package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AccountsProfileErrorFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final d f212437a;

    /* renamed from: b, reason: collision with root package name */
    public final b f212438b;

    /* renamed from: c, reason: collision with root package name */
    public final i f212439c;

    /* renamed from: d, reason: collision with root package name */
    public final k f212440d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f212441e;

    public g(d dVar, b bVar, i iVar, k kVar, Provider provider) {
        this.f212437a = dVar;
        this.f212438b = bVar;
        this.f212439c = iVar;
        this.f212440d = kVar;
        this.f212441e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f212437a.getClass();
        c cVar = new c();
        this.f212438b.getClass();
        a aVar = new a();
        this.f212439c.getClass();
        h hVar = new h();
        j jVar = (j) this.f212440d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f212441e.get();
        Y50.c.f19298g.getClass();
        return new f("AccountsProfileError", Y50.c.f19299h, new e(cVar, aVar, screenPerformanceTracker, jVar, hVar));
    }
}
