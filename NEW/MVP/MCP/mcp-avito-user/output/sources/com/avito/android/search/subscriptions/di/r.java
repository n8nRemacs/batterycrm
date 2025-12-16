package com.avito.android.search.subscriptions.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionsTrackerModule_ProvideScreenDiInjectTracker$_avito_search_subscriptions_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f263950a;

    public r(dagger.internal.u uVar) {
        this.f263950a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f263950a.get();
        q qVar = q.f263949a;
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        dagger.internal.t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
