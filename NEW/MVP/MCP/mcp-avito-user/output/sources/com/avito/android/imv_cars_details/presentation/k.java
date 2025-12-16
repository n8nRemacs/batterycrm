package com.avito.android.imv_cars_details.presentation;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.imv_cars_details.mvi.i f170251a;

    public k(com.avito.android.imv_cars_details.mvi.i iVar) {
        this.f170251a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.imv_cars_details.mvi.h) this.f170251a.get(), null, 2, null);
    }
}
