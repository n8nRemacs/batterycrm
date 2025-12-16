package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class j6j {
    public static boolean a(String str) {
        HashMap map = h54.c;
        d54 d54Var = (d54) map.get(str);
        if (d54Var == null) {
            return false;
        }
        d54Var.a.a();
        map.remove(str);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0004, code lost:
    
        r1 = r4.getString("ControllerChangeHandler.className");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.h54 b(android.os.Bundle r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            goto L2d
        L4:
            java.lang.String r1 = "ControllerChangeHandler.className"
            java.lang.String r1 = r4.getString(r1)
            if (r1 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.String r2 = "ControllerChangeHandler.savedState"
            android.os.Bundle r4 = r4.getBundle(r2)
            if (r4 != 0) goto L16
            goto L2d
        L16:
            r2 = 1
            java.lang.Class r2 = defpackage.q4j.a(r1, r2)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L24
            java.lang.Object r1 = r2.newInstance()     // Catch: java.lang.Exception -> L22
            goto L25
        L22:
            r4 = move-exception
            goto L2e
        L24:
            r1 = r0
        L25:
            h54 r1 = (defpackage.h54) r1
            if (r1 == 0) goto L2d
            r1.h(r4)
            return r1
        L2d:
            return r0
        L2e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "An exception occurred while creating a new instance of "
            java.lang.String r3 = ". "
            java.lang.StringBuilder r1 = defpackage.az1.n(r2, r1, r3)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j6j.b(android.os.Bundle):h54");
    }

    public static String c(int i) {
        return wy1.e(i, "ProfileItemId(value=", ")");
    }
}
