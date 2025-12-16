package com.avito.android.short_term_rent.bookingform.promocode.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BookingFormPromoCodeDialogDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f282100a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f282101b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f282102c;

    public b(dv.b bVar, dv.b bVar2, Provider provider) {
        this.f282100a = bVar;
        this.f282101b = bVar2;
        this.f282102c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.d) this.f282101b.get(), (a.f) this.f282100a.get(), this.f282102c.get());
    }
}
