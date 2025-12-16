package com.avito.android.early_access_advert.feedback_screen.mvi;

import Ux.C15581c;
import com.avito.android.analytics.screens.EarlyAccessAdvertFeedbackScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertFeedbackFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f145696a;

    /* renamed from: b, reason: collision with root package name */
    public final b f145697b;

    /* renamed from: c, reason: collision with root package name */
    public final i f145698c;

    /* renamed from: d, reason: collision with root package name */
    public final k f145699d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f145700e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f145696a = dVar;
        this.f145697b = bVar;
        this.f145698c = iVar;
        this.f145699d = kVar;
        this.f145700e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f145696a.get();
        a aVar = (a) this.f145697b.get();
        this.f145698c.getClass();
        h hVar = new h();
        this.f145699d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f145700e.get();
        C15581c.f16788g.getClass();
        return new f(EarlyAccessAdvertFeedbackScreen.f90345d.f90471b, C15581c.f16789h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
