package com.avito.android.contact_access.di.service;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f126120a;

    public e(Provider<H> provider) {
        this.f126120a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f126120a.get();
        int i12 = c.f126118a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
