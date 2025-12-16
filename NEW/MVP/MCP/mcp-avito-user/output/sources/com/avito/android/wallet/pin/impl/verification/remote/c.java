package com.avito.android.wallet.pin.impl.verification.remote;

import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WalletPinVerificationApi_Module_ProvideWalletPinVerificationApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f329344a;

    public c(f fVar) {
        this.f329344a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f329344a.get();
        b.f329343a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
