package com.avito.android.beduin.common.actionhandler;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: ModifyCartItemsCacheActionHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class H1 implements dagger.internal.h<D1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f100081a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.beduin_v2.repository.domain.cart_items.h> f100082b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.lib.beduin_v2.repository.cart_total_quantity.H f100083c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f100084d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.account.E> f100085e;

    public H1(dagger.internal.l lVar, Provider provider, com.avito.android.lib.beduin_v2.repository.cart_total_quantity.H h12, Provider provider2, Provider provider3) {
        this.f100081a = lVar;
        this.f100082b = provider;
        this.f100083c = h12;
        this.f100084d = provider2;
        this.f100085e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D1(dagger.internal.g.b(this.f100081a), this.f100082b.get(), (com.avito.android.lib.beduin_v2.repository.cart_total_quantity.F) this.f100083c.get(), this.f100084d.get(), this.f100085e.get());
    }
}
