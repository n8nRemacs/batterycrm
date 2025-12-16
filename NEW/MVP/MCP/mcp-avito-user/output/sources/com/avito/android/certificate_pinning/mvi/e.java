package com.avito.android.certificate_pinning.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UnsafeNetworkActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f117804a;

    public e(u uVar) {
        this.f117804a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.certificate_pinning.domain.a) this.f117804a.get());
    }
}
