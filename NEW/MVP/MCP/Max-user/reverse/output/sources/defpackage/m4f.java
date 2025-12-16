package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m4f {
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;
    public float s;
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public final e8a q = new e8a(16);
    public final RectF r = new RectF();

    public final float a(float f) {
        int i = this.p;
        RectF rectF = this.r;
        if (i <= 1) {
            return rectF.left;
        }
        e8a e8aVar = this.q;
        int i2 = 0;
        float fB = (e8aVar.b(1) - e8aVar.b(0)) / 2.0f;
        int i3 = e8aVar.b - 1;
        float f2 = rectF.left;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            float fB2 = e8aVar.b(i4);
            float f3 = fB2 - f;
            if (Math.abs(f3) <= fB) {
                return fB2;
            }
            if (Math.abs(f3) < Math.abs(f2 - f)) {
                f2 = fB2;
            }
            if (fB2 < f) {
                i2 = i4 + 1;
            } else {
                i3 = i4 - 1;
            }
        }
        return f2;
    }

    public final void b(int i) {
        this.p = i;
        RectF rectF = this.r;
        float fD = kti.d(rectF.width());
        int i2 = this.p - 1;
        if (i2 < 1) {
            i2 = 1;
        }
        float f = fD / i2;
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        float f2 = (((this.d - r3) - this.h) / 2.0f) + this.f;
        float f3 = iD / 2.0f;
        this.n = f2 - f3;
        this.o = f2 + f3;
        float f4 = rectF.left;
        int i3 = this.p;
        e8a e8aVar = this.q;
        float[] fArr = e8aVar.a;
        if (fArr.length < i3) {
            e8aVar.a = Arrays.copyOf(fArr, Math.max(i3, (fArr.length * 3) / 2));
        }
        int i4 = this.p;
        for (int i5 = 0; i5 < i4; i5++) {
            float f5 = (i5 * f) + f4;
            int i6 = e8aVar.b;
            if (i6 <= i5) {
                e8aVar.a(f5);
            } else {
                if (i5 < 0 || i5 >= i6) {
                    StringBuilder sbM = ho7.m(i5, "set index ", " must be between 0 .. ");
                    sbM.append(e8aVar.b - 1);
                    throw new IndexOutOfBoundsException(sbM.toString());
                }
                float[] fArr2 = e8aVar.a;
                float f6 = fArr2[i5];
                fArr2[i5] = f5;
            }
        }
    }

    public final void c(float f) {
        RectF rectF = this.r;
        this.s = n7j.b(f, rectF.left, rectF.right);
    }

    public final void d() {
        float f = (((this.d - r0) - this.h) / 2.0f) + this.f;
        RectF rectF = this.r;
        rectF.top = f;
        rectF.bottom = f;
        float f2 = this.e + this.i;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        rectF.left = f2;
        float f3 = (this.c - this.g) - this.k;
        if (f3 < f2) {
            f3 = f2;
        }
        rectF.right = f3;
        this.s = n7j.b(this.s, f2, f3);
    }
}
