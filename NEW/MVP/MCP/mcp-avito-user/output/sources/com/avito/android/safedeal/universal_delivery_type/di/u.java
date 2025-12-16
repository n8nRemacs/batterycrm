package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeTrackerModule_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class u implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f256617a;

    public u(Provider<H> provider) {
        this.f256617a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f256617a.get();
        q.f256613a.getClass();
        com.avito.android.analytics.screens.o oVarA = h12.a();
        dagger.internal.t.d(oVarA);
        return oVarA;
    }
}
