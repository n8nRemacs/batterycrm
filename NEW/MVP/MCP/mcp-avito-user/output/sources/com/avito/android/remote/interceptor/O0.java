package com.avito.android.remote.interceptor;

import com.avito.android.remote.l1;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: SupportedFeaturesInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/O0;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class O0 implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l1 f253501b;

    public O0(@Y61.k l1 l1Var) {
        this.f253501b = l1Var;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        l1 l1Var = this.f253501b;
        String f253512a = l1Var.getF253512a();
        return chain.proceed(f253512a == null ? chain.request() : chain.request().newBuilder().addHeader(l1Var.getKey(), f253512a).build());
    }
}
