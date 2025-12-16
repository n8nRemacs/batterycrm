package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.d;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FetchInvoiceFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f325217a;

    /* renamed from: b, reason: collision with root package name */
    public final e f325218b;

    /* renamed from: c, reason: collision with root package name */
    public final l f325219c;

    /* renamed from: d, reason: collision with root package name */
    public final n f325220d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f325221e;

    public j(g gVar, e eVar, l lVar, n nVar, Provider provider) {
        this.f325217a = gVar;
        this.f325218b = eVar;
        this.f325219c = lVar;
        this.f325220d = nVar;
        this.f325221e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f325217a.get();
        a aVar = (a) this.f325218b.get();
        this.f325219c.getClass();
        k kVar = new k();
        m mVar = (m) this.f325220d.get();
        return new i("verification_fetch_invoice", d.c.f12220b, new h(fVar, aVar, this.f325221e.get(), mVar, kVar));
    }
}
