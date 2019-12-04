package com.abed.myapplication.recyclerView

import android.view.View
import android.view.animation.AnimationUtils
import androidx.annotation.LayoutRes

class SimpleRecyclerAdapter<RecyclerData : Any>(
    data: List<RecyclerData>, @LayoutRes layoutID: Int,
    private val animationRes: Int = -1,
    private val onBindView: (holder: BaseViewHolder<RecyclerData>, data: RecyclerData, position: Int) -> Unit
) : BaseRecyclerAdapter<RecyclerData>(data) {

    override val layoutItemId: Int = layoutID

    override fun onBindViewHolder(holder: BaseViewHolder<RecyclerData>, position: Int) {
        val data = dataList[position]
        onBindView(holder, data, position)
        if (animationRes != -1)
            holder.itemView.setAnimation( position)
    }

    private var lastPosition = -1
    private fun View.setAnimation(position: Int) {

        if (position > lastPosition) {
            val animation =
                AnimationUtils.loadAnimation(context, animationRes)

            startAnimation(animation)
            lastPosition = position
        }
    }

    override fun onViewDetachedFromWindow(holder: BaseViewHolder<RecyclerData>) {
        holder.clearAnimation()
    }
}
