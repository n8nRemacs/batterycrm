package com.avito.android.hotel_available_rooms.di;

/* compiled from: GalleryAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f162750a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162751b;

    public k(j jVar, dagger.internal.u uVar) {
        this.f162750a = jVar;
        this.f162751b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f162751b.get();
        this.f162750a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
