package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import javax.inject.Provider;

/* compiled from: IacMakeCallInChannelMenuLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f168631a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MK.a> f168632b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<BL.a> f168633c;

    public n(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f168631a = fVar;
        this.f168632b = provider;
        this.f168633c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.deeplink_handler.handler.composite.a) this.f168631a.get(), this.f168632b.get(), this.f168633c.get());
    }
}
