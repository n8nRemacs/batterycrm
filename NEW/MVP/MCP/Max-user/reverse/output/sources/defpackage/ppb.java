package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* loaded from: classes2.dex */
public final /* synthetic */ class ppb implements RtpReceiver.Observer {
    public final /* synthetic */ wpb a;

    public /* synthetic */ ppb(wpb wpbVar) {
        this.a = wpbVar;
    }

    @Override // org.webrtc.RtpReceiver.Observer
    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        wpb wpbVar = this.a;
        wpbVar.v.post(new gpb(wpbVar, 6));
    }
}
