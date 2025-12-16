package com.avito.android.stories.di.module;

import com.avito.android.H0;
import com.avito.android.remote.interceptor.B0;
import com.avito.android.remote.interceptor.M;
import com.avito.android.remote.interceptor.P0;
import com.avito.android.util.C;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import rm0.InterfaceC47681a;

/* compiled from: StoriesActivityModule_ProvideCookieProvider$_avito_stories_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<com.avito.android.cookie_provider.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<M> f285133a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<P0> f285134b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<B0> f285135c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47681a> f285136d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.cookie_provider.d f285137e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C> f285138f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<H0> f285139g;

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.cookie_provider.d dVar, Provider provider5, Provider provider6) {
        this.f285133a = provider;
        this.f285134b = provider2;
        this.f285135c = provider3;
        this.f285136d = provider4;
        this.f285137e = dVar;
        this.f285138f = provider5;
        this.f285139g = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        M m12 = this.f285133a.get();
        this.f285134b.get();
        B0 b02 = this.f285135c.get();
        InterfaceC47681a interfaceC47681a = this.f285136d.get();
        com.avito.android.cookie_provider.b bVar = (com.avito.android.cookie_provider.b) this.f285137e.get();
        C c12 = this.f285138f.get();
        H0 h02 = this.f285139g.get();
        int i12 = a.f285131a;
        ArrayList arrayListE0 = C42745f0.e0(m12, b02, interfaceC47681a);
        c12.getF125491k().getClass();
        return new com.avito.android.cookie_provider.f(arrayListE0, bVar, c12, h02);
    }
}
