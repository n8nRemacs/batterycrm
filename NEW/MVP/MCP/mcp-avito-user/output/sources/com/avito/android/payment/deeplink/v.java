package com.avito.android.payment.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PaymentStatusDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214051a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214052b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214053c;

    public v(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214051a = bVar;
        this.f214052b = c36167y1;
        this.f214053c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((a.InterfaceC4053a) this.f214051a.get(), (InterfaceC36134w1) this.f214052b.get(), (a.b) this.f214053c.get());
    }
}
