package com.mobiledevpro.apptemplate.ui.mainscreen.view

import android.view.View
import androidx.appcompat.widget.Toolbar
import com.mobiledevpro.apptemplate.R
import com.mobiledevpro.apptemplate.helper.showMainFragment
import com.mobiledevpro.commons.activity.BaseActivity

class MainActivity : BaseActivity() {

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun initToolbar() {
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
    }

    override fun initPresenters() {
        //no need
    }

    override fun populateView(layoutView: View) {
        //work with view
        showMainFragment(mFragmentManager, R.id.fragment_container)
    }
}
