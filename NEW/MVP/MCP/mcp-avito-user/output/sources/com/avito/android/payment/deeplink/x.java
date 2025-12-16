package com.avito.android.payment.deeplink;

import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;

/* compiled from: PaymentStatusFormDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class x implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f214060a;

    /* renamed from: b, reason: collision with root package name */
    public final C36167y1 f214061b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f214062c;

    public x(dv.b bVar, C36167y1 c36167y1, dv.b bVar2) {
        this.f214060a = bVar;
        this.f214061b = c36167y1;
        this.f214062c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w((a.InterfaceC4053a) this.f214060a.get(), (InterfaceC36134w1) this.f214061b.get(), (a.b) this.f214062c.get());
    }
}
