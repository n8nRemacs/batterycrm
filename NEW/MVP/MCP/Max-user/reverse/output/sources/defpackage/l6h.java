package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l6h {
    public final k18 a;
    public final k18 b;
    public final k18 c;

    public l6h(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
    }

    public static Bitmap a(List list) {
        Integer numValueOf;
        Iterator it = list.iterator();
        int width = 0;
        int width2 = 0;
        while (it.hasNext()) {
            width2 += ((Bitmap) it.next()).getWidth();
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            numValueOf = Integer.valueOf(((Bitmap) it2.next()).getHeight());
            while (it2.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((Bitmap) it2.next()).getHeight());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        if (width2 <= 0 || iIntValue <= 0) {
            String name = list.getClass().getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, ho7.g("concatenateHorizontally incorrect size totalWidth: ", width2, iIntValue, " maxHeight: "), null);
                }
            }
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, iIntValue, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Bitmap bitmap = (Bitmap) it3.next();
            canvas.drawBitmap(bitmap, width, 0.0f, (Paint) null);
            width += bitmap.getWidth();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int iSqrt = (int) (fMin / ((float) Math.sqrt(2.0f)));
        if (i > 0 && iSqrt > 0) {
            int i2 = (int) ((fMin - iSqrt) / 2.0f);
            return Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, i2, i2, iSqrt, iSqrt), i, i, true);
        }
        String name = bitmap.getClass().getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.g("cropCircleInscribedSquare incorrect size frameSize: ", i, iSqrt, " inscribedSide: "), null);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, int r11, int r12, defpackage.q44 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.k6h
            if (r0 == 0) goto L13
            r0 = r13
            k6h r0 = (defpackage.k6h) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            k6h r0 = new k6h
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            l6h r10 = r0.d
            defpackage.g8j.b(r13)
            r6 = r9
            goto L8e
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.g8j.b(r13)
            int r13 = r10.size()
            int r11 = r11 / r13
            if (r11 >= r2) goto L3c
            r7 = r2
            goto L3d
        L3c:
            r7 = r11
        L3d:
            k18 r11 = r9.b
            java.lang.Object r11 = r11.getValue()
            lzf r11 = (defpackage.lzf) r11
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.b()
            if (r11 != 0) goto L4f
            x74 r11 = r0.b
        L4f:
            kotlinx.coroutines.internal.ContextScope r11 = defpackage.d7j.a(r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.we3.q(r10, r1)
            r13.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L62:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L7f
            java.lang.Object r4 = r10.next()
            j6h r3 = new j6h
            r5 = 0
            r6 = r9
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r12 = 3
            r1 = 0
            cs4 r12 = defpackage.svi.b(r11, r1, r3, r12)
            r13.add(r12)
            r12 = r8
            goto L62
        L7f:
            r6 = r9
            r0.d = r6
            r0.Y = r2
            java.lang.Object r13 = defpackage.hui.b(r13, r0)
            g84 r10 = defpackage.g84.a
            if (r13 != r10) goto L8d
            return r10
        L8d:
            r10 = r6
        L8e:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r11 = defpackage.ue3.E(r13)
            r10.getClass()
            android.graphics.Bitmap r10 = a(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6h.c(java.util.List, int, int, q44):java.lang.Object");
    }
}
