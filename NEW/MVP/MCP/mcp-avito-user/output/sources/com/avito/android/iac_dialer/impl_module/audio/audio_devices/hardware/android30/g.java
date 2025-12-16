package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl;
import kotlin.Metadata;
import kotlin.collections.b1;
import kotlin.jvm.internal.N;

/* compiled from: HardwareAudioManagerAndroid30Impl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State;", "it", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State$Running;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<HardwareAudioManagerAndroid30Impl.State.Running, HardwareAudioManagerAndroid30Impl.State> {

    /* renamed from: l, reason: collision with root package name */
    public static final g f165822l = new g();

    public g() {
        super(1);
    }

    @Override // Y41.l
    public final HardwareAudioManagerAndroid30Impl.State invoke(HardwareAudioManagerAndroid30Impl.State.Running running) {
        HardwareAudioManagerAndroid30Impl.State.Running running2 = running;
        return HardwareAudioManagerAndroid30Impl.State.Running.copy$default(running2, b1.i(running2.getDevices(), HardwareAudioDevice.BLUETOOTH), null, null, 6, null);
    }
}
