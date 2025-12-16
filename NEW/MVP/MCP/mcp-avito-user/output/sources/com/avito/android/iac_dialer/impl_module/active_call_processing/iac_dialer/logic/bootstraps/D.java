package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: CanRecallInteractorBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class D implements dagger.internal.h<CanRecallInteractorBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165101a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165102b;

    public D(dagger.internal.u uVar, Provider provider) {
        this.f165101a = uVar;
        this.f165102b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new CanRecallInteractorBootstrap((com.avito.android.iac_dialer.impl_module.canrecall_interactor.a) this.f165101a.get(), this.f165102b.get());
    }
}
