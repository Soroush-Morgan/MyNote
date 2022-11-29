package com.example.mynote

import androidx.recyclerview.widget.RecyclerView
import com.example.mynote.databinding.CategoryListBinding
import com.example.mynote.model.Category

class ListViewHolder(_binding: CategoryListBinding,val callback: Callback) :
    RecyclerView.ViewHolder(_binding.root) {

    private var binding: CategoryListBinding = _binding

    fun bindTo(item: Category) {
        binding.tvCategory.text = item.cname
    }

    interface Callback{

    }
}