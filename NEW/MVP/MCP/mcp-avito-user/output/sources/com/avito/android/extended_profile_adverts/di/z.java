package com.avito.android.extended_profile_adverts.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import javax.inject.Provider;

/* compiled from: PublicProfileAdvertsTrackerModule_ProvidesScreenDiInjectTracker$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class z implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f150837a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f150838b;

    public z(dagger.internal.l lVar, Provider provider) {
        this.f150837a = provider;
        this.f150838b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f150837a.get();
        boolean zBooleanValue = ((Boolean) this.f150838b.f393949a).booleanValue();
        y.f150835a.getClass();
        InterfaceC28499v interfaceC28499vB = zBooleanValue ? h12.b(y.f150836b) : h12.b(H.a.f90737a);
        dagger.internal.t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
