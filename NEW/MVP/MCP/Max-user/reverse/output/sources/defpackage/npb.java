package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class npb implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ npb(wpb wpbVar, boolean z, int i) {
        this.a = i;
        this.b = wpbVar;
        this.c = z;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (this.a) {
            case 0:
                wpb wpbVar = this.b;
                MediaConstraints mediaConstraints = wpbVar.R;
                if (this.c) {
                    mediaConstraints = new MediaConstraints();
                    mediaConstraints.optional.addAll(wpbVar.R.optional);
                    mediaConstraints.mandatory.addAll(wpbVar.R.mandatory);
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                qi1 qi1Var = wpbVar.E;
                if (qi1Var.z) {
                    jda jdaVar = qi1Var.y;
                    jda jdaVar2 = jda.a;
                    if (jdaVar2.equals(jdaVar)) {
                        wpbVar.h(new kda(jdaVar2, "emulated error", null, null));
                        break;
                    }
                }
                peerConnection.createOffer(new tpb(wpbVar, 0), mediaConstraints);
                break;
            default:
                wpb wpbVar2 = this.b;
                boolean z = this.c;
                wpbVar2.u(peerConnection, z);
                wpbVar2.l(peerConnection, z);
                break;
        }
    }
}
