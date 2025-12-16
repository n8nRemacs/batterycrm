package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;

/* loaded from: classes2.dex */
public class w7i extends ir6 implements s7i {
    public static final /* synthetic */ int C0 = 0;
    public final md0 A0;
    public t7i B0;
    public final RectF u0;
    public final RectF v0;
    public boolean w0;
    public final GestureDetector x0;
    public volatile n1h y0;
    public final Runnable z0;

    public w7i(Context context) {
        super(context);
        this.u0 = new RectF();
        this.v0 = new RectF();
        this.y0 = null;
        this.z0 = new u7i(this, 0);
        this.A0 = new md0(5, this);
        xr4 xr4Var = new xr4(new aqc(new b6()));
        this.B0 = xr4Var;
        xr4Var.b = this;
        this.x0 = new GestureDetector(getContext(), new kx0(16, this));
    }

    @Override // defpackage.s7i
    public void a(Matrix matrix) {
        op5.d(w7i.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        invalidate();
    }

    public void g(Throwable th) {
        op5.d(w7i.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        requestLayout();
        postInvalidate();
    }

    public t7i getZoomableController() {
        return this.B0;
    }

    public void h(pe7 pe7Var) {
        op5.d(w7i.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((xr4) this.B0).c) {
            j();
            t7i t7iVar = this.B0;
            boolean z = this.w0;
            xr4 xr4Var = (xr4) t7iVar;
            xr4Var.c = z;
            if (!z) {
                xr4Var.reset();
            }
        }
        requestLayout();
        postInvalidate();
    }

    public final void i(i45 i45Var) {
        i45 controller = getController();
        if (controller instanceof v0) {
            v0 v0Var = (v0) controller;
            md0 md0Var = this.A0;
            v0Var.getClass();
            md0Var.getClass();
            n54 n54Var = v0Var.f;
            if (n54Var instanceof u0) {
                u0 u0Var = (u0) n54Var;
                synchronized (u0Var) {
                    int iIndexOf = u0Var.a.indexOf(md0Var);
                    if (iIndexOf != -1) {
                        u0Var.a.set(iIndexOf, null);
                    }
                }
            } else if (n54Var == md0Var) {
                v0Var.f = null;
            }
        }
        if (i45Var instanceof v0) {
            ((v0) i45Var).a(this.A0);
        }
        super.setController(i45Var);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.y0);
        this.y0 = new n1h(this, 17, drawable);
        dqi.s(this, this.y0);
    }

    public final void j() {
        ch6 ch6Var = ((gr6) getHierarchy()).f;
        Matrix matrix = ch6.d;
        ch6Var.n(matrix);
        Rect bounds = ch6Var.getBounds();
        RectF rectF = this.u0;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        float width = getWidth();
        float height = getHeight();
        RectF rectF2 = this.v0;
        rectF2.set(0.0f, 0.0f, width, height);
        ((xr4) this.B0).h.set(rectF);
        ((xr4) this.B0).g.set(rectF2);
        op5.f(w7i.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSave = 0;
        boolean z = this.w0 && !((xr4) this.B0).k.isIdentity();
        if (z) {
            iSave = canvas.save();
            canvas.concat(((xr4) this.B0).k);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        op5.d(w7i.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        super.onLayout(z, i, i2, i3, i4);
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    @Override // defpackage.o45, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7i.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.o45
    public void setController(i45 i45Var) {
        i(null);
        xr4 xr4Var = (xr4) this.B0;
        xr4Var.c = false;
        xr4Var.reset();
        i(i45Var);
    }

    public void setListener(v7i v7iVar) {
    }

    public void setZoomEnabled(boolean z) {
        this.w0 = z;
        t7i t7iVar = this.B0;
        if (t7iVar != null) {
            xr4 xr4Var = (xr4) t7iVar;
            xr4Var.c = z;
            if (z) {
                return;
            }
            xr4Var.reset();
        }
    }

    public void setZoomableController(t7i t7iVar) {
        t7iVar.getClass();
        ((xr4) this.B0).b = null;
        this.B0 = t7iVar;
        ((xr4) t7iVar).b = this;
    }

    public w7i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u0 = new RectF();
        this.v0 = new RectF();
        this.y0 = null;
        this.z0 = new u7i(this, 0);
        this.A0 = new md0(5, this);
        xr4 xr4Var = new xr4(new aqc(new b6()));
        this.B0 = xr4Var;
        xr4Var.b = this;
        this.x0 = new GestureDetector(getContext(), new kx0(16, this));
    }
}
