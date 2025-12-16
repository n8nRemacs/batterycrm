package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

/* compiled from: OverlayLazyStateInitializerBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class U implements dagger.internal.h<OverlayLazyStateInitializerBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165326a;

    public U(dagger.internal.u uVar) {
        this.f165326a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new OverlayLazyStateInitializerBootstrap((com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.h) this.f165326a.get());
    }
}
