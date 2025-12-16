package com.avito.android.wallet.pin.impl.verification.mvi.component;

import android.app.Activity;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import oP0.C44676a;
import oP0.C44677b;

/* compiled from: WalletPinVerificationInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class w implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.wallet.pin.impl.verification.remote.a> f329259a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f329260b;

    /* renamed from: c, reason: collision with root package name */
    public final C44677b f329261c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f329262d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f329263e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.wallet_biometry.f> f329264f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f329265g;

    public w(Provider provider, dagger.internal.l lVar, C44677b c44677b, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar2) {
        this.f329259a = provider;
        this.f329260b = lVar;
        this.f329261c = c44677b;
        this.f329262d = provider2;
        this.f329263e = provider3;
        this.f329264f = provider4;
        this.f329265g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m(dagger.internal.g.a(dagger.internal.w.a(this.f329259a)), (String) this.f329260b.f393949a, (C44676a) this.f329261c.get(), this.f329262d.get(), this.f329263e.get(), this.f329264f.get(), (Activity) this.f329265g.f393949a);
    }
}
