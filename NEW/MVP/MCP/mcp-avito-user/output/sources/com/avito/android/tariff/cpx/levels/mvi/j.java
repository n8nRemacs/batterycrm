package com.avito.android.tariff.cpx.levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxLevelsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f297140a;

    public j(u uVar) {
        this.f297140a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.tariff.cpx.levels.domain.a) this.f297140a.get());
    }
}
