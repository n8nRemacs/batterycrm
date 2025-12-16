package com.avito.android.developments_agency_search.screen.deal_room.mvi;

/* compiled from: DealRoomReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.f f137600a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.h f137601b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.b f137602c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.screen.deal_room.use_case.d f137603d;

    /* renamed from: e, reason: collision with root package name */
    public final T f137604e;

    public P(com.avito.android.developments_agency_search.screen.deal_room.use_case.f fVar, com.avito.android.developments_agency_search.screen.deal_room.use_case.h hVar, com.avito.android.developments_agency_search.screen.deal_room.use_case.b bVar, com.avito.android.developments_agency_search.screen.deal_room.use_case.d dVar, T t12) {
        this.f137600a = fVar;
        this.f137601b = hVar;
        this.f137602c = bVar;
        this.f137603d = dVar;
        this.f137604e = t12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.developments_agency_search.screen.deal_room.use_case.e eVar = (com.avito.android.developments_agency_search.screen.deal_room.use_case.e) this.f137600a.get();
        this.f137601b.getClass();
        com.avito.android.developments_agency_search.screen.deal_room.use_case.g gVar = new com.avito.android.developments_agency_search.screen.deal_room.use_case.g();
        com.avito.android.developments_agency_search.screen.deal_room.use_case.a aVar = (com.avito.android.developments_agency_search.screen.deal_room.use_case.a) this.f137602c.get();
        this.f137603d.getClass();
        return new O(eVar, gVar, aVar, new com.avito.android.developments_agency_search.screen.deal_room.use_case.c(), (Q) this.f137604e.get());
    }
}
