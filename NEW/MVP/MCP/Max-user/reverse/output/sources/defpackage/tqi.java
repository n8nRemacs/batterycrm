package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public abstract class tqi {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zjd a(java.nio.ByteBuffer r11) {
        /*
            int r0 = r11.remaining()
            if (r0 != 0) goto Lb
            t76 r11 = defpackage.wg7.b
            zjd r11 = defpackage.zjd.o
            return r11
        Lb:
            java.nio.ByteBuffer r11 = r11.asReadOnlyBuffer()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r11.order(r0)
            int r0 = r11.position()
            int r0 = d(r0, r11)
            int r0 = r0 + 3
            java.lang.String r1 = "initialCapacity"
            r2 = 4
            defpackage.u4j.a(r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r4 = 1
            r5 = r1
            r7 = r3
            r6 = r4
            r1 = r0
        L2c:
            int r8 = r11.limit()
            if (r0 >= r8) goto Lbc
            if (r6 == 0) goto Lac
        L34:
            int r6 = r11.limit()
            int r6 = r6 - r2
            if (r0 > r6) goto L67
            int r6 = r11.getInt(r0)
            r8 = r6 & (-256(0xffffffffffffff00, float:NaN))
            if (r8 == 0) goto L84
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L48
            goto L84
        L48:
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r6
            if (r8 == 0) goto L64
            if (r8 != r4) goto L51
            goto L64
        L51:
            r8 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r6
            if (r8 != 0) goto L5a
            int r0 = r0 + 2
            goto L34
        L5a:
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto L61
            int r0 = r0 + 3
            goto L34
        L61:
            int r0 = r0 + 4
            goto L34
        L64:
            int r0 = r0 + 1
            goto L84
        L67:
            int r6 = r11.limit()
            int r6 = r6 + (-3)
            if (r0 != r6) goto L80
            short r6 = r11.getShort(r0)
            int r8 = r0 + 2
            byte r8 = r11.get(r8)
            if (r6 != 0) goto L80
            if (r8 == 0) goto L84
            if (r8 != r4) goto L80
            goto L84
        L80:
            int r0 = r11.limit()
        L84:
            int r6 = r0 - r1
            java.nio.ByteBuffer r8 = r11.duplicate()
            r8.position(r1)
            int r6 = r6 + r1
            r8.limit(r6)
            java.nio.ByteBuffer r6 = r8.slice()
            r6.getClass()
            int r8 = r5.length
            int r9 = r7 + 1
            int r8 = defpackage.mg7.h(r8, r9)
            int r10 = r5.length
            if (r8 > r10) goto La3
            goto La7
        La3:
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r8)
        La7:
            r5[r7] = r6
            r6 = r3
            r7 = r9
            goto L2c
        Lac:
            int r0 = d(r0, r11)
            int r1 = r11.limit()
            if (r0 == r1) goto Lbc
            int r1 = r0 + 3
            r0 = r1
            r6 = r4
            goto L2c
        Lbc:
            zjd r11 = defpackage.wg7.h(r7, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqi.a(java.nio.ByteBuffer):zjd");
    }

    public static final String b(View view) {
        Object ipdVar;
        try {
            ipdVar = view.getResources().getResourceName(view.getId());
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (kpd.a(ipdVar) != null) {
            ipdVar = view.getClass().getName();
        }
        return (String) ipdVar;
    }

    public static final void c(um6 um6Var, View view) {
        Object tag = view.getTag(o0d.oneme_theme_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            wqi.q("ViewThemeUtils", "try to observe onThemeChanged more than once for " + b(view), new Object[0]);
            return;
        }
        View.OnAttachStateChangeListener mhhVar = new mhh(um6Var, view);
        view.setTag(o0d.oneme_theme_attach_listener, mhhVar);
        if (view.isAttachedToWindow()) {
            mhhVar.onViewAttachedToWindow(view);
        }
        view.addOnAttachStateChangeListener(mhhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(int r5, java.nio.ByteBuffer r6) {
        /*
        L0:
            int r0 = r6.limit()
            int r0 = r0 + (-4)
            r1 = 0
            r2 = 1
            if (r5 > r0) goto L2e
            int r0 = r6.getInt(r5)
            r3 = r0 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L15
            goto L4c
        L15:
            if (r3 != 0) goto L19
            r3 = r2
            goto L1a
        L19:
            r3 = r1
        L1a:
            java.lang.String r4 = "Invalid Nal units"
            defpackage.hsi.f(r4, r3)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L25
            int r5 = r5 + r2
            return r5
        L25:
            if (r0 != 0) goto L28
            r1 = r2
        L28:
            defpackage.hsi.f(r4, r1)
            int r5 = r5 + 1
            goto L0
        L2e:
            int r0 = r6.limit()
            int r0 = r0 + (-3)
            java.lang.String r3 = "Invalid NAL units"
            if (r5 > r0) goto L54
            short r0 = r6.getShort(r5)
            if (r0 != 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = r1
        L41:
            defpackage.hsi.f(r3, r0)
            int r0 = r5 + 2
            byte r0 = r6.get(r0)
            if (r0 != r2) goto L4d
        L4c:
            return r5
        L4d:
            if (r0 != 0) goto L50
            r1 = r2
        L50:
            defpackage.hsi.f(r3, r1)
            goto L69
        L54:
            int r0 = r6.limit()
            if (r5 >= r0) goto L69
            byte r0 = r6.get(r5)
            if (r0 != 0) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            defpackage.hsi.f(r3, r0)
            int r5 = r5 + 1
            goto L54
        L69:
            int r5 = r6.limit()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqi.d(int, java.nio.ByteBuffer):int");
    }

    public static final void e(esg esgVar) {
        esgVar.b(1, new a28(3));
        esgVar.d(474, new bf8(1));
    }
}
