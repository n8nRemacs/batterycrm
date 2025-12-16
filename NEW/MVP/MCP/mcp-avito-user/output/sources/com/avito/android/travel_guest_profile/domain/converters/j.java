package com.avito.android.travel_guest_profile.domain.converters;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileRatingDetailsConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final n f301952a;

    /* renamed from: b, reason: collision with root package name */
    public final l f301953b;

    /* renamed from: c, reason: collision with root package name */
    public final h f301954c;

    public j(n nVar, l lVar, h hVar) {
        this.f301952a = nVar;
        this.f301953b = lVar;
        this.f301954c = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((m) this.f301952a.get(), (k) this.f301953b.get(), (g) this.f301954c.get());
    }
}
