package com.avito.android.profile.user_profile.cards.wallet;

import com.avito.android.account.E;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoFinanceItemViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f225775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f225776b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f225777c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<E> f225778d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<N90.p> f225779e;

    public k(Provider<com.avito.android.clientEventBus.a> provider, Provider<InterfaceC34401z0> provider2, Provider<R0> provider3, Provider<E> provider4, Provider<N90.p> provider5) {
        this.f225775a = provider;
        this.f225776b = provider2;
        this.f225777c = provider3;
        this.f225778d = provider4;
        this.f225779e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f225775a.get(), dagger.internal.g.b(this.f225776b), this.f225777c.get(), this.f225778d.get(), this.f225779e.get());
    }
}
