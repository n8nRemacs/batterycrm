package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class mi0 {
    public final pi0 a;
    public final Rect b;

    public mi0(pi0 pi0Var, Matrix matrix) {
        this.a = pi0Var;
        Rect rectF = pi0Var.f();
        if (rectF != null && matrix != null) {
            RectF rectF2 = new RectF(rectF);
            matrix.mapRect(rectF2);
            rectF.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        }
        this.b = rectF;
        Point[] pointArrL = pi0Var.l();
        if (pointArrL == null || matrix == null) {
            return;
        }
        int length = pointArrL.length;
        float[] fArr = new float[length + length];
        for (int i = 0; i < pointArrL.length; i++) {
            Point point = pointArrL[i];
            int i2 = i + i;
            fArr[i2] = point.x;
            fArr[i2 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i3 = 0; i3 < pointArrL.length; i3++) {
            int i4 = i3 + i3;
            pointArrL[i3].set((int) fArr[i4], (int) fArr[i4 + 1]);
        }
    }
}
