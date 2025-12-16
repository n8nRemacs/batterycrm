package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class hpb implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;

    public /* synthetic */ hpb(wpb wpbVar, int i) {
        this.a = i;
        this.b = wpbVar;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) {
        RtpTransceiver next;
        AudioTrack audioTrack;
        RtpTransceiver next2;
        VideoTrack videoTrack;
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                PeerConnection peerConnection = (PeerConnection) obj;
                wpbVar.u(peerConnection, false);
                wpbVar.l(peerConnection, false);
                break;
            default:
                wpb wpbVar2 = this.b;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                wpbVar2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                wpbVar2.W = null;
                wpbVar2.Y = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            wpbVar2.C.log("PCRTCClient", "audioShareTransceiver found");
                        }
                    } else {
                        next = null;
                    }
                }
                if (next != null) {
                    try {
                        next.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        wpbVar2.C.log("PCRTCClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    ie8 ie8Var = (ie8) wpbVar2.x.a().b;
                    if (ie8Var != null && (audioTrack = (AudioTrack) ((MediaStreamTrack) ie8Var.j.e)) != null) {
                        RtpSender sender = next.getSender();
                        wpbVar2.W = sender;
                        wpbVar2.t.j(sender, "audio-share");
                        sender.setTrack(audioTrack, false);
                        wpbVar2.C.log("PCRTCClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (next2.getMid() != null && next2.getMid().contains("s") && next2.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            wpbVar2.C.log("PCRTCClient", "shareScreenTransceiver found");
                        }
                    } else {
                        next2 = null;
                    }
                }
                if (next2 != null) {
                    try {
                        next2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        wpbVar2.C.log("PCRTCClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    ie8 ie8Var2 = (ie8) wpbVar2.x.a().b;
                    if (ie8Var2 != null && (videoTrack = (VideoTrack) ((MediaStreamTrack) ie8Var2.z.e)) != null) {
                        xpb xpbVar = wpbVar2.t;
                        RtpSender sender2 = next2.getSender();
                        xpbVar.l(sender2, "screen-share", 30000, 2048000, null, false);
                        wpbVar2.Y = sender2;
                        sender2.setTrack(videoTrack, false);
                        RtpSender rtpSender = wpbVar2.Y;
                        if (wpbVar2.l0 && rtpSender != null) {
                            rtpSender.setVideoEncoderObserver(new os0((Object) wpbVar2, false));
                        }
                        wpbVar2.C.log("PCRTCClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            wpbVar2.m(peerConnection2, false, true, wpbVar2.Y);
                        } catch (IllegalStateException e3) {
                            wpbVar2.C.log("PCRTCClient", "IllegalStateException, " + wpbVar2 + " ex=" + e3);
                        } catch (Exception e4) {
                            wpbVar2.C.log("PCRTCClient", "Exception, " + wpbVar2 + " ex=" + e4);
                        }
                    }
                }
                wpbVar2.v(peerConnection2);
                qi1 qi1Var = wpbVar2.E;
                if (qi1Var.z) {
                    jda jdaVar = jda.b;
                    if (jdaVar.equals(qi1Var.y)) {
                        wpbVar2.h(new kda(jdaVar, "emulated error", null, wpbVar2.O.getRemoteDescription()));
                        break;
                    }
                }
                peerConnection2.createAnswer(new tpb(wpbVar2, 1), wpbVar2.R);
                break;
        }
    }
}
