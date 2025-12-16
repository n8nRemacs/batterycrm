package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_fallback_screen.IacFinishedFallbackScreenArgument;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacFinishedFallbackScreenFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f166610a;

    /* renamed from: b, reason: collision with root package name */
    public final m f166611b;

    /* renamed from: c, reason: collision with root package name */
    public final o f166612c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f166613d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f166614e;

    /* renamed from: f, reason: collision with root package name */
    public final h f166615f;

    public k(f fVar, m mVar, o oVar, Provider provider, dagger.internal.l lVar, h hVar) {
        this.f166610a = fVar;
        this.f166611b = mVar;
        this.f166612c = oVar;
        this.f166613d = provider;
        this.f166614e = lVar;
        this.f166615f = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f166610a.get();
        l lVar = (l) this.f166611b.get();
        this.f166612c.getClass();
        n nVar = new n();
        ScreenPerformanceTracker screenPerformanceTracker = this.f166613d.get();
        IacFinishedFallbackScreenArgument iacFinishedFallbackScreenArgument = (IacFinishedFallbackScreenArgument) this.f166614e.f393949a;
        this.f166615f.getClass();
        return new j("IacFinishedFallbackScreen", new IacFinishedFallbackScreenState(iacFinishedFallbackScreenArgument, false), new i(aVar, new g(), screenPerformanceTracker, nVar, lVar));
    }
}
