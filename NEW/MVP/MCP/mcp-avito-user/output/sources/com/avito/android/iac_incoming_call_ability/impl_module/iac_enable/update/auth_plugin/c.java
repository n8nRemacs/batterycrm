package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.auth_plugin;

import NL.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacAuthorizationPlugin_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OL.a> f168343a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a> f168344b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d> f168345c;

    /* renamed from: d, reason: collision with root package name */
    public final u f168346d;

    public c(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f168343a = provider;
        this.f168344b = provider2;
        this.f168345c = provider3;
        this.f168346d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f168343a.get(), this.f168344b.get(), this.f168345c.get(), (com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a) this.f168346d.get());
    }
}
