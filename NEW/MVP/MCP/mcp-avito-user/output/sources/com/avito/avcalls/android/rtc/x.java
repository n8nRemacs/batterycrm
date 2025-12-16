package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.logger.g;
import com.avito.avcalls.android.rtc.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import org.webrtc.DataChannel;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import zQ0.b;
import zQ0.h;

/* compiled from: PeerConnectionObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/avcalls/android/rtc/x;", "Lorg/webrtc/PeerConnection$Observer;", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements PeerConnection.Observer {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f331981a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f331982b;

    public x() {
        e2 e2VarB = f2.b(100, 0, null, 6);
        this.f331981a = e2VarB;
        this.f331982b = e2VarB;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(@Y61.l org.webrtc.IceCandidate iceCandidate) {
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PeerConnectionObserver", "onIceCandidate [" + iceCandidate + ']');
        if (iceCandidate != null) {
            this.f331981a.K5(new v.b(new IceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp)));
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(@Y61.l PeerConnection.IceConnectionState iceConnectionState) {
        IceConnectionState iceConnectionState2;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PeerConnectionObserver", "onIceConnectionChange state=[" + iceConnectionState + ']');
        if (iceConnectionState == null) {
            g.Companion.a("PeerConnectionObserver", "invalid connection state", null);
            return;
        }
        e2 e2Var = this.f331981a;
        switch (b.a.f444040a[iceConnectionState.ordinal()]) {
            case 1:
                iceConnectionState2 = IceConnectionState.f331874b;
                break;
            case 2:
                iceConnectionState2 = IceConnectionState.f331875c;
                break;
            case 3:
                iceConnectionState2 = IceConnectionState.f331876d;
                break;
            case 4:
                iceConnectionState2 = IceConnectionState.f331877e;
                break;
            case 5:
                iceConnectionState2 = IceConnectionState.f331878f;
                break;
            case 6:
                iceConnectionState2 = IceConnectionState.f331879g;
                break;
            case 7:
                iceConnectionState2 = IceConnectionState.f331880h;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        e2Var.K5(new v.a(iceConnectionState2));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(@Y61.l PeerConnection.SignalingState signalingState) {
        SignalingState signalingState2;
        com.avito.avcalls.android.logger.g.INSTANCE.getClass();
        g.Companion.c("PeerConnectionObserver", "onSignalingChange state=[" + signalingState + ']');
        if (signalingState == null) {
            g.Companion.a("PeerConnectionObserver", "invalid signaling state", null);
            return;
        }
        e2 e2Var = this.f331981a;
        switch (h.a.f444043a[signalingState.ordinal()]) {
            case 1:
                signalingState2 = SignalingState.f331891b;
                break;
            case 2:
                signalingState2 = SignalingState.f331892c;
                break;
            case 3:
                signalingState2 = SignalingState.f331893d;
                break;
            case 4:
                signalingState2 = SignalingState.f331894e;
                break;
            case 5:
                signalingState2 = SignalingState.f331895f;
                break;
            case 6:
                signalingState2 = SignalingState.f331896g;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        e2Var.K5(new v.c(signalingState2));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddStream(@Y61.l MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onDataChannel(@Y61.l DataChannel dataChannel) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(@Y61.l org.webrtc.IceCandidate[] iceCandidateArr) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z12) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(@Y61.l PeerConnection.IceGatheringState iceGatheringState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(@Y61.l MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddTrack(@Y61.l RtpReceiver rtpReceiver, @Y61.l MediaStream[] mediaStreamArr) {
    }
}
