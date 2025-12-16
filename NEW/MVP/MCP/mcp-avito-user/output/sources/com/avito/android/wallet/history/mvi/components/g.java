package com.avito.android.wallet.history.mvi.components;

import com.avito.android.wallet.history.mvi.C36137b;
import com.avito.android.wallet.history.mvi.C36142g;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletHistoryBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final C36142g f327592a;

    public g(C36142g c36142g) {
        this.f327592a = c36142g;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((C36137b) this.f327592a.get());
    }
}
