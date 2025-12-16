package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoprolongBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f319545a;

    public f(u uVar) {
        this.f319545a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.vas_autoprolong.screens.autoprolong.domain.a) this.f319545a.get());
    }
}
