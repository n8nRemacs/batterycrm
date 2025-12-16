package com.avito.android.tariff.cpx.configure.advance.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CpxConfigureAdvanceSaveDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f295577a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f295578b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f295579c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f295580d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.tariff.cpx.configure.advance.domain.c f295581e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f295582f;

    public h(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, dv.b bVar3, com.avito.android.tariff.cpx.configure.advance.domain.c cVar, Provider provider) {
        this.f295577a = fVar;
        this.f295578b = bVar;
        this.f295579c = bVar2;
        this.f295580d = bVar3;
        this.f295581e = cVar;
        this.f295582f = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f295577a.get(), (a.g) this.f295578b.get(), (a.i) this.f295579c.get(), (a.InterfaceC4053a) this.f295580d.get(), (com.avito.android.tariff.cpx.configure.advance.domain.a) this.f295581e.get(), this.f295582f.get());
    }
}
