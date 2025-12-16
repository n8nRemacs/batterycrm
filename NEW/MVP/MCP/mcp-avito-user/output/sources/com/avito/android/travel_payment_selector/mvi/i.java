package com.avito.android.travel_payment_selector.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lF0.C43630c;

/* compiled from: PaymentSelectorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f302672a;

    /* renamed from: b, reason: collision with root package name */
    public final d f302673b;

    /* renamed from: c, reason: collision with root package name */
    public final k f302674c;

    /* renamed from: d, reason: collision with root package name */
    public final m f302675d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f302676e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f302672a = fVar;
        this.f302673b = dVar;
        this.f302674c = kVar;
        this.f302675d = mVar;
        this.f302676e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f302672a.get();
        c cVar = (c) this.f302673b.get();
        this.f302674c.getClass();
        j jVar = new j();
        l lVar = (l) this.f302675d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f302676e.get();
        C43630c.f413675j.getClass();
        return new h("PaymentSelector", C43630c.f413676k, new g(eVar, cVar, screenPerformanceTracker, lVar, jVar));
    }
}
