package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class bm8 extends FrameLayout {
    public final /* synthetic */ MainScreen a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm8(MainScreen mainScreen, Context context) {
        super(context);
        this.a = mainScreen;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets r12) {
        /*
            r11 = this;
            r0 = 0
            g4i r1 = defpackage.g4i.h(r0, r12)
            e4i r2 = r1.a
            r3 = 7
            co7 r4 = r2.f(r3)
            int r5 = r4.d
            r6 = 0
            android.view.View r7 = r11.getChildAt(r6)
            boolean r8 = r7 instanceof android.widget.FrameLayout
            if (r8 == 0) goto L1a
            r0 = r7
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
        L1a:
            if (r0 != 0) goto L21
            android.view.WindowInsets r12 = super.dispatchApplyWindowInsets(r12)
            return r12
        L21:
            rha r7 = one.me.main.MainScreen.Y
            one.me.main.MainScreen r7 = r11.a
            aza r7 = r7.z0()
            r8 = 135(0x87, float:1.89E-43)
            co7 r2 = r2.f(r8)
            int r8 = r7.b
            int r9 = r2.a
            int r9 = r9 + r8
            int r2 = r2.c
            int r8 = r8 + r2
            int r2 = r7.getPaddingTop()
            int r10 = r7.getPaddingBottom()
            r7.setPadding(r9, r2, r8, r10)
            int r2 = r7.getPaddingBottom()
            if (r2 == r5) goto L4b
            r7.setPadding(r6, r6, r6, r5)
        L4b:
            r7.dispatchApplyWindowInsets(r12)
            v17 r2 = defpackage.aza.c
            r2.getClass()
            int r2 = defpackage.v17.b(r11)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            if (r6 >= r7) goto L68
            int r8 = defpackage.xz7.a
            int r8 = defpackage.xz7.c
            boolean r8 = defpackage.xz7.b(r8)
            if (r8 == 0) goto L68
            goto L69
        L68:
            int r5 = r5 + r2
        L69:
            r2 = 30
            if (r6 < r2) goto L73
            x3i r2 = new x3i
            r2.<init>(r1)
            goto L80
        L73:
            if (r6 < r7) goto L7b
            v3i r2 = new v3i
            r2.<init>(r1)
            goto L80
        L7b:
            u3i r2 = new u3i
            r2.<init>(r1)
        L80:
            int r1 = r4.a
            int r6 = r4.b
            int r4 = r4.c
            co7 r1 = defpackage.co7.b(r1, r6, r4, r5)
            r2.c(r3, r1)
            g4i r1 = r2.b()
            android.view.WindowInsets r1 = r1.g()
            r0.dispatchApplyWindowInsets(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm8.dispatchApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }
}
