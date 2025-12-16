package defpackage;

import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class yvf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ awf b;
    public final /* synthetic */ awf c;

    public /* synthetic */ yvf(awf awfVar, awf awfVar2, int i) {
        this.a = i;
        this.b = awfVar;
        this.c = awfVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                awf awfVar = this.b;
                awf awfVar2 = this.c;
                lz9 lz9Var = awfVar.b;
                synchronized (lz9Var.b) {
                    ((LinkedHashSet) lz9Var.c).remove(awfVar);
                    ((LinkedHashSet) lz9Var.d).remove(awfVar);
                }
                awfVar.g(awfVar2);
                if (awfVar.g != null) {
                    Objects.requireNonNull(awfVar.f);
                    awfVar.f.c(awfVar2);
                    return;
                } else {
                    gri.i("SyncCaptureSessionBase", "[" + awfVar + "] Cannot call onClosed() when the CameraCaptureSession is not correctly configured.");
                    return;
                }
            default:
                awf awfVar3 = this.b;
                awf awfVar4 = this.c;
                Objects.requireNonNull(awfVar3.f);
                awfVar3.f.g(awfVar4);
                return;
        }
    }
}
