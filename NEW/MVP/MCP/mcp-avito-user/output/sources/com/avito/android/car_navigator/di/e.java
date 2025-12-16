package com.avito.android.car_navigator.di;

import com.avito.android.H0;
import com.avito.android.car_navigator.di.f;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: CarNavigatorModule_ProvideCookieProvider$_avito_car_navigator_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B0> f115156a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f115157b;

    /* renamed from: c, reason: collision with root package name */
    public final u f115158c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C> f115159d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H0> f115160e;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f115156a = provider;
        this.f115157b = provider2;
        this.f115158c = uVar;
        this.f115159d = provider3;
        this.f115160e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B0 b02 = (B0) ((f.c.g) this.f115156a).get();
        InterfaceC47681a interfaceC47681a = (InterfaceC47681a) ((f.c.e) this.f115157b).get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f115158c.get();
        C c12 = (C) ((f.c.b) this.f115159d).get();
        H0 h02 = (H0) ((f.c.d) this.f115160e).get();
        int i12 = c.f115154a;
        return new com.avito.android.cookie_provider.f(C42745f0.U(b02, interfaceC47681a), bVar, c12, h02);
    }
}
