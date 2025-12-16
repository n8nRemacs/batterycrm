package com.avito.android.advert.auto_flats_bottom_sheet.autoflatstwocolumndialog.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoFlatsTwoColumnDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f68721a;

    /* renamed from: b, reason: collision with root package name */
    public final b f68722b;

    /* renamed from: c, reason: collision with root package name */
    public final i f68723c;

    /* renamed from: d, reason: collision with root package name */
    public final k f68724d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f68725e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f68721a = dVar;
        this.f68722b = bVar;
        this.f68723c = iVar;
        this.f68724d = kVar;
        this.f68725e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f68721a.get();
        a aVar = (a) this.f68722b.get();
        this.f68723c.getClass();
        h hVar = new h();
        this.f68724d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f68725e.get();
        U3.c.f16138f.getClass();
        return new f("AutoFlatsTwoColumnDialog", U3.c.f16139g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
