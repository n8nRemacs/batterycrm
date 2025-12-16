package com.avito.android.guests_selector.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import hI.C40827a;
import javax.inject.Provider;

/* compiled from: GuestsSelectorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f161563a;

    /* renamed from: b, reason: collision with root package name */
    public final c f161564b;

    /* renamed from: c, reason: collision with root package name */
    public final j f161565c;

    /* renamed from: d, reason: collision with root package name */
    public final l f161566d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f161567e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f161563a = eVar;
        this.f161564b = cVar;
        this.f161565c = jVar;
        this.f161566d = lVar;
        this.f161567e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f161563a.get();
        this.f161564b.getClass();
        b bVar = new b();
        this.f161565c.getClass();
        i iVar = new i();
        k kVar = (k) this.f161566d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f161567e.get();
        C40827a.f397131n.getClass();
        return new g("GuestsSelector", C40827a.f397132o, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
