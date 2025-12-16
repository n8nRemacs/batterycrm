package com.avito.android.intermediary_verification.presentation.mvi;

import com.avito.android.analytics.screens.IntermediaryVerificationScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mO.b;

/* compiled from: IntermediaryVerificationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f173194a;

    /* renamed from: b, reason: collision with root package name */
    public final d f173195b;

    /* renamed from: c, reason: collision with root package name */
    public final b f173196c;

    /* renamed from: d, reason: collision with root package name */
    public final i f173197d;

    /* renamed from: e, reason: collision with root package name */
    public final k f173198e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f173199f;

    public g(dagger.internal.l lVar, d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f173194a = lVar;
        this.f173195b = dVar;
        this.f173196c = bVar;
        this.f173197d = iVar;
        this.f173198e = kVar;
        this.f173199f = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        IntermediaryVerificationData intermediaryVerificationData = (IntermediaryVerificationData) this.f173194a.f393949a;
        c cVar = (c) this.f173195b.get();
        this.f173196c.getClass();
        a aVar = new a();
        this.f173197d.getClass();
        h hVar = new h();
        this.f173198e.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f173199f.get();
        mO.b.f414489c.getClass();
        b.a aVar2 = mO.b.f414489c;
        return new f(IntermediaryVerificationScreen.f90381d.f90471b, new mO.b(intermediaryVerificationData), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
