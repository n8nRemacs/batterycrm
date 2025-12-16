package com.avito.android.profile.user_profile.cards.active_orders;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ActiveOrdersViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f224709a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.activeOrders.a> f224710b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.activeOrders.e> f224711c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f224712d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.profile.user_profile.cards.active_orders.features.b> f224713e;

    public t(Provider<InterfaceC35745a5> provider, Provider<com.avito.android.activeOrders.a> provider2, Provider<com.avito.android.activeOrders.e> provider3, Provider<E> provider4, Provider<com.avito.android.profile.user_profile.cards.active_orders.features.b> provider5) {
        this.f224709a = provider;
        this.f224710b = provider2;
        this.f224711c = provider3;
        this.f224712d = provider4;
        this.f224713e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f224709a.get(), this.f224710b.get(), this.f224711c.get(), this.f224712d.get(), this.f224713e.get());
    }
}
