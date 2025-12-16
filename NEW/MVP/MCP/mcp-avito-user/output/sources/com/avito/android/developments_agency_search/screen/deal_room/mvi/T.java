package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: DealRoomViewStateAssembler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class T implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.developments_agency_search.screen.deal_room.e> f137609a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f137610b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f137611c;

    public T(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f137609a = provider;
        this.f137610b = uVar;
        this.f137611c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new Q(this.f137609a.get(), (com.avito.android.developments_agency_search.screen.deal_room.i) this.f137610b.get(), (Context) this.f137611c.f393949a);
    }
}
