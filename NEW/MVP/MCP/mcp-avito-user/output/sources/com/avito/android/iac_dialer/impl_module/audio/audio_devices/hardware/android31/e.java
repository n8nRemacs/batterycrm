package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31;

import android.media.AudioDeviceInfo;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: HardwareAudioManagerAndroid31Impl.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {
    public static final void a(StringBuilder sb2) {
        sb2.append('\n');
        sb2.append(C43066x.Z(8, " "));
    }

    public static final String b(AudioDeviceInfo audioDeviceInfo) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        switch (audioDeviceInfo.getType()) {
            case 1:
                str = "INFO_BUILTIN_EARPIECE";
                break;
            case 2:
                str = "INFO_BUILTIN_SPEAKER";
                break;
            case 3:
                str = "INFO_WIRED_HEADSET";
                break;
            case 4:
                str = "INFO_WIRED_HEADPHONES";
                break;
            case 5:
                str = "INFO_LINE_ANALOG";
                break;
            case 6:
                str = "INFO_LINE_DIGITAL";
                break;
            case 7:
                str = "INFO_BLUETOOTH_SCO";
                break;
            case 8:
                str = "INFO_BLUETOOTH_A2DP";
                break;
            case 9:
                str = "INFO_HDMI";
                break;
            case 10:
                str = "INFO_HDMI_ARC";
                break;
            case 11:
                str = "INFO_USB_DEVICE";
                break;
            case 12:
                str = "INFO_USB_ACCESSORY";
                break;
            case 13:
                str = "INFO_DOCK";
                break;
            case 14:
                str = "INFO_FM";
                break;
            case 15:
                str = "INFO_BUILTIN_MIC";
                break;
            case 16:
                str = "INFO_FM_TUNER";
                break;
            case 17:
                str = "INFO_TV_TUNER";
                break;
            case 18:
                str = "INFO_TELEPHONY";
                break;
            case 19:
                str = "INFO_AUX_LINE";
                break;
            case 20:
                str = "INFO_IP";
                break;
            case 21:
                str = "INFO_BUS";
                break;
            case 22:
                str = "INFO_USB_HEADSET";
                break;
            case 23:
                str = "INFO_HEARING_AID";
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                str = "INFO_BUILTIN_SPEAKER_SAFE";
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                str = "INFO_REMOTE_SUBMIX";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                str = "INFO_BLE_HEADSET";
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                str = "INFO_BLE_SPEAKER";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            default:
                str = "unknown_audio_device_info_type_" + audioDeviceInfo.getType();
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                str = "INFO_HDMI_EARC";
                break;
            case 30:
                str = "INFO_BLE_BROADCAST";
                break;
        }
        sb2.append(str);
        sb2.append("(id=");
        sb2.append(audioDeviceInfo.getId());
        sb2.append(", name='");
        sb2.append((Object) audioDeviceInfo.getProductName());
        sb2.append("')");
        return sb2.toString();
    }
}
