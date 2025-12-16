package com.avito.android.short_term_rent.bookingform.deeplink;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BookingFormDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C25721c f281234a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.short_term_rent.bookingform.h f281235b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f281236c;

    public c(C25721c c25721c, com.avito.android.short_term_rent.bookingform.h hVar, dv.b bVar) {
        this.f281234a = c25721c;
        this.f281235b = hVar;
        this.f281236c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C25719a) this.f281234a.get(), (com.avito.android.short_term_rent.bookingform.e) this.f281235b.get(), (a.InterfaceC4053a) this.f281236c.get());
    }
}
