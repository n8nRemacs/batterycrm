package com.avito.android.str_seller_orders_calendar.navigation;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrOrdersCalendarDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f290483a;

    /* renamed from: b, reason: collision with root package name */
    public final g f290484b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f290485c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f290486d;

    public b(dv.b bVar, g gVar, dv.b bVar2, Provider provider) {
        this.f290483a = bVar;
        this.f290484b = gVar;
        this.f290485c = bVar2;
        this.f290486d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f290483a.get(), (e) this.f290484b.get(), (a.InterfaceC4053a) this.f290485c.get(), this.f290486d.get());
    }
}
