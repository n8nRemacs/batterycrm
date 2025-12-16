package com.avito.android.re_agent_landing.landing.flows_dialog.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingFlowsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f250679a;

    public c(Provider<InterfaceC28373a> provider) {
        this.f250679a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f250679a.get());
    }
}
