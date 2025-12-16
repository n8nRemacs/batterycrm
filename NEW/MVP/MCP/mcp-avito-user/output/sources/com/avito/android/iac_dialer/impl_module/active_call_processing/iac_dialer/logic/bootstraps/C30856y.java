package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: BackClicksSuppressorBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30856y implements dagger.internal.h<BackClicksSuppressorBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165410a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f165411b;

    public C30856y(dagger.internal.u uVar, Provider provider) {
        this.f165410a = uVar;
        this.f165411b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new BackClicksSuppressorBootstrap((com.avito.android.iac_dialer_root.public_module.on_back_pressed_callback.b) this.f165410a.get(), this.f165411b.get());
    }
}
