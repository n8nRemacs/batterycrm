package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: IacBootstrapsProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final A f165412a;

    public c(A a12) {
        this.f165412a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Set) this.f165412a.get());
    }
}
