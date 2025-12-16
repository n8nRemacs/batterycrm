package com.avito.android.verification.verification_passport.mvi;

import VM0.c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f325738a;

    /* renamed from: b, reason: collision with root package name */
    public final l f325739b;

    /* renamed from: c, reason: collision with root package name */
    public final n f325740c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325741d;

    public j(g gVar, l lVar, n nVar, Provider provider) {
        this.f325738a = gVar;
        this.f325739b = lVar;
        this.f325740c = nVar;
        this.f325741d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f325738a.get();
        this.f325739b.getClass();
        k kVar = new k();
        this.f325740c.getClass();
        m mVar = new m();
        return new i("PassportVerification", c.a.f17101b, new h(fVar, this.f325741d.get(), mVar, kVar));
    }
}
