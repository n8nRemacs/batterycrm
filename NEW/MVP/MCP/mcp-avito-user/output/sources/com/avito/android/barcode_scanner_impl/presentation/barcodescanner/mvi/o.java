package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi;

import bh.AbstractC25650c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BarcodeScannerFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final i f99022a;

    /* renamed from: b, reason: collision with root package name */
    public final g f99023b;

    /* renamed from: c, reason: collision with root package name */
    public final q f99024c;

    /* renamed from: d, reason: collision with root package name */
    public final s f99025d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f99026e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<j> f99027f;

    public o(i iVar, g gVar, q qVar, s sVar, Provider provider, Provider provider2) {
        this.f99022a = iVar;
        this.f99023b = gVar;
        this.f99024c = qVar;
        this.f99025d = sVar;
        this.f99026e = provider;
        this.f99027f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = (h) this.f99022a.get();
        f fVar = (f) this.f99023b.get();
        p pVar = (p) this.f99024c.get();
        this.f99025d.getClass();
        r rVar = new r();
        ScreenPerformanceTracker screenPerformanceTracker = this.f99026e.get();
        j jVar = this.f99027f.get();
        AbstractC25650c.f57385b.getClass();
        return new n("BarcodeScannerFeature", AbstractC25650c.f57386c, new m(hVar, fVar, screenPerformanceTracker, rVar, pVar, jVar));
    }
}
