package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import com.avito.android.analytics.screens.o;
import com.avito.android.analytics.screens.tracker.H;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionTrackerModule_ProvidesScreenFlowTrackerProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class k implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f256805a;

    public k(Provider<H> provider) {
        this.f256805a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f256805a.get();
        i.f256802a.getClass();
        o oVarA = h12.a();
        t.d(oVarA);
        return oVarA;
    }
}
