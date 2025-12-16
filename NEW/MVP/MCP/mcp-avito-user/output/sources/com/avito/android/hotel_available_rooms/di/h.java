package com.avito.android.hotel_available_rooms.di;

import javax.inject.Provider;

/* compiled from: FiltersAdapterModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30778e f162746a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162747b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f162748c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.hotel_available_rooms.konveyor.c f162749d;

    public h(C30778e c30778e, dagger.internal.u uVar, Provider provider, com.avito.android.hotel_available_rooms.konveyor.c cVar) {
        this.f162746a = c30778e;
        this.f162747b = uVar;
        this.f162748c = provider;
        this.f162749d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f162747b.get();
        com.avito.konveyor.a aVar2 = this.f162748c.get();
        this.f162749d.getClass();
        com.avito.android.hotel_available_rooms.konveyor.b bVar = new com.avito.android.hotel_available_rooms.konveyor.b();
        this.f162746a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, bVar);
    }
}
