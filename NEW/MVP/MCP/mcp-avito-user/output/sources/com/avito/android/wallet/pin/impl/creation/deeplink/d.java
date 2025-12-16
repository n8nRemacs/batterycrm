package com.avito.android.wallet.pin.impl.creation.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WalletPinCreationLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.creation.e f328475a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f328476b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f328477c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f328478d;

    public d(com.avito.android.wallet.pin.impl.creation.e eVar, dv.b bVar, dv.b bVar2, Provider provider) {
        this.f328475a = eVar;
        this.f328476b = bVar;
        this.f328477c = bVar2;
        this.f328478d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.wallet.pin.impl.creation.d) this.f328475a.get(), (a.InterfaceC4053a) this.f328476b.get(), (a.b) this.f328477c.get(), this.f328478d.get());
    }
}
