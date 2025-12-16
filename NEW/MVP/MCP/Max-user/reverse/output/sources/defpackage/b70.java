package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* loaded from: classes2.dex */
public final class b70 extends View implements u6g {
    public final Paint A0;
    public final Paint B0;
    public final Path C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public a70 G0;
    public final byte[] H0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float d;
    public final float o;
    public byte[] s0;
    public byte[] t0;
    public long u0;
    public long v0;
    public boolean w0;
    public int x0;
    public final Paint y0;
    public final Paint z0;

    public b70(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        this.C0 = new Path();
        setLayerType(1, null);
        this.b = vw4.d().getDisplayMetrics().density * 5.0f;
        this.c = vw4.d().getDisplayMetrics().density * 2.0f;
        float f = vw4.d().getDisplayMetrics().density * 2.0f;
        this.d = f;
        this.o = vw4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.y0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.B0 = paint3;
        this.z0 = new Paint(paint);
        m8j.a(this);
        if (m8j.d(this)) {
            setScaleX(-1.0f);
        }
        this.H0 = new byte[0];
    }

    private final int getDataWidth() {
        if (this.t0 == null) {
            return 0;
        }
        return (int) (((r0.length - 1) * this.c) + (r0.length * this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r5.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r6 = r6.getRawX()
            int r1 = r5.getWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 != 0) goto L17
        L15:
            r6 = r3
            goto L29
        L17:
            int r4 = r0 + r1
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L20
            r6 = r2
            goto L29
        L20:
            float r0 = (float) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L15
        L26:
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
        L29:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L35
            long r0 = r5.u0
            r3 = 1
            long r0 = r0 - r3
            float r6 = (float) r0
            float r2 = r2 / r6
            return r2
        L35:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b70.a(android.view.MotionEvent):float");
    }

    public final void b(long j, byte[] bArr) {
        this.s0 = bArr;
        this.t0 = null;
        this.u0 = j;
        this.v0 = 0L;
        this.x0 = 0;
        onThemeChanged(a93.s0.y(this));
        Path path = this.C0;
        if (!path.isEmpty()) {
            path.reset();
        }
        requestLayout();
        postInvalidate();
    }

    public final void c(float f, boolean z, boolean z2) {
        if (!this.F0 || z2) {
            long j = (long) (f * this.u0);
            if (this.v0 == j && this.w0 == z) {
                return;
            }
            this.v0 = j;
            this.w0 = z;
            if (!z) {
                this.F0 = false;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Path path = this.C0;
        if (path.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = 6;
        float fD = ((this.v0 / this.u0) * u45.d(f, vw4.d().getDisplayMetrics().density, 2, getWidth())) + kti.d(f * vw4.d().getDisplayMetrics().density);
        boolean z = this.w0 || this.F0;
        float f2 = vw4.d().getDisplayMetrics().density * 4.0f;
        if (this.F0) {
            f2 += vw4.d().getDisplayMetrics().density * 2.0f;
        }
        if (z) {
            canvas.save();
            float f3 = (vw4.d().getDisplayMetrics().density * 2.0f) + f2;
            width = fD < f3 ? f3 : fD;
            if (width > getWidth() - f3) {
                width = getWidth() - f3;
            }
        } else {
            width = 0.0f;
        }
        Paint paint = this.y0;
        if (!z) {
            canvas.drawPath(path, paint);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, fD, canvas.getHeight());
            canvas.drawPath(path, this.z0);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(fD, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, this.o + f2, this.B0);
                canvas.drawCircle(width, measuredHeight, f2, this.A0);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        byte[] bArr = this.s0;
        if (bArr == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        byte[] bArr2 = this.t0;
        float f = this.d;
        float f2 = this.c;
        if (bArr2 == null || this.x0 != size) {
            int iD = (int) (((size + f2) - (kti.d(6 * vw4.d().getDisplayMetrics().density) * 2)) / (f2 + f));
            if (iD < 0) {
                wqi.q("b70", "Width is very small " + size, new Object[0]);
                bArr = this.H0;
            } else if (bArr.length != 0) {
                IntEvaluator intEvaluator = new IntEvaluator();
                byte[] bArr3 = new byte[iD];
                for (int i3 = 0; i3 < iD; i3++) {
                    if (i3 == 0 || bArr.length == 1) {
                        iIntValue = bArr[0];
                    } else if (i3 == iD - 1) {
                        iIntValue = bArr[bArr.length - 1];
                    } else {
                        float length = (i3 / iD) * (bArr.length - 1);
                        int i4 = (int) length;
                        int i5 = i4 + 1;
                        iIntValue = (i4 >= bArr.length - 1 || i5 >= bArr.length - 1) ? 0 : intEvaluator.evaluate(length - i4, Integer.valueOf(bArr[i4]), Integer.valueOf(bArr[i5])).intValue();
                    }
                    bArr3[i3] = (byte) iIntValue;
                }
                bArr = bArr3;
            }
            this.t0 = bArr;
            this.x0 = size;
        }
        setMeasuredDimension(u45.c(6, vw4.d().getDisplayMetrics().density, getDataWidth()), View.MeasureSpec.getSize(i2));
        byte[] bArr4 = this.t0;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        Path path = this.C0;
        path.reset();
        if (bArr4 == null || bArr4.length == 0) {
            return;
        }
        float fD = (f / 2.0f) + kti.d(r2 * vw4.d().getDisplayMetrics().density);
        for (byte b : bArr4) {
            float measuredHeight2 = (getMeasuredHeight() / 127.0f) * b;
            float f3 = this.b;
            if (measuredHeight2 < f3) {
                measuredHeight2 = f3;
            }
            float f4 = measuredHeight2 / 2.0f;
            path.moveTo(fD, measuredHeight - f4);
            path.lineTo(fD, f4 + measuredHeight);
            fD = fD + f + f2;
        }
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        yt0 yt0VarI = this.E0 ? v1aVar.y(this).a().i() : v1aVar.y(this).a().r();
        rt0 rt0Var = yt0VarI.a;
        int i = rt0Var.e;
        this.y0.setColor(rt0Var.f);
        this.A0.setColor(i);
        this.B0.setColor(yt0VarI.c.a);
        this.z0.setColor(i);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001c, code lost:
    
        if (r0 != 3) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.w0
            if (r0 != 0) goto Le
            boolean r0 = r11.F0
            if (r0 == 0) goto L9
            goto Le
        L9:
            boolean r12 = super.onTouchEvent(r12)
            return r12
        Le:
            int r0 = r12.getAction()
            r1 = 1
            if (r0 == 0) goto L85
            r2 = 0
            if (r0 == r1) goto L4e
            r3 = 2
            if (r0 == r3) goto L20
            r3 = 3
            if (r0 == r3) goto L4e
            goto L97
        L20:
            boolean r0 = r11.F0
            if (r0 != 0) goto L25
            goto L97
        L25:
            boolean r0 = r11.D0
            if (r0 == 0) goto L2b
            r11.D0 = r2
        L2b:
            a70 r0 = r11.G0
            if (r0 == 0) goto L97
            float r12 = r11.a(r12)
            ukd r0 = (defpackage.ukd) r0
            java.lang.Object r0 = r0.b
            s40 r0 = (defpackage.s40) r0
            cm6 r2 = r0.b
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L48
            goto L97
        L48:
            b70 r0 = r0.D0
            r0.c(r12, r1, r1)
            return r1
        L4e:
            r11.D0 = r2
            r11.F0 = r2
            a70 r0 = r11.G0
            if (r0 == 0) goto L7d
            float r12 = r11.a(r12)
            ukd r0 = (defpackage.ukd) r0
            java.lang.Object r0 = r0.b
            s40 r0 = (defpackage.s40) r0
            java.lang.Long r3 = r0.O0
            if (r3 == 0) goto L7d
            long r9 = r3.longValue()
            java.lang.Long r3 = r0.N0
            if (r3 == 0) goto L7d
            long r5 = r3.longValue()
            em6 r0 = r0.a
            vp9 r4 = new vp9
            float r3 = (float) r9
            float r12 = r12 * r3
            long r7 = (long) r12
            r4.<init>(r5, r7, r9)
            r0.invoke(r4)
        L7d:
            android.view.ViewParent r12 = r11.getParent()
            r12.requestDisallowInterceptTouchEvent(r2)
            return r1
        L85:
            r11.D0 = r1
            r11.F0 = r1
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            a70 r0 = r11.G0
            if (r0 == 0) goto L97
            r11.a(r12)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b70.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInInput(boolean z) {
    }

    public final void setIncomingMessage(boolean z) {
        this.E0 = z;
    }

    public final void setListener(a70 a70Var) {
        this.G0 = a70Var;
    }
}
