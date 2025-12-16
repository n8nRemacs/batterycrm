package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AudioBluetoothManager_BluetoothConnectPermissionHelper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class a implements dagger.internal.h<AudioBluetoothManager.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165811a;

    public a(C30102l3 c30102l3) {
        this.f165811a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AudioBluetoothManager.a((Context) this.f165811a.get());
    }
}
