package com.example.provapractica
// EditarTascaFragment.kt



// Layout XML: fragment_editar_tasca.xml
/*

*/

// Exemple de com navegar al fragment passant l'ID amb Bundle
/*

// A TasquesAdapter, afegir listener de click al constructor

private val onTascaClick: (Tasca) -> Unit

// Cridar al listener al lloc apropiat
holder.itemView.setOnClickListener { onTascaClick(tasca) }


// Des del TasquesFragment, quan creem l'adapter, caldrà passar aquest bloc de codi:
val bundle = Bundle().apply {
    putInt("tasca_id", tasca.id)
}

val fragment = EditarTascaFragment()
fragment.arguments = bundle

parentFragmentManager.beginTransaction()
    .replace(R.id.fragmentContainer, fragment)
    .addToBackStack(null)
    .commit()
*/