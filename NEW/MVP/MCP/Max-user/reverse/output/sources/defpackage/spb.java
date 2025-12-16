package defpackage;

import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class spb extends m9j {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionDescription b;
    public final /* synthetic */ wpb c;

    public /* synthetic */ spb(wpb wpbVar, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.c = wpbVar;
        this.b = sessionDescription;
    }

    @Override // defpackage.m9j, org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        switch (this.a) {
            case 0:
                wpb wpbVar = this.c;
                if (!wpbVar.E.z) {
                    wpbVar.p(this.b, true, str);
                    break;
                } else {
                    SessionDescription sessionDescription = this.b;
                    kda kdaVar = new kda(jda.a(sessionDescription.type, true), str, sessionDescription, wpbVar.O.getRemoteDescription());
                    wpbVar.p(sessionDescription, true, str);
                    wpbVar.i(new kpb(wpbVar, kdaVar, 1), "onSetFailure");
                    break;
                }
            default:
                wpb wpbVar2 = this.c;
                if (!wpbVar2.E.z) {
                    wpbVar2.p(this.b, false, str);
                    break;
                } else {
                    SessionDescription sessionDescription2 = this.b;
                    kda kdaVar2 = new kda(jda.a(sessionDescription2.type, false), str, wpbVar2.O.getLocalDescription(), sessionDescription2);
                    wpbVar2.p(sessionDescription2, false, str);
                    wpbVar2.i(new kpb(wpbVar2, kdaVar2, 1), "onSetFailure");
                    break;
                }
        }
    }

    @Override // defpackage.m9j, org.webrtc.SdpObserver
    public final void onSetSuccess() {
        switch (this.a) {
            case 0:
                this.c.o(this.b, true);
                break;
            default:
                this.c.o(this.b, false);
                break;
        }
    }
}
