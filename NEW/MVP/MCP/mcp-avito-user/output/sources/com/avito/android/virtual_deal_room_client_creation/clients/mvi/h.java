package com.avito.android.virtual_deal_room_client_creation.clients.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f326663a;

    /* renamed from: b, reason: collision with root package name */
    public final c f326664b;

    /* renamed from: c, reason: collision with root package name */
    public final j f326665c;

    /* renamed from: d, reason: collision with root package name */
    public final l f326666d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f326667e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f326663a = eVar;
        this.f326664b = cVar;
        this.f326665c = jVar;
        this.f326666d = lVar;
        this.f326667e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f326663a.get();
        b bVar = (b) this.f326664b.get();
        this.f326665c.getClass();
        i iVar = new i();
        k kVar = (k) this.f326666d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f326667e.get();
        NN0.c.f11402i.getClass();
        return new g("Clients", NN0.c.f11403j, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
