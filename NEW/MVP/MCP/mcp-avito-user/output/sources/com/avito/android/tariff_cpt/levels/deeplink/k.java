package com.avito.android.tariff_cpt.levels.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TariffCptLevelsDeeplinkHandlerV3_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f298564a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f298565b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f298566c;

    public k(dagger.internal.f fVar, dv.b bVar, dv.b bVar2) {
        this.f298564a = bVar;
        this.f298565b = bVar2;
        this.f298566c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.deeplink_handler.handler.composite.a) this.f298566c.get(), (a.d) this.f298564a.get(), (a.f) this.f298565b.get());
    }
}
