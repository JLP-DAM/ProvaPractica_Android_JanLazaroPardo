package com.example.provapractica

import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val nomTextView: TextView = itemView.findViewById(R.id.tvNom)
    private val dataTextView: TextView = itemView.findViewById(R.id.tvData)
    private val estatTextView: TextView = itemView.findViewById(R.id.tvEstat)
    private val categoriaTextView: TextView = itemView.findViewById(R.id.tvCategoria)

    fun renderitza(item: Tasca) {
        nomTextView.text = item.nom
        dataTextView.text = item.data
        estatTextView.text = item.estat.nom
        categoriaTextView.text = item.categoria.nom

        if (item.estat.nom == "No començada") {
            estatTextView.setTextColor(Color.parseColor("#FF9800"))
        } else if (item.estat.nom == "En curs") {
            estatTextView.setTextColor(Color.parseColor("#2196F3"))
        } else if (item.estat.nom == "Finalitzada") {
            estatTextView.setTextColor(Color.parseColor("#4CAF50"))
        }
    }
}