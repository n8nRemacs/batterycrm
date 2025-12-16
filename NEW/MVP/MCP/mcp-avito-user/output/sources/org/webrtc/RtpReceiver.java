package org.webrtc;

import j.P;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public class RtpReceiver {

    @P
    private MediaStreamTrack cachedTrack;
    private long nativeObserver;
    private long nativeRtpReceiver;

    public interface Observer {
        @CalledByNative("Observer")
        void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType);
    }

    @CalledByNative
    public RtpReceiver(long j12) {
        this.nativeRtpReceiver = j12;
        this.cachedTrack = MediaStreamTrack.createMediaStreamTrack(nativeGetTrack(j12));
    }

    private void checkRtpReceiverExists() {
        if (this.nativeRtpReceiver == 0) {
            throw new IllegalStateException("RtpReceiver has been disposed.");
        }
    }

    private static native String nativeGetId(long j12);

    private static native RtpParameters nativeGetParameters(long j12);

    private static native long nativeGetTrack(long j12);

    private static native void nativeSetFrameDecryptor(long j12, long j13);

    private static native long nativeSetObserver(long j12, Observer observer);

    private static native void nativeUnsetObserver(long j12, long j13);

    public void SetObserver(Observer observer) {
        checkRtpReceiverExists();
        long j12 = this.nativeObserver;
        if (j12 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j12);
        }
        this.nativeObserver = nativeSetObserver(this.nativeRtpReceiver, observer);
    }

    @CalledByNative
    public void dispose() {
        checkRtpReceiverExists();
        this.cachedTrack.dispose();
        long j12 = this.nativeObserver;
        if (j12 != 0) {
            nativeUnsetObserver(this.nativeRtpReceiver, j12);
            this.nativeObserver = 0L;
        }
        JniCommon.nativeReleaseRef(this.nativeRtpReceiver);
        this.nativeRtpReceiver = 0L;
    }

    public long getNativeRtpReceiver() {
        checkRtpReceiverExists();
        return this.nativeRtpReceiver;
    }

    public RtpParameters getParameters() {
        checkRtpReceiverExists();
        return nativeGetParameters(this.nativeRtpReceiver);
    }

    public String id() {
        checkRtpReceiverExists();
        return nativeGetId(this.nativeRtpReceiver);
    }

    public void setFrameDecryptor(FrameDecryptor frameDecryptor) {
        checkRtpReceiverExists();
        nativeSetFrameDecryptor(this.nativeRtpReceiver, frameDecryptor.getNativeFrameDecryptor());
    }

    @P
    public MediaStreamTrack track() {
        return this.cachedTrack;
    }
}
