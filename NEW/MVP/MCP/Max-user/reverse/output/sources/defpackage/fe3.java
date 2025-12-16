package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class fe3 extends s19 implements ii9, id3 {
    public final zd3 x0;

    public fe3(Context context) {
        super(context);
        zd3 zd3Var = new zd3(context, this);
        zd3Var.e = true;
        this.x0 = zd3Var;
    }

    @Override // defpackage.d19
    public final int b(int i, int i2) {
        zd3 zd3Var = this.x0;
        int i3 = zd3Var.c;
        zd3Var.d(i, i2);
        return zd3Var.d;
    }

    @Override // defpackage.ii9
    public final void e(MotionEvent motionEvent, int[] iArr) {
        this.x0.g(kti.d(motionEvent.getX()), kti.d(motionEvent.getY()), iArr);
    }

    @Override // defpackage.ii9
    public final boolean i(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new be3(this, drawable, 0));
        } else {
            post(new ce3(this, drawable, 0));
        }
    }

    @Override // defpackage.ii9
    public final jd3 o(MotionEvent motionEvent) {
        return this.x0.b(kti.d(motionEvent.getX()), kti.d(motionEvent.getY()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        float f = 1.0f * vw4.d().getDisplayMetrics().density;
        float[] fArrA = ((qh9) getBackground()).a();
        Rect bounds = ((qh9) getBackground()).getBounds();
        float f2 = ((qh9) getBackground()).q;
        float[] fArrA2 = dw8.a();
        int length = fArrA2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f3 = fArrA2[i];
            dw8.a()[i2] = Math.max(0.0f, fArrA[i2] - f);
            i++;
            i2++;
        }
        Path pathB = dw8.b();
        pathB.reset();
        pathB.addRoundRect(bounds.left + f, bounds.top + f, bounds.right - f, (bounds.bottom - f) - f2, dw8.a(), Path.Direction.CW);
        Path pathB2 = dw8.b();
        int iSave = canvas.save();
        canvas.clipPath(pathB2);
        try {
            dispatchDraw(canvas);
            try {
                zd3 zd3Var = this.x0;
                int length2 = zd3Var.j.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    qsd qsdVarD = zd3Var.f.c(i3).d();
                    if (qsdVarD != null) {
                        qsdVarD.draw(canvas);
                    }
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                th = th;
                canvas.restoreToCount(iSave);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.x0.f.i();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.x0.a();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new de3(this, drawable, runnable, j, 0));
        } else {
            post(new de3(this, drawable, runnable, j, 1));
        }
    }

    public void setOnFinalImageSetCallback(em6 em6Var) {
        this.x0.i = em6Var;
    }

    @Override // defpackage.ii9
    public final boolean t(MotionEvent motionEvent) {
        return this.x0.c(motionEvent);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ee3(this, drawable, runnable, 0));
        } else {
            post(new ee3(this, drawable, runnable, 1));
        }
    }

    @Override // defpackage.d19
    public final long v(int i, int i2, int i3, int i4) {
        zd3 zd3Var = this.x0;
        zd3Var.e(i2);
        return bhi.a(zd3Var.c, zd3Var.d);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.x0.l(drawable) || super.verifyDrawable(drawable);
    }

    @Override // defpackage.d19
    public final void x(ws8 ws8Var) {
        ae3 ae3Var = (ae3) ws8Var;
        float[] fArr = ae3Var.a;
        ArrayList arrayList = ae3Var.b;
        zd3 zd3Var = this.x0;
        zd3Var.j = fArr;
        zd3Var.g.O(zd3Var, zd3.l[0], arrayList);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new be3(this, drawable, 1));
        } else {
            post(new ce3(this, drawable, 1));
        }
    }
}
