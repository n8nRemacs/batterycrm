package com.avito.android.mortgage.verification_flow;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationFlowViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.verification_flow.mvi.j f203954a;

    public v(com.avito.android.mortgage.verification_flow.mvi.j jVar) {
        this.f203954a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.mortgage.verification_flow.mvi.i) this.f203954a.get(), null, 2, null);
    }
}
