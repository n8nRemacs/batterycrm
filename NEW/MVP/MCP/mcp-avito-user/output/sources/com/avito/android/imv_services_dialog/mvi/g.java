package com.avito.android.imv_services_dialog.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import jN.C42288c;
import javax.inject.Provider;

/* compiled from: ImvServicesDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f170803a;

    /* renamed from: b, reason: collision with root package name */
    public final b f170804b;

    /* renamed from: c, reason: collision with root package name */
    public final i f170805c;

    /* renamed from: d, reason: collision with root package name */
    public final k f170806d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f170807e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f170803a = dVar;
        this.f170804b = bVar;
        this.f170805c = iVar;
        this.f170806d = kVar;
        this.f170807e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f170803a.get();
        a aVar = (a) this.f170804b.get();
        this.f170805c.getClass();
        h hVar = new h();
        this.f170806d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f170807e.get();
        C42288c.f405594f.getClass();
        return new f("ImvServicesDialog", C42288c.f405595g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
