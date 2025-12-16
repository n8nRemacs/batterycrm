package com.avito.android.edit_seller_type.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.edit_seller_type.mvi.entity.c;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditSellerTypeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f146840a;

    /* renamed from: b, reason: collision with root package name */
    public final d f146841b;

    /* renamed from: c, reason: collision with root package name */
    public final k f146842c;

    /* renamed from: d, reason: collision with root package name */
    public final m f146843d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f146844e;

    public i(f fVar, d dVar, k kVar, m mVar, Provider provider) {
        this.f146840a = fVar;
        this.f146841b = dVar;
        this.f146842c = kVar;
        this.f146843d = mVar;
        this.f146844e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = (e) this.f146840a.get();
        c cVar = (c) this.f146841b.get();
        this.f146842c.getClass();
        j jVar = new j();
        this.f146843d.getClass();
        l lVar = new l();
        return new h("EditSellerType", c.C4273c.f146810b, new g(eVar, cVar, this.f146844e.get(), lVar, jVar));
    }
}
