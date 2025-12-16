package com.avito.android.payment.di.module;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.P0;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: WebPaymentMviModule_Companion_ProvideCookieProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class X implements dagger.internal.h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.interceptor.M> f214238a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f214239b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B0> f214240c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cookie_provider.d f214241d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.remote.interceptor.I> f214242e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f214243f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f214244g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<H0> f214245h;

    public X(Provider provider, Provider provider2, Provider provider3, com.avito.android.cookie_provider.d dVar, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f214238a = provider;
        this.f214239b = provider2;
        this.f214240c = provider3;
        this.f214241d = dVar;
        this.f214242e = provider4;
        this.f214243f = provider5;
        this.f214244g = provider6;
        this.f214245h = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.interceptor.M m12 = this.f214238a.get();
        this.f214239b.get();
        B0 b02 = this.f214240c.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f214241d.get();
        com.avito.android.remote.interceptor.I i12 = this.f214242e.get();
        InterfaceC47681a interfaceC47681a = this.f214243f.get();
        com.avito.android.util.C c12 = this.f214244g.get();
        H0 h02 = this.f214245h.get();
        W.f214236a.getClass();
        ArrayList arrayListE0 = C42745f0.e0(b02);
        arrayListE0.add(m12);
        c12.getF125491k().getClass();
        arrayListE0.add(i12);
        arrayListE0.add(interfaceC47681a);
        return new com.avito.android.cookie_provider.f(arrayListE0, bVar, c12, h02);
    }
}
