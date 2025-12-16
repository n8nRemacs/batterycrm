package com.avito.android.phone_reverification_info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneReverificationInfoFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final e f216173a;

    /* renamed from: b, reason: collision with root package name */
    public final c f216174b;

    /* renamed from: c, reason: collision with root package name */
    public final j f216175c;

    /* renamed from: d, reason: collision with root package name */
    public final l f216176d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f216177e;

    public h(e eVar, c cVar, j jVar, l lVar, Provider provider) {
        this.f216173a = eVar;
        this.f216174b = cVar;
        this.f216175c = jVar;
        this.f216176d = lVar;
        this.f216177e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f216173a.get();
        b bVar = (b) this.f216174b.get();
        this.f216175c.getClass();
        i iVar = new i();
        this.f216176d.getClass();
        k kVar = new k();
        ScreenPerformanceTracker screenPerformanceTracker = this.f216177e.get();
        y70.c.f442948e.getClass();
        return new g("PhoneReverificationInfo", y70.c.f442949f, new f(dVar, bVar, screenPerformanceTracker, kVar, iVar));
    }
}
