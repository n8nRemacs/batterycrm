package com.avito.android.profile.user_profile.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.T0;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideAvitoFinanceItemDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<com.avito.android.profile.user_profile.cards.wallet.d> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226099a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226100b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<D> f226101c;

    public j(f fVar, dagger.internal.l lVar, Provider provider) {
        this.f226099a = fVar;
        this.f226100b = lVar;
        this.f226101c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f226100b.f393949a;
        D d12 = this.f226101c.get();
        this.f226099a.getClass();
        return (com.avito.android.profile.user_profile.cards.wallet.d) new P0(t02, d12).a(com.avito.android.profile.user_profile.cards.wallet.f.class);
    }
}
