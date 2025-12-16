package com.avito.android.cpt.activation;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CptActivationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.activation.mvi.g f126282a;

    public h(com.avito.android.cpt.activation.mvi.g gVar) {
        this.f126282a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cpt.activation.mvi.f fVar = (com.avito.android.cpt.activation.mvi.f) this.f126282a.get();
        i2.f411430a.getClass();
        return new g(fVar, i2.a.f411433c);
    }
}
