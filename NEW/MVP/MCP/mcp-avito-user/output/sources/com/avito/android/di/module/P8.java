package com.avito.android.di.module;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.witcher.C34888g;
import com.avito.android.serp.adapter.witcher.InterfaceC34887f;
import javax.inject.Provider;

/* compiled from: SerpItemConverterModule_ProvideWitcherElementConverterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class P8 implements dagger.internal.h<InterfaceC34887f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f144097a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.H0> f144098b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.f> f144099c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.T> f144100d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f144101e;

    public P8(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f144097a = provider;
        this.f144098b = provider2;
        this.f144099c = provider3;
        this.f144100d = provider4;
        this.f144101e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34904z0 interfaceC34904z0 = this.f144097a.get();
        com.avito.android.serp.adapter.H0 h02 = this.f144098b.get();
        com.avito.android.constructor_advert.ui.serp.constructor.f fVar = this.f144099c.get();
        com.avito.android.serp.adapter.T t12 = this.f144100d.get();
        com.avito.android.serp.adapter.n1 n1Var = (com.avito.android.serp.adapter.n1) this.f144101e.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new C34888g(fVar, t12, interfaceC34904z0, h02, n1Var);
    }
}
