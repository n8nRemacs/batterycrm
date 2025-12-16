package com.avito.android.license.mvi;

import YV.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LicenseFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final b f181532a;

    /* renamed from: b, reason: collision with root package name */
    public final g f181533b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f181534c;

    public e(b bVar, g gVar, Provider provider) {
        this.f181532a = bVar;
        this.f181533b = gVar;
        this.f181534c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = (a) this.f181532a.get();
        this.f181533b.getClass();
        f fVar = new f();
        return new d("License", a.C1380a.f19485b, new c(aVar, this.f181534c.get(), fVar));
    }
}
