package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaChoosingPurchaseFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f97200a;

    /* renamed from: b, reason: collision with root package name */
    public final c f97201b;

    /* renamed from: c, reason: collision with root package name */
    public final o f97202c;

    /* renamed from: d, reason: collision with root package name */
    public final u f97203d;

    public k(h hVar, c cVar, o oVar, u uVar) {
        this.f97200a = hVar;
        this.f97201b = cVar;
        this.f97202c = oVar;
        this.f97203d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f97200a.get();
        b bVar = (b) this.f97201b.get();
        n nVar = (n) this.f97202c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f97203d.get();
        Hf.c.f7585d.getClass();
        return new j("AutotekaChoosingPurchase", Hf.c.f7586e, new i(fVar, bVar, nVar, screenPerformanceTracker));
    }
}
