package com.avito.android.extended_profile_adverts.di;

import com.avito.android.analytics.screens.tracker.H;
import javax.inject.Provider;

/* compiled from: PublicProfileAdvertsTrackerModule_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f150595a;

    public A(Provider<H> provider) {
        this.f150595a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f150595a.get();
        y.f150835a.getClass();
        com.avito.android.analytics.screens.o oVarA = h12.a();
        dagger.internal.t.d(oVarA);
        return oVarA;
    }
}
