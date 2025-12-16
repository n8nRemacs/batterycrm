package com.avito.android.str_calendar.common.domain;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.StrBookingIntentFactory;
import com.avito.android.short_term_rent.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CalendarLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f286630a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f286631b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f286632c;

    public b(d dVar, dv.b bVar, dv.b bVar2) {
        this.f286630a = dVar;
        this.f286631b = bVar;
        this.f286632c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        StrBookingIntentFactory strBookingIntentFactory = (StrBookingIntentFactory) this.f286630a.get();
        return new a((a.InterfaceC4053a) this.f286632c.get(), (a.b) this.f286631b.get(), strBookingIntentFactory);
    }
}
