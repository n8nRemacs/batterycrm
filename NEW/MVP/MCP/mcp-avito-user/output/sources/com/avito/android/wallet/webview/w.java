package com.avito.android.wallet.webview;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletWebViewViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.webview.mvi.components.g f329461a;

    public w(com.avito.android.wallet.webview.mvi.components.g gVar) {
        this.f329461a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new v((com.avito.android.wallet.webview.mvi.components.f) this.f329461a.get(), null, 2, null);
    }
}
