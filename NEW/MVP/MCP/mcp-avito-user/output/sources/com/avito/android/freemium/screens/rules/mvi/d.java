package com.avito.android.freemium.screens.rules.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumRulesBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.rules.domain.d f159130a;

    public d(com.avito.android.freemium.screens.rules.domain.d dVar) {
        this.f159130a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.freemium.screens.rules.domain.c) this.f159130a.get());
    }
}
