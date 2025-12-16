package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import j.P;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: classes9.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";

    @P
    private static AudioEffect.Descriptor[] cachedEffects;

    @P
    private AcousticEchoCanceler aec;

    /* renamed from: ns, reason: collision with root package name */
    @P
    private NoiseSuppressor f422272ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z12) {
        if (!z12) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        return (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported());
    }

    @P
    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] descriptorArrQueryEffects = AudioEffect.queryEffects();
        cachedEffects = descriptorArrQueryEffects;
        return descriptorArrQueryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !r4.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i12) throws IllegalStateException {
        Logging.d(TAG, "enable(audioSession=" + i12 + ")");
        boolean z12 = false;
        assertTrue(this.aec == null);
        assertTrue(this.f422272ns == null);
        boolean zIsAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String str = BeduinCartItemModel.DISABLED_STRING;
        if (zIsAcousticEchoCancelerSupported) {
            AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(i12);
            this.aec = acousticEchoCancelerCreate;
            if (acousticEchoCancelerCreate != null) {
                boolean enabled = acousticEchoCancelerCreate.getEnabled();
                boolean z13 = this.shouldEnableAec && isAcousticEchoCancelerSupported();
                if (this.aec.setEnabled(z13) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                Logging.d(TAG, "AcousticEchoCanceler: was " + (enabled ? "enabled" : BeduinCartItemModel.DISABLED_STRING) + ", enable: " + z13 + ", is now: " + (this.aec.getEnabled() ? "enabled" : BeduinCartItemModel.DISABLED_STRING));
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(i12);
            this.f422272ns = noiseSuppressorCreate;
            if (noiseSuppressorCreate == null) {
                Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
                return;
            }
            boolean enabled2 = noiseSuppressorCreate.getEnabled();
            if (this.shouldEnableNs && isNoiseSuppressorSupported()) {
                z12 = true;
            }
            if (this.f422272ns.setEnabled(z12) != 0) {
                Logging.e(TAG, "Failed to set the NoiseSuppressor state");
            }
            String str2 = enabled2 ? "enabled" : BeduinCartItemModel.DISABLED_STRING;
            if (this.f422272ns.getEnabled()) {
                str = "enabled";
            }
            Logging.d(TAG, "NoiseSuppressor: was " + str2 + ", enable: " + z12 + ", is now: " + str);
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f422272ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f422272ns = null;
        }
    }

    public boolean setAEC(boolean z12) {
        Logging.d(TAG, "setAEC(" + z12 + ")");
        if (!isAcousticEchoCancelerSupported()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z12 == this.shouldEnableAec) {
            this.shouldEnableAec = z12;
            return true;
        }
        Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z12) {
        Logging.d(TAG, "setNS(" + z12 + ")");
        if (!isNoiseSuppressorSupported()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.f422272ns == null || z12 == this.shouldEnableNs) {
            this.shouldEnableNs = z12;
            return true;
        }
        Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }

    public boolean toggleNS(boolean z12) {
        if (this.f422272ns == null) {
            Logging.e(TAG, "Attempting to enable or disable nonexistent NoiseSuppressor.");
            return false;
        }
        Logging.d(TAG, "toggleNS(" + z12 + ")");
        return this.f422272ns.setEnabled(z12) == 0;
    }
}
