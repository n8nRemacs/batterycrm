package com.avito.android.vas_performance.screens.applied_services.ui;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: AppliedServicesViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.applied_services.mvi.h f320384a;

    public i(com.avito.android.vas_performance.screens.applied_services.mvi.h hVar) {
        this.f320384a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.screens.applied_services.mvi.g gVar = (com.avito.android.vas_performance.screens.applied_services.mvi.g) this.f320384a.get();
        i2.f411430a.getClass();
        return new h(gVar, i2.a.f411433c);
    }
}
