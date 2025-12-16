package com.avito.android.iac_incoming_call_ability.impl_module.api;

import com.avito.android.iac_api_utils.util_module.i;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacIncomingCallAbilityApiImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f168214a;

    /* renamed from: b, reason: collision with root package name */
    public final i f168215b;

    public c(Provider provider, i iVar) {
        this.f168214a = provider;
        this.f168215b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f168214a), (com.avito.android.iac_api_utils.util_module.a) this.f168215b.get());
    }
}
