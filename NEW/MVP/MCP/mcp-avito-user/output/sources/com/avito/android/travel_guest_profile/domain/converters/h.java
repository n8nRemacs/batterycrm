package com.avito.android.travel_guest_profile.domain.converters;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileRatingBuyerReviewConverter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final p f301946a;

    /* renamed from: b, reason: collision with root package name */
    public final d f301947b;

    public h(p pVar, d dVar) {
        this.f301946a = pVar;
        this.f301947b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f301946a.getClass();
        o oVar = new o();
        this.f301947b.getClass();
        return new g(oVar, new c());
    }
}
