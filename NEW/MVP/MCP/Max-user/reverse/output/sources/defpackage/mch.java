package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class mch extends ch6 {
    public static final Typeface t0 = Typeface.create("sans-serif-medium", 0);
    public Paint X;
    public Paint Y;
    public RectF Z;
    public rw4 o;
    public Path s0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            rw4 r0 = r7.o
            android.graphics.RectF r1 = r7.Z
            android.graphics.drawable.Drawable r2 = r7.a
            int r3 = r7.getIntrinsicWidth()
            r4 = 0
            boolean r4 = defpackage.l8g.c(r4)
            r5 = 0
            if (r4 == 0) goto L13
            goto L2d
        L13:
            r4 = 0
            boolean r4 = defpackage.l8g.c(r4)
            if (r4 == 0) goto L1c
            r4 = r5
            goto L24
        L1c:
            android.graphics.Paint r4 = r7.X
            r6 = 0
            float r4 = r4.measureText(r6)
            int r4 = (int) r4
        L24:
            int r6 = super.getIntrinsicWidth()
            int r6 = r6 / 2
            int r4 = r4 - r6
            if (r4 >= 0) goto L2e
        L2d:
            r4 = r5
        L2e:
            int r3 = r3 - r4
            int r4 = r7.getIntrinsicHeight()
            r2.setBounds(r5, r5, r3, r4)
            r2 = 0
            boolean r2 = defpackage.l8g.c(r2)
            if (r2 != 0) goto L47
            r8.save()
            android.graphics.Path r3 = r7.s0
            android.graphics.Region$Op r4 = android.graphics.Region.Op.DIFFERENCE
            r8.clipPath(r3, r4)
        L47:
            android.graphics.drawable.Drawable r3 = r7.a
            r3.draw(r8)
            if (r2 != 0) goto L6b
            r8.restore()
            int r2 = r0.b
            float r2 = (float) r2
            android.graphics.Paint r3 = r7.Y
            r8.drawRoundRect(r1, r2, r2, r3)
            float r2 = r1.left
            int r3 = r0.a
            float r3 = (float) r3
            float r2 = r2 + r3
            float r1 = r1.bottom
            int r0 = r0.c
            float r0 = (float) r0
            float r1 = r1 - r0
            android.graphics.Paint r0 = r7.X
            r3 = 0
            r8.drawText(r3, r2, r1, r0)
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mch.draw(android.graphics.Canvas):void");
    }

    @Override // defpackage.ch6, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int intrinsicWidth = super.getIntrinsicWidth();
        int i = 0;
        if (!l8g.c(null)) {
            int iMeasureText = (l8g.c(null) ? 0 : (int) this.X.measureText(null)) - (super.getIntrinsicWidth() / 2);
            if (iMeasureText >= 0) {
                i = iMeasureText;
            }
        }
        return i + intrinsicWidth;
    }
}
