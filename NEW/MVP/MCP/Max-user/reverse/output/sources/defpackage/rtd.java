package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class rtd extends ch6 implements mtd {
    public final RectF A0;
    public final RectF X;
    public final float[] Y;
    public final float[] Z;
    public final int o;
    public final Paint s0;
    public boolean t0;
    public float u0;
    public int v0;
    public int w0;
    public float x0;
    public final Path y0;
    public final Path z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtd(Drawable drawable) {
        super(drawable);
        drawable.getClass();
        this.o = 1;
        this.X = new RectF();
        this.Y = new float[8];
        this.Z = new float[8];
        this.s0 = new Paint(1);
        this.t0 = false;
        this.u0 = 0.0f;
        this.v0 = 0;
        this.w0 = 0;
        this.x0 = 0.0f;
        this.y0 = new Path();
        this.z0 = new Path();
        this.A0 = new RectF();
    }

    @Override // defpackage.mtd
    public final void a(int i, float f) {
        this.v0 = i;
        this.u0 = f;
        p();
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void b(boolean z) {
        this.t0 = z;
        p();
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void c() {
        Arrays.fill(this.Y, 0.0f);
        p();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            android.graphics.Rect r0 = r11.getBounds()
            android.graphics.RectF r1 = r11.X
            r1.set(r0)
            int r0 = r11.o
            int r0 = defpackage.az1.v(r0)
            android.graphics.Path r2 = r11.y0
            android.graphics.Paint r8 = r11.s0
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L1b
        L18:
            r3 = r12
            goto L9f
        L1b:
            int r0 = r12.save()
            r12.clipPath(r2)
            super.draw(r12)
            r12.restoreToCount(r0)
            goto L18
        L29:
            super.draw(r12)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r8.setStyle(r0)
            int r0 = r11.w0
            r8.setColor(r0)
            r0 = 0
            r8.setStrokeWidth(r0)
            r3 = 0
            r8.setFilterBitmap(r3)
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
            r2.setFillType(r3)
            r12.drawPath(r2, r8)
            boolean r3 = r11.t0
            if (r3 == 0) goto L18
            float r3 = r1.width()
            float r4 = r1.height()
            float r3 = r3 - r4
            float r4 = r11.u0
            float r3 = r3 + r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r9 = r3 / r4
            float r3 = r1.height()
            float r5 = r1.width()
            float r3 = r3 - r5
            float r5 = r11.u0
            float r3 = r3 + r5
            float r10 = r3 / r4
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            float r4 = r1.left
            float r5 = r1.top
            float r6 = r4 + r9
            float r7 = r1.bottom
            r3 = r12
            r3.drawRect(r4, r5, r6, r7, r8)
            float r6 = r1.right
            float r4 = r6 - r9
            float r5 = r1.top
            float r7 = r1.bottom
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L85
        L84:
            r3 = r12
        L85:
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 <= 0) goto L9f
            float r4 = r1.left
            float r5 = r1.top
            float r6 = r1.right
            float r7 = r5 + r10
            r3.drawRect(r4, r5, r6, r7, r8)
            float r4 = r1.left
            float r7 = r1.bottom
            float r5 = r7 - r10
            float r6 = r1.right
            r3.drawRect(r4, r5, r6, r7, r8)
        L9f:
            int r12 = r11.v0
            if (r12 == 0) goto Lbc
            android.graphics.Paint$Style r12 = android.graphics.Paint.Style.STROKE
            r8.setStyle(r12)
            int r12 = r11.v0
            r8.setColor(r12)
            float r12 = r11.u0
            r8.setStrokeWidth(r12)
            android.graphics.Path$FillType r12 = android.graphics.Path.FillType.EVEN_ODD
            r2.setFillType(r12)
            android.graphics.Path r12 = r11.z0
            r3.drawPath(r12, r8)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtd.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.mtd
    public final void f() {
    }

    @Override // defpackage.mtd
    public final void h(float f) {
        this.x0 = f;
        p();
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void i() {
    }

    @Override // defpackage.mtd
    public final void k() {
        p();
        invalidateSelf();
    }

    @Override // defpackage.mtd
    public final void m(float[] fArr) {
        float[] fArr2 = this.Y;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            l5j.b("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        p();
        invalidateSelf();
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        p();
    }

    public final void p() {
        float[] fArr;
        Path path = this.y0;
        path.reset();
        Path path2 = this.z0;
        path2.reset();
        Rect bounds = getBounds();
        RectF rectF = this.A0;
        rectF.set(bounds);
        float f = this.x0;
        rectF.inset(f, f);
        if (this.o == 1) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z = this.t0;
        float[] fArr2 = this.Y;
        if (z) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = -this.x0;
        rectF.inset(f2, f2);
        float f3 = this.u0 / 2.0f;
        rectF.inset(f3, f3);
        if (this.t0) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.Z;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.x0) - (this.u0 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = (-this.u0) / 2.0f;
        rectF.inset(f4, f4);
    }
}
