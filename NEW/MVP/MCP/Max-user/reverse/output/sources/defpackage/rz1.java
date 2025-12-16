package defpackage;

import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraControlInternal$CameraControlException;

/* loaded from: classes.dex */
public final class rz1 extends k02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tu1 b;

    public /* synthetic */ rz1(tu1 tu1Var, int i) {
        this.a = i;
        this.b = tu1Var;
    }

    @Override // defpackage.k02
    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new ImageCaptureException("Capture request is cancelled because camera is closed", null));
                break;
            default:
                tu1 tu1Var = this.b;
                if (tu1Var != null) {
                    tu1Var.d(new CameraControl$OperationCanceledException("Camera is closed"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.k02
    public final void b(int i, r02 r02Var) {
        switch (this.a) {
            case 0:
                this.b.b(null);
                break;
            default:
                gri.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.b.b(null);
                break;
        }
    }

    @Override // defpackage.k02
    public final void c(int i, jbe jbeVar) {
        switch (this.a) {
            case 0:
                this.b.d(new ImageCaptureException("Capture request failed with reason ".concat("ERROR"), null));
                break;
            default:
                this.b.d(new CameraControlInternal$CameraControlException());
                break;
        }
    }
}
