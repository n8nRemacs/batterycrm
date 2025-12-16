package com.avito.android.profile.user_profile.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.T0;
import javax.inject.Provider;

/* compiled from: UserProfileModule_ProvideWalletItemDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class w implements dagger.internal.h<com.avito.android.profile.user_profile.cards.wallet.m> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226138a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226139b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<D> f226140c;

    public w(f fVar, dagger.internal.l lVar, Provider provider) {
        this.f226138a = fVar;
        this.f226139b = lVar;
        this.f226140c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f226139b.f393949a;
        D d12 = this.f226140c.get();
        this.f226138a.getClass();
        return (com.avito.android.profile.user_profile.cards.wallet.m) new P0(t02, d12).a(com.avito.android.profile.user_profile.cards.wallet.o.class);
    }
}
