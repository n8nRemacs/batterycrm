package com.avito.android.str_calendar.seller.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.short_term_rent.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSellerCalendarLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f287837a;

    /* renamed from: b, reason: collision with root package name */
    public final d f287838b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f287839c;

    public b(d dVar, dv.b bVar, dv.b bVar2) {
        this.f287837a = bVar;
        this.f287838b = dVar;
        this.f287839c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.InterfaceC4053a) this.f287839c.get(), (a.b) this.f287837a.get(), (StrBookingIntentFactory) this.f287838b.get());
    }
}
