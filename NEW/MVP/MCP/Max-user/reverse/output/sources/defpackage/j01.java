package defpackage;

import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public interface j01 {
    void onIceRestart();

    void onNegotiationError(kda kdaVar);

    void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState);

    void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);
}
