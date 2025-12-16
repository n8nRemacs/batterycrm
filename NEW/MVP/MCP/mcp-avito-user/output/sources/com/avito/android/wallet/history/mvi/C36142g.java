package com.avito.android.wallet.history.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: WalletHistoryInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.wallet.history.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36142g implements dagger.internal.h<C36137b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IO0.a> f327688a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<DO0.a> f327689b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f327690c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.wallet.history.feature.a> f327691d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f327692e;

    public C36142g(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f327688a = provider;
        this.f327689b = provider2;
        this.f327690c = provider3;
        this.f327691d = provider4;
        this.f327692e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C36137b(dagger.internal.g.a(dagger.internal.w.a(this.f327688a)), dagger.internal.g.a(dagger.internal.w.a(this.f327689b)), this.f327690c.get(), this.f327691d.get(), (String) this.f327692e.f393949a);
    }
}
