package com.avito.android.cpt.pre_activation;

import com.avito.android.cpt.pre_activation.mvi.j;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: PreActivationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final j f126716a;

    public i(j jVar) {
        this.f126716a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cpt.pre_activation.mvi.i iVar = (com.avito.android.cpt.pre_activation.mvi.i) this.f126716a.get();
        i2.f411430a.getClass();
        return new h(iVar, i2.a.f411433c);
    }
}
