package com.avito.android.cpt.mass_activation.mvi;

import Ur.InterfaceC15560a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Ur.c f126603a;

    public k(Ur.c cVar) {
        this.f126603a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC15560a) this.f126603a.get());
    }
}
