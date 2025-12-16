package com.avito.android.rating.user_contacts.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsModule_ProvideAdapterPresenter$_avito_rating_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.android.recycler.responsive.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f247758a;

    /* renamed from: b, reason: collision with root package name */
    public final u f247759b;

    public f(u uVar, Provider provider) {
        this.f247758a = provider;
        this.f247759b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f247758a.get();
        com.avito.android.recycler.responsive.a aVar2 = (com.avito.android.recycler.responsive.a) this.f247759b.get();
        e.f247757a.getClass();
        return new com.avito.android.recycler.responsive.f(aVar, aVar2);
    }
}
