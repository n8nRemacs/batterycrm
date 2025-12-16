package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.bootstraps;

import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: TonePlayerBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class j0 implements dagger.internal.h<TonePlayerBootstrap> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f165386a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.audio.tone.d f165387b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f165388c;

    public j0(dagger.internal.u uVar, com.avito.android.iac_dialer.impl_module.audio.tone.d dVar, Provider provider) {
        this.f165386a = uVar;
        this.f165387b = dVar;
        this.f165388c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new TonePlayerBootstrap((com.avito.android.iac_dialer.impl_module.audio.dtmf.a) this.f165386a.get(), (com.avito.android.iac_dialer.impl_module.audio.tone.c) this.f165387b.get(), this.f165388c.get());
    }
}
