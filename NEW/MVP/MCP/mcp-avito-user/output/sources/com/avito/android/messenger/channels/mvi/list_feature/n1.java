package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Provider;

/* compiled from: ChannelsListReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class n1 implements dagger.internal.h<m1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f188144a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.analytics.d> f188145b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f188146c;

    public n1(Provider provider, Provider provider2, e1 e1Var) {
        this.f188144a = provider;
        this.f188145b = provider2;
        this.f188146c = e1Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m1(this.f188144a.get(), this.f188145b.get(), (b1) this.f188146c.get());
    }
}
