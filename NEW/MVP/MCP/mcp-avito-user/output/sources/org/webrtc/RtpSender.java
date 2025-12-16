package org.webrtc;

import j.P;
import java.util.List;

/* loaded from: classes9.dex */
public class RtpSender {

    @P
    private MediaStreamTrack cachedTrack;

    @P
    private final DtmfSender dtmfSender;
    private long nativeRtpSender;
    private boolean ownsTrack = true;

    @CalledByNative
    public RtpSender(long j12) {
        this.nativeRtpSender = j12;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j12));
        if (!nativeGetMediaType(j12).equalsIgnoreCase(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            this.dtmfSender = null;
        } else {
            long jNativeGetDtmfSender = nativeGetDtmfSender(j12);
            this.dtmfSender = jNativeGetDtmfSender != 0 ? new DtmfSender(jNativeGetDtmfSender) : null;
        }
    }

    private void checkRtpSenderExists() {
        if (this.nativeRtpSender == 0) {
            throw new IllegalStateException("RtpSender has been disposed.");
        }
    }

    private static native long nativeGetDtmfSender(long j12);

    private static native String nativeGetId(long j12);

    private static native String nativeGetMediaType(long j12);

    private static native RtpParameters nativeGetParameters(long j12);

    private static native List<String> nativeGetStreams(long j12);

    private static native long nativeGetTrack(long j12);

    private static native void nativeSetFrameEncryptor(long j12, long j13);

    private static native boolean nativeSetParameters(long j12, RtpParameters rtpParameters);

    private static native void nativeSetStreams(long j12, List<String> list);

    private static native boolean nativeSetTrack(long j12, long j13);

    public void dispose() {
        checkRtpSenderExists();
        DtmfSender dtmfSender = this.dtmfSender;
        if (dtmfSender != null) {
            dtmfSender.dispose();
        }
        MediaStreamTrack mediaStreamTrack = this.cachedTrack;
        if (mediaStreamTrack != null && this.ownsTrack) {
            mediaStreamTrack.dispose();
        }
        JniCommon.nativeReleaseRef(this.nativeRtpSender);
        this.nativeRtpSender = 0L;
    }

    @P
    public DtmfSender dtmf() {
        return this.dtmfSender;
    }

    public long getNativeRtpSender() {
        checkRtpSenderExists();
        return this.nativeRtpSender;
    }

    public RtpParameters getParameters() {
        checkRtpSenderExists();
        return nativeGetParameters(this.nativeRtpSender);
    }

    public List<String> getStreams() {
        checkRtpSenderExists();
        return nativeGetStreams(this.nativeRtpSender);
    }

    public String id() {
        checkRtpSenderExists();
        return nativeGetId(this.nativeRtpSender);
    }

    public void setFrameEncryptor(FrameEncryptor frameEncryptor) {
        checkRtpSenderExists();
        nativeSetFrameEncryptor(this.nativeRtpSender, frameEncryptor.getNativeFrameEncryptor());
    }

    public boolean setParameters(RtpParameters rtpParameters) {
        checkRtpSenderExists();
        return nativeSetParameters(this.nativeRtpSender, rtpParameters);
    }

    public void setStreams(List<String> list) {
        checkRtpSenderExists();
        nativeSetStreams(this.nativeRtpSender, list);
    }

    public boolean setTrack(@P MediaStreamTrack mediaStreamTrack, boolean z12) {
        checkRtpSenderExists();
        if (!nativeSetTrack(this.nativeRtpSender, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack())) {
            return false;
        }
        MediaStreamTrack mediaStreamTrack2 = this.cachedTrack;
        if (mediaStreamTrack2 != null && this.ownsTrack) {
            mediaStreamTrack2.dispose();
        }
        this.cachedTrack = mediaStreamTrack;
        this.ownsTrack = z12;
        return true;
    }

    @P
    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
