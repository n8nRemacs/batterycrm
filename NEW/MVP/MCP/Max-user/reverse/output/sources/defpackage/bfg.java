package defpackage;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class bfg implements Thread.UncaughtExceptionHandler {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uncaughtException(java.lang.Thread r16, java.lang.Throwable r17) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r15 = this;
            boolean r0 = defpackage.feg.b
            if (r0 == 0) goto L5
            return
        L5:
            qs3 r0 = defpackage.jeg.b     // Catch: java.lang.IllegalStateException -> Lc3
            if (r0 == 0) goto Lbb
            boolean r1 = defpackage.feg.b
            if (r1 == 0) goto Le
            return
        Le:
            java.lang.Object r1 = r0.c
            pje r1 = (defpackage.pje) r1
            r1.getClass()
            r2 = 0
            r3 = 6
            r4 = 0
            defpackage.pje.d(r1, r4, r2, r3)
            java.lang.String r1 = ".shutdown.until.ts"
            java.lang.String r2 = "system."
            java.lang.String r3 = "CRASH_REPORT"
            ssb r5 = defpackage.tha.u0
            if (r5 == 0) goto Lb3
            java.lang.String r6 = "system.shutdown.until.ts"
            boolean r6 = defpackage.g5j.a(r5, r6)
            r7 = 1
            if (r6 == 0) goto L2f
            goto L44
        L2f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r3)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            boolean r1 = defpackage.g5j.a(r5, r1)
            if (r1 == 0) goto L45
        L44:
            r4 = r7
        L45:
            if (r4 == 0) goto L48
            return
        L48:
            java.lang.Object r1 = r0.b
            r8 = r1
            iv6 r8 = (defpackage.iv6) r8
            java.lang.Object r1 = r0.c
            pje r1 = (defpackage.pje) r1
            wxf r11 = r1.c()
            java.lang.Object r1 = r0.o
            uyf r1 = (defpackage.uyf) r1
            java.util.ArrayList r2 = r1.e
            monitor-enter(r2)
            java.util.ArrayList r1 = r1.e     // Catch: java.lang.Throwable -> Lb0
            java.util.List r12 = defpackage.ue3.d0(r1)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r2)
            java.util.Map r13 = java.lang.Thread.getAllStackTraces()
            java.lang.Object r1 = r0.X
            qg8 r1 = (defpackage.qg8) r1
            java.util.concurrent.ConcurrentLinkedQueue r1 = r1.i
            java.util.List r14 = defpackage.ue3.d0(r1)
            r9 = 1
            r10 = r17
            g94 r1 = r8.y(r9, r10, r11, r12, r13, r14)
            if (r1 == 0) goto Lc3
            java.util.concurrent.CountDownLatch r2 = new java.util.concurrent.CountDownLatch
            r2.<init>(r7)
            cj r3 = new cj
            r4 = 16
            r3.<init>(r0, r1, r2, r4)
            defpackage.afg.b(r3)
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            boolean r1 = defpackage.fni.a(r1, r3)
            if (r1 == 0) goto L9a
            r3 = 5000(0x1388, double:2.4703E-320)
            goto L9d
        L9a:
            r3 = 100000000(0x5f5e100, double:4.94065646E-316)
        L9d:
            java.lang.Object r0 = r0.Y
            qje r0 = (defpackage.qje) r0
            java.lang.Object r0 = r0.b     // Catch: java.lang.Exception -> Laa
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0     // Catch: java.lang.Exception -> Laa
            if (r0 == 0) goto Laa
            r0.block(r3)     // Catch: java.lang.Exception -> Laa
        Laa:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.await(r3, r0)
            goto Lc3
        Lb0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Tracer settings are not initialized."
            r0.<init>(r1)
            throw r0
        Lbb:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> Lc3
            r1.<init>(r0)     // Catch: java.lang.IllegalStateException -> Lc3
            throw r1     // Catch: java.lang.IllegalStateException -> Lc3
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfg.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
