package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FileDownloadFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f301794a;

    /* renamed from: b, reason: collision with root package name */
    public final d f301795b;

    /* renamed from: c, reason: collision with root package name */
    public final t f301796c;

    /* renamed from: d, reason: collision with root package name */
    public final v f301797d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f301798e;

    public j(f fVar, d dVar, t tVar, v vVar, Provider provider) {
        this.f301794a = fVar;
        this.f301795b = dVar;
        this.f301796c = tVar;
        this.f301797d = vVar;
        this.f301798e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f301794a.get();
        c cVar = (c) this.f301795b.get();
        this.f301796c.getClass();
        s sVar = new s();
        this.f301797d.getClass();
        u uVar = new u();
        ScreenPerformanceTracker screenPerformanceTracker = this.f301798e.get();
        HE0.c.f7018c.getClass();
        return new h(FileDownloadScreen.f301766d.f90471b, HE0.c.f7019d, new g(eVar, cVar, screenPerformanceTracker, uVar, sVar));
    }
}
