package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AudioBluetoothManager_BluetoothServiceListener_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<AudioBluetoothManager.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f165816a;

    /* renamed from: b, reason: collision with root package name */
    public final u f165817b;

    public d(C30102l3 c30102l3, u uVar) {
        this.f165816a = c30102l3;
        this.f165817b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new AudioBluetoothManager.d((Context) this.f165816a.get(), (AudioBluetoothManager.a) this.f165817b.get());
    }
}
