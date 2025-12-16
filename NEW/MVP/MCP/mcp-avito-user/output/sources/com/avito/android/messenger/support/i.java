package com.avito.android.messenger.support;

import com.avito.android.remote.i1;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.A;
import ru.avito.messenger.F0;

/* compiled from: SupportChatFormInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i1> f197390a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<F0> f197391b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<A> f197392c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f197393d;

    public i(Provider<i1> provider, Provider<F0> provider2, Provider<A> provider3, Provider<InterfaceC35863o4> provider4) {
        this.f197390a = provider;
        this.f197391b = provider2;
        this.f197392c = provider3;
        this.f197393d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f197390a.get(), this.f197391b.get(), this.f197392c.get(), this.f197393d.get());
    }
}
