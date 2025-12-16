package com.avito.android.profile.remove.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f223965a;

    /* renamed from: b, reason: collision with root package name */
    public final b f223966b;

    /* renamed from: c, reason: collision with root package name */
    public final i f223967c;

    /* renamed from: d, reason: collision with root package name */
    public final k f223968d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f223969e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f223965a = dVar;
        this.f223966b = bVar;
        this.f223967c = iVar;
        this.f223968d = kVar;
        this.f223969e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f223965a.get();
        a aVar = (a) this.f223966b.get();
        this.f223967c.getClass();
        h hVar = new h();
        this.f223968d.getClass();
        j jVar = new j();
        ScreenPerformanceTracker screenPerformanceTracker = this.f223969e.get();
        K90.c.f9292e.getClass();
        return new f("ProfileRemove", K90.c.f9293f, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
