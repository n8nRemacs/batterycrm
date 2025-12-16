package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class ewe extends Drawable {
    public final q00 a = new q00(24, this);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public bwe f;

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        bwe bweVar = this.f;
        if (bweVar == null) {
            bweVar = null;
        }
        if (!bweVar.j || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b(bwe bweVar) {
        boolean zIsStarted;
        ValueAnimator valueAnimator;
        this.f = bweVar;
        this.b.setXfermode(new PorterDuffXfermode(bweVar.k));
        e();
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            zIsStarted = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        bwe bweVar2 = this.f;
        if (bweVar2 == null) {
            bweVar2 = null;
        }
        bwe bweVar3 = bweVar2;
        ValueAnimator valueAnimatorOfFloat = bweVar3.q;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            long j = bweVar3.n;
            long j2 = bweVar3.o + j;
            valueAnimatorOfFloat.setRepeatMode(bweVar3.m);
            valueAnimatorOfFloat.setRepeatCount(bweVar3.l);
            valueAnimatorOfFloat.setDuration(j2);
            valueAnimatorOfFloat.setInterpolator(new awe(j, j2, bweVar3));
            bweVar3.q = valueAnimatorOfFloat;
        }
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this.a);
        if (zIsStarted && (valueAnimator = this.e) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.e.start();
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.e.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            android.graphics.Paint r0 = r9.b
            android.graphics.Shader r1 = r0.getShader()
            if (r1 != 0) goto L9
            return
        L9:
            bwe r1 = r9.f
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = r2
        Lf:
            r1.getClass()
            r1 = 0
            double r3 = (double) r1
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.tan(r3)
            float r3 = (float) r3
            android.graphics.Rect r4 = r9.c
            int r5 = r4.height()
            float r5 = (float) r5
            int r6 = r4.width()
            float r6 = (float) r6
            float r6 = r6 * r3
            float r6 = r6 + r5
            int r5 = r4.width()
            float r5 = (float) r5
            int r7 = r4.height()
            float r7 = (float) r7
            float r3 = r3 * r7
            float r3 = r3 + r5
            android.animation.ValueAnimator r5 = r9.e
            if (r5 == 0) goto L40
            java.lang.Object r5 = r5.getAnimatedValue()
            goto L41
        L40:
            r5 = r2
        L41:
            boolean r7 = r5 instanceof java.lang.Float
            if (r7 == 0) goto L48
            java.lang.Float r5 = (java.lang.Float) r5
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 == 0) goto L50
            float r5 = r5.floatValue()
            goto L51
        L50:
            r5 = r1
        L51:
            bwe r7 = r9.f
            if (r7 != 0) goto L56
            r7 = r2
        L56:
            int r7 = r7.c
            int r7 = defpackage.az1.v(r7)
            if (r7 == 0) goto L82
            r8 = 1
            if (r7 == r8) goto L7c
            r8 = 2
            if (r7 == r8) goto L75
            r3 = 3
            if (r7 != r3) goto L6f
            float r3 = -r6
            float r3 = defpackage.utb.i(r3, r6, r5, r6)
        L6c:
            r5 = r3
            r3 = r1
            goto L88
        L6f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L75:
            float r6 = -r3
            float r3 = defpackage.utb.i(r6, r3, r5, r3)
        L7a:
            r5 = r1
            goto L88
        L7c:
            float r3 = -r6
            float r3 = defpackage.utb.i(r6, r3, r5, r3)
            goto L6c
        L82:
            float r6 = -r3
            float r3 = defpackage.utb.i(r3, r6, r5, r6)
            goto L7a
        L88:
            android.graphics.Matrix r6 = r9.d
            r6.reset()
            bwe r7 = r9.f
            if (r7 != 0) goto L92
            goto L93
        L92:
            r2 = r7
        L93:
            r2.getClass()
            int r2 = r4.width()
            float r2 = (float) r2
            r7 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r7
            int r8 = r4.height()
            float r8 = (float) r8
            float r8 = r8 / r7
            r6.setRotate(r1, r2, r8)
            r6.postTranslate(r3, r5)
            android.graphics.Shader r1 = r0.getShader()
            r1.setLocalMatrix(r6)
            r10.drawRect(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewe.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r13 = this;
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
            if (r1 == 0) goto L71
            if (r0 != 0) goto L12
            goto L71
        L12:
            bwe r2 = r13.f
            r3 = 0
            if (r2 != 0) goto L18
            r2 = r3
        L18:
            int r4 = r2.f
            if (r4 <= 0) goto L1d
            goto L25
        L1d:
            float r2 = r2.g
            float r1 = (float) r1
            float r2 = r2 * r1
            int r4 = defpackage.kti.d(r2)
        L25:
            bwe r1 = r13.f
            if (r1 != 0) goto L2a
            r1 = r3
        L2a:
            float r1 = r1.h
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = defpackage.kti.d(r1)
            bwe r1 = r13.f
            if (r1 != 0) goto L38
            r2 = r3
            goto L39
        L38:
            r2 = r1
        L39:
            int r2 = r2.c
            r5 = 2
            r6 = 0
            if (r2 == r5) goto L4a
            if (r1 != 0) goto L42
            r1 = r3
        L42:
            int r1 = r1.c
            r2 = 4
            if (r1 != r2) goto L48
            goto L4a
        L48:
            r1 = r6
            goto L4b
        L4a:
            r1 = 1
        L4b:
            if (r1 == 0) goto L4e
            r4 = r6
        L4e:
            if (r1 == 0) goto L51
            goto L52
        L51:
            r0 = r6
        L52:
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            float r8 = (float) r4
            float r9 = (float) r0
            bwe r0 = r13.f
            if (r0 != 0) goto L5c
            r1 = r3
            goto L5d
        L5c:
            r1 = r0
        L5d:
            int[] r10 = r1.b
            if (r0 != 0) goto L62
            goto L63
        L62:
            r3 = r0
        L63:
            float[] r11 = r3.a
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            android.graphics.Paint r0 = r13.b
            r0.setShader(r5)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewe.e():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        bwe bweVar = this.f;
        if ((bweVar == null ? null : bweVar).i) {
            return -3;
        }
        if (bweVar == null) {
            bweVar = null;
        }
        return bweVar.k == PorterDuff.Mode.DST_IN ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        e();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
