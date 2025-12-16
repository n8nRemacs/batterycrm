package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* loaded from: classes2.dex */
public final class r95 extends View implements m95, ScaleGestureDetector.OnScaleGestureListener {
    public ArrayList a;
    public ScaleGestureDetector b;
    public q95 c;
    public Matrix d;
    public Matrix o;
    public Float s0;
    public Float t0;
    public float[] u0;
    public float v0;
    public Rect w0;
    public boolean x0;
    public p95 y0;

    private Matrix getCorrectionMatrix() {
        Matrix matrix;
        float measuredWidth;
        float measuredHeight;
        Matrix matrix2 = this.d;
        float[] fArr = this.u0;
        matrix2.getValues(fArr);
        float f = fArr[0];
        if (f < 1.0f) {
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, 1.0f, 0.5f, 0.5f);
            return matrix3;
        }
        if (f > this.v0) {
            matrix = new Matrix(matrix2);
            float f2 = this.v0 / f;
            matrix.postScale(f2, f2, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        } else {
            matrix = null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        if (matrix != null) {
            matrix.mapRect(rectF);
        } else {
            matrix2.mapRect(rectF);
        }
        if (rectF.right < getMeasuredWidth()) {
            measuredWidth = getMeasuredWidth() - rectF.right;
        } else {
            float f3 = rectF.left;
            measuredWidth = f3 > 0.0f ? -f3 : 0.0f;
        }
        if (rectF.bottom < getMeasuredHeight()) {
            measuredHeight = getMeasuredHeight() - rectF.bottom;
        } else {
            float f4 = rectF.top;
            measuredHeight = f4 > 0.0f ? -f4 : 0.0f;
        }
        if (measuredWidth == 0.0f && measuredHeight == 0.0f) {
            return matrix;
        }
        if (matrix == null) {
            matrix = new Matrix(matrix2);
        }
        matrix.postTranslate(measuredWidth, measuredHeight);
        return matrix;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.concat(this.d);
        Rect rect = this.w0;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((k95) it.next()).draw(canvas);
        }
        canvas.restore();
    }

    public Rect getBounds() {
        Rect rect = this.w0;
        return rect != null ? rect : new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public List<k95> getLayers() {
        return Collections.unmodifiableList(this.a);
    }

    public Rect getResultBounds() {
        p95 p95Var;
        Rect rect = this.w0;
        if (rect == null) {
            rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.x0 && (p95Var = this.y0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) p95Var;
            editorSurfaceViewContainer.getClass();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            int i4 = rect.bottom;
            int i5 = rect.top;
            if (i4 - i5 >= i3) {
                rect.top = editorSurfaceViewContainer.a.getHeight() + i5;
                rect.bottom -= editorSurfaceViewContainer.b.getHeight();
                return rect;
            }
            rect.left = editorSurfaceViewContainer.a.getWidth() + i2;
            rect.right -= editorSurfaceViewContainer.b.getWidth();
        }
        return rect;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Matrix matrix = this.d;
        matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
        Float f = this.s0;
        if (f != null && this.t0 != null) {
            matrix.postTranslate(focusX - f.floatValue(), focusY - this.t0.floatValue());
        }
        matrix.invert(this.o);
        this.s0 = Float.valueOf(focusX);
        this.t0 = Float.valueOf(focusY);
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        q95 q95Var = this.c;
        if (q95Var == null) {
            return true;
        }
        n95 n95Var = (n95) q95Var;
        i5i i5iVar = n95Var.c;
        if (i5iVar != null) {
            i5iVar.g().a(n95Var.a);
        }
        n95Var.c = null;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        float[] fArr = this.u0;
        this.s0 = null;
        this.t0 = null;
        Matrix correctionMatrix = getCorrectionMatrix();
        if (correctionMatrix != null) {
            this.d.getValues(fArr);
            float[] fArr2 = new float[9];
            correctionMatrix.getValues(fArr2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new o95(this, new float[9], fArr, fArr2, 0));
            valueAnimatorOfFloat.addListener(new kh(this, fArr2, false, 3));
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.start();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p95 p95Var;
        q95 q95Var;
        if (this.x0 && (p95Var = this.y0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) p95Var;
            editorSurfaceViewContainer.getClass();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view = editorSurfaceViewContainer.a;
            Rect rect = editorSurfaceViewContainer.o;
            view.getHitRect(rect);
            View view2 = editorSurfaceViewContainer.b;
            Rect rect2 = editorSurfaceViewContainer.s0;
            view2.getHitRect(rect2);
            if (rect.contains(x, y) || rect2.contains(x, y)) {
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (q95Var = this.c) != null) {
                    ((n95) q95Var).c(motionEvent);
                }
                return true;
            }
        }
        this.b.onTouchEvent(motionEvent);
        if (this.c != null && motionEvent != null && !this.b.isInProgress()) {
            motionEvent.transform(this.o);
            ((n95) this.c).c(motionEvent);
        }
        return true;
    }

    public void setBoundingListener(p95 p95Var) {
        this.y0 = p95Var;
    }

    public void setBounds(Rect rect) {
        this.w0 = rect;
        invalidate();
    }

    public void setDrawStickerEnabled(boolean z) {
        if (z == this.x0) {
            return;
        }
        this.x0 = z;
        p95 p95Var = this.y0;
        if (p95Var != null) {
            p95Var.setDrawStickerEnabled(z);
        }
    }

    public void setListener(q95 q95Var) {
        this.c = q95Var;
    }

    public void setMaxZoom(float f) {
        this.v0 = f;
    }
}
