package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* loaded from: classes.dex */
public interface r02 {
    default void d(gk5 gk5Var) {
        int i;
        ArrayList arrayList = gk5Var.a;
        int iO = o();
        if (iO == 1) {
            return;
        }
        int iV = az1.v(iO);
        if (iV == 1) {
            i = 32;
        } else if (iV == 2) {
            i = 0;
        } else {
            if (iV != 3) {
                gri.i("ExifData", "Unknown flash state: ".concat(iO != 1 ? iO != 2 ? iO != 3 ? iO != 4 ? "null" : "FIRED" : "READY" : "NONE" : "UNKNOWN"));
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            gk5Var.c("LightSource", String.valueOf(4), arrayList);
        }
        gk5Var.c("Flash", String.valueOf(i), arrayList);
    }

    ryf e();

    long getTimestamp();

    p02 m();

    int o();

    n02 q();

    default CaptureResult s() {
        return null;
    }

    o02 v();
}
