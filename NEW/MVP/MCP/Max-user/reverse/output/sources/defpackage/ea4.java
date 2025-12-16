package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class ea4 extends xr4 {
    public final int l;
    public Rect m;
    public final RectF n;
    public boolean o;
    public float p;

    public ea4(aqc aqcVar, int i) {
        super(aqcVar);
        this.n = new RectF();
        this.p = 0.0f;
        this.l = i;
    }

    @Override // defpackage.xr4, defpackage.t7i
    public final void a(float f, float f2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[PHI: r0 r4
  0x0019: PHI (r0v10 float) = (r0v2 float), (r0v3 float) binds: [B:5:0x0017, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0019: PHI (r4v4 int) = (r4v0 int), (r4v1 int) binds: [B:5:0x0017, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.xr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            android.graphics.Rect r0 = r8.m
            if (r0 == 0) goto L4f
            android.graphics.RectF r0 = r8.h
            android.graphics.Matrix r1 = r8.k
            android.graphics.RectF r2 = r8.n
            r1.mapRect(r2, r0)
            float r0 = r2.top
            android.graphics.Rect r3 = r8.m
            int r4 = r3.top
            float r5 = (float) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r6 = 0
            if (r5 <= 0) goto L1c
        L19:
            float r4 = (float) r4
            float r4 = r4 - r0
            goto L27
        L1c:
            float r0 = r2.bottom
            int r4 = r3.bottom
            float r5 = (float) r4
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L26
            goto L19
        L26:
            r4 = r6
        L27:
            float r0 = r2.left
            int r5 = r3.left
            float r7 = (float) r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 <= 0) goto L33
            float r2 = (float) r5
        L31:
            float r2 = r2 - r0
            goto L3f
        L33:
            float r0 = r2.right
            int r2 = r3.right
            float r3 = (float) r2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L3e
            float r2 = (float) r2
            goto L31
        L3e:
            r2 = r6
        L3f:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L47
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L4f
        L47:
            r1.postTranslate(r2, r4)
            aqc r0 = r8.a
            r0.j()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea4.b():void");
    }

    public final Rect c(int i) {
        RectF rectF = new RectF();
        this.k.mapRect(rectF, this.h);
        if (this.m == null) {
            return null;
        }
        float fWidth = i / rectF.width();
        Rect rect = this.m;
        float f = rect.left - rectF.left;
        int i2 = (int) (f * fWidth);
        int i3 = (int) ((rect.top - rectF.top) * fWidth);
        int iWidth = (int) ((f + rect.width()) * fWidth);
        Rect rect2 = this.m;
        Rect rect3 = new Rect(i2, i3, iWidth, (int) (((rect2.top - rectF.top) + rect2.height()) * fWidth));
        if (this.o && rect3.height() != rect3.width()) {
            wqi.c("ea4", "cropped rect is not square: square it", new Object[0]);
            if (rect3.width() > rect3.height()) {
                rect3.right -= rect3.width() - rect3.height();
                return rect3;
            }
            rect3.bottom -= rect3.height() - rect3.width();
        }
        return rect3;
    }

    public final void d(int i) {
        if (c(i) != null) {
            float fWidth = (r2.width() / this.l) - 0.05f;
            if (fWidth > 1.0f) {
                this.f = fWidth;
            }
        }
    }

    public final void e() {
        RectF rectF = this.h;
        if (rectF == null || this.m == null) {
            return;
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        this.e = Math.max(this.m.width() / fWidth, this.m.height() / fHeight);
        if (fWidth < this.m.width() || fHeight < this.m.height()) {
            float f = this.e;
            this.k.setScale(f, f, rectF.centerX(), rectF.centerY());
        }
        b();
    }

    @Override // defpackage.xr4, defpackage.t7i
    public final void reset() {
        super.reset();
        this.p = 0.0f;
    }
}
