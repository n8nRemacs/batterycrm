package com.avito.android.hotel_available_rooms.di;

/* compiled from: GalleryAdapterModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final j f162754a;

    /* renamed from: b, reason: collision with root package name */
    public final k f162755b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f162756c;

    public m(j jVar, k kVar, dagger.internal.u uVar) {
        this.f162754a = jVar;
        this.f162755b = kVar;
        this.f162756c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f162755b.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f162756c.get();
        this.f162754a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
