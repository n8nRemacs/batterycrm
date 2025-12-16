package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import jK.InterfaceC42266a;
import javax.inject.Provider;

/* compiled from: RingingBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class a0 implements dagger.internal.h<RingingBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.audio.ringtone.c> f165343a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.a> f165344b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165345c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f165346d;

    public a0(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f165343a = provider;
        this.f165344b = provider2;
        this.f165345c = provider3;
        this.f165346d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RingingBootstrap(this.f165343a.get(), this.f165344b.get(), this.f165345c.get(), (InterfaceC42266a) this.f165346d.get());
    }
}
