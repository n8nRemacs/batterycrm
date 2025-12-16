package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final /* synthetic */ class v02 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ v02(py1 py1Var, CameraCaptureSession cameraCaptureSession, int i, long j) {
        this.d = py1Var;
        this.o = cameraCaptureSession;
        this.c = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                py1 py1Var = (py1) this.d;
                ((CameraCaptureSession.CaptureCallback) py1Var.b).onCaptureSequenceCompleted((CameraCaptureSession) this.o, this.c, this.b);
                break;
            default:
                u0g u0gVar = (u0g) this.d;
                Object obj = (sm) this.o;
                u0gVar.getClass();
                wqi.c(u0g.z0, "persistable task execution started, force connection", new Object[0]);
                ((z7c) u0gVar.o.getValue()).a.A(true);
                ((a3g) u0gVar.d.getValue()).g((tsb) obj, this.b, this.c);
                she.v((c6i) u0gVar.t0.getValue());
                ((x2g) u0gVar.u0.getValue()).a();
                break;
        }
    }

    public /* synthetic */ v02(u0g u0gVar, sm smVar, long j, int i) {
        this.d = u0gVar;
        this.o = smVar;
        this.b = j;
        this.c = i;
    }
}
