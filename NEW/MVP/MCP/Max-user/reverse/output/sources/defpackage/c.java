package defpackage;

import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final class c extends re0 {
    public final /* synthetic */ int c;
    public final hu3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wpb wpbVar, hu3 hu3Var, int i) {
        super(wpbVar);
        this.c = i;
        switch (i) {
            case 1:
                this.d = hu3Var;
                super(wpbVar);
                break;
            default:
                this.d = hu3Var;
                break;
        }
    }

    @Override // defpackage.re0
    public final void a(PeerConnection peerConnection) {
        switch (this.c) {
            case 0:
                this.d.accept(peerConnection);
                break;
            default:
                this.d.accept(peerConnection);
                break;
        }
    }
}
