package com.avito.android.wallet.history.mvi.components;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletHistoryReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final l f327612a;

    /* renamed from: b, reason: collision with root package name */
    public final r f327613b;

    public p(l lVar, r rVar) {
        this.f327612a = lVar;
        this.f327613b = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        k kVar = (k) this.f327612a.get();
        this.f327613b.getClass();
        return new o(kVar, new q());
    }
}
