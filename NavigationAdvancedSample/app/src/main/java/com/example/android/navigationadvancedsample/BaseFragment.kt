package com.example.android.navigationadvancedsample

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    /**
     * 计算次数，用于判断Navigation在2.4.0提供的多堆栈能否保存Fragment的状态和数据
     */
    protected var calculateTimes = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        calculateTimes++
        Log.e("fragment_lifecycle", "onCreate $this -- $calculateTimes")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        calculateTimes++
        Log.e("fragment_lifecycle", "onAttach $this -- $calculateTimes")
    }

    override fun onDetach() {
        super.onDetach()
        calculateTimes++
        Log.e("fragment_lifecycle", "onDetach $this -- $calculateTimes")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val onCreateView = super.onCreateView(inflater, container, savedInstanceState)
        calculateTimes++
        Log.e("fragment_lifecycle", "onCreateView $this -- $calculateTimes")
        return onCreateView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calculateTimes++
        Log.e("fragment_lifecycle", "onViewCreated $this -- $calculateTimes")
    }

    override fun onStart() {
        super.onStart()
        calculateTimes++
        Log.e("fragment_lifecycle", "onStart $this -- $calculateTimes")
    }

    override fun onPause() {
        super.onPause()
        calculateTimes++
        Log.e("fragment_lifecycle", "onPause $this -- $calculateTimes")
    }

    override fun onResume() {
        super.onResume()
        calculateTimes++
        Log.e("fragment_lifecycle", "onResume $this -- $calculateTimes")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        calculateTimes++
        Log.e("fragment_lifecycle", "onDestroyView $this -- $calculateTimes")
    }

    override fun onDestroy() {
        super.onDestroy()
        calculateTimes++
        Log.e("fragment_lifecycle", "onDestroy $this -- $calculateTimes")
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        calculateTimes++
        Log.e("fragment_lifecycle", "onHiddenChanged $this -- $calculateTimes $hidden")
    }
}
