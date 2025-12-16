package com.avito.android.wallet.pin.impl.verification.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletPinVerificationLinkHandlerModule_ProvideWalletPinVerificationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f329065a;

    /* renamed from: b, reason: collision with root package name */
    public final f f329066b;

    public c(d dVar, f fVar) {
        this.f329065a = dVar;
        this.f329066b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f329066b.getClass();
        e eVar = new e();
        d dVar = this.f329065a;
        b.f329064a.getClass();
        return new C43834a(WalletPinVerificationLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WalletPinVerificationLink.class), dVar));
    }
}
