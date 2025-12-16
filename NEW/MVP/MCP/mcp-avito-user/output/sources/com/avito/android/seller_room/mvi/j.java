package com.avito.android.seller_room.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SellerRoomFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f268154a;

    /* renamed from: b, reason: collision with root package name */
    public final c f268155b;

    /* renamed from: c, reason: collision with root package name */
    public final g f268156c;

    /* renamed from: d, reason: collision with root package name */
    public final l f268157d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f268158e;

    public j(e eVar, c cVar, g gVar, l lVar, dagger.internal.l lVar2) {
        this.f268154a = eVar;
        this.f268155b = cVar;
        this.f268156c = gVar;
        this.f268157d = lVar;
        this.f268158e = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f268154a.get();
        b bVar = (b) this.f268155b.get();
        this.f268156c.getClass();
        f fVar = new f();
        this.f268157d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f268158e.f393949a;
        Vq0.c.f17420c.getClass();
        return new i("SellerRoomScreen", Vq0.c.f17421d, new h(dVar, bVar, screenPerformanceTracker, kVar, fVar));
    }
}
