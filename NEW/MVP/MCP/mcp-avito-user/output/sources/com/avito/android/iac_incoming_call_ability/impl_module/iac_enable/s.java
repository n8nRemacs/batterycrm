package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacTimeIntervalInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> f168334a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OL.a> f168335b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168336c;

    public s(Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> provider, Provider<OL.a> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f168334a = provider;
        this.f168335b = provider2;
        this.f168336c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f168334a.get(), this.f168335b.get(), this.f168336c.get());
    }
}
