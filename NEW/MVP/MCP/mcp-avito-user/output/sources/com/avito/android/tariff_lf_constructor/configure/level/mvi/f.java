package com.avito.android.tariff_lf_constructor.configure.level.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ConstructorConfigureLevelBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f299838a;

    public f(u uVar) {
        this.f299838a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.tariff_lf_constructor.configure.level.domain.a) this.f299838a.get());
    }
}
