package com.avito.android.auto_select.contact_me.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import gf.C40672c;
import javax.inject.Provider;

/* compiled from: AutoSelectContactMeFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final c f96016a;

    /* renamed from: b, reason: collision with root package name */
    public final l f96017b;

    /* renamed from: c, reason: collision with root package name */
    public final e f96018c;

    /* renamed from: d, reason: collision with root package name */
    public final j f96019d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f96020e;

    public h(c cVar, l lVar, e eVar, j jVar, Provider provider) {
        this.f96016a = cVar;
        this.f96017b = lVar;
        this.f96018c = eVar;
        this.f96019d = jVar;
        this.f96020e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f96016a.getClass();
        b bVar = new b();
        this.f96017b.getClass();
        k kVar = new k();
        d dVar = (d) this.f96018c.get();
        i iVar = (i) this.f96019d.get();
        return new g("AutoSelectContactMe", new C40672c(null, null, null, 7, null), new f(bVar, this.f96020e.get(), kVar, dVar, iVar));
    }
}
