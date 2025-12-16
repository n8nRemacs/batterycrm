package com.avito.android.photo_gallery.di;

import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;

/* compiled from: LegacyPhotoTrackerModule_ProvideScreenDiInjectTracker$_avito_photo_gallery_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class x implements dagger.internal.h<InterfaceC28499v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f217073a;

    public x(dagger.internal.u uVar) {
        this.f217073a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = (H) this.f217073a.get();
        int i12 = w.f217072a;
        InterfaceC28499v interfaceC28499vB = h12.b(H.a.f90737a);
        dagger.internal.t.d(interfaceC28499vB);
        return interfaceC28499vB;
    }
}
