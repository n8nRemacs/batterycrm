package com.avito.android.success.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import eA0.C39981c;
import javax.inject.Provider;

/* compiled from: SuccessFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f291687a;

    /* renamed from: b, reason: collision with root package name */
    public final d f291688b;

    /* renamed from: c, reason: collision with root package name */
    public final k f291689c;

    /* renamed from: d, reason: collision with root package name */
    public final m f291690d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f291691e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f291687a = fVar;
        this.f291688b = dVar;
        this.f291689c = kVar;
        this.f291690d = mVar;
        this.f291691e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f291687a.get();
        c cVar = (c) this.f291688b.get();
        this.f291689c.getClass();
        j jVar = new j();
        this.f291690d.getClass();
        l lVar = new l();
        return new h("Success", new C39981c(null, 1, null), new g(eVar, cVar, jVar, this.f291691e.get(), lVar));
    }
}
