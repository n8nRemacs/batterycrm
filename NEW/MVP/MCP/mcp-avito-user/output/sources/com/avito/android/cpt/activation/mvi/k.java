package com.avito.android.cpt.activation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptActivationReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.cpt.activation.data.mapper.c f126307a;

    public k(com.avito.android.cpt.activation.data.mapper.c cVar) {
        this.f126307a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.cpt.activation.data.mapper.a) this.f126307a.get());
    }
}
