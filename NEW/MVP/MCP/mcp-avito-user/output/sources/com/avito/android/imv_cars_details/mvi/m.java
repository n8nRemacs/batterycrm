package com.avito.android.imv_cars_details.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvCarsDetailsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f170009a;

    public m(u uVar) {
        this.f170009a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.imv_cars_details.presentation.a) this.f170009a.get());
    }
}
