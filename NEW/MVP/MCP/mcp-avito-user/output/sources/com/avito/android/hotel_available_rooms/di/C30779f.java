package com.avito.android.hotel_available_rooms.di;

/* compiled from: FiltersAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.hotel_available_rooms.di.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30779f implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30778e f162742a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162743b;

    public C30779f(C30778e c30778e, dagger.internal.u uVar) {
        this.f162742a = c30778e;
        this.f162743b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f162743b.get();
        this.f162742a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
