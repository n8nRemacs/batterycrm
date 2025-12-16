package com.avito.android.tariff.cpr.configure.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCprConfigureSaveHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f295517a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f295518b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f295519c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff.cpr.configure.data.repository.c f295520d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f295521e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f295522f;

    public l(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, com.avito.android.tariff.cpr.configure.data.repository.c cVar, dv.b bVar3, Provider provider) {
        this.f295517a = fVar;
        this.f295518b = bVar;
        this.f295519c = bVar2;
        this.f295520d = cVar;
        this.f295521e = bVar3;
        this.f295522f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.deeplink_handler.handler.composite.a) this.f295517a.get(), (a.g) this.f295518b.get(), (a.i) this.f295519c.get(), (com.avito.android.tariff.cpr.configure.data.repository.a) this.f295520d.get(), (a.InterfaceC4053a) this.f295521e.get(), this.f295522f.get());
    }
}
