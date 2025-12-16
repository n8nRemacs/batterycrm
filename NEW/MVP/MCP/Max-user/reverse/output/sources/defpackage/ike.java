package defpackage;

/* loaded from: classes.dex */
public final class ike extends y1 {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = y1.Y;
        }
        if (!y1.X.b(this, null, obj)) {
            return false;
        }
        y1.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!y1.X.b(this, null, new f1(th))) {
            return false;
        }
        y1.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(defpackage.ha8 r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = defpackage.y1.f(r6)
            yoi r0 = defpackage.y1.X
            boolean r6 = r0.b(r5, r3, r6)
            if (r6 == 0) goto L4f
            defpackage.y1.b(r5)
            return r2
        L20:
            l1 r0 = new l1
            r0.<init>(r5, r6)
            yoi r4 = defpackage.y1.X
            boolean r3 = r4.b(r5, r3, r0)
            if (r3 == 0) goto L42
            cx4 r1 = defpackage.cx4.a     // Catch: java.lang.Throwable -> L33
            r6.d(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            f1 r1 = new f1     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            f1 r1 = defpackage.f1.b
        L3c:
            yoi r6 = defpackage.y1.X
            r6.b(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.a
        L44:
            boolean r2 = r0 instanceof defpackage.c1
            if (r2 == 0) goto L4f
            c1 r0 = (defpackage.c1) r0
            boolean r0 = r0.a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ike.k(ha8):boolean");
    }
}
