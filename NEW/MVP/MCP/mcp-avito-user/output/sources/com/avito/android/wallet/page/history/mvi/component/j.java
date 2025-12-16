package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentHistoryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f328033a;

    /* renamed from: b, reason: collision with root package name */
    public final e f328034b;

    /* renamed from: c, reason: collision with root package name */
    public final r f328035c;

    /* renamed from: d, reason: collision with root package name */
    public final t f328036d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f328037e;

    public j(g gVar, e eVar, r rVar, t tVar, Provider provider) {
        this.f328033a = gVar;
        this.f328034b = eVar;
        this.f328035c = rVar;
        this.f328036d = tVar;
        this.f328037e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f328033a.get();
        a aVar = (a) this.f328034b.get();
        this.f328035c.getClass();
        q qVar = new q();
        s sVar = (s) this.f328036d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f328037e.get();
        VO0.d.f17122e.getClass();
        return new i("PaymentHistory", VO0.d.f17123f, new h(fVar, aVar, screenPerformanceTracker, sVar, qVar));
    }
}
