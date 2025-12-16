package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public final /* synthetic */ class eu3 implements hu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eu3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hu3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                ap4 ap4Var = (ap4) this.b;
                synchronized (ap4Var.f) {
                    try {
                        for (String str : ap4Var.h.keySet()) {
                            ap4Var.u(str, (nt1) ap4Var.h.get(str), null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) this.b);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new xu9(10, (wdf) this.b));
                return;
            case 4:
                ((em6) this.b).invoke((ti1) obj);
                return;
            default:
                ((i2f) ((l2f) this.b)).a((ti1) obj);
                return;
        }
    }
}
