package com.avito.android.realty_agency.checkerboard.mvi;

import Xh0.C17011a;
import Xh0.C17012b;

/* compiled from: CheckerboardReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final C17012b f251226a;

    public E(C17012b c17012b) {
        this.f251226a = c17012b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((C17011a) this.f251226a.get());
    }
}
