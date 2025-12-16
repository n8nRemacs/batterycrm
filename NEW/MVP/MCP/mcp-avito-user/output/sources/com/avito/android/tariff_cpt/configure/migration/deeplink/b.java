package com.avito.android.tariff_cpt.configure.migration.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMigrationDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f298019a;

    /* renamed from: b, reason: collision with root package name */
    public final hC0.e f298020b;

    public b(dv.b bVar, hC0.e eVar) {
        this.f298019a = bVar;
        this.f298020b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f298019a.get(), (hC0.c) this.f298020b.get());
    }
}
