package com.avito.android.push.impl_module.token.providing;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40417a;
import javax.inject.Provider;

/* compiled from: PushTokenDataProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40417a> f245995a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f245996b;

    public h(dagger.internal.f fVar, Provider provider) {
        this.f245995a = provider;
        this.f245996b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f245995a.get(), (InterfaceC28373a) this.f245996b.get());
    }
}
