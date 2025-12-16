package org.webrtc;

/* loaded from: classes9.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j12) {
        super(j12);
    }

    private static native void nativeSetVolume(long j12, double d12);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d12) {
        nativeSetVolume(getNativeAudioTrack(), d12);
    }
}
