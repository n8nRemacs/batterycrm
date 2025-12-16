package com.avito.android.mortgage.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.mvi.domain.c f200267a;

    public h(com.avito.android.mortgage.landing.mvi.domain.c cVar) {
        this.f200267a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.mortgage.landing.mvi.domain.a) this.f200267a.get());
    }
}
