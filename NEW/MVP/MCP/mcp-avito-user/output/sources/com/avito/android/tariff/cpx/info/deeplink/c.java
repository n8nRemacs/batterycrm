package com.avito.android.tariff.cpx.info.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import jB0.InterfaceC42230a;
import l90.o;
import l90.q;

/* compiled from: TariffCpxInfoHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f296360a;

    /* renamed from: b, reason: collision with root package name */
    public final jB0.c f296361b;

    /* renamed from: c, reason: collision with root package name */
    public final q f296362c;

    public c(dv.b bVar, jB0.c cVar, q qVar) {
        this.f296360a = bVar;
        this.f296361b = cVar;
        this.f296362c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((a.InterfaceC4053a) this.f296360a.get(), (InterfaceC42230a) this.f296361b.get(), (o) this.f296362c.get());
    }
}
