package com.avito.android.verification.verification_finish.mvi;

import QM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FinishFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f325293a;

    /* renamed from: b, reason: collision with root package name */
    public final d f325294b;

    /* renamed from: c, reason: collision with root package name */
    public final k f325295c;

    /* renamed from: d, reason: collision with root package name */
    public final m f325296d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325297e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f325293a = fVar;
        this.f325294b = dVar;
        this.f325295c = kVar;
        this.f325296d = mVar;
        this.f325297e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f325293a.get();
        c cVar = (c) this.f325294b.get();
        this.f325295c.getClass();
        j jVar = new j();
        l lVar = (l) this.f325296d.get();
        return new h("VerificationFinish", c.C0901c.f13701b, new g(eVar, cVar, this.f325297e.get(), lVar, jVar));
    }
}
