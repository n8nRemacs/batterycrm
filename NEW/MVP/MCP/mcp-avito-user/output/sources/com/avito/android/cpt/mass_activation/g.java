package com.avito.android.cpt.mass_activation;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CptMassActivationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.mvi.g f126580a;

    public g(com.avito.android.cpt.mass_activation.mvi.g gVar) {
        this.f126580a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cpt.mass_activation.mvi.f fVar = (com.avito.android.cpt.mass_activation.mvi.f) this.f126580a.get();
        i2.f411430a.getClass();
        return new f(fVar, i2.a.f411433c);
    }
}
