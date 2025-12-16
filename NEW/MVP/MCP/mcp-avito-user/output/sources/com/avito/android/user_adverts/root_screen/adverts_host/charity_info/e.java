package com.avito.android.user_adverts.root_screen.adverts_host.charity_info;

import com.avito.android.account.E;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CharityViewModelImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.charity.a> f312549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f312550b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f312551c;

    public e(Provider<com.avito.android.charity.a> provider, Provider<R0> provider2, Provider<E> provider3) {
        this.f312549a = provider;
        this.f312550b = provider2;
        this.f312551c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f312549a.get(), this.f312550b.get(), this.f312551c.get());
    }
}
