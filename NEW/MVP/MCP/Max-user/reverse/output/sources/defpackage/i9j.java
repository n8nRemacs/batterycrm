package defpackage;

import android.content.Context;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class i9j {
    public static final Size a(Context context) {
        Size size = new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        return size.getHeight() > size.getWidth() ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.r1e b(android.content.Context r14) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L3c
            android.view.WindowManager r0 = defpackage.e6j.b(r14)
            android.view.WindowMetrics r0 = defpackage.jlb.o(r0)
            android.graphics.Rect r0 = defpackage.jlb.i(r0)
            android.view.WindowManager r1 = defpackage.e6j.b(r14)
            android.view.WindowMetrics r1 = defpackage.jlb.o(r1)
            android.view.WindowInsets r1 = defpackage.jlb.j(r1)
            int r3 = defpackage.jlb.A()
            android.graphics.Insets r1 = defpackage.w3i.c(r1, r3)
            int r3 = r0.width()
            int r0 = r0.height()
            int r4 = defpackage.y35.a(r1)
            int r1 = defpackage.y35.B(r1)
            r6 = r0
            r9 = r1
        L39:
            r7 = r3
            r8 = r4
            goto L84
        L3c:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r3 = defpackage.e6j.b(r14)
            android.view.Display r3 = r3.getDefaultDisplay()
            r3.getMetrics(r1)
            int r3 = r1.widthPixels
            int r1 = r1.heightPixels
            r4 = 29
            if (r0 < r4) goto L80
            android.view.WindowManager r0 = defpackage.e6j.b(r14)
            android.view.Display r0 = r0.getDefaultDisplay()
            android.view.DisplayCutout r0 = defpackage.hld.i(r0)
            if (r0 == 0) goto L68
            int r0 = defpackage.i7c.w(r0)
            r4 = r0
            goto L69
        L68:
            r4 = r2
        L69:
            android.view.WindowManager r0 = defpackage.e6j.b(r14)
            android.view.Display r0 = r0.getDefaultDisplay()
            android.view.DisplayCutout r0 = defpackage.hld.i(r0)
            if (r0 == 0) goto L7c
            int r0 = defpackage.i7c.d(r0)
            goto L7d
        L7c:
            r0 = r2
        L7d:
            r9 = r0
            r6 = r1
            goto L39
        L80:
            r6 = r1
            r8 = r2
            r9 = r8
            r7 = r3
        L84:
            r1e r5 = new r1e
            nv4 r14 = defpackage.c9j.b(r14)
            nv4 r0 = defpackage.nv4.AVERAGE
            int r14 = r14.compareTo(r0)
            r0 = 1
            if (r14 >= 0) goto L95
            r10 = r0
            goto L96
        L95:
            r10 = r2
        L96:
            float r14 = (float) r6
            float r1 = (float) r7
            float r14 = r14 / r1
            double r3 = (double) r14
            r11 = 4612429112365904036(0x4002a3d70a3d70a4, double:2.33)
            int r14 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r14 < 0) goto La5
            r11 = r0
            goto La6
        La5:
            r11 = r2
        La6:
            r12 = 4610785298501913805(0x3ffccccccccccccd, double:1.8)
            int r14 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r14 > 0) goto Lb1
            r12 = r0
            goto Lb2
        Lb1:
            r12 = r2
        Lb2:
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9j.b(android.content.Context):r1e");
    }
}
