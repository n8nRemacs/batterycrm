package defpackage;

import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class ou4 extends f45 {
    public static final nu4 A0 = new nu4();
    public final q45 v0;
    public final n8f w0;
    public final m8f x0;
    public final p45 y0;
    public boolean z0;

    public ou4(Context context, rk0 rk0Var, q45 q45Var) {
        super(context, rk0Var);
        this.z0 = false;
        this.v0 = q45Var;
        this.y0 = new p45();
        n8f n8fVar = new n8f();
        this.w0 = n8fVar;
        n8fVar.a(1.0f);
        n8fVar.b(50.0f);
        m8f m8fVar = new m8f(this, A0);
        this.x0 = m8fVar;
        m8fVar.m = n8fVar;
        if (this.Z != 1.0f) {
            this.Z = 1.0f;
            invalidateSelf();
        }
    }

    @Override // defpackage.f45
    public final boolean d(boolean z, boolean z2, boolean z3) {
        boolean zD = super.d(z, z2, z3);
        jh jhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        jhVar.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.z0 = true;
            return zD;
        }
        this.z0 = false;
        this.w0.b(50.0f / f);
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.o;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            q45 q45Var = this.v0;
            q45Var.a.a();
            q45Var.a(canvas, bounds, fB, z, z2);
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.s0;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            rk0 rk0Var = this.b;
            int i = rk0Var.c[0];
            p45 p45Var = this.y0;
            p45Var.c = i;
            int iD = rk0Var.g;
            if (iD > 0) {
                if (!(this.v0 instanceof r48)) {
                    iD = (int) ((dui.d(p45Var.b, 0.0f, 0.01f) * iD) / 0.01f);
                }
                this.v0.d(canvas, paint, p45Var.b, 1.0f, rk0Var.d, this.t0, iD);
            } else {
                this.v0.d(canvas, paint, 0.0f, 1.0f, rk0Var.d, this.t0, 0);
            }
            this.v0.c(canvas, paint, p45Var, this.t0);
            this.v0.b(canvas, paint, rk0Var.c[0], this.t0);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.v0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.v0.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.x0.f();
        this.y0.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.z0;
        p45 p45Var = this.y0;
        m8f m8fVar = this.x0;
        if (z) {
            m8fVar.f();
            p45Var.b = i / 10000.0f;
            invalidateSelf();
        } else {
            m8fVar.b = p45Var.b * 10000.0f;
            m8fVar.c = true;
            m8fVar.a(i);
        }
        return true;
    }
}
