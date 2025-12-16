package com.avito.android.mortgage.phone_confirm.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneConfirmFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final d f201655a;

    /* renamed from: b, reason: collision with root package name */
    public final f f201656b;

    /* renamed from: c, reason: collision with root package name */
    public final j f201657c;

    /* renamed from: d, reason: collision with root package name */
    public final l f201658d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f201659e;

    public h(d dVar, f fVar, j jVar, l lVar, Provider provider) {
        this.f201655a = dVar;
        this.f201656b = fVar;
        this.f201657c = jVar;
        this.f201658d = lVar;
        this.f201659e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f201655a.get();
        e eVar = (e) this.f201656b.get();
        this.f201657c.getClass();
        return new g(this.f201659e.get(), cVar, eVar, new i(), (k) this.f201658d.get());
    }
}
