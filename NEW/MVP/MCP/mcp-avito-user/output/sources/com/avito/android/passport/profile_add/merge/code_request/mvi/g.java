package com.avito.android.passport.profile_add.merge.code_request.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final b f212885a;

    /* renamed from: b, reason: collision with root package name */
    public final l f212886b;

    /* renamed from: c, reason: collision with root package name */
    public final i f212887c;

    /* renamed from: d, reason: collision with root package name */
    public final d f212888d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212889e;

    public g(b bVar, l lVar, i iVar, d dVar, Provider provider) {
        this.f212885a = bVar;
        this.f212886b = lVar;
        this.f212887c = iVar;
        this.f212888d = dVar;
        this.f212889e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f212885a.get();
        k kVar = (k) this.f212886b.get();
        this.f212887c.getClass();
        h hVar = new h();
        c cVar = (c) this.f212888d.get();
        return new f("CodeRequest", new c60.c(false, false, false, null, null, 0L, 63, null), new e(aVar, kVar, this.f212889e.get(), hVar, cVar));
    }
}
