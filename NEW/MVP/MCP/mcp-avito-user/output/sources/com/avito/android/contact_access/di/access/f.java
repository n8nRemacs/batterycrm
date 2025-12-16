package com.avito.android.contact_access.di.access;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f126090a;

    public f(Provider<H> provider) {
        this.f126090a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f126090a.get();
        int i12 = d.f126088a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
