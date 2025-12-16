package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacAudioDeviceManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f165759a;

    public e(u uVar) {
        this.f165759a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(dagger.internal.g.a(w.a(this.f165759a)));
    }
}
