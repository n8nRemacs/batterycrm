package com.avito.android.orders.badge_counter;

import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import hz.InterfaceC41196a;
import javax.inject.Provider;

/* compiled from: OrdersBadgeCounterRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f209956a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f209957b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f209958c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC41196a> f209959d;

    public l(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f209956a = uVar;
        this.f209957b = provider;
        this.f209958c = provider2;
        this.f209959d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.a(w.a(this.f209956a)), this.f209957b.get(), this.f209958c.get(), this.f209959d.get());
    }
}
