package com.avito.android.cpt.activation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.activation.domain.b f126288a;

    public d(com.avito.android.cpt.activation.domain.b bVar) {
        this.f126288a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.cpt.activation.domain.a) this.f126288a.get());
    }
}
