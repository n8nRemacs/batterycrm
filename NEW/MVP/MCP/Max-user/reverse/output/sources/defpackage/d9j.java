package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class d9j {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static Matrix a(kt ktVar, kt ktVar2, int i) {
        int i2 = ktVar.c;
        int i3 = ktVar.b;
        int i4 = ktVar2.c;
        int i5 = ktVar2.b;
        int iV = az1.v(i);
        if (iV == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(i3 / i5, i2 / i4, 0.0f, 0.0f);
            return matrix;
        }
        if (iV == 1) {
            float f = i5 / i3;
            float f2 = i4;
            float f3 = f2 / i2;
            float fMin = Math.min(f, f3);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(fMin / f, fMin / f3, i5 / 2.0f, f2 / 2.0f);
            return matrix2;
        }
        if (iV != 2) {
            throw new IllegalArgumentException("Unknown scale type = ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "CENTER_CROP" : "FIT_CENTER" : "NONE"));
        }
        float f4 = i5 / i3;
        float f5 = i4;
        float f6 = f5 / i2;
        float fMax = Math.max(f4, f6);
        Matrix matrix3 = new Matrix();
        matrix3.setScale(fMax / f4, fMax / f6, i5 / 2.0f, f5 / 2.0f);
        return matrix3;
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        a.booleanValue();
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
