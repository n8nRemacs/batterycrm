package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class zoc {
    public final Context a;
    public final k18 b;
    public final k18 c;

    public zoc(k18 k18Var, k18 k18Var2, Context context) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(java.lang.CharSequence r19, defpackage.ll7[] r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoc.a(java.lang.CharSequence, ll7[]):java.lang.CharSequence");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0256 A[PHI: r21 r24
  0x0256: PHI (r21v3 int) = (r21v2 int), (r21v2 int), (r21v6 int) binds: [B:115:0x0212, B:96:0x01ba, B:75:0x0143] A[DONT_GENERATE, DONT_INLINE]
  0x0256: PHI (r24v4 java.lang.Object[]) = (r24v3 java.lang.Object[]), (r24v3 java.lang.Object[]), (r24v7 java.lang.Object[]) binds: [B:115:0x0212, B:96:0x01ba, B:75:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.lang.CharSequence r24) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zoc.b(java.lang.CharSequence):java.util.ArrayList");
    }

    public final qk4 c(Drawable drawable) {
        try {
            r2c r2cVarH = ((gf7) this.b.getValue()).h();
            int iWidth = drawable.getBounds().width();
            int iHeight = drawable.getBounds().height();
            if (iWidth <= 0) {
                iWidth = kti.d(18 * vw4.d().getDisplayMetrics().density);
            }
            if (iHeight <= 0) {
                iHeight = kti.d(18 * vw4.d().getDisplayMetrics().density);
            }
            Rect bounds = drawable.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            vc3 vc3VarC = r2cVarH.c(iWidth, iHeight, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, iWidth, iHeight);
            Canvas canvas = new Canvas((Bitmap) vc3VarC.Z());
            canvas.drawColor(0, PorterDuff.Mode.SRC);
            drawable.draw(canvas);
            drawable.setBounds(i, i2, i3, i4);
            return (qk4) vc3VarC;
        } catch (Throwable th) {
            wqi.e(drawable.getClass().getName(), "fail to fetch image from Drawable", th);
            return null;
        }
    }
}
