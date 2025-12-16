package com.avito.android.mortgage.landing;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.mvi.m f200326a;

    public r(com.avito.android.mortgage.landing.mvi.m mVar) {
        this.f200326a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.mortgage.landing.mvi.l) this.f200326a.get(), null, 2, null);
    }
}
