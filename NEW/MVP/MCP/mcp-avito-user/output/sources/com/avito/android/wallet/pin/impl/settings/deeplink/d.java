package com.avito.android.wallet.pin.impl.settings.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import jP0.C42295a;

/* compiled from: WalletSecuritySettingsLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final jP0.b f328729a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f328730b;

    public d(jP0.b bVar, dv.b bVar2) {
        this.f328729a = bVar;
        this.f328730b = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((C42295a) this.f328729a.get(), (a.InterfaceC4053a) this.f328730b.get());
    }
}
