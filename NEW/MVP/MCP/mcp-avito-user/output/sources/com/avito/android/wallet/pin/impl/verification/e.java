package com.avito.android.wallet.pin.impl.verification;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPinVerificationIntentFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f329104a;

    public e(C30102l3 c30102l3) {
        this.f329104a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Context) this.f329104a.get());
    }
}
