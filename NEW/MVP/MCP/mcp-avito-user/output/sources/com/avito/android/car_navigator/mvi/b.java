package com.avito.android.car_navigator.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CarNavigatorActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f115196a;

    public b(u uVar) {
        this.f115196a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.car_navigator.presentation.d) this.f115196a.get());
    }
}
