package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class jz9 {
    public Rational a;

    public final iz9 a(float f, float f2, float f3) {
        PointF pointF;
        b9c b9cVar = (b9c) this;
        float[] fArr = {f, f2};
        synchronized (b9cVar) {
            try {
                Matrix matrix = b9cVar.d;
                if (matrix == null) {
                    pointF = b9c.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } finally {
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        iz9 iz9Var = new iz9();
        iz9Var.a = f4;
        iz9Var.b = f5;
        iz9Var.c = f3;
        iz9Var.d = rational;
        return iz9Var;
    }
}
