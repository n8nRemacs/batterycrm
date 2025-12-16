package com.avito.android.rating.user_contacts.di;

import com.avito.android.recycler.responsive.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsModule_ProvideResponsiveRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f247761a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f247762b;

    public i(u uVar, Provider provider) {
        this.f247761a = uVar;
        this.f247762b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.responsive.e eVar = (com.avito.android.recycler.responsive.e) this.f247761a.get();
        com.avito.konveyor.a aVar = this.f247762b.get();
        e.f247757a.getClass();
        return new j(eVar, aVar);
    }
}
