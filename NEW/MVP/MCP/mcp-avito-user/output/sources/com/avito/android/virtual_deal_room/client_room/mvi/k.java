package com.avito.android.virtual_deal_room.client_room.mvi;

import EN0.d;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f326408a;

    /* renamed from: b, reason: collision with root package name */
    public final f f326409b;

    /* renamed from: c, reason: collision with root package name */
    public final m f326410c;

    /* renamed from: d, reason: collision with root package name */
    public final o f326411d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f326412e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f326413f;

    public k(h hVar, f fVar, m mVar, o oVar, Provider provider, dagger.internal.l lVar) {
        this.f326408a = hVar;
        this.f326409b = fVar;
        this.f326410c = mVar;
        this.f326411d = oVar;
        this.f326412e = provider;
        this.f326413f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f326408a.get();
        e eVar = (e) this.f326409b.get();
        this.f326410c.getClass();
        l lVar = new l();
        n nVar = (n) this.f326411d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f326412e.get();
        ClientRoomArguments clientRoomArguments = (ClientRoomArguments) this.f326413f.f393949a;
        EN0.c.f3965s.getClass();
        d.c cVar = d.c.f3993a;
        String str = clientRoomArguments.f326339b;
        return new j("ClientRoom", new EN0.c(null, str, null, str, null, null, null, null, null, null, null, null, false, false, null, false, cVar, 4, null), new i(gVar, eVar, screenPerformanceTracker, nVar, lVar));
    }
}
