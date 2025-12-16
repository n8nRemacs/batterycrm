package com.avito.android.social_management.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SocialManagementModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f284661a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f284662b;

    public n(u uVar, Provider provider) {
        this.f284661a = uVar;
        this.f284662b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f284661a.get();
        com.avito.konveyor.a aVar = this.f284662b.get();
        g.f284647a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
