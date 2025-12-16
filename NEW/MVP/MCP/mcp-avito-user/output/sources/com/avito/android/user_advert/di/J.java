package com.avito.android.user_advert.di;

import javax.inject.Provider;

/* compiled from: MyAdvertItemsModule_ProvideSimpleRecyclerPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class J implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f310884a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f310885b;

    public J(dagger.internal.u uVar, Provider provider) {
        this.f310884a = uVar;
        this.f310885b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f310884a.get();
        com.avito.konveyor.a aVar = this.f310885b.get();
        B.f310787a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        jVar.setHasStableIds(false);
        return jVar;
    }
}
