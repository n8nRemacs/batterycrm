package com.avito.android.bundles.vas_union.di;

import javax.inject.Provider;

/* compiled from: VasUnionModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final q f108551a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f108552b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f108553c;

    public y(q qVar, dagger.internal.u uVar, Provider provider) {
        this.f108551a = qVar;
        this.f108552b = uVar;
        this.f108553c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f108552b.get();
        com.avito.konveyor.a aVar2 = this.f108553c.get();
        this.f108551a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
