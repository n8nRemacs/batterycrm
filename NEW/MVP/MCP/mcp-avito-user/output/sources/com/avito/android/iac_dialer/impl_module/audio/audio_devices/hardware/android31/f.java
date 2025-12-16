package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HardwareAudioManagerAndroid31Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165844a;

    public f(C30102l3 c30102l3) {
        this.f165844a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Context) this.f165844a.get());
    }
}
