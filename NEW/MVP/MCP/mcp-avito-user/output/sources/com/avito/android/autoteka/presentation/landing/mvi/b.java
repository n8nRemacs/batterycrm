package com.avito.android.autoteka.presentation.landing.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaLandingActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.data.landing.b f97334a;

    public b(com.avito.android.autoteka.data.landing.b bVar) {
        this.f97334a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.autoteka.data.landing.a) this.f97334a.get());
    }
}
