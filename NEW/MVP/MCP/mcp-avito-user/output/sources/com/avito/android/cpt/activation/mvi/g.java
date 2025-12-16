package com.avito.android.cpt.activation.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f126299a;

    /* renamed from: b, reason: collision with root package name */
    public final b f126300b;

    /* renamed from: c, reason: collision with root package name */
    public final i f126301c;

    /* renamed from: d, reason: collision with root package name */
    public final k f126302d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f126303e;

    /* renamed from: f, reason: collision with root package name */
    public final l f126304f;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider, l lVar) {
        this.f126299a = dVar;
        this.f126300b = bVar;
        this.f126301c = iVar;
        this.f126302d = kVar;
        this.f126303e = provider;
        this.f126304f = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f126299a.get();
        a aVar = (a) this.f126300b.get();
        this.f126301c.getClass();
        h hVar = new h();
        j jVar = (j) this.f126302d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f126303e.get();
        DeepLink deepLink = (DeepLink) this.f126304f.f393949a;
        Lr.c.f10137h.getClass();
        return new f("CptActivation", Lr.c.a(Lr.c.f10138i, false, null, null, null, deepLink, null, 47), new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
