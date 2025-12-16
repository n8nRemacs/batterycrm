package com.vk.api.sdk.okhttp;

import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: UserAgentInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/s;", "Lokhttp3/Interceptor;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class s implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.utils.d f366675b;

    public s(@Y61.k com.vk.api.sdk.utils.d dVar) {
        this.f366675b = dVar;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", (String) this.f366675b.f366713d.getValue()).build());
    }
}
