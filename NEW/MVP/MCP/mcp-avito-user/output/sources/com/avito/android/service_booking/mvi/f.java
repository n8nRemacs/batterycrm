package com.avito.android.service_booking.mvi;

import com.avito.android.service_booking.mvi.navigation.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SharedStepNavigationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.service_booking.mvi.navigation.mvi.h f274406a;

    public f(com.avito.android.service_booking.mvi.navigation.mvi.h hVar) {
        this.f274406a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f274406a.get(), null, 2, null);
    }
}
