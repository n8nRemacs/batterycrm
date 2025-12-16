package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class jeg {
    public static final jeg a = new jeg();
    public static qs3 b;

    public static final void a(String str) {
        if (feg.b) {
            return;
        }
        try {
            qs3 qs3Var = b;
            if (qs3Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            qg8 qg8Var = (qg8) qs3Var.X;
            ConcurrentLinkedQueue concurrentLinkedQueue = qg8Var.i;
            int i = qg8Var.a;
            int i2 = i - 30;
            if (i2 <= 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - qg8Var.j;
            byte[] bytes = str.getBytes(lb2.a);
            if (bytes.length > i2) {
                if ((bytes[i2] & 192) == 128) {
                    do {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                    } while ((bytes[i2] & 192) == 128);
                }
                bytes = ys.o(0, bytes, i2);
            }
            gg8 gg8Var = new gg8(jCurrentTimeMillis, bytes);
            concurrentLinkedQueue.add(gg8Var);
            qg8Var.h += gg8Var.c;
            while (qg8Var.h > i) {
                gg8 gg8Var2 = (gg8) concurrentLinkedQueue.poll();
                if (gg8Var2 != null) {
                    qg8Var.h -= gg8Var2.c;
                } else {
                    qg8Var.h = 0;
                }
            }
            afg.a(new qz5(qg8Var, str, gg8Var));
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.sse r16, java.lang.Throwable r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jeg.b(sse, java.lang.Throwable, java.lang.String):void");
    }
}
