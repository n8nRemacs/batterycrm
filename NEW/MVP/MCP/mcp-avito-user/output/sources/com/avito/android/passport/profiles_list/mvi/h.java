package com.avito.android.passport.profiles_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import j60.C42206c;

/* compiled from: PassportProfilesListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f213842a;

    /* renamed from: b, reason: collision with root package name */
    public final b f213843b;

    /* renamed from: c, reason: collision with root package name */
    public final j f213844c;

    /* renamed from: d, reason: collision with root package name */
    public final m f213845d;

    /* renamed from: e, reason: collision with root package name */
    public final u f213846e;

    public h(e eVar, b bVar, j jVar, m mVar, u uVar) {
        this.f213842a = eVar;
        this.f213843b = bVar;
        this.f213844c = jVar;
        this.f213845d = mVar;
        this.f213846e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f213842a.get();
        a aVar = (a) this.f213843b.get();
        i iVar = (i) this.f213844c.get();
        k kVar = (k) this.f213845d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f213846e.get();
        C42206c.f405436h.getClass();
        return new g("PassportProfilesList", C42206c.f405437i, new f(dVar, aVar, screenPerformanceTracker, kVar, iVar));
    }
}
