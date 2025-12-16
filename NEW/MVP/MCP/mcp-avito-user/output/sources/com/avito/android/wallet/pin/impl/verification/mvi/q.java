package com.avito.android.wallet.pin.impl.verification.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPinVerificationViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.verification.mvi.component.l f329341a;

    public q(com.avito.android.wallet.pin.impl.verification.mvi.component.l lVar) {
        this.f329341a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.wallet.pin.impl.verification.mvi.component.k) this.f329341a.get(), null, 2, null);
    }
}
