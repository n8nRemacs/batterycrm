package com.avito.android.tariff.cpx.limit.cancel.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxLimitCancelHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297194a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297195b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.limit.cancel.domain.c f297196c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f297197d;

    public d(dv.b bVar, dv.b bVar2, com.avito.android.tariff.cpx.limit.cancel.domain.c cVar, Provider provider) {
        this.f297194a = bVar;
        this.f297195b = bVar2;
        this.f297196c = cVar;
        this.f297197d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.g) this.f297194a.get(), (a.i) this.f297195b.get(), (com.avito.android.tariff.cpx.limit.cancel.domain.a) this.f297196c.get(), this.f297197d.get());
    }
}
