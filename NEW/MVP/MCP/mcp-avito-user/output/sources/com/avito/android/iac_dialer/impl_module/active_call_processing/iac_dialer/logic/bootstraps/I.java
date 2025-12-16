package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.error_reporting.app_state.C30363b;
import com.avito.android.error_reporting.app_state.C30364c;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: FirebaseLogBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class I implements dagger.internal.h<FirebaseLogBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final C30364c f165147a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165148b;

    public I(C30364c c30364c, Provider provider) {
        this.f165147a = c30364c;
        this.f165148b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FirebaseLogBootstrap((C30363b) this.f165147a.get(), this.f165148b.get());
    }
}
