package com.avito.android.mortgage.landing.mvi.builder;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final f f200097a;

    public i(f fVar) {
        this.f200097a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((e) this.f200097a.get());
    }
}
