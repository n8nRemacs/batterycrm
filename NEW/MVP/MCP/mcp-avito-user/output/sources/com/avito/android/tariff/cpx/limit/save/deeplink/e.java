package com.avito.android.tariff.cpx.limit.save.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxLimitSaveHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f297214a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297215b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.limit.save.domain.c f297216c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f297217d;

    public e(dv.b bVar, dv.b bVar2, com.avito.android.tariff.cpx.limit.save.domain.c cVar, Provider provider) {
        this.f297214a = bVar;
        this.f297215b = bVar2;
        this.f297216c = cVar;
        this.f297217d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.g) this.f297214a.get(), (a.i) this.f297215b.get(), (com.avito.android.tariff.cpx.limit.save.domain.a) this.f297216c.get(), this.f297217d.get());
    }
}
