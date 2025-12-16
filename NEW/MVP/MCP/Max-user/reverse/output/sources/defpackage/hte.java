package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public abstract class hte {
    public static final hp0 a = new hp0(10, 3);
    public static final Matrix b = new Matrix();

    public static final void a(Path path, Rect rect) {
        if (rect == null || rect.isEmpty()) {
            path.reset();
            return;
        }
        Matrix matrix = new Matrix();
        int iMin = Math.min(rect.width(), rect.height()) / 2;
        Path pathB = (Path) a.c(new s8f(iMin));
        if (pathB == null) {
            pathB = b(iMin);
        }
        path.set(pathB);
        float f = iMin;
        matrix.setTranslate(rect.left + ((rect.width() / 2.0f) - f), rect.top + ((rect.height() / 2.0f) - f));
        path.transform(matrix);
    }

    public static final Path b(int i) {
        Path path = new Path();
        if (i <= 0) {
            return path;
        }
        double d = i;
        double d2 = 2.8d;
        double dPow = Math.pow(d, 2.8d);
        float f = i;
        path.moveTo(-f, 0.0f);
        double d3 = -d;
        double d4 = d3;
        boolean z = false;
        while (true) {
            double dPow2 = dPow - Math.pow(Math.abs(d4), d2);
            double d5 = d4;
            path.lineTo((float) d5, (float) (Math.pow(Math.abs(dPow2), 0.35714285714285715d) * Math.signum(dPow2)));
            if (z) {
                break;
            }
            double d6 = d;
            boolean z2 = z;
            double dA = n7j.a(d6 / 80, 0.2d) + d5;
            if (dA >= d6) {
                z = true;
                d = d6;
                d4 = d;
            } else {
                d4 = dA;
                z = z2;
                d = d6;
            }
            d2 = 2.8d;
        }
        double dA2 = d;
        boolean z3 = false;
        while (true) {
            double dPow3 = dPow - Math.pow(Math.abs(dA2), 2.8d);
            double d7 = d;
            path.lineTo((float) dA2, (float) (Math.pow(Math.abs(dPow3), 0.35714285714285715d) * (-Math.signum(dPow3))));
            if (z3) {
                path.close();
                path.offset(f, f);
                return path;
            }
            dA2 -= n7j.a(d7 / 80, 0.2d);
            if (dA2 <= (-i)) {
                dA2 = d3;
                z3 = true;
            }
            d = d7;
        }
    }
}
