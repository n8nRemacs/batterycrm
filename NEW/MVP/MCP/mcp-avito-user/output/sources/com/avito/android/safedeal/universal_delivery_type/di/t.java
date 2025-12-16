package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalDeliveryTypeTrackerModule_ProvidesScreenDiInjectTracker$_avito_safedeal_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f256616a;

    public t(dagger.internal.u uVar) {
        this.f256616a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f256616a.get();
        q.f256613a.getClass();
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        dagger.internal.t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
