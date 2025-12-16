package com.avito.android.mortgage.sending_confirm.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendingConfirmFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final b f203577a;

    /* renamed from: b, reason: collision with root package name */
    public final d f203578b;

    /* renamed from: c, reason: collision with root package name */
    public final h f203579c;

    /* renamed from: d, reason: collision with root package name */
    public final j f203580d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f203581e;

    public f(b bVar, d dVar, h hVar, j jVar, Provider provider) {
        this.f203577a = bVar;
        this.f203578b = dVar;
        this.f203579c = hVar;
        this.f203580d = jVar;
        this.f203581e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f203577a.get();
        c cVar = (c) this.f203578b.get();
        this.f203579c.getClass();
        return new e(this.f203581e.get(), aVar, cVar, new g(), (i) this.f203580d.get());
    }
}
