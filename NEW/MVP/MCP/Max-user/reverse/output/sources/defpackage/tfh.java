package defpackage;

import android.util.Log;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class tfh {
    public static final sfh a = new sfh();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j48 a(android.view.View r4) {
        /*
            zx0 r0 = defpackage.zx0.I0
            if (r4 != 0) goto L7
            qd5 r0 = defpackage.qd5.a
            goto L13
        L7:
            az4 r1 = new az4
            b0e r2 = new b0e
            r3 = 2
            r2.<init>(r3, r4)
            r1.<init>(r2, r0)
            r0 = r1
        L13:
            zx0 r1 = defpackage.zx0.J0
            oz5 r0 = defpackage.lee.k(r0, r1)
            java.lang.Object r0 = defpackage.lee.i(r0)
            j48 r0 = (defpackage.j48) r0
            if (r0 != 0) goto L65
            int r0 = defpackage.v0d.view_custom_attach_lifecycle_owner
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.g48
            if (r1 == 0) goto L2e
            g48 r0 = (defpackage.g48) r0
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L43
            l48 r1 = r0.a
            if (r1 == 0) goto L43
            l38 r1 = r1.d
            if (r1 == 0) goto L43
            l38 r2 = defpackage.l38.c
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != r2) goto L43
            goto L65
        L43:
            g48 r0 = new g48
            r0.<init>()
            l48 r1 = new l48
            r1.<init>(r0)
            r0.a = r1
            k38 r2 = defpackage.k38.ON_CREATE
            r1.d(r2)
            r4.addOnAttachStateChangeListener(r0)
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L60
            r0.onViewAttachedToWindow(r4)
        L60:
            int r1 = defpackage.v0d.view_custom_attach_lifecycle_owner
            r4.setTag(r1, r0)
        L65:
            boolean r4 = defpackage.tfh.b
            if (r4 == 0) goto L79
            l48 r4 = r0.p()
            sfh r1 = defpackage.tfh.a
            r4.f(r1)
            l48 r4 = r0.p()
            r4.a(r1)
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tfh.a(android.view.View):j48");
    }

    public static final x38 b(View view) {
        return zpi.a(a(view).p());
    }
}
