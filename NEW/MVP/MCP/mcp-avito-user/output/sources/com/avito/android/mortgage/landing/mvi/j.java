package com.avito.android.mortgage.landing.mvi;

import com.avito.android.mortgage.landing.model.LandingArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.mortgage.landing.mvi.domain.c f200274a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f200275b;

    public j(com.avito.android.mortgage.landing.mvi.domain.c cVar, dagger.internal.l lVar) {
        this.f200274a = cVar;
        this.f200275b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.mortgage.landing.mvi.domain.a) this.f200274a.get(), (LandingArguments) this.f200275b.f393949a);
    }
}
