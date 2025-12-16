package com.avito.android.re_agent_landing.di;

import Qh0.C14897a;
import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ReAgentProfileCreateLandingFeaturesModule_ProvideReAgentProfileCreateLandingFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<C14897a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f250547a;

    public e(Provider<C34161r> provider) {
        this.f250547a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f250547a.get();
        d.f250546a.getClass();
        return (C14897a) c34161r.f246393a.b(C14897a.class);
    }
}
