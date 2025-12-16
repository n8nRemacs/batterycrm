package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import com.avito.android.analytics.screens.UniversalDeliveryTypeScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.safedeal.universal_delivery_type.shipping_competition.di.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalDeliveryTypeShippingCompetitionTrackerModule_ProvidesScreenTrackerFactory$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f256806a;

    public l(Provider<InterfaceC28481c> provider) {
        this.f256806a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.e) this.f256806a).get();
        i.f256802a.getClass();
        UniversalDeliveryTypeScreen universalDeliveryTypeScreen = UniversalDeliveryTypeScreen.f90537d;
        r.f90693e.getClass();
        return interfaceC28481c.b(universalDeliveryTypeScreen, r.a.a());
    }
}
