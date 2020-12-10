package com.lph.xfilepicker

import android.app.Activity
import androidx.fragment.app.Fragment
import java.lang.ref.WeakReference

class XFilePicker private constructor(activity: Activity, fragment: Fragment?) {
    private var mContext: WeakReference<Activity>? = null
    private var mFragment: WeakReference<Fragment>? = null

    init {
        mContext = WeakReference(activity)
        mFragment = WeakReference(fragment)
    }

    companion object {
        fun from(activity: Activity) {
            XFilePicker(activity, null)
        }

        fun from(fragment: Fragment) {
            XFilePicker(fragment.activity!!, fragment)
        }
    }


    private fun setFileMode() {

    }

    private fun setImageMode() {

    }

}