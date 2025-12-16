package com.avito.android.developments_agency_search.screen.deal_room_development.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealRoomDevelopmentModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f137916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f137917b;

    public e(u uVar, Provider provider) {
        this.f137916a = uVar;
        this.f137917b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f137916a.get();
        com.avito.konveyor.a aVar2 = this.f137917b.get();
        d.f137915a.getClass();
        return new j(aVar, aVar2);
    }
}
