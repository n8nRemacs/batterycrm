package com.avito.android.similar_adverts.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SimilarAdvertsBlueprintsModule_ProvideDataAwareAdapterPresenter$_avito_similar_adverts_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f283908a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f283909b;

    /* renamed from: c, reason: collision with root package name */
    public final u f283910c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f283908a = provider;
        this.f283909b = provider2;
        this.f283910c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f283908a);
        com.avito.konveyor.adapter.a aVar = this.f283909b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f283910c.get();
        b.f283906a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, aVar, eVar);
    }
}
