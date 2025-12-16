package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacDialerLoggerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i> f165632a;

    public i(Provider<com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.i> provider) {
        this.f165632a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f165632a.get());
    }
}
