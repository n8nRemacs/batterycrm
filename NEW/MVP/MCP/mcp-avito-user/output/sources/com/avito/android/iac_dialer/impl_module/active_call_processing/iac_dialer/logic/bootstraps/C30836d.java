package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AnalyticsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30836d implements dagger.internal.h<AnalyticsBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.analytics.a> f165349a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.statsd.F> f165350b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165351c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f165352d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f165353e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f165354f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<IacTechInfoStorage> f165355g;

    public C30836d(dagger.internal.f fVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f165349a = provider;
        this.f165350b = provider2;
        this.f165351c = provider3;
        this.f165352d = fVar;
        this.f165353e = uVar;
        this.f165354f = provider4;
        this.f165355g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AnalyticsBootstrap(this.f165349a.get(), this.f165350b.get(), this.f165351c.get(), (InterfaceC28373a) this.f165352d.get(), (com.avito.android.iac_dialer.impl_module.analytics.i) this.f165353e.get(), this.f165354f.get(), this.f165355g.get());
    }
}
