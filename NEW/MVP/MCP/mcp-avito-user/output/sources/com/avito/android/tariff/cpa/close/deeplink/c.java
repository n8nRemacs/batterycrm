package com.avito.android.tariff.cpa.close.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpaCloseLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f294229a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f294230b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.tariff.cpa.close.domain.d f294231c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f294232d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f294233e;

    public c(f fVar, dv.b bVar, com.avito.android.tariff.cpa.close.domain.d dVar, dv.b bVar2, Provider provider) {
        this.f294229a = fVar;
        this.f294230b = bVar;
        this.f294231c = dVar;
        this.f294232d = bVar2;
        this.f294233e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f294229a.get(), (a.g) this.f294230b.get(), (com.avito.android.tariff.cpa.close.domain.a) this.f294231c.get(), (a.i) this.f294232d.get(), this.f294233e.get());
    }
}
