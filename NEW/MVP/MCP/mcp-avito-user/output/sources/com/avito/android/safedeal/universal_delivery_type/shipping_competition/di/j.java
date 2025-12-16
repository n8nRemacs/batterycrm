package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeShippingCompetitionTrackerModule_ProvidesScreenDiInjectTracker$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256804a;

    public j(u uVar) {
        this.f256804a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f256804a.get();
        i.f256802a.getClass();
        InterfaceC28499v interfaceC28499vB = h12.b(i.f256803b);
        t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
