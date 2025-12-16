package com.avito.android.profile.user_profile.di;

import Cd.D;
import androidx.view.P0;
import androidx.view.T0;

/* compiled from: UserProfileModule_ProvideActiveOrdersDelegateFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<com.avito.android.profile.user_profile.cards.active_orders.j> {

    /* renamed from: a, reason: collision with root package name */
    public final f f226094a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f226095b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f226096c;

    public h(f fVar, dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f226094a = fVar;
        this.f226095b = lVar;
        this.f226096c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f226095b.f393949a;
        D d12 = (D) this.f226096c.get();
        this.f226094a.getClass();
        return (com.avito.android.profile.user_profile.cards.active_orders.j) new P0(t02, d12).a(com.avito.android.profile.user_profile.cards.active_orders.s.class);
    }
}
