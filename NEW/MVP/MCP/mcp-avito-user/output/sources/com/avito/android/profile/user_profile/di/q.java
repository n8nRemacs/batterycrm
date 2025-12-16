package com.avito.android.profile.user_profile.di;

import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideRecyclerAdapter$_avito_profile_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226119a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f226120b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f226121c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.profile.user_profile.cards.diff.n f226122d;

    public q(f fVar, dagger.internal.u uVar, Provider provider, com.avito.android.profile.user_profile.cards.diff.n nVar) {
        this.f226119a = fVar;
        this.f226120b = uVar;
        this.f226121c = provider;
        this.f226122d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f226120b.get();
        com.avito.konveyor.a aVar2 = this.f226121c.get();
        this.f226122d.getClass();
        com.avito.android.profile.user_profile.cards.diff.m mVar = new com.avito.android.profile.user_profile.cards.diff.m();
        this.f226119a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, mVar);
    }
}
