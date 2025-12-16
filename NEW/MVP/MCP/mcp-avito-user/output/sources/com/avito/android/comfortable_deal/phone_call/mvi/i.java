package com.avito.android.comfortable_deal.phone_call.mvi;

import Zp.C19585c;
import Zp.d;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneCallFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f122511a;

    /* renamed from: b, reason: collision with root package name */
    public final d f122512b;

    /* renamed from: c, reason: collision with root package name */
    public final m f122513c;

    /* renamed from: d, reason: collision with root package name */
    public final k f122514d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f122515e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f122516f;

    public i(f fVar, d dVar, m mVar, k kVar, Provider provider, dagger.internal.l lVar) {
        this.f122511a = fVar;
        this.f122512b = dVar;
        this.f122513c = mVar;
        this.f122514d = kVar;
        this.f122515e = provider;
        this.f122516f = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f122511a.get();
        c cVar = (c) this.f122512b.get();
        l lVar = (l) this.f122513c.get();
        this.f122514d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f122515e.get();
        PhoneCallArguments phoneCallArguments = (PhoneCallArguments) this.f122516f.f393949a;
        C19585c.f20495i.getClass();
        return new h("PhoneCall", new C19585c(phoneCallArguments.getF122479b(), phoneCallArguments.getF122480c(), null, false, true, false, d.c.f20506a), new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
