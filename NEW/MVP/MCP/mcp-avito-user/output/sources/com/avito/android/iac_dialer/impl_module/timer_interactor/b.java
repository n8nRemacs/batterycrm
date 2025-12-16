package com.avito.android.iac_dialer.impl_module.timer_interactor;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import pK.InterfaceC46970a;

/* compiled from: IacTimerInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f166504a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC46970a> f166505b;

    public b(Provider<R0> provider, Provider<InterfaceC46970a> provider2) {
        this.f166504a = provider;
        this.f166505b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f166504a.get(), this.f166505b.get());
    }
}
