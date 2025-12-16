package com.avito.android.tariff_cpt.info.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: CptInfoDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f298151a;

    /* renamed from: b, reason: collision with root package name */
    public final hC0.e f298152b;

    /* renamed from: c, reason: collision with root package name */
    public final q f298153c;

    public b(dv.b bVar, hC0.e eVar, q qVar) {
        this.f298151a = bVar;
        this.f298152b = eVar;
        this.f298153c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f298151a.get(), (hC0.c) this.f298152b.get(), (o) this.f298153c.get());
    }
}
