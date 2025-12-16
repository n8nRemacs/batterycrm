package com.avito.android.rating.details.di;

import androidx.recyclerview.widget.C;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingDetailsModule_ProvideDataAwareAdapterPresenterImplFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.android.recycler.data_aware.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f246991a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.h> f246992b;

    /* renamed from: c, reason: collision with root package name */
    public final u f246993c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f246991a = provider;
        this.f246992b = provider2;
        this.f246993c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f246991a);
        com.avito.konveyor.adapter.h hVar = this.f246992b.get();
        com.avito.android.recycler.data_aware.e eVar = (com.avito.android.recycler.data_aware.e) this.f246993c.get();
        e.f246981a.getClass();
        return new com.avito.android.recycler.data_aware.d(eVarB, hVar, eVar);
    }
}
