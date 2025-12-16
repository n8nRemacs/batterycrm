package com.avito.android.wallet.page.topup.form.di;

import dagger.internal.y;

/* compiled from: TopUpFormModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class v implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f328297a;

    /* renamed from: b, reason: collision with root package name */
    public final s f328298b;

    public v(dagger.internal.u uVar, s sVar) {
        this.f328297a = uVar;
        this.f328298b = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f328297a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f328298b.get();
        g.f328273a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
