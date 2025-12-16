package com.avito.android.virtual_deal_room.client_edit.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientEditFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f326236a;

    /* renamed from: b, reason: collision with root package name */
    public final d f326237b;

    /* renamed from: c, reason: collision with root package name */
    public final k f326238c;

    /* renamed from: d, reason: collision with root package name */
    public final n f326239d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f326240e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f326241f;

    public i(f fVar, d dVar, k kVar, n nVar, Provider provider, dagger.internal.l lVar) {
        this.f326236a = fVar;
        this.f326237b = dVar;
        this.f326238c = kVar;
        this.f326239d = nVar;
        this.f326240e = provider;
        this.f326241f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f326236a.get();
        b bVar = (b) this.f326237b.get();
        this.f326238c.getClass();
        j jVar = new j();
        l lVar = (l) this.f326239d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f326240e.get();
        ClientEditArguments clientEditArguments = (ClientEditArguments) this.f326241f.f393949a;
        CN0.c.f2146j.getClass();
        String str = clientEditArguments.f326194g;
        return new h("ClientEdit", new CN0.c(clientEditArguments.f326190c, clientEditArguments.f326191d, clientEditArguments.f326192e, clientEditArguments.f326193f, str, false, false, clientEditArguments.f326189b), new g(eVar, bVar, screenPerformanceTracker, lVar, jVar));
    }
}
