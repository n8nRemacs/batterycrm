package com.avito.android.gsm_realty_trx_flow.impl_module.link;

import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GsmRealtyTrxFlowLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f161267a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<XH.a> f161268b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f161269c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ZH.a> f161270d;

    public f(dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f161267a = fVar;
        this.f161268b = provider;
        this.f161269c = provider2;
        this.f161270d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f161267a.get(), this.f161268b.get(), this.f161269c.get(), this.f161270d.get());
    }
}
