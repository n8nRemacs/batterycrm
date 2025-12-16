package com.avito.android.similar_adverts.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsBlueprintsModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f283916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f283917b;

    public g(u uVar, Provider provider) {
        this.f283916a = uVar;
        this.f283917b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f283916a.get();
        com.avito.konveyor.a aVar2 = this.f283917b.get();
        b.f283906a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
