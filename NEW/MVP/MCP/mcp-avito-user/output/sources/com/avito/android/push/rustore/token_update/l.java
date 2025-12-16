package com.avito.android.push.rustore.token_update;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.public_module.token.sending.sender.PushTokenSender;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RuStorePushTokenUpdaterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f246145a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e> f246146b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f246147c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.push.rustore.f> f246148d;

    /* renamed from: e, reason: collision with root package name */
    public final u f246149e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<R0> f246150f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<E> f246151g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f246152h;

    public l(com.avito.android.push.impl_module.features.b bVar, Provider provider, Provider provider2, Provider provider3, u uVar, Provider provider4, Provider provider5, dagger.internal.f fVar) {
        this.f246145a = bVar;
        this.f246146b = provider;
        this.f246147c = provider2;
        this.f246148d = provider3;
        this.f246149e = uVar;
        this.f246150f = provider4;
        this.f246151g = provider5;
        this.f246152h = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f246145a.get();
        return new j(this.f246146b.get(), this.f246147c.get(), this.f246148d.get(), (PushTokenSender) this.f246149e.get(), this.f246150f.get(), this.f246151g.get(), (InterfaceC28373a) this.f246152h.get());
    }
}
