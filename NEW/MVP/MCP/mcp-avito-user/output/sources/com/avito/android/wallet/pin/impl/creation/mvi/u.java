package com.avito.android.wallet.pin.impl.creation.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPinCreationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class u implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.creation.mvi.components.o f328721a;

    public u(com.avito.android.wallet.pin.impl.creation.mvi.components.o oVar) {
        this.f328721a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t((com.avito.android.wallet.pin.impl.creation.mvi.components.n) this.f328721a.get(), null, 2, null);
    }
}
