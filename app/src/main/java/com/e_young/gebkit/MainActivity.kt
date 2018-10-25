package com.e_young.gebkit

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.e_young.gebkit2.views.SimpleWebPage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mWP: SimpleWebPage? = null

    var context: Context? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this

        mWP = SimpleWebPage(context)

        rootview.addView(mWP)

        var weburl: String = "https://www.baidu.com"

        mWP!!.webView.loadUrl(weburl)

//        // Example of a call to a native method
//        sample_text.text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
