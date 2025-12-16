package com.avito.android.payment.lib.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentSessionDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214584a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214585b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214586c;

    public g(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214584a = bVar;
        this.f214585b = c36167y1;
        this.f214586c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((a.InterfaceC4053a) this.f214584a.get(), (InterfaceC36134w1) this.f214585b.get(), (a.b) this.f214586c.get());
    }
}
