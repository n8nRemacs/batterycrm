package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class G6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G6 f378175a = new G6();

    private G6() {
    }

    @X41.n
    @Y61.k
    public static final F6 a(@Y61.k Throwable th2) {
        return f378175a.a(th2, 1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.yandex.metrica.impl.ob.F6 a(java.lang.Throwable r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = r10.getMessage()
            r0 = 0
            java.lang.StackTraceElement[] r1 = r10.getStackTrace()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r0]
        L14:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r1.length
            r4.<init>(r5)
            int r5 = r1.length
            r6 = r0
        L1c:
            if (r6 >= r5) goto L2b
            r7 = r1[r6]
            com.yandex.metrica.impl.ob.D6 r8 = new com.yandex.metrica.impl.ob.D6
            r8.<init>(r7)
            r4.add(r8)
            int r6 = r6 + 1
            goto L1c
        L2b:
            java.lang.Throwable r1 = r10.getCause()
            r5 = 0
            if (r1 == 0) goto L44
            if (r12 >= r11) goto L35
            goto L36
        L35:
            r1 = r5
        L36:
            if (r1 == 0) goto L44
            com.yandex.metrica.impl.ob.G6 r6 = com.yandex.metrica.impl.ob.G6.f378175a
            int r7 = r12 + 1
            r8 = 30
            com.yandex.metrica.impl.ob.F6 r1 = r6.a(r1, r8, r7)
            r6 = r1
            goto L45
        L44:
            r6 = r5
        L45:
            r1 = 19
            boolean r1 = com.yandex.metrica.impl.ob.A2.a(r1)
            if (r1 == 0) goto L6b
            if (r12 >= r11) goto L6b
            java.lang.Throwable[] r10 = r10.getSuppressed()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.length
            r11.<init>(r1)
            int r1 = r10.length
        L5a:
            if (r0 >= r1) goto L6c
            r5 = r10[r0]
            com.yandex.metrica.impl.ob.G6 r7 = com.yandex.metrica.impl.ob.G6.f378175a
            r8 = 1
            com.yandex.metrica.impl.ob.F6 r5 = r7.a(r5, r8, r12)
            r11.add(r5)
            int r0 = r0 + 1
            goto L5a
        L6b:
            r11 = r5
        L6c:
            com.yandex.metrica.impl.ob.F6 r10 = new com.yandex.metrica.impl.ob.F6
            r1 = r10
            r5 = r6
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.G6.a(java.lang.Throwable, int, int):com.yandex.metrica.impl.ob.F6");
    }
}
