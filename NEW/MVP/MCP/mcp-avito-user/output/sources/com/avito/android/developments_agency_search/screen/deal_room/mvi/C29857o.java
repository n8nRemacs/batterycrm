package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Bw.InterfaceC13195c;
import javax.inject.Provider;

/* compiled from: DealRoomActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29857o implements dagger.internal.h<C29856n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f137712a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC13195c> f137713b;

    public C29857o(dagger.internal.u uVar, Provider provider) {
        this.f137712a = uVar;
        this.f137713b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C29856n((u) this.f137712a.get(), this.f137713b.get());
    }
}
