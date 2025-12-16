package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentScreen;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealRoomDevelopmentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f137946a;

    /* renamed from: b, reason: collision with root package name */
    public final f f137947b;

    /* renamed from: c, reason: collision with root package name */
    public final m f137948c;

    /* renamed from: d, reason: collision with root package name */
    public final o f137949d;

    public k(h hVar, f fVar, m mVar, o oVar) {
        this.f137946a = hVar;
        this.f137947b = fVar;
        this.f137948c = mVar;
        this.f137949d = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f137946a.get();
        d dVar = (d) this.f137947b.get();
        l lVar = (l) this.f137948c.get();
        n nVar = (n) this.f137949d.get();
        Dw.d.f3548d.getClass();
        return new j(DealRoomDevelopmentScreen.f137845d.f90471b, Dw.d.f3549e, new i(gVar, dVar, nVar, lVar));
    }
}
