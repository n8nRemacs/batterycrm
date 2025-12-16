package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_voip_call_request;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacVoipCallRequestDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f168283a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<EL.a> f168284b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f168285c;

    public d(dv.b bVar, Provider provider, dagger.internal.f fVar) {
        this.f168283a = bVar;
        this.f168284b = provider;
        this.f168285c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.i) this.f168283a.get(), this.f168284b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f168285c.get());
    }
}
