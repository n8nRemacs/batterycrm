package com.avito.android.iac_outgoing_call_ability.impl_module.api;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacOutgoingCallAbilityRetrofitApi_Module_ProvideIacOutgoingCallAbilityRetrofitApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168431a;

    public g(dagger.internal.f fVar) {
        this.f168431a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f168431a.get();
        f.f168430a.getClass();
        e eVar = (e) r02.create(e.class);
        t.d(eVar);
        return eVar;
    }
}
