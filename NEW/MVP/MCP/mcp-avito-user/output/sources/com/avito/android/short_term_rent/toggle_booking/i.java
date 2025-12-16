package com.avito.android.short_term_rent.toggle_booking;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ToggleOnlineBookingLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final e f283016a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f283017b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f283018c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f283019d;

    public i(e eVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f283016a = eVar;
        this.f283017b = bVar;
        this.f283018c = bVar2;
        this.f283019d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((a) this.f283016a.get(), (a.i) this.f283017b.get(), (a.g) this.f283018c.get(), this.f283019d.get());
    }
}
