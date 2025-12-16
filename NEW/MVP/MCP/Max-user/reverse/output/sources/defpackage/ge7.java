package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* loaded from: classes.dex */
public final class ge7 extends kz1 {
    public static final ge7 b;

    static {
        new r8j(21);
        b = new ge7();
    }

    @Override // defpackage.kz1
    public final void a(xwg xwgVar, w30 w30Var) {
        super.a(xwgVar, w30Var);
        if (!(xwgVar instanceof fe7)) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        fe7 fe7Var = (fe7) xwgVar;
        x8a x8aVarB = x8a.b();
        s90 s90Var = fe7.b;
        if (fe7Var.i(s90Var)) {
            int iIntValue = ((Integer) fe7Var.f(s90Var)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) rv4.a.e(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    x8aVarB.n(e02.N(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    x8aVarB.n(e02.N(key2), Boolean.FALSE);
                }
            }
        }
        w30Var.c(new e02(9, fjb.a(x8aVarB)));
    }
}
