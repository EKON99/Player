package com.example.player.presentation.fragment.all_videos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.player.databinding.FragmentAllVideosBinding

class AllVideosFragment : Fragment() {

    /** Data binding component */
    private lateinit var binding: FragmentAllVideosBinding

    /** ViewModel component */
    private
    val viewModel: AllVideoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        /** Data binding */
        binding = FragmentAllVideosBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}