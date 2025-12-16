package com.avito.android.remote.interceptor;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: UserAgentInterceptorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/Z0;", "Lcom/avito/android/remote/interceptor/Y0;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class Z0 implements Y0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U0 f253519b;

    @Inject
    public Z0(@Y61.k U0 u02) {
        this.f253519b = u02;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        U0 u02 = this.f253519b;
        String f253516a = u02.getF253516a();
        return chain.proceed((f253516a == null || C43066x.K(f253516a)) ? chain.request() : chain.request().newBuilder().header(u02.getKey(), f253516a).build());
    }
}
