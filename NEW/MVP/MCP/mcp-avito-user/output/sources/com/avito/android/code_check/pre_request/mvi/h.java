package com.avito.android.code_check.pre_request.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PreRequestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f119218a;

    /* renamed from: b, reason: collision with root package name */
    public final j f119219b;

    /* renamed from: c, reason: collision with root package name */
    public final l f119220c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f119221d;

    public h(e eVar, j jVar, l lVar, Provider provider) {
        this.f119218a = eVar;
        this.f119219b = jVar;
        this.f119220c = lVar;
        this.f119221d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f119218a.get();
        this.f119219b.getClass();
        i iVar = new i();
        this.f119220c.getClass();
        k kVar = new k();
        return new g("PreRequest", So.b.f15151b, new f(aVar, this.f119221d.get(), kVar, iVar));
    }
}
