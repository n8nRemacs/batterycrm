package com.avito.android.bxcontent.analytics;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.PresentationType;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import is0.InterfaceC42103e;
import javax.inject.Provider;

/* compiled from: BxContentTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f109494a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f109495b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n> f109496c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42103e> f109497d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<xI.e> f109498e;

    /* renamed from: f, reason: collision with root package name */
    public final u f109499f;

    public i(dagger.internal.l lVar, dagger.internal.l lVar2, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f109494a = lVar;
        this.f109495b = lVar2;
        this.f109496c = provider;
        this.f109497d = provider2;
        this.f109498e = provider3;
        this.f109499f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((PresentationType) this.f109494a.f393949a, (ScreenPerformanceTracker) this.f109495b.f393949a, dagger.internal.g.b(this.f109496c), dagger.internal.g.b(this.f109497d), dagger.internal.g.b(this.f109498e), dagger.internal.g.a(w.a(this.f109499f)));
    }
}
