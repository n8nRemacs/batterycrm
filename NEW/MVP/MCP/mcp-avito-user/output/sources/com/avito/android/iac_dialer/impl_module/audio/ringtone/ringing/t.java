package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacVibrationPlayerSplitter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f165907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<n> f165908b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f165909c;

    public t(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f165907a = provider;
        this.f165908b = provider2;
        this.f165909c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(dagger.internal.g.b(this.f165907a), dagger.internal.g.b(this.f165908b), dagger.internal.g.a(w.a(this.f165909c)));
    }
}
