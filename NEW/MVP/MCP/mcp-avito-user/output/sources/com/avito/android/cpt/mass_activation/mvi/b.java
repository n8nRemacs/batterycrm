package com.avito.android.cpt.mass_activation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.mass_activation.domain.b f126582a;

    public b(com.avito.android.cpt.mass_activation.domain.b bVar) {
        this.f126582a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.cpt.mass_activation.domain.a) this.f126582a.get());
    }
}
