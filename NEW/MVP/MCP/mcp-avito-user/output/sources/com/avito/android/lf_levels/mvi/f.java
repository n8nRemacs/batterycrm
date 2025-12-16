package com.avito.android.lf_levels.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f175384a;

    public f(u uVar) {
        this.f175384a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.lf_levels.domain.a) this.f175384a.get());
    }
}
