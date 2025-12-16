package com.avito.android.tariff.cpa.info.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: TariffCpaInfoDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f294632a;

    /* renamed from: b, reason: collision with root package name */
    public final g f294633b;

    /* renamed from: c, reason: collision with root package name */
    public final q f294634c;

    public b(com.avito.android.paid_services_impl.e eVar, g gVar, q qVar) {
        this.f294632a = eVar;
        this.f294633b = gVar;
        this.f294634c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f294632a.get(), (v50.c) this.f294633b.get(), (o) this.f294634c.get());
    }
}
