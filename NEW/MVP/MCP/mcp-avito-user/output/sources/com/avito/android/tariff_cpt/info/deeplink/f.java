package com.avito.android.tariff_cpt.info.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptInfoMonthsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f298158a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f298159b;

    public f(dagger.internal.f fVar, dv.b bVar) {
        this.f298158a = bVar;
        this.f298159b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a.d) this.f298158a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f298159b.get());
    }
}
