package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class aeg extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, kjb {
    public final x7f c;
    public final GestureDetector o;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final float d = 25.0f;
    public volatile float X = 3.1415927f;

    public aeg(Context context, x7f x7fVar) {
        this.c = x7fVar;
        this.o = new GestureDetector(context, this);
    }

    @Override // defpackage.kjb
    public final void a(float[] fArr, float f) {
        this.X = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.d;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.X;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        x7f x7fVar = this.c;
        PointF pointF3 = this.b;
        synchronized (x7fVar) {
            float f5 = pointF3.y;
            x7fVar.Y = f5;
            Matrix.setRotateM(x7fVar.o, 0, -f5, (float) Math.cos(x7fVar.Z), (float) Math.sin(x7fVar.Z), 0.0f);
            Matrix.setRotateM(x7fVar.X, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.u0.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.o.onTouchEvent(motionEvent);
    }
}
