package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic;

import dagger.internal.A;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: IacMiddlewaresProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final A f165417a;

    public g(A a12) {
        this.f165417a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Set) this.f165417a.get());
    }
}
