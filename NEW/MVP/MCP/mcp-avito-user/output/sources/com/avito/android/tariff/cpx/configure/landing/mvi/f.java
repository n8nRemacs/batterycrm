package com.avito.android.tariff.cpx.configure.landing.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureLandingBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f296032a;

    public f(u uVar) {
        this.f296032a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff.cpx.configure.landing.mvi.domain.a) this.f296032a.get());
    }
}
