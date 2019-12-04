package com.abed.myapplication.recyclerView

import androidx.annotation.LayoutRes

class SimpleRecyclerAdapter<RecyclerData : Any>(
    data: List<RecyclerData>, @LayoutRes layoutID: Int,
    private val onBindView: (holder: BaseViewHolder<RecyclerData>, data: RecyclerData, position: Int) -> Unit
) : BaseRecyclerAdapter<RecyclerData>(data) {

    override val layoutItemId: Int = layoutID

    override fun onBindViewHolder(holder: BaseViewHolder<RecyclerData>, position: Int) {
        onBindView(holder, dataList[position], position)
    }
}
