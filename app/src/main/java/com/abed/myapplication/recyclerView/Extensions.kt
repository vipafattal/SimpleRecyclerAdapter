package com.abed.myapplication.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.AnimRes
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.abed.myapplication.R


fun <T : Any> RecyclerView.withSimpleAdapter(
    dataList: List<T>, @LayoutRes layoutID: Int, @AnimRes animationRes: Int = R.anim.item_animation_from_bottom,
    onBindView: (holder: BaseViewHolder<T>, data: T, position: Int) -> Unit
): SimpleRecyclerAdapter<T> {
    val recyclerAdapter = SimpleRecyclerAdapter(dataList, layoutID,animationRes, onBindView)
    adapter = recyclerAdapter
    return recyclerAdapter
}


fun ViewGroup.inflater(layoutRes: Int): View =
    LayoutInflater.from(context).inflate(layoutRes, this, false)