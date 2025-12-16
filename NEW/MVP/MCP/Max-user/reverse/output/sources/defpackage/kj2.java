package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class kj2 {
    public static final Object a = new Object();
    public static ExecutorService b;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.g8g r4, defpackage.um6 r5, java.lang.Throwable r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.l46
            if (r0 == 0) goto L13
            r0 = r7
            l46 r0 = (defpackage.l46) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            l46 r0 = new l46
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.g8j.b(r7)
            r0.d = r6     // Catch: java.lang.Throwable -> L27
            r0.X = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L41
            return r5
        L41:
            qqg r4 = defpackage.qqg.a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            defpackage.saj.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj2.a(g8g, um6, java.lang.Throwable, q44):java.lang.Object");
    }

    public static void b(y5c y5cVar, long j) throws IOException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = y5cVar.skip(j);
            if (jSkip <= 0) {
                if (y5cVar.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }
}
