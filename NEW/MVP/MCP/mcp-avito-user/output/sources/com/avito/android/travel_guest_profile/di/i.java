package com.avito.android.travel_guest_profile.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelGuestProfileRecyclerModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301928a;

    /* renamed from: b, reason: collision with root package name */
    public final u f301929b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f301930c;

    public i(f fVar, u uVar, Provider provider) {
        this.f301928a = fVar;
        this.f301929b = uVar;
        this.f301930c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f301929b.get();
        com.avito.konveyor.a aVar2 = this.f301930c.get();
        this.f301928a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
