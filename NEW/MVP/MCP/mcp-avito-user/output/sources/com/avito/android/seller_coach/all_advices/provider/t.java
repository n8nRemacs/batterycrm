package com.avito.android.seller_coach.all_advices.provider;

import javax.inject.Provider;

/* compiled from: AllAdvicesModule_ProvideRecyclerAdapter$_avito_seller_coach_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f267368a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f267369b;

    public t(dagger.internal.u uVar, Provider provider) {
        this.f267368a = uVar;
        this.f267369b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f267368a.get();
        com.avito.konveyor.a aVar2 = this.f267369b.get();
        m.f267358a.getClass();
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
