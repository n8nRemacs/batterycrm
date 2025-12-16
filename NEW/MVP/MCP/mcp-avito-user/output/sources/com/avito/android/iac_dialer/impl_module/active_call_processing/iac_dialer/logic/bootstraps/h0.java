package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: TimerInteractorBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class h0 implements dagger.internal.h<TimerInteractorBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165382a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165383b;

    public h0(dagger.internal.u uVar, Provider provider) {
        this.f165382a = uVar;
        this.f165383b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TimerInteractorBootstrap((IacTimerInteractor) this.f165382a.get(), this.f165383b.get());
    }
}
