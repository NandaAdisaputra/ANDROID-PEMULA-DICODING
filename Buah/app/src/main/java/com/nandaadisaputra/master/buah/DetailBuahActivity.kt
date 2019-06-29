package com.nandaadisaputra.master.buah

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.webkit.WebSettings
import android.widget.ImageView
import org.jetbrains.anko.*

class DetailBuahActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var image_buah = intent.getIntExtra("image", 0)
        var name_buah = intent.getStringExtra("name")
        DetailBuahActivityUI().setContentView(this)

        verticalLayout {
            imageView(image_buah) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE
            }.lparams(dip(300), dip(300)) {
                gravity = Gravity.CENTER
                topMargin = dip(10)
            }
            textView(name_buah) {
                textSize = sp(12).toFloat()
                gravity = Gravity.CENTER
            }.lparams(matchParent, wrapContent) {
                margin = dip(10)
            }
        }
    }

    class DetailBuahActivityUI : AnkoComponent<DetailBuahActivity> {
        override fun createView(ui: AnkoContext<DetailBuahActivity>) = with(ui) {
            verticalLayout {

            }
        }
    }

}
