package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;

/* loaded from: classes.dex */
public final class vdg {
    public final ry1 a;
    public final j8a b = new j8a(0);
    public final boolean c;
    public final qee d;
    public boolean e;
    public tu1 f;
    public boolean g;

    public vdg(ry1 ry1Var, i12 i12Var, qee qeeVar) {
        this.a = ry1Var;
        this.d = qeeVar;
        this.c = if0.c(new xtd(22, i12Var));
        ry1Var.p(new qy1() { // from class: udg
            @Override // defpackage.qy1
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                vdg vdgVar = this.a;
                if (vdgVar.f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == vdgVar.g) {
                        vdgVar.f.b(null);
                        vdgVar.f = null;
                    }
                }
                return false;
            }
        });
    }

    public static void b(j8a j8aVar, Integer num) {
        if (jei.c()) {
            j8aVar.k(num);
        } else {
            j8aVar.i(num);
        }
    }

    public final void a(tu1 tu1Var, boolean z) {
        if (!this.c) {
            if (tu1Var != null) {
                tu1Var.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z2 = this.e;
        j8a j8aVar = this.b;
        if (!z2) {
            b(j8aVar, 0);
            if (tu1Var != null) {
                tu1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.g = z;
        this.a.r(z);
        b(j8aVar, Integer.valueOf(z ? 1 : 0));
        tu1 tu1Var2 = this.f;
        if (tu1Var2 != null) {
            tu1Var2.d(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f = tu1Var;
    }
}
