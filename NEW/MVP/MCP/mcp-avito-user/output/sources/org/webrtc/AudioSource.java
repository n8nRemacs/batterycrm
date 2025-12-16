package org.webrtc;

/* loaded from: classes9.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j12) {
        super(j12);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
