package com.avito.android.short_term_rent;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrSoftBookingLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final d f282412a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f282413b;

    /* renamed from: c, reason: collision with root package name */
    public final C25721c f282414c;

    public p(d dVar, dv.b bVar, C25721c c25721c) {
        this.f282412a = dVar;
        this.f282413b = bVar;
        this.f282414c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((StrBookingIntentFactory) this.f282412a.get(), (a.InterfaceC4053a) this.f282413b.get(), (C25719a) this.f282414c.get());
    }
}
