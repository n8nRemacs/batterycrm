package com.avito.android.photo_gallery.di;

import com.avito.android.analytics.screens.tracker.H;
import javax.inject.Provider;

/* compiled from: LegacyPhotoTrackerModule_ProvideScreenFlowTracker$_avito_photo_gallery_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class y implements dagger.internal.h<com.avito.android.analytics.screens.o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<H> f217074a;

    public y(Provider<H> provider) {
        this.f217074a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        H h12 = this.f217074a.get();
        int i12 = w.f217072a;
        com.avito.android.analytics.screens.o oVarA = h12.a();
        dagger.internal.t.d(oVarA);
        return oVarA;
    }
}
