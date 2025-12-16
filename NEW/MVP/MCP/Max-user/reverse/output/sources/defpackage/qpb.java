package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import org.webrtc.VideoEncoderObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* loaded from: classes2.dex */
public final /* synthetic */ class qpb implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qpb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wpb wpbVar = (wpb) this.b;
                PeerConnection.IceGatheringState iceGatheringState = (PeerConnection.IceGatheringState) this.c;
                ArrayList arrayList = wpbVar.Z;
                if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
                    wpbVar.N = SystemClock.elapsedRealtime();
                }
                if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
                    wpbVar.C.log("PCRTCClient", wpbVar.toString() + ": iceGatheringState=" + arrayList.size() + " " + arrayList);
                    if (wpbVar.b0) {
                        int i = 0;
                        wpbVar.b0 = false;
                        int size = arrayList.size();
                        boolean z = false;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            IceCandidate iceCandidate = (IceCandidate) obj2;
                            if (iceCandidate.sdp.contains("typ srflx") || iceCandidate.sdp.contains("typ prflx") || iceCandidate.sdp.contains("typ relay")) {
                                z = true;
                            }
                        }
                        if (!z) {
                            wpbVar.B.log(hcf.app_event, "rtc.no.stun.candidates", (String) null);
                            break;
                        }
                    }
                }
                break;
            case 1:
                wpb wpbVar2 = (wpb) this.b;
                sbh sbhVar = (sbh) this.c;
                PeerConnection peerConnection = (PeerConnection) obj;
                wpbVar2.getClass();
                if (sbhVar.c != 0) {
                    wpbVar2.l(peerConnection, false);
                    break;
                } else {
                    wpbVar2.u(peerConnection, false);
                    break;
                }
            case 2:
                wpb wpbVar3 = (wpb) this.b;
                StatsObserver statsObserver = (StatsObserver) this.c;
                wpbVar3.getClass();
                if (!((PeerConnection) obj).getStats(statsObserver, (MediaStreamTrack) null)) {
                    wpbVar3.C.log("PCRTCClient", wpbVar3.toString() + ": failed to get stats");
                    break;
                }
                break;
            case 3:
                wpb wpbVar4 = (wpb) this.b;
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                wpbVar4.C.log("PCRTCClient", "❄ -> removed ice candidates: " + Arrays.toString(iceCandidateArr));
                wpbVar4.v.post(new k79(wpbVar4, 25, iceCandidateArr));
                break;
            case 4:
                ((PeerConnection) obj).setConfiguration(((wpb) this.b).g((List) this.c));
                break;
            case 5:
                os0 os0Var = (os0) this.b;
                VideoEncoderObserver.EncoderInfo encoderInfo = (VideoEncoderObserver.EncoderInfo) this.c;
                wpb wpbVar5 = (wpb) os0Var.b;
                if (!encoderInfo.isHardwareAccelerated()) {
                    wpbVar5.a0.l(Float.valueOf(wpbVar5.m0), Float.valueOf(wpbVar5.n0));
                    break;
                } else {
                    wpbVar5.a0.l(null, null);
                    break;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4((WaitingRoomParticipants) this.b, (l2f) this.c, (lu1) obj);
                break;
        }
    }
}
