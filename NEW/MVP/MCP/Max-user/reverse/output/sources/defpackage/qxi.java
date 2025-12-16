package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;

/* loaded from: classes.dex */
public abstract class qxi {
    public static boolean a(t22 t22Var, String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) t22Var.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(new CameraUnavailableException(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(defpackage.ry9 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.x3a
            r1 = 1
            if (r0 != 0) goto L33
            boolean r0 = r6 instanceof defpackage.v3a
            if (r0 != 0) goto L33
            boolean r0 = r6 instanceof defpackage.y3a
            if (r0 == 0) goto L22
            r0 = r6
            y3a r0 = (defpackage.y3a) r0
            long r2 = r0.a
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L22
            long r2 = r0.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L22
            goto L33
        L22:
            boolean r0 = r6 instanceof defpackage.ks8
            if (r0 == 0) goto L31
            ks8 r6 = (defpackage.ks8) r6
            int r6 = r6.d
            if (r6 == r1) goto L33
            r0 = 23
            if (r6 != r0) goto L31
            goto L33
        L31:
            r6 = 0
            return r6
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxi.b(ry9):boolean");
    }
}
