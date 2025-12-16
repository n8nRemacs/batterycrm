package com.avito.android.str_seller_orders.orders.mvi;

import com.avito.android.analytics.screens.StrOrdersScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import mz0.C44158c;

/* compiled from: StrOrdersFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f288896a;

    /* renamed from: b, reason: collision with root package name */
    public final c f288897b;

    /* renamed from: c, reason: collision with root package name */
    public final j f288898c;

    /* renamed from: d, reason: collision with root package name */
    public final l f288899d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f288900e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f288896a = eVar;
        this.f288897b = cVar;
        this.f288898c = jVar;
        this.f288899d = lVar;
        this.f288900e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f288896a.get();
        b bVar = (b) this.f288897b.get();
        this.f288898c.getClass();
        i iVar = new i();
        this.f288899d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f288900e.get();
        String str = StrOrdersScreen.f90516d.f90471b;
        C44158c.f414839d.getClass();
        return new g(str, C44158c.f414840e, new f(dVar, bVar, iVar, screenPerformanceTracker, kVar));
    }
}
