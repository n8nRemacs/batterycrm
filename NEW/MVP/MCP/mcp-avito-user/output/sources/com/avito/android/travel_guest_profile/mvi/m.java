package com.avito.android.travel_guest_profile.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileViewStateBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.c f302202a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.converters.b f302203b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.travel_guest_profile.domain.converters.j f302204c;

    public m(com.avito.android.travel_guest_profile.domain.c cVar, com.avito.android.travel_guest_profile.domain.converters.b bVar, com.avito.android.travel_guest_profile.domain.converters.j jVar) {
        this.f302202a = cVar;
        this.f302203b = bVar;
        this.f302204c = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f302202a.getClass();
        com.avito.android.travel_guest_profile.domain.b bVar = new com.avito.android.travel_guest_profile.domain.b();
        this.f302203b.getClass();
        return new l(bVar, new com.avito.android.travel_guest_profile.domain.converters.a(), (com.avito.android.travel_guest_profile.domain.converters.i) this.f302204c.get());
    }
}
