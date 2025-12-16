package com.avito.android.hotel_available_rooms.di;

/* compiled from: RoomsAdapterModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class D implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f162669a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f162670b;

    public D(C c12, dagger.internal.u uVar) {
        this.f162669a = c12;
        this.f162670b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f162670b.get();
        this.f162669a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
