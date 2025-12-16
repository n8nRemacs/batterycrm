package com.avito.android.di.module;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ur0.InterfaceC49104a;

/* compiled from: SerpItemConverterModule_ProvideSerpItemProcessorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class H8 implements dagger.internal.h<com.avito.android.serp.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.L0> f143988a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49104a> f143989b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f143990c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.T> f143991d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.n1> f143992e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f143993f;

    public H8(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f143988a = provider;
        this.f143989b = provider2;
        this.f143990c = uVar;
        this.f143991d = provider3;
        this.f143992e = provider4;
        this.f143993f = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.L0 l02 = this.f143988a.get();
        InterfaceC49104a interfaceC49104a = this.f143989b.get();
        com.avito.android.serp.adapter.V0 v02 = (com.avito.android.serp.adapter.V0) this.f143990c.get();
        com.avito.android.serp.adapter.T t12 = this.f143991d.get();
        com.avito.android.serp.adapter.n1 n1Var = this.f143992e.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) this.f143993f.get();
        C29986a8 c29986a8 = C29986a8.f144230a;
        return new com.avito.android.serp.j(l02, interfaceC49104a, v02, t12, n1Var, interfaceC35745a5);
    }
}
