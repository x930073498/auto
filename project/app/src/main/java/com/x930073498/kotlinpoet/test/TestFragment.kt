package com.x930073498.kotlinpoet.test

import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.TextView
import androidx.activity.OnBackPressedDispatcher
import androidx.fragment.app.Fragment
import com.x930073498.annotations.FactoryAnnotation
import com.x930073498.annotations.FragmentAnnotation
import com.x930073498.annotations.ValueAutowiredAnnotation
import com.x930073498.kotlinpoet.R
import com.x930073498.router.*
import com.x930073498.router.action.ContextHolder
import com.x930073498.router.impl.FragmentActionDelegate
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.Serializable


@FragmentAnnotation(path = "/test/a")
class TestFragment : Fragment(R.layout.fragment_test) {
    @ValueAutowiredAnnotation
    var name = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireView().findViewById<TextView>(R.id.tv)?.text = name
        requireView().setOnClickListener {
            GlobalScope.launch {
                Router.from("/test/test4?a=method&b=14&c=test").navigate<String>(requireContext())?.also {
                    println(it)
                }
//                Router.from("/test/service?testA=8484848&b=4&c=5").navigate<TestService>()
            }
        }
    }

    @FactoryAnnotation
    class Factory : FragmentActionDelegate.Factory {
        override  suspend fun create(
            contextHolder: ContextHolder,
            clazz: Class<*>,
            bundle: Bundle,
        ): TestFragment {
            return TestFragment().also {
                it.arguments = bundle
            }
        }
    }

    companion object {

        @FactoryAnnotation
        fun create(bundle: Bundle): TestFragment {
            return TestFragment().also { it.arguments = bundle }
        }
    }
}



