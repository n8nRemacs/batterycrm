package com.avito.android.re_agent_landing.landing.interactor;

import Nh0.InterfaceC14577a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14577a> f250709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f250710b;

    public c(Provider<InterfaceC14577a> provider, Provider<R0> provider2) {
        this.f250709a = provider;
        this.f250710b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f250709a.get(), this.f250710b.get());
    }
}
