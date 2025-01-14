package com.cz.sample.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cz.android.sample.api.Register
import com.cz.android.sample.library.component.code.SampleSourceCode
import com.cz.android.sample.library.component.message.SampleMessage
import com.cz.sample.databinding.FragmentMessageLayoutBinding

/**
 * This sample demonstrated how to output message and show it to your sample
 * @see SampleSourceCode add additional panel that show all the source code
 */
@SampleMessage
@SampleSourceCode
@Register(title = "消息输出", desc = "演示加载系统System.out流操作", path = "其他")
class SampleMessageFragment : Fragment() {
    private lateinit var binding: FragmentMessageLayoutBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMessageLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.outButton.setOnClickListener {
            println("System.out from fragment.")
        }
    }
}