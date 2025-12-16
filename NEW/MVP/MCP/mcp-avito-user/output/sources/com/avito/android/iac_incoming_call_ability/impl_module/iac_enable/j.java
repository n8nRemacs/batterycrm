package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacOptionsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_incoming_call_ability.impl_module.api.a> f168310a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f168311b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<NL.e> f168312c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f168313d;

    public j(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f168310a = provider;
        this.f168311b = provider2;
        this.f168312c = provider3;
        this.f168313d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f168310a.get(), this.f168311b.get(), this.f168312c.get(), (NL.f) this.f168313d.get());
    }
}
