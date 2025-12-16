package com.avito.android.freemium.screens.rules.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FreemiumRulesActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.freemium.screens.rules.domain.d f159127a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.freemium.screens.rules.domain.b f159128b;

    public b(com.avito.android.freemium.screens.rules.domain.d dVar, com.avito.android.freemium.screens.rules.domain.b bVar) {
        this.f159127a = dVar;
        this.f159128b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.freemium.screens.rules.domain.c) this.f159127a.get(), (com.avito.android.freemium.screens.rules.domain.a) this.f159128b.get());
    }
}
