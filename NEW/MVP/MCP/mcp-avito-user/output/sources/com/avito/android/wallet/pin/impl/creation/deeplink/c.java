package com.avito.android.wallet.pin.impl.creation.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: WalletPinCreationLinkHandlerModule_ProvideWalletPinCreationLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f328473a;

    /* renamed from: b, reason: collision with root package name */
    public final f f328474b;

    public c(d dVar, f fVar) {
        this.f328473a = dVar;
        this.f328474b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f328474b.getClass();
        e eVar = new e();
        d dVar = this.f328473a;
        b.f328472a.getClass();
        return new C43834a(WalletPinCreationLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(WalletPinCreationLink.class), dVar));
    }
}
