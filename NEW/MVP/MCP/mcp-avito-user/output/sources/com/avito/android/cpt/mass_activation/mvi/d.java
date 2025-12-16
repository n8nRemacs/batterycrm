package com.avito.android.cpt.mass_activation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.domain.b f126584a;

    public d(com.avito.android.cpt.mass_activation.domain.b bVar) {
        this.f126584a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.cpt.mass_activation.domain.a) this.f126584a.get());
    }
}
