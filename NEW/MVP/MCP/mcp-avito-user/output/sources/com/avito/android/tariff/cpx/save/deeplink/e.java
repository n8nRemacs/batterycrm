package com.avito.android.tariff.cpx.save.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxSaveHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f297353a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f297354b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f297355c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.save.domain.c f297356d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f297357e;

    public e(f fVar, dv.b bVar, dv.b bVar2, com.avito.android.tariff.cpx.save.domain.c cVar, Provider provider) {
        this.f297353a = fVar;
        this.f297354b = bVar;
        this.f297355c = bVar2;
        this.f297356d = cVar;
        this.f297357e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.deeplink_handler.handler.composite.a) this.f297353a.get(), (a.g) this.f297354b.get(), (a.i) this.f297355c.get(), (com.avito.android.tariff.cpx.save.domain.a) this.f297356d.get(), this.f297357e.get());
    }
}
