package com.avito.android.remote.interceptor;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.Response;
import ur.InterfaceC49101b;

/* compiled from: AcceptLanguageInterceptorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/f;", "Lcom/avito/android/remote/interceptor/e;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.f, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34280f implements InterfaceC34278e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34270a f253528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f253529c;

    @Inject
    public C34280f(@Y61.k InterfaceC34270a interfaceC34270a, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.f253528b = interfaceC34270a;
        this.f253529c = interfaceC49101b;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        if (!this.f253529c.c()) {
            return chain.proceed(chain.request());
        }
        InterfaceC34270a interfaceC34270a = this.f253528b;
        String f253516a = interfaceC34270a.getF253516a();
        return chain.proceed((f253516a == null || C43066x.K(f253516a)) ? chain.request() : chain.request().newBuilder().header(interfaceC34270a.getKey(), f253516a).build());
    }
}
