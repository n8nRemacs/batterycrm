package com.avito.android.category_with_params.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.category_with_params.mvi.entity.CategoryWithParamsState;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryWithParamsFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f117704a;

    /* renamed from: b, reason: collision with root package name */
    public final c f117705b;

    /* renamed from: c, reason: collision with root package name */
    public final j f117706c;

    /* renamed from: d, reason: collision with root package name */
    public final l f117707d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f117708e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f117704a = eVar;
        this.f117705b = cVar;
        this.f117706c = jVar;
        this.f117707d = lVar;
        this.f117708e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f117704a.get();
        this.f117705b.getClass();
        b bVar = new b();
        this.f117706c.getClass();
        i iVar = new i();
        k kVar = (k) this.f117707d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f117708e.get();
        CategoryWithParamsState.f117693f.getClass();
        return new g("CategoryWithParams", CategoryWithParamsState.f117694g, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
