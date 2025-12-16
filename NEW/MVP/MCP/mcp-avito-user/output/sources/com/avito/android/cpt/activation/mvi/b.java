package com.avito.android.cpt.activation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.activation.domain.b f126286a;

    public b(com.avito.android.cpt.activation.domain.b bVar) {
        this.f126286a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.cpt.activation.domain.a) this.f126286a.get());
    }
}
