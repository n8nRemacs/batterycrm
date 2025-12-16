package com.avito.android.service_booking_calendar.flexible.di;

/* compiled from: FlexibleCalendarHeaderModule_ProvideMonthSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f275810a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f275811b;

    public k(dagger.internal.f fVar, dagger.internal.u uVar) {
        this.f275810a = fVar;
        this.f275811b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f275810a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f275811b.get();
        e.f275798a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
