package com.avito.android.tariff.cpx.configure.advance.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295756a;

    public g(u uVar) {
        this.f295756a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.tariff.cpx.configure.advance.domain.d) this.f295756a.get());
    }
}
