package com.avito.android.loyalty.ui.quality_service;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: QualityServiceViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.loyalty.ui.quality_service.mvi.m f184031a;

    public q(com.avito.android.loyalty.ui.quality_service.mvi.m mVar) {
        this.f184031a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.loyalty.ui.quality_service.mvi.l lVar = (com.avito.android.loyalty.ui.quality_service.mvi.l) this.f184031a.get();
        i2.f411430a.getClass();
        return new p(lVar, i2.a.f411433c);
    }
}
