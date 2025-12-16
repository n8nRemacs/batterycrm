package com.avito.android.di.module;

import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: AdvertItemPresenterModule_ProvideComplementaryAdvertRedesignItemPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class J implements dagger.internal.h<com.avito.android.section.item.redesign.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f144011a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f144012b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f144013c;

    public J(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f144011a = fVar;
        this.f144012b = provider;
        this.f144013c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f144011a);
        InterfaceC28373a interfaceC28373a = this.f144012b.get();
        C36135w2 c36135w2 = this.f144013c.get();
        D d12 = D.f143878a;
        return new com.avito.android.section.item.redesign.h(eVarB, interfaceC28373a, c36135w2);
    }
}
