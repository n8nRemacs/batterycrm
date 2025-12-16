package com.avito.android.user_address.suggest.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAddressSuggestFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final o f308101a;

    /* renamed from: b, reason: collision with root package name */
    public final s f308102b;

    /* renamed from: c, reason: collision with root package name */
    public final u f308103c;

    /* renamed from: d, reason: collision with root package name */
    public final b f308104d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f308105e;

    public e(o oVar, s sVar, u uVar, b bVar, Provider provider) {
        this.f308101a = oVar;
        this.f308102b = sVar;
        this.f308103c = uVar;
        this.f308104d = bVar;
        this.f308105e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        g gVar = (g) this.f308101a.get();
        this.f308102b.getClass();
        r rVar = new r();
        this.f308103c.getClass();
        t tVar = new t();
        a aVar = (a) this.f308104d.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f308105e.get();
        UserAddressSuggestMviState.f308083b.getClass();
        return new d("UserAddressSuggest", UserAddressSuggestMviState.f308084c, new c(gVar, screenPerformanceTracker, rVar, tVar, aVar));
    }
}
