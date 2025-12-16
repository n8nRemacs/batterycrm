package com.avito.android.hotel_available_rooms.di;

import javax.inject.Provider;

/* compiled from: RoomsAdapterModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class F implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C f162673a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162674b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f162675c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.hotel_available_rooms.konveyor.c f162676d;

    public F(C c12, dagger.internal.u uVar, Provider provider, com.avito.android.hotel_available_rooms.konveyor.c cVar) {
        this.f162673a = c12;
        this.f162674b = uVar;
        this.f162675c = provider;
        this.f162676d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f162674b.get();
        com.avito.konveyor.a aVar2 = this.f162675c.get();
        this.f162676d.getClass();
        com.avito.android.hotel_available_rooms.konveyor.b bVar = new com.avito.android.hotel_available_rooms.konveyor.b();
        this.f162673a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, bVar);
    }
}
