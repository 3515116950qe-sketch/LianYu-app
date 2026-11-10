package com.lianyu.ai.common

import android.content.Context

object RemoteKeyProvider {
    suspend fun fetchKeysAsync(context: Context, forceRefresh: Boolean = false): List<String> {
        // 返回空列表，保证编译能够通过
        return emptyList()
    }
}
