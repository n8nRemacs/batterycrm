package com.avito.android.certificate_pinning.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnsafeNetworkBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f117830a;

    public g(u uVar) {
        this.f117830a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.certificate_pinning.domain.a) this.f117830a.get());
    }
}
