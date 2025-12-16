package com.avito.android.verification.verification_status_list.mvi;

import YM0.b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StatusListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f325815a;

    /* renamed from: b, reason: collision with root package name */
    public final d f325816b;

    /* renamed from: c, reason: collision with root package name */
    public final m f325817c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325818d;

    public k(h hVar, d dVar, m mVar, Provider provider) {
        this.f325815a = hVar;
        this.f325816b = dVar;
        this.f325817c = mVar;
        this.f325818d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f325815a.get();
        c cVar = (c) this.f325816b.get();
        l lVar = (l) this.f325817c.get();
        return new j("VerificationStatusList", b.c.f19459b, new i(gVar, cVar, this.f325818d.get(), lVar));
    }
}
