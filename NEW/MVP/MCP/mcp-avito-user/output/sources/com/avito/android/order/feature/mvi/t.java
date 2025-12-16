package com.avito.android.order.feature.mvi;

import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: OrderBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.order.feature.domain.b f209698a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f209699b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.order.feature.a> f209700c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Wi.b> f209701d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<W40.b> f209702e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f209703f;

    public t(com.avito.android.order.feature.domain.b bVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f209698a = bVar;
        this.f209699b = provider;
        this.f209700c = provider2;
        this.f209701d = provider3;
        this.f209702e = provider4;
        this.f209703f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.order.feature.domain.a) this.f209698a.get(), this.f209699b.get(), this.f209700c.get(), this.f209701d.get(), this.f209702e.get(), this.f209703f.get());
    }
}
