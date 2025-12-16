package com.avito.android.wallet.pin.impl.verification.mvi.component;

import gj.InterfaceC40691b;
import javax.inject.Provider;
import oP0.C44676a;
import oP0.C44677b;

/* compiled from: WalletPinVerificationActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<C36145a> {

    /* renamed from: a, reason: collision with root package name */
    public final w f329162a;

    /* renamed from: b, reason: collision with root package name */
    public final C44677b f329163b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f329164c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f329165d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f329166e;

    public g(w wVar, C44677b c44677b, Provider provider, Provider provider2, Provider provider3) {
        this.f329162a = wVar;
        this.f329163b = c44677b;
        this.f329164c = provider;
        this.f329165d = provider2;
        this.f329166e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C36145a((m) this.f329162a.get(), (C44676a) this.f329163b.get(), this.f329164c.get(), this.f329165d.get(), this.f329166e.get());
    }
}
