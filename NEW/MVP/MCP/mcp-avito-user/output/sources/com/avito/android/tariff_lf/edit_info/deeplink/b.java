package com.avito.android.tariff_lf.edit_info.deeplink;

import com.avito.android.paid_services_impl.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: TariffEditInfoDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.paid_services_impl.e f298778a;

    /* renamed from: b, reason: collision with root package name */
    public final g f298779b;

    /* renamed from: c, reason: collision with root package name */
    public final q f298780c;

    public b(com.avito.android.paid_services_impl.e eVar, g gVar, q qVar) {
        this.f298778a = eVar;
        this.f298779b = gVar;
        this.f298780c = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.paid_services.a) this.f298778a.get(), (v50.c) this.f298779b.get(), (o) this.f298780c.get());
    }
}
