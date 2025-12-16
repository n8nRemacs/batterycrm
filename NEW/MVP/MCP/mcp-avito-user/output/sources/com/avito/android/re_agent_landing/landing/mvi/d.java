package com.avito.android.re_agent_landing.landing.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.re_agent_landing.landing.ReAgentProfileCreateLandingArgs;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.re_agent_landing.landing.interactor.a> f250819a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f250820b;

    /* renamed from: c, reason: collision with root package name */
    public final l f250821c;

    public d(l lVar, Provider provider, Provider provider2) {
        this.f250819a = provider;
        this.f250820b = provider2;
        this.f250821c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f250819a.get(), this.f250820b.get(), (ReAgentProfileCreateLandingArgs) this.f250821c.f393949a);
    }
}
