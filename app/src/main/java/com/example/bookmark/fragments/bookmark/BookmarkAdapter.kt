package com.example.bookmark.fragments.bookmark

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bookmark.data.models.Bookmarkmodel
import com.example.bookmark.databinding.ItemBookmarkBinding

class BookmarkAdapter : RecyclerView.Adapter<BookmarkAdapter.BookmarkViewHolder>(){

    private var items = mutableListOf<Bookmarkmodel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BookmarkAdapter.BookmarkViewHolder {
        val binding = ItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = BookmarkViewHolder(binding)
        return holder
    }

    override fun onBindViewHolder(holder: BookmarkAdapter.BookmarkViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun addItems(list: List<Bookmarkmodel>){
        this.items.run{
            clear()
            addAll(list)
        }
    }

    class BookmarkViewHolder(binding:ItemBookmarkBinding): RecyclerView.ViewHolder(binding.root) {
        val binding = binding
        fun bind(bm:Bookmarkmodel){
            binding.bookmarkmodel=bm
        }
    }

}