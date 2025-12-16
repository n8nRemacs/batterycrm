package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HardwareAudioManagerAndroid30Impl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<HardwareAudioManagerAndroid30Impl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AudioBluetoothManager> f165824a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<HardwareAudioManagerAndroid30Impl.d> f165825b;

    /* renamed from: c, reason: collision with root package name */
    public final u f165826c;

    public i(u uVar, Provider provider, Provider provider2) {
        this.f165824a = provider;
        this.f165825b = provider2;
        this.f165826c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new HardwareAudioManagerAndroid30Impl(this.f165824a.get(), this.f165825b.get(), (HardwareAudioManagerAndroid30Impl.b) this.f165826c.get());
    }
}
