package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.di.module.C30214v6;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacAvailabilityNotifiedStateStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f168293a;

    public c(C30214v6 c30214v6) {
        this.f168293a = c30214v6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((AK0.l) this.f168293a.get());
    }
}
