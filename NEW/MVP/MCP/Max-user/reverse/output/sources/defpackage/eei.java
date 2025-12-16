package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class eei {
    public static final long[] a = new long[0];

    public static final boolean a(g37 g37Var, g37 g37Var2, iv6 iv6Var) {
        if (g37Var.g() == g37Var2.g() && g37Var.h() == g37Var2.h() && g37Var.j().size() == g37Var2.j().size()) {
            try {
                int size = g37Var.j().size();
                for (int i = 0; i < size; i++) {
                    if (k4j.c((d93) g37Var.j().get(i), (d93) g37Var2.j().get(i))) {
                    }
                }
                return true;
            } catch (IndexOutOfBoundsException e) {
                if (iv6Var != null) {
                    String str = (String) iv6Var.b;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, wmf.e("equalsBounds: exception while iterate chunks: \n                |" + e + "\n                |"), null);
                        }
                    }
                }
            }
        }
        return false;
    }

    public static ssb b() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map mapA = gei.a(allStackTraces);
        Throwable th = null;
        try {
            Throwable th2 = null;
            Throwable th3 = null;
            Throwable th4 = null;
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                String str = key.getName() + " (state=" + key.getState() + ", pid=" + key.getId() + ")";
                if (dnf.n(key.getName(), "main", true)) {
                    th4 = new Throwable(str);
                    th4.setStackTrace(value);
                } else if (th3 != null) {
                    Throwable th5 = new Throwable(str, th3);
                    th5.setStackTrace(value);
                    th3 = th5;
                } else {
                    th2 = new Throwable(str);
                    th2.setStackTrace(value);
                    th3 = th2;
                }
            }
            if (th4 != null && th2 != null) {
                th2.initCause(th4);
            }
            th = th3;
        } catch (Throwable unused) {
        }
        return new ssb(mapA, 12, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long[] c(long[] r4, int r5, int r6) {
        /*
        L0:
            long[] r0 = defpackage.eei.a
            if (r5 < 0) goto L2e
            int r1 = r4.length
            r2 = 1
            int r1 = r1 - r2
            if (r5 <= r1) goto La
            goto L2e
        La:
            r1 = 0
            if (r6 != 0) goto L19
            int r6 = r4.length
            int r6 = r6 - r2
            if (r5 > r6) goto L18
            r5 = r4[r5]
            long[] r4 = new long[r2]
            r4[r1] = r5
            return r4
        L18:
            return r0
        L19:
            if (r6 <= 0) goto L26
            int r6 = r6 + r5
            int r1 = r4.length
            if (r6 <= r1) goto L20
            int r6 = r4.length
        L20:
            long[] r4 = java.util.Arrays.copyOfRange(r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            return r4
        L25:
            return r0
        L26:
            int r6 = r6 + r5
            if (r6 >= 0) goto L2a
            r6 = r1
        L2a:
            r3 = r6
            r6 = r5
            r5 = r3
            goto L0
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eei.c(long[], int, int):long[]");
    }
}
