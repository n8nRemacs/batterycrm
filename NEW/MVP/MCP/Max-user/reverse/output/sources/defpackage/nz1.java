package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: classes.dex */
public final class nz1 implements tz1 {
    public final ry1 a;
    public boolean b = false;

    public nz1(ry1 ry1Var) {
        this.a = ry1Var;
    }

    @Override // defpackage.tz1
    public final ha8 a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int iIntValue;
        ag7 ag7VarF = wsf.f(Boolean.TRUE);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
            gri.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                gri.a("Camera2CapturePipeline", "Trigger AF");
                this.b = true;
                this.a.h.f(false);
            }
        }
        return ag7VarF;
    }

    @Override // defpackage.tz1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.tz1
    public final void c() {
        if (this.b) {
            gri.a("Camera2CapturePipeline", "cancel TriggerAF");
            this.a.h.a(true, false);
        }
    }
}
