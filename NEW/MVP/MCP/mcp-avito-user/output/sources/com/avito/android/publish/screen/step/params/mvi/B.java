package com.avito.android.publish.screen.step.params.mvi;

import com.avito.android.publish.screen.step.params.domain.InterfaceC34074a;
import com.avito.android.publish.screen.step.params.domain.g0;
import javax.inject.Provider;

/* compiled from: PublishDetailsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34074a> f241331a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f241332b;

    public B(dagger.internal.u uVar, Provider provider) {
        this.f241331a = provider;
        this.f241332b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f241331a.get(), (g0) this.f241332b.get());
    }
}
