package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import javax.inject.Provider;

/* compiled from: PersonFormFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class L implements dagger.internal.h<K> {

    /* renamed from: a, reason: collision with root package name */
    public final S f200883a;

    /* renamed from: b, reason: collision with root package name */
    public final C32666s f200884b;

    /* renamed from: c, reason: collision with root package name */
    public final N f200885c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f200886d;

    public L(S s5, C32666s c32666s, N n12, Provider provider) {
        this.f200883a = s5;
        this.f200884b = c32666s;
        this.f200885c = n12;
        this.f200886d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P p12 = (P) this.f200883a.get();
        C32649a c32649a = (C32649a) this.f200884b.get();
        this.f200885c.getClass();
        return new K(this.f200886d.get(), c32649a, new M(), p12);
    }
}
