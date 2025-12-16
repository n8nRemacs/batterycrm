package com.avito.android.cpx_promo_geo.screens.region_sheet.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RegionSheetDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f128258a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f128259b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f128260c;

    public c(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f128258a = bVar;
        this.f128259b = bVar2;
        this.f128260c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f128259b.get(), (a.f) this.f128258a.get(), this.f128260c.get());
    }
}
