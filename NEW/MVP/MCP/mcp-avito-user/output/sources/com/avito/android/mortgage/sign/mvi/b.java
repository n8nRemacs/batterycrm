package com.avito.android.mortgage.sign.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SignActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.sign.files.b f203764a;

    public b(com.avito.android.mortgage.sign.files.b bVar) {
        this.f203764a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.sign.files.a) this.f203764a.get());
    }
}
