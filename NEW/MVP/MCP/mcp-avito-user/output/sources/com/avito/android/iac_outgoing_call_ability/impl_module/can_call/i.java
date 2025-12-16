package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import vN.C49237a;
import vN.C49239c;

/* compiled from: IacCanCallResultFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168553a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f168554b;

    /* renamed from: c, reason: collision with root package name */
    public final C49239c f168555c;

    public i(dagger.internal.f fVar, Provider provider, C49239c c49239c) {
        this.f168553a = fVar;
        this.f168554b = provider;
        this.f168555c = c49239c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC28373a) this.f168553a.get(), this.f168554b.get(), (C49237a) this.f168555c.get());
    }
}
