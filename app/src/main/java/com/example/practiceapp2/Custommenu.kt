package com.example.practiceapp2

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class Custommenu {

    fun custommenu(context: Context, view: View) {
        val pop = PopupMenu(context, view)

        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when (it!!.itemId) {
                R.id.edit -> {
                    Toast.makeText(context, "Edit", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.share -> {
                    Toast.makeText(context, "share", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.delete -> {
                    Toast.makeText(context, "Delete", Toast.LENGTH_SHORT).show()
                    true
                }
                else->false
            }
        }

        try{
            val field=PopupMenu::class.java.getDeclaredField("mPopup")
            field.isAccessible=true
            val mPopup = field.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("setFoeceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)
        }
        catch (e:Exception){

        }finally {
            pop.show()
        }
    }


}