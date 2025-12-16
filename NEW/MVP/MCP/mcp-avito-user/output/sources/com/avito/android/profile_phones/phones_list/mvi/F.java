package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviState;

/* compiled from: PhonesListMviFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final C f227911a;

    /* renamed from: b, reason: collision with root package name */
    public final w f227912b;

    /* renamed from: c, reason: collision with root package name */
    public final M f227913c;

    /* renamed from: d, reason: collision with root package name */
    public final P f227914d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f227915e;

    public F(C c12, w wVar, M m12, P p12, dagger.internal.u uVar) {
        this.f227911a = c12;
        this.f227912b = wVar;
        this.f227913c = m12;
        this.f227914d = p12;
        this.f227915e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        B b12 = (B) this.f227911a.get();
        C33433e c33433e = (C33433e) this.f227912b.get();
        L l12 = (L) this.f227913c.get();
        N n12 = (N) this.f227914d.get();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f227915e.get();
        PhonesListMviState.f228016r.getClass();
        return new E("PhonesListMvi", PhonesListMviState.f228017s, new D(b12, c33433e, screenPerformanceTracker, n12, l12));
    }
}
