package com.avito.android.success.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SuccessBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.success.domain.b f291681a;

    public f(com.avito.android.success.domain.b bVar) {
        this.f291681a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.success.domain.a) this.f291681a.get());
    }
}
