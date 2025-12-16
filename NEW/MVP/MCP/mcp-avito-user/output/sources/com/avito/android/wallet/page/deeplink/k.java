package com.avito.android.wallet.page.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletTransactionHistoryLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f327790a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.wallet.page.e f327791b;

    public k(dv.b bVar, com.avito.android.wallet.page.e eVar) {
        this.f327790a = bVar;
        this.f327791b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((a.InterfaceC4053a) this.f327790a.get(), (com.avito.android.wallet.page.c) this.f327791b.get());
    }
}
