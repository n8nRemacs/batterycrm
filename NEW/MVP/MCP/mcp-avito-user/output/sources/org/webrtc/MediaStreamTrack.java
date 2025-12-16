package org.webrtc;

import j.P;

/* loaded from: classes9.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i12) {
            this.nativeIndex = i12;
        }

        @CalledByNative("MediaType")
        public static MediaType fromNativeIndex(int i12) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i12) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException(AK.c.g(i12, "Unknown native media type: "));
        }

        @CalledByNative("MediaType")
        public int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i12) {
            return values()[i12];
        }
    }

    public MediaStreamTrack(long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j12;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    @P
    public static MediaStreamTrack createMediaStreamTrack(long j12) {
        if (j12 == 0) {
            return null;
        }
        String strNativeGetKind = nativeGetKind(j12);
        if (strNativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j12);
        }
        if (strNativeGetKind.equals("video")) {
            return new VideoTrack(j12);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j12);

    private static native String nativeGetId(long j12);

    private static native String nativeGetKind(long j12);

    private static native State nativeGetState(long j12);

    private static native boolean nativeSetEnabled(long j12, boolean z12);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z12) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z12);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
