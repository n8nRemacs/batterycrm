package com.avito.android.developments_agency_search.screen.deal_room.mvi;

import Cw.C13364c;
import com.avito.android.developments_agency_search.screen.deal_room.DealRoomScreen;

/* compiled from: DealRoomFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.developments_agency_search.screen.deal_room.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29861t implements dagger.internal.h<C29860s> {

    /* renamed from: a, reason: collision with root package name */
    public final C29859q f137724a;

    /* renamed from: b, reason: collision with root package name */
    public final C29857o f137725b;

    /* renamed from: c, reason: collision with root package name */
    public final C f137726c;

    /* renamed from: d, reason: collision with root package name */
    public final P f137727d;

    public C29861t(C29859q c29859q, C29857o c29857o, C c12, P p12) {
        this.f137724a = c29859q;
        this.f137725b = c29857o;
        this.f137726c = c12;
        this.f137727d = p12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29858p c29858p = (C29858p) this.f137724a.get();
        C29856n c29856n = (C29856n) this.f137725b.get();
        A a12 = (A) this.f137726c.get();
        O o12 = (O) this.f137727d.get();
        C13364c.f2777h.getClass();
        return new C29860s(DealRoomScreen.f137244d.f90471b, C13364c.f2778i, new r(c29858p, c29856n, o12, a12));
    }
}
