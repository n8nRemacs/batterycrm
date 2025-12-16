package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HardwareAudioManagerAndroid30Impl_WiredHeadsetReceiver_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<HardwareAudioManagerAndroid30Impl.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165828a;

    public k(C30102l3 c30102l3) {
        this.f165828a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new HardwareAudioManagerAndroid30Impl.d((Context) this.f165828a.get());
    }
}
