package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final /* synthetic */ class zvf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ awf b;

    public /* synthetic */ zvf(awf awfVar, int i) {
        this.a = i;
        this.b = awfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                awf awfVar = this.b;
                awfVar.g(awfVar);
                return;
            default:
                awf awfVar2 = this.b;
                awfVar2.l("Session call super.close()");
                z5j.e(awfVar2.g, "Need to call openCaptureSession before using this API.");
                lz9 lz9Var = awfVar2.b;
                synchronized (lz9Var.b) {
                    ((LinkedHashSet) lz9Var.d).add(awfVar2);
                }
                ((CameraCaptureSession) ((i5i) awfVar2.g.b).a).close();
                awfVar2.d.execute(new zvf(awfVar2, 0));
                return;
        }
    }
}
