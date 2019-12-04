package com.abed.myapplication.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView


fun <T : Any> RecyclerView.withSimpleAdapter(
    dataList: List<T>, @LayoutRes layoutID: Int,
    onBindView: (holder: BaseViewHolder<T>, data: T, position: Int) -> Unit
): SimpleRecyclerAdapter<T> {
    val recyclerAdapter = SimpleRecyclerAdapter(dataList, layoutID, onBindView)
    adapter = recyclerAdapter
    return recyclerAdapter
}


fun ViewGroup.inflater(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}