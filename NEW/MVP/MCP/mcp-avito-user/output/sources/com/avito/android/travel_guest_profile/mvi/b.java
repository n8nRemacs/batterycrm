package com.avito.android.travel_guest_profile.mvi;

import com.avito.android.travel_guest_profile.domain.interactors.p;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.interactors.e f302147a;

    /* renamed from: b, reason: collision with root package name */
    public final p f302148b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.interactors.b f302149c;

    public b(com.avito.android.travel_guest_profile.domain.interactors.e eVar, p pVar, com.avito.android.travel_guest_profile.domain.interactors.b bVar) {
        this.f302147a = eVar;
        this.f302148b = pVar;
        this.f302149c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.travel_guest_profile.domain.interactors.c) this.f302147a.get(), (com.avito.android.travel_guest_profile.domain.interactors.f) this.f302148b.get(), (com.avito.android.travel_guest_profile.domain.interactors.a) this.f302149c.get());
    }
}
