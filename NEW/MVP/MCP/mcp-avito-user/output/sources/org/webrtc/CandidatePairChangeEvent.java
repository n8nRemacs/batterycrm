package org.webrtc;

/* loaded from: classes9.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final IceCandidate local;
    public final String reason;
    public final IceCandidate remote;

    @CalledByNative
    public CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i12, String str, int i13) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i12;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i13;
    }
}
