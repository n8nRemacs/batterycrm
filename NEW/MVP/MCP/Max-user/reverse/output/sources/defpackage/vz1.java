package defpackage;

import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class vz1 implements qy1 {
    public tu1 a;
    public final wu1 b = ixi.a(new xtd(27, this));
    public final uz1 c;

    public vz1(uz1 uz1Var) {
        this.c = uz1Var;
    }

    @Override // defpackage.qy1
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        uz1 uz1Var = this.c;
        if (uz1Var != null && !uz1Var.a(totalCaptureResult)) {
            return false;
        }
        this.a.b(totalCaptureResult);
        return true;
    }
}
