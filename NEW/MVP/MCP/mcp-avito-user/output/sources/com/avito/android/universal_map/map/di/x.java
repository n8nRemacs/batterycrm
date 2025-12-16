package com.avito.android.universal_map.map.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.ownership.Owners;
import gj.InterfaceC40691b;
import gj.d;
import java.util.Collections;
import java.util.Set;
import javax.inject.Provider;
import kj.C42699b;
import pj.C47101d;

/* compiled from: UniversalMapFragmentModule_ProvideBeduinContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class x implements dagger.internal.h<InterfaceC40691b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f305163a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f305164b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Set<gj.f<?>>> f305165c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f305166d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f305167e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<C28478k> f305168f;

    public x(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, Provider provider, Provider provider2) {
        this.f305163a = uVar;
        this.f305164b = uVar2;
        this.f305165c = provider;
        this.f305166d = uVar3;
        this.f305167e = uVar4;
        this.f305168f = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        gj.d dVar = (gj.d) this.f305163a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f305164b.get();
        Set<gj.f<?>> set = this.f305165c.get();
        a.b bVar = (a.b) this.f305166d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f305167e.get();
        C28478k c28478k = this.f305168f.get();
        C35315v.f305153a.getClass();
        return d.a.a(dVar, aVar, bVar, new C47101d(screenPerformanceTracker), set, null, null, new C42699b(c28478k.f90636a.f90471b, Collections.singletonList(Owners.f210392B0), "UniversalMap", false, 8, null), 48);
    }
}
