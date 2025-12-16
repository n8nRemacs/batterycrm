package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class o32 {
    public static final f32 a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new y28(2));
        a = new f32(linkedHashSet);
    }

    public static void a(Context context, py0 py0Var, f32 f32Var) throws CameraValidator$CameraIdListIncorrectException {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && to0.b(context) != 0) {
            LinkedHashSet linkedHashSetB = py0Var.B();
            if (linkedHashSetB.isEmpty()) {
                throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, null);
            }
            gri.a("CameraValidator", "Virtual device with ID: " + to0.b(context) + " has " + linkedHashSetB.size() + " cameras. Skipping validation.");
            return;
        }
        if (f32Var != null) {
            try {
                numB = f32Var.b();
                if (numB == null) {
                    gri.i("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                gri.c("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numB = null;
        }
        gri.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numB);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (f32Var == null || numB.intValue() == 1)) {
                f32.c.c(py0Var.B());
                i = 1;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
            gri.j("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (f32Var == null || numB.intValue() == 0)) {
                f32.b.c(py0Var.B());
                i++;
            }
        } catch (IllegalArgumentException e3) {
            illegalArgumentException = e3;
            gri.j("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            a.c(py0Var.B());
            gri.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        gri.b("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + py0Var.B());
        throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }
}
