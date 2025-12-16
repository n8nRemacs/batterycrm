package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class t implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f328294a;

    /* renamed from: b, reason: collision with root package name */
    public final o f328295b;

    public t(dagger.internal.u uVar, o oVar) {
        this.f328294a = uVar;
        this.f328295b = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) this.f328294a.get();
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f328295b.get();
        g.f328273a.getClass();
        return new com.avito.konveyor.adapter.j(cVar, aVar);
    }
}
