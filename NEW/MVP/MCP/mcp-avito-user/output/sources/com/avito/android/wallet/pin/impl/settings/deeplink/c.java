package com.avito.android.wallet.pin.impl.settings.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletSecuritySettingsLinkHandlerModule_ProvideWalletSecuritySettingsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f328727a;

    /* renamed from: b, reason: collision with root package name */
    public final f f328728b;

    public c(d dVar, f fVar) {
        this.f328727a = dVar;
        this.f328728b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f328728b.getClass();
        e eVar = new e();
        d dVar = this.f328727a;
        b.f328726a.getClass();
        return new C43834a(WalletSecuritySettingsLink.class, eVar, new C43834a.b.C11809b(dVar));
    }
}
