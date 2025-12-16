package defpackage;

import android.opengl.Matrix;

/* loaded from: classes.dex */
public abstract class fui {
    public static final mc0 a(CharSequence charSequence, Long l) {
        if ((l == null || l.longValue() == 0) && charSequence == null) {
            return mc0.c;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        if (charSequence == null) {
            charSequence = "";
        }
        return new mc0(charSequence, jLongValue);
    }

    public static int b(int i, boolean z) {
        return a9h.b(i, 31, z);
    }

    public static void c(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void d(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
