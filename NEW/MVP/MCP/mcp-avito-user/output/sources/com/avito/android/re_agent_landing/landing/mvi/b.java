package com.avito.android.re_agent_landing.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.re_agent_landing.landing.interactor.a> f250810a;

    public b(Provider<com.avito.android.re_agent_landing.landing.interactor.a> provider) {
        this.f250810a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f250810a.get());
    }
}
