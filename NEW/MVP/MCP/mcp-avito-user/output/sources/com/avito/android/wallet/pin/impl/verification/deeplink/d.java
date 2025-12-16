package com.avito.android.wallet.pin.impl.verification.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPinVerificationLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.verification.e f329067a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f329068b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f329069c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f329070d;

    public d(com.avito.android.wallet.pin.impl.verification.e eVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f329067a = eVar;
        this.f329068b = bVar;
        this.f329069c = bVar2;
        this.f329070d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.wallet.pin.impl.verification.d) this.f329067a.get(), (a.InterfaceC4053a) this.f329068b.get(), (a.b) this.f329069c.get(), this.f329070d.get());
    }
}
