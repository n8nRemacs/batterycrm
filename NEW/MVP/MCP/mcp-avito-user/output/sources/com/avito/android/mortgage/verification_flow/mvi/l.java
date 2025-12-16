package com.avito.android.mortgage.verification_flow.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VerificationFlowReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final r10.e f203931a;

    public l(r10.e eVar) {
        this.f203931a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((r10.c) this.f203931a.get());
    }
}
