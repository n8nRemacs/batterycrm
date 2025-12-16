package com.avito.android.remote.interceptor;

import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: DateInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/D;", "Lokhttp3/Interceptor;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class D implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34319z f253485b;

    public D(@Y61.k InterfaceC34319z interfaceC34319z) {
        this.f253485b = interfaceC34319z;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        InterfaceC34319z interfaceC34319z = this.f253485b;
        String f253512a = interfaceC34319z.getF253512a();
        return chain.proceed((f253512a == null || C43066x.K(f253512a)) ? chain.request() : chain.request().newBuilder().header(interfaceC34319z.getKey(), f253512a).build());
    }
}
