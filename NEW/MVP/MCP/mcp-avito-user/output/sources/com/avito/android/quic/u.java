package com.avito.android.quic;

import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: QuicURLsModifierInterceptor.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/u;", "Lokhttp3/Interceptor;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p f246391b;

    @Inject
    public u(@Y61.k p pVar) {
        this.f246391b = pVar;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        return chain.proceed(request.newBuilder().url(this.f246391b.e(request.url())).build());
    }
}
