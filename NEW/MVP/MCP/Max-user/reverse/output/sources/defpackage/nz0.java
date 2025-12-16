package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class nz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ nz0(k01 k01Var, int i) {
        this.a = i;
        this.b = k01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                if (k01Var.u) {
                    return;
                }
                Iterator it = k01Var.l0.iterator();
                if (it.hasNext()) {
                    throw ctd.h(it);
                }
                return;
            case 1:
                k01 k01Var2 = this.b;
                k01Var2.l.post(new nz0(k01Var2, 3));
                return;
            case 2:
                k01 k01Var3 = this.b;
                k01Var3.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = k01Var3.f0.d;
                    if (peerConnectionFactory == null) {
                        return;
                    }
                    peerConnectionFactory.clearDumpRequests();
                    return;
                } catch (Throwable th) {
                    k01Var3.P.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
            case 3:
                k01 k01Var4 = this.b;
                y6d y6dVar = k01Var4.P;
                EglBase eglBase = k01Var4.r;
                try {
                    y6dVar.log("OKRTCCall", "Releasing " + w0a.c(eglBase));
                    eglBase.release();
                    y6dVar.log("OKRTCCall", w0a.c(eglBase) + " was released");
                    return;
                } catch (Exception e) {
                    y6dVar.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            default:
                k01 k01Var5 = this.b;
                r8a r8aVar = k01Var5.u0;
                if (k01Var5.u) {
                    return;
                }
                int iC = k01Var5.g0.c();
                boolean z = true;
                if (iC != 2 && iC != 1) {
                    z = false;
                }
                if (z == r8aVar.f) {
                    return;
                }
                k01Var5.P.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + r8aVar.f + ") != camera video enabled state (" + z + "). Let us update media settings");
                if (k01Var5.j()) {
                    k01Var5.x("rtc.video.switch");
                    k01Var5.n(z);
                    k01Var5.J();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ nz0(k01 k01Var, boolean z) {
        this.a = 0;
        this.b = k01Var;
    }
}
