package com.avito.android.tariff.cpx.info.advance.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffCpxInfoAdvanceSaveDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f296298a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f296299b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f296300c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<WB0.a> f296301d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f296302e;

    public c(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f296298a = bVar;
        this.f296299b = bVar2;
        this.f296300c = fVar;
        this.f296301d = provider;
        this.f296302e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.i) this.f296298a.get(), (a.g) this.f296299b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f296300c.get(), this.f296301d.get(), this.f296302e.get());
    }
}
