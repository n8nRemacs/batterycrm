package com.avito.android.str_seller_orders.strsellerordersdialog.mvi;

import Bz0.C13210c;
import com.avito.android.analytics.screens.StrSellerOrdersDialogScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerOrdersDialogFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f290158a;

    /* renamed from: b, reason: collision with root package name */
    public final b f290159b;

    /* renamed from: c, reason: collision with root package name */
    public final i f290160c;

    /* renamed from: d, reason: collision with root package name */
    public final k f290161d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f290162e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f290158a = dVar;
        this.f290159b = bVar;
        this.f290160c = iVar;
        this.f290161d = kVar;
        this.f290162e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c cVar = (c) this.f290158a.get();
        this.f290159b.getClass();
        a aVar = new a();
        this.f290160c.getClass();
        h hVar = new h();
        j jVar = (j) this.f290161d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f290162e.get();
        C13210c.f1836f.getClass();
        return new f(StrSellerOrdersDialogScreen.f90520d.f90471b, C13210c.f1837g, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
