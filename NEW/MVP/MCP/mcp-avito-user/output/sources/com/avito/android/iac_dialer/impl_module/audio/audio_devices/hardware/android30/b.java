package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AudioBluetoothManager_BluetoothHeadsetBroadcastReceiver_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class b implements dagger.internal.h<AudioBluetoothManager.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165812a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AudioBluetoothManager.a> f165813b;

    public b(C30102l3 c30102l3, Provider provider) {
        this.f165812a = c30102l3;
        this.f165813b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AudioBluetoothManager.b((Context) this.f165812a.get(), this.f165813b.get());
    }
}
