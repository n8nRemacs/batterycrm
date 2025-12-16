package defpackage;

/* loaded from: classes.dex */
public abstract class sxi {
    public static pca a;

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (gri.d(2, "CameraOrientationUtil")) {
            StringBuilder sbK = wy1.k("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i2, ", isOppositeFacing=");
            sbK.append(z);
            sbK.append(", result=");
            sbK.append(i3);
            gri.a("CameraOrientationUtil", sbK.toString());
        }
        return i3;
    }

    public static int b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unsupported surface rotation: "));
    }
}
