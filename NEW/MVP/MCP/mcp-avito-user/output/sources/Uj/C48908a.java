package uJ;

import Y41.l;
import Y61.k;
import com.avito.avcalls.rtc.connecting.IceConnectionState;
import com.avito.avcalls.rtc.connecting.SignalingState;
import com.avito.avcalls.rtc.connecting.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import vJ.C49221a;
import vJ.b;
import vJ.h;

/* compiled from: PeerConnectionObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LuJ/a;", "Lorg/webrtc/PeerConnection$Observer;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48908a implements PeerConnection.Observer {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final com.avito.avcalls.utils.logs.a f439901b;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<com.avito.avcalls.rtc.connecting.a, G0> f439902a;

    /* compiled from: PeerConnectionObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LuJ/a$a;", "", "<init>", "()V", "Lcom/avito/avcalls/utils/logs/a;", "logs", "Lcom/avito/avcalls/utils/logs/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uJ.a$a, reason: collision with other inner class name */
    public static final class C12709a {
        public /* synthetic */ C12709a(C42822w c42822w) {
            this();
        }

        public C12709a() {
        }
    }

    static {
        new C12709a(null);
        f439901b = new com.avito.avcalls.utils.logs.a("PeerConnectionObserver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C48908a(@k l<? super com.avito.avcalls.rtc.connecting.a, G0> lVar) {
        this.f439902a = lVar;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(@Y61.l IceCandidate iceCandidate) {
        f439901b.b("onIceCandidate", iceCandidate);
        if (iceCandidate != null) {
            C49221a.f440670a.getClass();
            this.f439902a.invoke(new a.b(new com.avito.avcalls.rtc.connecting.IceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp)));
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(@Y61.l PeerConnection.IceConnectionState iceConnectionState) {
        IceConnectionState iceConnectionState2;
        com.avito.avcalls.utils.logs.a aVar = f439901b;
        aVar.b("onIceConnectionChange", iceConnectionState);
        if (iceConnectionState == null) {
            aVar.a("onIceConnectionChange", "invalid connection state", null);
            return;
        }
        b.f440671a.getClass();
        switch (b.a.f440672a[iceConnectionState.ordinal()]) {
            case 1:
                iceConnectionState2 = IceConnectionState.f333063b;
                break;
            case 2:
                iceConnectionState2 = IceConnectionState.f333064c;
                break;
            case 3:
                iceConnectionState2 = IceConnectionState.f333065d;
                break;
            case 4:
                iceConnectionState2 = IceConnectionState.f333066e;
                break;
            case 5:
                iceConnectionState2 = IceConnectionState.f333067f;
                break;
            case 6:
                iceConnectionState2 = IceConnectionState.f333068g;
                break;
            case 7:
                iceConnectionState2 = IceConnectionState.f333069h;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f439902a.invoke(new a.C10347a(iceConnectionState2));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(@Y61.l PeerConnection.SignalingState signalingState) {
        SignalingState signalingState2;
        com.avito.avcalls.utils.logs.a aVar = f439901b;
        aVar.b("onSignalingChange", signalingState);
        if (signalingState == null) {
            aVar.a("onSignalingChange", "invalid signaling state", null);
            return;
        }
        h.f440679a.getClass();
        switch (h.a.f440680a[signalingState.ordinal()]) {
            case 1:
                signalingState2 = SignalingState.f333081b;
                break;
            case 2:
                signalingState2 = SignalingState.f333082c;
                break;
            case 3:
                signalingState2 = SignalingState.f333083d;
                break;
            case 4:
                signalingState2 = SignalingState.f333084e;
                break;
            case 5:
                signalingState2 = SignalingState.f333085f;
                break;
            case 6:
                signalingState2 = SignalingState.f333086g;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f439902a.invoke(new a.c(signalingState2));
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
    public final void onIceCandidatesRemoved(@Y61.l IceCandidate[] iceCandidateArr) {
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
