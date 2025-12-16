package com.avito.android.wallet.webview.mvi.components;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletWebViewBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f329416a;

    public d(l lVar) {
        this.f329416a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(((Boolean) this.f329416a.f393949a).booleanValue());
    }
}
