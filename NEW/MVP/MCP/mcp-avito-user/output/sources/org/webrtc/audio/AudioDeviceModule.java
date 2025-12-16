package org.webrtc.audio;

/* loaded from: classes9.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z12);

    default boolean setNoiseSuppressorEnabled(boolean z12) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f12) {
        return false;
    }

    void setSpeakerMute(boolean z12);
}
