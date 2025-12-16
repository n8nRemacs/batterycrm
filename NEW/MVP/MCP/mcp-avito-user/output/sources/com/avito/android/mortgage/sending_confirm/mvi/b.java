package com.avito.android.mortgage.sending_confirm.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SendingConfirmActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f203551a;

    public b(u uVar) {
        this.f203551a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.mortgage.sending_confirm.mvi.domain.a) this.f203551a.get());
    }
}
