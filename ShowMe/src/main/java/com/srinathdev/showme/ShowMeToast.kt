package com.srinathdev.showme

import android.content.Context
import android.widget.Toast

open class ShowMeToast {
    companion object{
        open fun toaster(context: Context?, msg: String?) {
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }

}