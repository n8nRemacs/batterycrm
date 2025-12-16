package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AudioBluetoothManager_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<AudioBluetoothManager> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AudioBluetoothManager.d> f165818a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<AudioBluetoothManager.b> f165819b;

    /* renamed from: c, reason: collision with root package name */
    public final u f165820c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<AudioBluetoothManager.a> f165821d;

    public e(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f165818a = provider;
        this.f165819b = provider2;
        this.f165820c = uVar;
        this.f165821d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new AudioBluetoothManager(this.f165818a.get(), this.f165819b.get(), (AudioBluetoothManager.c) this.f165820c.get(), this.f165821d.get());
    }
}
