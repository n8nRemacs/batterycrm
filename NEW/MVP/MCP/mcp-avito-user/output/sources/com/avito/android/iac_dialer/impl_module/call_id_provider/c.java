package com.avito.android.iac_dialer.impl_module.call_id_provider;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CallIdProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f165932a;

    public c(u uVar) {
        this.f165932a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((IJ.a) this.f165932a.get());
    }
}
