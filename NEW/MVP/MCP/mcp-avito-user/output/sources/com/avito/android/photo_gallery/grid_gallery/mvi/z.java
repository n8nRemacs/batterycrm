package com.avito.android.photo_gallery.grid_gallery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: GridGalleryFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final w f217417a;

    /* renamed from: b, reason: collision with root package name */
    public final s f217418b;

    /* renamed from: c, reason: collision with root package name */
    public final B f217419c;

    /* renamed from: d, reason: collision with root package name */
    public final D f217420d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f217421e;

    public z(w wVar, s sVar, B b12, D d12, Provider provider) {
        this.f217417a = wVar;
        this.f217418b = sVar;
        this.f217419c = b12;
        this.f217420d = d12;
        this.f217421e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = (v) this.f217417a.get();
        n nVar = (n) this.f217418b.get();
        this.f217419c.getClass();
        A a12 = new A();
        C c12 = (C) this.f217420d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f217421e.get();
        T70.e.f15415j.getClass();
        return new y("GridGallery", T70.e.f15416k, new x(vVar, nVar, screenPerformanceTracker, c12, a12));
    }
}
