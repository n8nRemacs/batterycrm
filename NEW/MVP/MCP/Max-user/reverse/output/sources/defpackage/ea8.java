package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
public final class ea8 implements View.OnTouchListener {
    public static final int B0 = ViewConfiguration.getTapTimeout();
    public final q55 A0;
    public final float[] X;
    public final int Y;
    public final int Z;
    public final a90 a;
    public final AccelerateInterpolator b;
    public final q55 c;
    public ue d;
    public final float[] o;
    public final float[] s0;
    public final float[] t0;
    public final float[] u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public ea8(q55 q55Var) {
        a90 a90Var = new a90();
        a90Var.e = Long.MIN_VALUE;
        a90Var.g = -1L;
        a90Var.f = 0L;
        this.a = a90Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.o = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.X = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.s0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.t0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.u0 = fArr5;
        this.c = q55Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.Y = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.Z = B0;
        a90Var.a = 500;
        a90Var.b = 500;
        this.A0 = q55Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.o
            r0 = r0[r4]
            float[] r1 = r3.X
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.s0
            r0 = r0[r4]
            float[] r1 = r3.t0
            r1 = r1[r4]
            float[] r2 = r3.u0
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea8.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.Y;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.y0 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.w0) {
            this.y0 = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a90 a90Var = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - a90Var.e);
        int i3 = a90Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        a90Var.i = i;
        a90Var.h = a90Var.a(jCurrentAnimationTimeMillis);
        a90Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        q55 q55Var;
        int count;
        a90 a90Var = this.a;
        float f = a90Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(a90Var.c);
        if (iAbs != 0 && (count = (q55Var = this.A0).getCount()) != 0) {
            int childCount = q55Var.getChildCount();
            int firstVisiblePosition = q55Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && q55Var.getChildAt(0).getTop() >= 0)) : !(i >= count && q55Var.getChildAt(childCount - 1).getBottom() <= q55Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.z0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            r4 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.x0 = r3
            r8.v0 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            q55 r5 = r8.c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r3, r10, r9, r4)
            a90 r10 = r8.a
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.y0
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            ue r9 = r8.d
            if (r9 != 0) goto L60
            ue r9 = new ue
            r9.<init>(r2, r8)
            r8.d = r9
        L60:
            r8.y0 = r3
            r8.w0 = r3
            boolean r9 = r8.v0
            if (r9 != 0) goto L75
            int r9 = r8.Z
            if (r9 <= 0) goto L75
            ue r10 = r8.d
            long r6 = (long) r9
            java.util.WeakHashMap r9 = defpackage.hfh.a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            ue r9 = r8.d
            r9.run()
        L7a:
            r8.v0 = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea8.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
