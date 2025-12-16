package com.avito.android.wallet.page.mvi.component;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPageReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final s f328169a;

    public p(s sVar) {
        this.f328169a = sVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((q) this.f328169a.get());
    }
}
