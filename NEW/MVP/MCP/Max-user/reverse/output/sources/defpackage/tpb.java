package defpackage;

import org.webrtc.SessionDescription;

/* loaded from: classes2.dex */
public final class tpb extends m9j {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;

    public /* synthetic */ tpb(wpb wpbVar, int i) {
        this.a = i;
        this.b = wpbVar;
    }

    @Override // defpackage.m9j, org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                if (!wpbVar.E.z) {
                    wpbVar.j(str);
                    break;
                } else {
                    wpbVar.h(new kda(jda.a, str, null, null));
                    break;
                }
            default:
                wpb wpbVar2 = this.b;
                if (!wpbVar2.E.z) {
                    wpbVar2.j(str);
                    break;
                } else {
                    wpbVar2.h(new kda(jda.b, str, null, wpbVar2.O.getRemoteDescription()));
                    break;
                }
        }
    }

    @Override // defpackage.m9j, org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.a) {
            case 0:
                this.b.n(sessionDescription);
                break;
            default:
                this.b.n(sessionDescription);
                break;
        }
    }
}
