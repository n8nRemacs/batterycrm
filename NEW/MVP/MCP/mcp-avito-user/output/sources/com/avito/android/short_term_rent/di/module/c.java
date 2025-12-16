package com.avito.android.short_term_rent.di.module;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import gj.d;
import javax.inject.Provider;
import kj.C42699b;
import kotlin.collections.C42745f0;
import pj.C47101d;

/* compiled from: StrBookingBeduinModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<gj.d> f282327a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f282328b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a.b> f282329c;

    /* renamed from: d, reason: collision with root package name */
    public final u f282330d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C28478k> f282331e;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f282327a = provider;
        this.f282328b = provider2;
        this.f282329c = provider3;
        this.f282330d = uVar;
        this.f282331e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = this.f282327a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f282328b.get();
        a.b bVar = this.f282329c.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f282330d.get();
        C28478k c28478k = this.f282331e.get();
        a.f282326a.getClass();
        return d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), null, null, null, new C42699b(c28478k.f90636a.f90471b, C42745f0.U(Owners.f210511l3, Owners.f210519n3), "StrBooking", false, 8, null), 56);
    }
}
