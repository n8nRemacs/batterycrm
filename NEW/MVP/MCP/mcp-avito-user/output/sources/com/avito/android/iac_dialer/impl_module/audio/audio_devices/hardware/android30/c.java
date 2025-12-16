package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AudioBluetoothManager_BluetoothScoAudioStreamConnector_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<AudioBluetoothManager.c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165814a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AudioBluetoothManager.a> f165815b;

    public c(C30102l3 c30102l3, Provider provider) {
        this.f165814a = c30102l3;
        this.f165815b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AudioBluetoothManager.c((Context) this.f165814a.get(), this.f165815b.get());
    }
}
