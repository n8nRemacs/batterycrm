package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfilesListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final d f213303a;

    /* renamed from: b, reason: collision with root package name */
    public final g f213304b;

    /* renamed from: c, reason: collision with root package name */
    public final i f213305c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f213306d;

    /* renamed from: e, reason: collision with root package name */
    public final n f213307e;

    public l(d dVar, g gVar, i iVar, Provider provider, n nVar) {
        this.f213303a = dVar;
        this.f213304b = gVar;
        this.f213305c = iVar;
        this.f213306d = provider;
        this.f213307e = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = (b) this.f213303a.get();
        f fVar = (f) this.f213304b.get();
        h hVar = (h) this.f213305c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213306d.get();
        this.f213307e.getClass();
        return new k("ProfilesList", new f60.c(false, false, false, false, null, null, 0, null, null, 511, null), new j(bVar, fVar, hVar, screenPerformanceTracker, new m()));
    }
}
