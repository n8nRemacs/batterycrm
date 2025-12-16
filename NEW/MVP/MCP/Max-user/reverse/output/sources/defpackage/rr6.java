package defpackage;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* loaded from: classes2.dex */
public final class rr6 extends fp7 {
    public ScaleGestureDetector M0;
    public xsd N0;
    public GestureDetector O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    public boolean T0;
    public boolean U0;
    public int V0;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getDrawable() != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                removeCallbacks(this.I0);
                removeCallbacks(this.J0);
            }
            if (motionEvent.getPointerCount() > 1) {
                this.P0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                this.Q0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            }
            this.O0.onTouchEvent(motionEvent);
            if (this.U0) {
                this.M0.onTouchEvent(motionEvent);
            }
            if (this.T0) {
                xsd xsdVar = this.N0;
                xsdVar.getClass();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    xsdVar.c = motionEvent.getX();
                    xsdVar.d = motionEvent.getY();
                    xsdVar.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                    xsdVar.g = 0.0f;
                    xsdVar.h = true;
                } else if (actionMasked == 1) {
                    xsdVar.e = -1;
                } else if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        xsdVar.a = motionEvent.getX();
                        xsdVar.b = motionEvent.getY();
                        xsdVar.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                        xsdVar.g = 0.0f;
                        xsdVar.h = true;
                    } else if (actionMasked == 6) {
                        xsdVar.f = -1;
                    }
                } else if (xsdVar.e != -1 && xsdVar.f != -1 && motionEvent.getPointerCount() > xsdVar.f) {
                    float x = motionEvent.getX(xsdVar.e);
                    float y = motionEvent.getY(xsdVar.e);
                    float x2 = motionEvent.getX(xsdVar.f);
                    float y2 = motionEvent.getY(xsdVar.f);
                    if (xsdVar.h) {
                        xsdVar.g = 0.0f;
                        xsdVar.h = false;
                    } else {
                        float f = xsdVar.a;
                        float degrees = (((float) Math.toDegrees((float) Math.atan2(y2 - y, x2 - x))) % 360.0f) - (((float) Math.toDegrees((float) Math.atan2(xsdVar.b - xsdVar.d, f - xsdVar.c))) % 360.0f);
                        xsdVar.g = degrees;
                        if (degrees < -180.0f) {
                            xsdVar.g = degrees + 360.0f;
                        } else if (degrees > 180.0f) {
                            xsdVar.g = degrees - 360.0f;
                        }
                    }
                    rr6 rr6Var = (rr6) xsdVar.i.b;
                    float f2 = xsdVar.g;
                    float f3 = rr6Var.P0;
                    float f4 = rr6Var.Q0;
                    Matrix matrix = rr6Var.t0;
                    if (f2 != 0.0f) {
                        matrix.postRotate(f2, f3, f4);
                        rr6Var.setImageMatrix(matrix);
                    }
                    xsdVar.a = x2;
                    xsdVar.b = y2;
                    xsdVar.c = x;
                    xsdVar.d = y;
                }
            }
            if ((motionEvent.getAction() & 255) == 1) {
                setImageToWrapCropBounds(true);
            }
        }
        return true;
    }
}
