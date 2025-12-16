package com.avito.android.credits.landing.di;

import com.avito.android.H0;
import com.avito.android.credits.landing.di.f;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.InterfaceC34273b0;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: CreditProductsLandingModule_ProvideCookieProvider$_avito_credits_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f128905a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<B0> f128906b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<M> f128907c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<U0> f128908d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<I> f128909e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC34273b0> f128910f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f128911g;

    /* renamed from: h, reason: collision with root package name */
    public final u f128912h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C> f128913i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<H0> f128914j;

    public e(c cVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, u uVar, Provider provider7, Provider provider8) {
        this.f128905a = cVar;
        this.f128906b = provider;
        this.f128907c = provider2;
        this.f128908d = provider3;
        this.f128909e = provider4;
        this.f128910f = provider5;
        this.f128911g = provider6;
        this.f128912h = uVar;
        this.f128913i = provider7;
        this.f128914j = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) ((f.c.h) this.f128906b).get();
        M m12 = (M) ((f.c.C3823c) this.f128907c).get();
        U0 u02 = (U0) ((f.c.i) this.f128908d).get();
        I i12 = (I) ((f.c.b) this.f128909e).get();
        InterfaceC34273b0 interfaceC34273b0 = (InterfaceC34273b0) ((f.c.d) this.f128910f).get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) ((f.c.C3824f) this.f128911g).get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f128912h.get();
        C c12 = (C) ((f.c.a) this.f128913i).get();
        H0 h02 = (H0) ((f.c.e) this.f128914j).get();
        this.f128905a.getClass();
        return new com.avito.android.cookie_provider.f(C42745f0.e0(b02, m12, u02, i12, interfaceC34273b0, interfaceC47681a), bVar, c12, h02);
    }
}
