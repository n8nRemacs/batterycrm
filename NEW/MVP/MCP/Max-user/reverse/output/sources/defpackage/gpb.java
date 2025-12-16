package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class gpb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wpb b;

    public /* synthetic */ gpb(wpb wpbVar, int i) {
        this.a = i;
        this.b = wpbVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vpb] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vpb] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, vpb] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                WeakReference weakReference = this.b.T;
                j01 j01Var = weakReference == null ? null : (j01) weakReference.get();
                if (j01Var != null) {
                    j01Var.onIceRestart();
                    break;
                }
                break;
            case 1:
                this.b.r();
                break;
            case 2:
                wpb wpbVar = this.b;
                wpbVar.d0 = false;
                ?? r1 = wpbVar.S;
                if (r1 != 0) {
                    r1.d(wpbVar);
                    break;
                }
                break;
            case 3:
                this.b.P = true;
                break;
            case 4:
                wpb wpbVar2 = this.b;
                ?? r12 = wpbVar2.S;
                if (r12 != 0) {
                    r12.b(wpbVar2);
                    break;
                }
                break;
            case 5:
                wpb wpbVar3 = this.b;
                wpbVar3.C.log("PCRTCClient", "createPeerConnectionFactoryInternal, " + wpbVar3);
                wpbVar3.P = false;
                break;
            case 6:
                wpb wpbVar4 = this.b;
                ?? r13 = wpbVar4.S;
                if (r13 != 0) {
                    r13.o(wpbVar4);
                    break;
                }
                break;
            default:
                wpb wpbVar5 = this.b;
                wpbVar5.r();
                ak akVar = wpbVar5.l;
                if (akVar != null) {
                    akVar.d();
                    zh zhVar = akVar.a;
                    if (zhVar.i) {
                        zhVar.g.remove(akVar);
                    }
                }
                zi ziVar = wpbVar5.n;
                if (ziVar != null) {
                    ae4 ae4Var = ziVar.c;
                    if (ae4Var != null) {
                        ae4Var.c(ziVar);
                    }
                    ziVar.c = null;
                }
                wpbVar5.C.log("PCRTCClient", wpbVar5 + ": " + w0a.c(wpbVar5) + " was released");
                break;
        }
    }
}
