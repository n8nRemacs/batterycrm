package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import e60.C39958c;
import javax.inject.Provider;

/* compiled from: ProfileToConvertFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final g f213173a;

    /* renamed from: b, reason: collision with root package name */
    public final b f213174b;

    /* renamed from: c, reason: collision with root package name */
    public final i f213175c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f213176d;

    /* renamed from: e, reason: collision with root package name */
    public final n f213177e;

    public l(g gVar, b bVar, i iVar, Provider provider, n nVar) {
        this.f213173a = gVar;
        this.f213174b = bVar;
        this.f213175c = iVar;
        this.f213176d = provider;
        this.f213177e = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f213173a.get();
        this.f213174b.getClass();
        a aVar = new a();
        h hVar = (h) this.f213175c.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f213176d.get();
        this.f213177e.getClass();
        return new k("ProfileToConvert", new C39958c(null, null, 3, null), new j(fVar, aVar, screenPerformanceTracker, new m(), hVar));
    }
}
