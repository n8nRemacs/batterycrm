package com.avito.android.comfortable_deal.deal.mvi;

import Dp.InterfaceC13428a;

/* compiled from: DealReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Dp.d f121573a;

    public E(Dp.d dVar) {
        this.f121573a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((InterfaceC13428a) this.f121573a.get());
    }
}
