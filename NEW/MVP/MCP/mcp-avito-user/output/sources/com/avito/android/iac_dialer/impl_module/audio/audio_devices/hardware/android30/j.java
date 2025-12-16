package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HardwareAudioManagerAndroid30Impl_InternalAudioManager_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<HardwareAudioManagerAndroid30Impl.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165827a;

    public j(C30102l3 c30102l3) {
        this.f165827a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new HardwareAudioManagerAndroid30Impl.b((Context) this.f165827a.get());
    }
}
