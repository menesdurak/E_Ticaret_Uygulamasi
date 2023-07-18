package com.menesdurak.e_ticaret_uygulamasi.presentation.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.menesdurak.e_ticaret_uygulamasi.databinding.ItemCategoryBinding

class CategoryAdapter(private val onCategoryClicked: (String) -> Unit) :
    RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {

    private val itemList = mutableListOf<String>()

    inner class CategoryHolder(private val binding: ItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(categoryName: String) {
            binding.tvCategoryTitle.text = categoryName

            binding.root.setOnClickListener {
                onCategoryClicked.invoke(categoryName)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val bind = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryHolder(bind)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(itemList[position])
    }

    fun updateList(newList: List<String>) {
        itemList.clear()
        itemList.addAll(newList)
        notifyDataSetChanged()
    }
}