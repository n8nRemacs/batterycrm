package com.avito.android.installments.form.di;

import com.avito.android.H0;
import com.avito.android.installments.form.di.a;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.I;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: InstallmentsFormModule_ProvideCookieProvider$_avito_installments_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f172678a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f172679b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B0> f172680c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.cookie_provider.d f172681d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<U0> f172682e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<I> f172683f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f172684g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C> f172685h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<H0> f172686i;

    public e(Provider provider, Provider provider2, Provider provider3, com.avito.android.cookie_provider.d dVar, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f172678a = provider;
        this.f172679b = provider2;
        this.f172680c = provider3;
        this.f172681d = dVar;
        this.f172682e = provider4;
        this.f172683f = provider5;
        this.f172684g = provider6;
        this.f172685h = provider7;
        this.f172686i = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M m12 = (M) ((a.c.e) this.f172678a).get();
        B0 b02 = (B0) ((a.c.m) this.f172680c).get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f172681d.get();
        U0 u02 = (U0) ((a.c.o) this.f172682e).get();
        I i12 = (I) ((a.c.d) this.f172683f).get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) ((a.c.j) this.f172684g).get();
        C c12 = (C) ((a.c.C5089a) this.f172685h).get();
        H0 h02 = (H0) ((a.c.g) this.f172686i).get();
        d.f172677a.getClass();
        ArrayList arrayListE0 = C42745f0.e0(m12, b02, u02, i12, interfaceC47681a);
        c12.getF125491k().getClass();
        return new com.avito.android.cookie_provider.f(arrayListE0, bVar, c12, h02);
    }
}
