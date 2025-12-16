package com.avito.android.travel_guest_profile.mvi;

import com.avito.android.travel_guest_profile.domain.interactors.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.interactors.e f302158a;

    /* renamed from: b, reason: collision with root package name */
    public final p f302159b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f302160c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f302161d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f302162e;

    public d(com.avito.android.travel_guest_profile.domain.interactors.e eVar, p pVar, dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f302158a = eVar;
        this.f302159b = pVar;
        this.f302160c = lVar;
        this.f302161d = lVar2;
        this.f302162e = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.travel_guest_profile.domain.interactors.c) this.f302158a.get(), (com.avito.android.travel_guest_profile.domain.interactors.f) this.f302159b.get(), (String) this.f302160c.f393949a, (String) this.f302161d.f393949a, (String) this.f302162e.f393949a);
    }
}
