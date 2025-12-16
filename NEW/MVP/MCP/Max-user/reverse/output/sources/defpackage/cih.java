package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class cih extends ari {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    @Override // defpackage.ari
    public void e(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.e(view, i);
        } else if (g) {
            try {
                bih.a(view, i);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void f(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                aih.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void g(View view, Matrix matrix) {
        if (d) {
            try {
                zhh.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                zhh.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
