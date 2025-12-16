package com.avito.android.publish.di;

import javax.inject.Provider;

/* compiled from: PublishModule_ProvideScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235120a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.analytics.screens.tracker.H> f235121b;

    public B(C33824o c33824o, Provider<com.avito.android.analytics.screens.tracker.H> provider) {
        this.f235120a = c33824o;
        this.f235121b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.analytics.screens.tracker.H h12 = this.f235121b.get();
        this.f235120a.getClass();
        com.avito.android.analytics.screens.o oVarA = h12.a();
        dagger.internal.t.d(oVarA);
        return oVarA;
    }
}
