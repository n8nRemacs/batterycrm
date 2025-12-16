package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionsFeatureBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class F implements dagger.internal.h<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f314387a;

    /* renamed from: b, reason: collision with root package name */
    public final A f314388b;

    /* renamed from: c, reason: collision with root package name */
    public final H f314389c;

    /* renamed from: d, reason: collision with root package name */
    public final C f314390d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f314391e;

    public F(Provider provider, A a12, H h12, C c12, Provider provider2) {
        this.f314387a = provider;
        this.f314388b = a12;
        this.f314389c = h12;
        this.f314390d = c12;
        this.f314391e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f314387a.get();
        return new E("UserAdvertsActionsFeature", new UserAdvertsActionsState(null, null, null, null, 15, null), new D((C35641a) this.f314388b.get(), screenPerformanceTracker, (G) this.f314389c.get(), (B) this.f314390d.get(), this.f314391e.get()));
    }
}
