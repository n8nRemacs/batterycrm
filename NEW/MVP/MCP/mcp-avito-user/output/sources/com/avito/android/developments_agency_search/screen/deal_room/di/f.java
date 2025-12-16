package com.avito.android.developments_agency_search.screen.deal_room.di;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealRoomModule_ProvideListRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f137527a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f137528b;

    public f(u uVar, Provider provider) {
        this.f137527a = uVar;
        this.f137528b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f137527a.get();
        com.avito.konveyor.a aVar2 = this.f137528b.get();
        d.f137525a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
