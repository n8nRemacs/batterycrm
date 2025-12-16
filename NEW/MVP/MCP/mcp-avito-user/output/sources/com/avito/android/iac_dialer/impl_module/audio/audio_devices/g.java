package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: IacAudioDeviceManager.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165760a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f165761b;

        static {
            int[] iArr = new int[HardwareAudioDevice.values().length];
            try {
                iArr[HardwareAudioDevice.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HardwareAudioDevice.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HardwareAudioDevice.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HardwareAudioDevice.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f165760a = iArr;
            int[] iArr2 = new int[AudioDevice.Type.values().length];
            try {
                iArr2[AudioDevice.Type.WIRED_HEADSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AudioDevice.Type.BLUETOOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AudioDevice.Type.SPEAKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AudioDevice.Type.EARPIECE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AudioDevice.Type.STREAMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AudioDevice.Type.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f165761b = iArr2;
        }
    }

    @k
    public static final AudioDevice a(@k HardwareAudioDevice hardwareAudioDevice) {
        int i12 = a.f165760a[hardwareAudioDevice.ordinal()];
        if (i12 == 1) {
            AudioDevice.Type type = AudioDevice.Type.BLUETOOTH;
            com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
            return new AudioDevice(type, "", com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165747e);
        }
        if (i12 == 2) {
            AudioDevice.Type type2 = AudioDevice.Type.WIRED_HEADSET;
            com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
            return new AudioDevice(type2, "", com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165745c);
        }
        if (i12 == 3) {
            AudioDevice.Type type3 = AudioDevice.Type.EARPIECE;
            com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
            return new AudioDevice(type3, "", com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165746d);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        AudioDevice.Type type4 = AudioDevice.Type.SPEAKER;
        com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
        return new AudioDevice(type4, "", com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165744b);
    }
}
