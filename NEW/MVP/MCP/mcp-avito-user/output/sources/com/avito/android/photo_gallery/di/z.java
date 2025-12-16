package com.avito.android.photo_gallery.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Provider;

/* compiled from: LegacyPhotoTrackerModule_ProvideScreenInitTrackerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class z implements dagger.internal.h<InterfaceC28501x> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f217075a;

    public z(Provider<H> provider) {
        this.f217075a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f217075a.get();
        int i12 = w.f217072a;
        InterfaceC28501x interfaceC28501xC = h12.c(H.a.f90737a);
        dagger.internal.t.d(interfaceC28501xC);
        return interfaceC28501xC;
    }
}
