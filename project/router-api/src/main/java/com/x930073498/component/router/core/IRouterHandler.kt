package com.x930073498.component.router.core

import android.net.Uri
import android.os.Bundle

interface IRouterHandler  {
    fun greenChannel(): IRouterHandler
    fun scheme(scheme: String): IRouterHandler
    fun query(query: String): IRouterHandler
    fun path(path: String): IRouterHandler
    fun authority(authority: String): IRouterHandler
    fun appendQuery(key: String, value: String): IRouterHandler
    fun uri(action: Uri.Builder.() -> Unit): IRouterHandler
    fun serializer(action: ISerializerBundle.() -> Unit): IRouterHandler
    fun bundle(action: Bundle.() -> Unit): IRouterHandler
    fun bundle(key: String, value: Any?): IRouterHandler
}