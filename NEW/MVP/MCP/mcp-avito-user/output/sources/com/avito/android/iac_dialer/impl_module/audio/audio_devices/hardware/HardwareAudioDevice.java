package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware;

import Y61.k;
import dL.d;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HardwareAudioDeviceManager.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "BLUETOOTH", "WIRED_HEADSET", "EARPIECE", "SPEAKER_PHONE", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HardwareAudioDevice implements d {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HardwareAudioDevice[] $VALUES;
    public static final HardwareAudioDevice BLUETOOTH = new HardwareAudioDevice("BLUETOOTH", 0);
    public static final HardwareAudioDevice WIRED_HEADSET = new HardwareAudioDevice("WIRED_HEADSET", 1);
    public static final HardwareAudioDevice EARPIECE = new HardwareAudioDevice("EARPIECE", 2);
    public static final HardwareAudioDevice SPEAKER_PHONE = new HardwareAudioDevice("SPEAKER_PHONE", 3);

    private static final /* synthetic */ HardwareAudioDevice[] $values() {
        return new HardwareAudioDevice[]{BLUETOOTH, WIRED_HEADSET, EARPIECE, SPEAKER_PHONE};
    }

    static {
        HardwareAudioDevice[] hardwareAudioDeviceArr$values = $values();
        $VALUES = hardwareAudioDeviceArr$values;
        $ENTRIES = c.a(hardwareAudioDeviceArr$values);
    }

    private HardwareAudioDevice(String str, int i12) {
    }

    @k
    public static a<HardwareAudioDevice> getEntries() {
        return $ENTRIES;
    }

    public static HardwareAudioDevice valueOf(String str) {
        return (HardwareAudioDevice) Enum.valueOf(HardwareAudioDevice.class, str);
    }

    public static HardwareAudioDevice[] values() {
        return (HardwareAudioDevice[]) $VALUES.clone();
    }
}
