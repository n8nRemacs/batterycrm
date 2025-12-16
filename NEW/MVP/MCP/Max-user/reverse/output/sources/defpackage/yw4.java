package defpackage;

import java.util.Map;
import org.json.JSONException;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class yw4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ax4 b;

    public /* synthetic */ yw4(ax4 ax4Var, int i) {
        this.a = i;
        this.b = ax4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.a) {
            case 0:
                ax4 ax4Var = this.b;
                for (wpb wpbVar : ax4Var.C.values()) {
                    ax4Var.W(wpbVar, wpbVar.B());
                }
                break;
            case 1:
                ax4 ax4Var2 = this.b;
                if (ax4Var2.F()) {
                    for (Map.Entry entry : ax4Var2.C.entrySet()) {
                        ti1 ti1Var = (ti1) entry.getKey();
                        if (((wpb) entry.getValue()).B() != PeerConnection.IceConnectionState.CONNECTED) {
                            yi1 yi1VarW = ax4Var2.w(ti1Var);
                            ax4Var2.b = true;
                            w0a.d(ax4Var2.e, "DIRECT_CONNECTION_TIMEOUT", yi1VarW != null ? yi1VarW.l : null);
                            k01 k01Var = ax4Var2.n;
                            if (k01Var != null) {
                                k01Var.B(ax4Var2);
                            }
                            ax4Var2.I.C(new odg(ax4Var2.u, 0));
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ax4 ax4Var3 = this.b;
                k01 k01Var2 = ax4Var3.n;
                if (k01Var2 != null) {
                    k01Var2.B(ax4Var3);
                }
                ax4Var3.I.C(new odg(ax4Var3.t, 1));
                break;
        }
    }
}
