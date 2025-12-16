package com.avito.android.messenger.channels.filter;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChannelsFilterStateHolderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<pZ.d> f187168a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f187169b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<JY.a> f187170c;

    public l(Provider<pZ.d> provider, Provider<R0> provider2, Provider<JY.a> provider3) {
        this.f187168a = provider;
        this.f187169b = provider2;
        this.f187170c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f187168a.get(), this.f187169b.get(), this.f187170c.get());
    }
}
