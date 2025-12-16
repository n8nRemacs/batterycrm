package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f168321a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OL.a> f168322b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f168323c;

    public n(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f168321a = uVar;
        this.f168322b = provider;
        this.f168323c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.iac_incoming_call_ability.impl_module.api.a) this.f168321a.get(), this.f168322b.get(), this.f168323c.get());
    }
}
