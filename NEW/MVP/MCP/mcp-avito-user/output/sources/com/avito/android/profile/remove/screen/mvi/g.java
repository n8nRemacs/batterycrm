package com.avito.android.profile.remove.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveItemsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f224180a;

    /* renamed from: b, reason: collision with root package name */
    public final b f224181b;

    /* renamed from: c, reason: collision with root package name */
    public final i f224182c;

    /* renamed from: d, reason: collision with root package name */
    public final l f224183d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f224184e;

    public g(d dVar, b bVar, i iVar, l lVar, Provider provider) {
        this.f224180a = dVar;
        this.f224181b = bVar;
        this.f224182c = iVar;
        this.f224183d = lVar;
        this.f224184e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f224180a.get();
        this.f224181b.getClass();
        a aVar = new a();
        this.f224182c.getClass();
        h hVar = new h();
        j jVar = (j) this.f224183d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f224184e.get();
        M90.c.f10426d.getClass();
        return new f("ProfileRemoveItems", M90.c.f10427e, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
