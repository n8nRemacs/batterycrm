package com.avito.android.virtual_deal_room_client_creation.create.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f326855a;

    /* renamed from: b, reason: collision with root package name */
    public final g f326856b;

    /* renamed from: c, reason: collision with root package name */
    public final i f326857c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f326858d;

    public e(b bVar, g gVar, i iVar, Provider provider) {
        this.f326855a = bVar;
        this.f326856b = gVar;
        this.f326857c = iVar;
        this.f326858d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f326855a.get();
        this.f326856b.getClass();
        f fVar = new f();
        h hVar = (h) this.f326857c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f326858d.get();
        RN0.c.f14425k.getClass();
        return new d("Create", RN0.c.f14426l, new c(aVar, screenPerformanceTracker, hVar, fVar));
    }
}
