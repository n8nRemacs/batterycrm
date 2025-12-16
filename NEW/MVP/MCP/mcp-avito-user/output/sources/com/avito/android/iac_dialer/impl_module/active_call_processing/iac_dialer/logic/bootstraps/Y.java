package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;
import uK.InterfaceC48910a;

/* compiled from: ProximityLockerBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class Y implements dagger.internal.h<ProximityLockerBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165339a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165340b;

    public Y(dagger.internal.u uVar, Provider provider) {
        this.f165339a = uVar;
        this.f165340b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ProximityLockerBootstrap((InterfaceC48910a) this.f165339a.get(), this.f165340b.get());
    }
}
