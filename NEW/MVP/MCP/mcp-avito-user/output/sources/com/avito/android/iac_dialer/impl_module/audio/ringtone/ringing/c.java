package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacRingingPlayerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f> f165883a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f165884b;

    public c(dagger.internal.u uVar, Provider provider) {
        this.f165883a = provider;
        this.f165884b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f165883a.get(), (k) this.f165884b.get());
    }
}
