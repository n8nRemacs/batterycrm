package com.avito.android.installments.form.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f172690a;

    public i(Provider<H> provider) {
        this.f172690a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f172690a.get();
        int i12 = f.f172687a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
