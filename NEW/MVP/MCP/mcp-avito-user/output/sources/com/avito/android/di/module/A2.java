package com.avito.android.di.module;

import com.avito.android.remote.C34383q;
import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.remote.interceptor.C34315x;
import com.avito.android.remote.interceptor.InterfaceC34313w;
import javax.inject.Provider;

/* compiled from: CertificatePinningModule_ProvideCertificatePinningInterceptorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A2 implements dagger.internal.h<InterfaceC34313w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f143818a;

    /* renamed from: b, reason: collision with root package name */
    public final C34383q f143819b;

    public A2(Provider provider, C34383q c34383q) {
        this.f143818a = provider;
        this.f143819b = c34383q;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.server_time.f fVar = this.f143818a.get();
        InterfaceC34332n interfaceC34332n = (InterfaceC34332n) this.f143819b.get();
        C30243y2.f144717a.getClass();
        return new C34315x(fVar, C30243y2.a(), interfaceC34332n);
    }
}
