package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public interface vpb {
    void a(wpb wpbVar, SessionDescription sessionDescription);

    void b(wpb wpbVar);

    void d(wpb wpbVar);

    void e(String str);

    void f(wpb wpbVar, String str);

    void g(wpb wpbVar, IceCandidate[] iceCandidateArr);

    void i(wpb wpbVar, PeerConnection.SignalingState signalingState);

    void j(wpb wpbVar, IceCandidate iceCandidate);

    void k(wpb wpbVar, SessionDescription sessionDescription);

    void l(wpb wpbVar, PeerConnection.IceConnectionState iceConnectionState);

    default void m(wpb wpbVar, long j) {
    }

    void o(wpb wpbVar);
}
