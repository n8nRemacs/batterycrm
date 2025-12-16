package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class c20 extends Drawable {
    public static final int s = (int) zm.d.getResources().getDimension(tvc.attach_drawable);
    public final int a;
    public int b;
    public int f;
    public boolean g;
    public long h;
    public final Paint k;
    public final Paint l;
    public final Drawable m;
    public ValueAnimator o;
    public int c = s;
    public int d = 0;
    public int e = 270;
    public long i = 0;
    public boolean j = true;
    public final RectF n = new RectF();
    public final b20 p = new b20(this, 0);
    public final b20 q = new b20(this, 1);
    public final o3 r = new o3(11, this);

    public c20(Context context, int i) {
        int i2 = rw4.a().b;
        this.a = i2;
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        Paint paint = new Paint();
        this.k = paint;
        int i3 = q1gVarD.r;
        int i4 = q1gVarD.t;
        paint.setColor(i3);
        paint.setAntiAlias(true);
        if (i > 0) {
            this.m = cei.h(i, i4, context);
        }
        Paint paint2 = new Paint();
        this.l = paint2;
        paint2.setColor(i4);
        paint2.setStrokeWidth(i2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
    }

    public final boolean b() {
        return (this.b != 0 && this.f == this.d && this.e == 270) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e5 A[PHI: r9
  0x00e5: PHI (r9v8 boolean) = (r9v7 boolean), (r9v9 boolean) binds: [B:36:0x00b3, B:53:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c20.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        o3 o3Var = this.r;
        unscheduleSelf(o3Var);
        scheduleSelf(o3Var, 0L);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.b == 0 && i != 0) {
            this.f = i;
            if (this.e == 270) {
                this.d = i;
            }
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.j = false;
        } else if (f == -0.2f) {
            this.j = true;
        } else {
            if (i == 0) {
                this.i = System.currentTimeMillis() + 150;
            }
            boolean zB = b();
            b20 b20Var = this.q;
            b20 b20Var2 = this.p;
            if (zB || i < this.b || i == 10000) {
                this.b = i;
                if (this.o != null) {
                    if (Looper.getMainLooper().isCurrentThread()) {
                        this.o.cancel();
                    } else {
                        unscheduleSelf(b20Var2);
                        unscheduleSelf(b20Var);
                        scheduleSelf(b20Var2, 0L);
                    }
                }
            } else {
                if (this.o == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.o = valueAnimator;
                    valueAnimator.addUpdateListener(new q00(1, this));
                    this.o.setDuration(200L);
                } else if (Looper.getMainLooper().isCurrentThread()) {
                    this.o.cancel();
                } else {
                    unscheduleSelf(b20Var2);
                    unscheduleSelf(b20Var);
                    scheduleSelf(b20Var2, 0L);
                }
                this.o.setIntValues(this.b, i);
                if (Looper.getMainLooper().isCurrentThread()) {
                    this.o.start();
                } else {
                    unscheduleSelf(b20Var2);
                    unscheduleSelf(b20Var);
                    scheduleSelf(b20Var, 0L);
                }
            }
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (rect.width() <= 0 || rect.width() >= s) {
            return;
        }
        this.c = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (getBounds().width() <= 0 || getBounds().width() >= s) {
            return;
        }
        this.c = getBounds().width();
    }
}
