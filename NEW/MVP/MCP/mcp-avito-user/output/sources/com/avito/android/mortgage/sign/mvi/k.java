package com.avito.android.mortgage.sign.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SignReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final n10.d f203794a;

    public k(n10.d dVar) {
        this.f203794a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((n10.b) this.f203794a.get());
    }
}
