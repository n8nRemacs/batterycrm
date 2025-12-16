package com.avito.android.mortgage.sign;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SignViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.sign.mvi.g f203812a;

    public u(com.avito.android.mortgage.sign.mvi.g gVar) {
        this.f203812a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.mortgage.sign.mvi.f) this.f203812a.get(), null, 2, null);
    }
}
