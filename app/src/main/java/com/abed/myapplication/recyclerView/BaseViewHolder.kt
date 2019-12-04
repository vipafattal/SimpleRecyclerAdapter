package com.abed.myapplication.recyclerView

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
/**
 * Created by ${User} on ${Date}
 */
open class BaseViewHolder<in T>(parent: ViewGroup, @LayoutRes layoutId: Int) :
    RecyclerView.ViewHolder(parent.inflater(layoutId)) {

    fun clearAnimation() {
        itemView.clearAnimation()
    }
}