package com.avito.android.short_term_rent;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingPaymentLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f282402a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f282403b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f282404c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f282405d;

    public j(dv.b bVar, C36167y1 c36167y1, dv.b bVar2, Provider provider) {
        this.f282402a = bVar;
        this.f282403b = c36167y1;
        this.f282404c = bVar2;
        this.f282405d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a.b) this.f282402a.get(), (InterfaceC36134w1) this.f282403b.get(), (a.InterfaceC4053a) this.f282404c.get(), this.f282405d.get());
    }
}
