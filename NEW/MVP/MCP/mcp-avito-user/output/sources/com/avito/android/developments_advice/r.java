package com.avito.android.developments_advice;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DevelopmentsAdviceViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_advice.mvi.l f136191a;

    public r(com.avito.android.developments_advice.mvi.l lVar) {
        this.f136191a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((com.avito.android.developments_advice.mvi.k) this.f136191a.get(), null, 2, null);
    }
}
