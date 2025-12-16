package defpackage;

/* loaded from: classes.dex */
public abstract class d6j {
    public static volatile String a;

    public static final jy7 a(ree reeVar) {
        if (reeVar instanceof x34) {
            ((x34) reeVar).getClass();
            return null;
        }
        if (reeVar instanceof see) {
            return a(((see) reeVar).a);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r0 = r0.substring(0, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b() {
        /*
            java.lang.String r0 = defpackage.d6j.a
            if (r0 != 0) goto L65
            java.lang.String r0 = "/proc/"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L11
            java.lang.String r0 = defpackage.i7c.m()
            goto L63
        L11:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L61
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L61
            r2.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L61
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.nio.charset.Charset r0 = defpackage.lb2.c     // Catch: java.lang.Throwable -> L61
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L61
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L61
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = defpackage.guf.t(r2)     // Catch: java.lang.Throwable -> L55
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L55
            r3 = 0
            r4 = r3
        L41:
            if (r4 >= r1) goto L57
            char r5 = r0.charAt(r4)     // Catch: java.lang.Throwable -> L55
            int r5 = defpackage.fni.b(r5, r3)     // Catch: java.lang.Throwable -> L55
            if (r5 <= 0) goto L50
            int r4 = r4 + 1
            goto L41
        L50:
            java.lang.String r0 = r0.substring(r3, r4)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r0 = move-exception
            goto L5b
        L57:
            r2.close()     // Catch: java.lang.Throwable -> L61
            goto L63
        L5b:
            throw r0     // Catch: java.lang.Throwable -> L5c
        L5c:
            r1 = move-exception
            defpackage.r4j.a(r2, r0)     // Catch: java.lang.Throwable -> L61
            throw r1     // Catch: java.lang.Throwable -> L61
        L61:
            java.lang.String r0 = "unknown"
        L63:
            defpackage.d6j.a = r0
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6j.b():java.lang.String");
    }
}
