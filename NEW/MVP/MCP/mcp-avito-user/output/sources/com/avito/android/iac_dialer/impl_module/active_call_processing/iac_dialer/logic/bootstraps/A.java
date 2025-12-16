package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;
import kK.InterfaceC42590b;

/* compiled from: BroadcastReceiverBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class A implements dagger.internal.h<BroadcastReceiverBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f164979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f164980b;

    public A(dagger.internal.u uVar, Provider provider) {
        this.f164979a = uVar;
        this.f164980b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new BroadcastReceiverBootstrap((InterfaceC42590b) this.f164979a.get(), this.f164980b.get());
    }
}
