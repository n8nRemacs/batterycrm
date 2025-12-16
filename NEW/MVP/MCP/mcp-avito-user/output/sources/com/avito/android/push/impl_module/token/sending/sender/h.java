package com.avito.android.push.impl_module.token.sending.sender;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PushTokenSenderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246047b;

    /* renamed from: c, reason: collision with root package name */
    public final S f246048c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f246049d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f246050e;

    public h(u uVar, Provider provider, S s5, dagger.internal.f fVar, Provider provider2) {
        this.f246046a = uVar;
        this.f246047b = provider;
        this.f246048c = s5;
        this.f246049d = fVar;
        this.f246050e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(dagger.internal.g.a(w.a(this.f246046a)), this.f246047b.get(), (P) this.f246048c.get(), (InterfaceC28373a) this.f246049d.get(), this.f246050e.get());
    }
}
