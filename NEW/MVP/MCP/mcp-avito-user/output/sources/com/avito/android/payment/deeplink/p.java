package com.avito.android.payment.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PaymentGenericFormDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214031a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214032b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214033c;

    public p(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214031a = bVar;
        this.f214032b = c36167y1;
        this.f214033c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((a.InterfaceC4053a) this.f214031a.get(), (InterfaceC36134w1) this.f214032b.get(), (a.b) this.f214033c.get());
    }
}
