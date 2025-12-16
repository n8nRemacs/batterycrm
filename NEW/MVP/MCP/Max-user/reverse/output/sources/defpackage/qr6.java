package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* loaded from: classes2.dex */
public final class qr6 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ rr6 a;

    public qr6(rr6 rr6Var) {
        this.a = rr6Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        rr6 rr6Var = this.a;
        float f = rr6Var.P0;
        float f2 = rr6Var.Q0;
        Matrix matrix = rr6Var.t0;
        if (scaleFactor != 0.0f) {
            matrix.postScale(scaleFactor, scaleFactor, f, f2);
            rr6Var.setImageMatrix(matrix);
        }
        rr6Var.R0 = scaleGestureDetector.getFocusX();
        rr6Var.S0 = scaleGestureDetector.getFocusY();
        return true;
    }
}
