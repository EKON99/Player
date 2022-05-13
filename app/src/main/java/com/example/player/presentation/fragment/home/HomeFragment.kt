package com.example.player.presentation.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.player.R
import com.example.player.databinding.FragmentHomeBinding
import com.example.player.presentation.fragment.all_folder.AllFolderFragment
import com.example.player.presentation.fragment.all_videos.AllVideosFragment

class HomeFragment : Fragment() {

    /** Data binding component */
    private lateinit var binding: FragmentHomeBinding

    /** ViewModel component */
    private
    val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        /** Data binding */
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /** Setting first fragment */
        setFragment(AllVideosFragment())

        /** SetListener */
        setListener()

    }

    /** SetListener */
    private fun setListener() {

        /** Bottom navigation bar item click listener */
        binding.bnb.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.allVideos -> setFragment(AllVideosFragment())
                R.id.allFolder -> setFragment(AllFolderFragment())
            }
            return@setOnItemSelectedListener true
        }
    }

    /**
     * Setting fragment in frameLayout
     * @param fragment
     */
    private fun setFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction().replace(R.id.fl, fragment).commit()
    }

}