package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import org.webrtc.PeerConnection;

/* loaded from: classes2.dex */
public abstract class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public re0(wpb wpbVar) {
        this.a = 0;
        this.b = wpbVar;
    }

    public static void b(c5i c5iVar, String str) {
        e6i e6iVar;
        boolean z;
        WorkDatabase workDatabase = c5iVar.c;
        s5i s5iVarX = workDatabase.x();
        xt4 xt4VarS = workDatabase.s();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            w4i w4iVarN = s5iVarX.n(str2);
            if (w4iVarN != w4i.c && w4iVarN != w4i.d) {
                s5iVarX.v(w4i.X, str2);
            }
            linkedList.addAll(xt4VarS.x(str2));
        }
        jac jacVar = c5iVar.f;
        synchronized (jacVar.v0) {
            try {
                cei.g().c(jac.w0, "Processor cancelling " + str);
                jacVar.t0.add(str);
                e6iVar = (e6i) jacVar.X.remove(str);
                z = e6iVar != null;
                if (e6iVar == null) {
                    e6iVar = (e6i) jacVar.Y.remove(str);
                }
                if (e6iVar != null) {
                    jacVar.Z.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jac.c(str, e6iVar);
        if (z) {
            jacVar.i();
        }
        Iterator it = c5iVar.e.iterator();
        while (it.hasNext()) {
            ((k0e) it.next()).c(str);
        }
    }

    public abstract void a(PeerConnection peerConnection);

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                PeerConnection peerConnectionH = ((wpb) this.b).H();
                if (peerConnectionH != null) {
                    a(peerConnectionH);
                    break;
                }
                break;
            default:
                wib wibVar = (wib) this.b;
                try {
                    c();
                    wibVar.B(vib.P);
                    break;
                } catch (Throwable th) {
                    wibVar.B(new sib(th));
                }
        }
    }

    public re0() {
        this.a = 1;
        this.b = new wib(0);
    }
}
