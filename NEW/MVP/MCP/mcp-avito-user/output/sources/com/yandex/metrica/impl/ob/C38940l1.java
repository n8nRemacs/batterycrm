package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.l1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38940l1 extends B {
    public C38940l1(Context context, A3 a32, @j.N com.yandex.metrica.f fVar, T1 t12) {
        this(context, a32, fVar, t12, new A0(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[Catch: all -> 0x00c5, TryCatch #1 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x001a, B:11:0x001d, B:12:0x001e, B:13:0x001f, B:15:0x0027, B:16:0x002a, B:18:0x0032, B:21:0x0035, B:22:0x0036, B:23:0x0037, B:25:0x003e, B:27:0x0049, B:28:0x004c, B:30:0x0054, B:33:0x0057, B:34:0x0058, B:35:0x0059, B:37:0x0061, B:38:0x0068, B:40:0x0070, B:41:0x0077, B:42:0x007c, B:47:0x00c7, B:17:0x002b, B:29:0x004d, B:7:0x0013), top: B:52:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037 A[Catch: all -> 0x00c5, TryCatch #1 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x001a, B:11:0x001d, B:12:0x001e, B:13:0x001f, B:15:0x0027, B:16:0x002a, B:18:0x0032, B:21:0x0035, B:22:0x0036, B:23:0x0037, B:25:0x003e, B:27:0x0049, B:28:0x004c, B:30:0x0054, B:33:0x0057, B:34:0x0058, B:35:0x0059, B:37:0x0061, B:38:0x0068, B:40:0x0070, B:41:0x0077, B:42:0x007c, B:47:0x00c7, B:17:0x002b, B:29:0x004d, B:7:0x0013), top: B:52:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x00c5, TryCatch #1 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x001a, B:11:0x001d, B:12:0x001e, B:13:0x001f, B:15:0x0027, B:16:0x002a, B:18:0x0032, B:21:0x0035, B:22:0x0036, B:23:0x0037, B:25:0x003e, B:27:0x0049, B:28:0x004c, B:30:0x0054, B:33:0x0057, B:34:0x0058, B:35:0x0059, B:37:0x0061, B:38:0x0068, B:40:0x0070, B:41:0x0077, B:42:0x007c, B:47:0x00c7, B:17:0x002b, B:29:0x004d, B:7:0x0013), top: B:52:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000a, B:6:0x0012, B:8:0x001a, B:11:0x001d, B:12:0x001e, B:13:0x001f, B:15:0x0027, B:16:0x002a, B:18:0x0032, B:21:0x0035, B:22:0x0036, B:23:0x0037, B:25:0x003e, B:27:0x0049, B:28:0x004c, B:30:0x0054, B:33:0x0057, B:34:0x0058, B:35:0x0059, B:37:0x0061, B:38:0x0068, B:40:0x0070, B:41:0x0077, B:42:0x007c, B:47:0x00c7, B:17:0x002b, B:29:0x004d, B:7:0x0013), top: B:52:0x000a, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private C38940l1(@j.N android.content.Context r17, @j.N com.yandex.metrica.impl.ob.A3 r18, @j.N com.yandex.metrica.f r19, @j.N com.yandex.metrica.impl.ob.T1 r20, @j.N com.yandex.metrica.impl.ob.A0 r21) {
        /*
            r16 = this;
            r0 = r19
            com.yandex.metrica.impl.ob.Q1 r5 = new com.yandex.metrica.impl.ob.Q1
            com.yandex.metrica.CounterConfiguration r1 = new com.yandex.metrica.CounterConfiguration
            r1.<init>()
            monitor-enter(r1)
            java.lang.String r2 = r0.apiKey     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = com.yandex.metrica.impl.ob.A2.a(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L1f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc5
            android.content.ContentValues r3 = r1.f377493b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "CFG_API_KEY"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            goto L1f
        L1c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        L1f:
            java.lang.Integer r2 = r0.sessionTimeout     // Catch: java.lang.Throwable -> Lc5
            boolean r3 = com.yandex.metrica.impl.ob.A2.a(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == 0) goto L37
            r2.intValue()     // Catch: java.lang.Throwable -> Lc5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc5
            android.content.ContentValues r3 = r1.f377493b     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "CFG_SESSION_TIMEOUT"
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            goto L37
        L34:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        L37:
            r2 = 0
            boolean r3 = com.yandex.metrica.impl.ob.A2.a(r2)     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto Lc7
            r1.f(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Boolean r3 = r0.logs     // Catch: java.lang.Throwable -> Lc5
            boolean r4 = com.yandex.metrica.impl.ob.A2.a(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto L59
            r3.getClass()     // Catch: java.lang.Throwable -> Lc5
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lc5
            android.content.ContentValues r4 = r1.f377493b     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "CFG_IS_LOG_ENABLED"
            r4.put(r6, r3)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            goto L59
        L56:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        L59:
            java.lang.Boolean r3 = r0.statisticsSending     // Catch: java.lang.Throwable -> Lc5
            boolean r4 = com.yandex.metrica.impl.ob.A2.a(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto L68
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lc5
            r1.i(r3)     // Catch: java.lang.Throwable -> Lc5
        L68:
            java.lang.Integer r3 = r0.maxReportsInDatabaseCount     // Catch: java.lang.Throwable -> Lc5
            boolean r4 = com.yandex.metrica.impl.ob.A2.a(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto L77
            android.content.ContentValues r4 = r1.f377493b     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r6 = "MAX_REPORTS_IN_DB_COUNT"
            r4.put(r6, r3)     // Catch: java.lang.Throwable -> Lc5
        L77:
            java.lang.String r3 = r0.apiKey     // Catch: java.lang.Throwable -> Lc5
            r1.h(r3)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = r0.userProfileID
            r4 = r18
            r5.<init>(r4, r1, r3)
            com.yandex.metrica.impl.ob.P r1 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.bm r7 = r1.j()
            com.yandex.metrica.impl.ob.Zg r8 = new com.yandex.metrica.impl.ob.Zg
            r8.<init>()
            com.yandex.metrica.impl.ob.Yg r9 = new com.yandex.metrica.impl.ob.Yg
            r9.<init>(r2, r2)
            com.yandex.metrica.impl.ob.X6 r10 = new com.yandex.metrica.impl.ob.X6
            r10.<init>()
            com.yandex.metrica.impl.ob.S6 r11 = new com.yandex.metrica.impl.ob.S6
            r11.<init>()
            com.yandex.metrica.impl.ob.M6 r12 = new com.yandex.metrica.impl.ob.M6
            r12.<init>()
            com.yandex.metrica.impl.ob.K6 r13 = new com.yandex.metrica.impl.ob.K6
            r13.<init>()
            com.yandex.metrica.impl.ob.s6 r14 = new com.yandex.metrica.impl.ob.s6
            r6 = r21
            r14.<init>(r6)
            com.yandex.metrica.impl.ob.P r1 = com.yandex.metrica.impl.ob.P.g()
            com.yandex.metrica.impl.ob.zg r15 = r1.k()
            r1 = r16
            r2 = r17
            r3 = r20
            r4 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        Lc5:
            r0 = move-exception
            goto Lc8
        Lc7:
            throw r2     // Catch: java.lang.Throwable -> Lc5
        Lc8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38940l1.<init>(android.content.Context, com.yandex.metrica.impl.ob.A3, com.yandex.metrica.f, com.yandex.metrica.impl.ob.T1, com.yandex.metrica.impl.ob.A0):void");
    }

    @j.k0
    public C38940l1(Context context, T1 t12, @j.N com.yandex.metrica.f fVar, Q1 q12, @j.N A0 a02, @j.N InterfaceC38712bm interfaceC38712bm, @j.N Zg zg2, @j.N Yg yg2, @j.N X6 x62, @j.N S6 s62, @j.N M6 m62, @j.N K6 k62, @j.N C39116s6 c39116s6, @j.N C39294zg c39294zg) {
        super(context, t12, q12, a02, interfaceC38712bm, zg2.a(t12.b(), fVar.apiKey, false), yg2, x62, s62, m62, k62, c39116s6);
        c39294zg.a(fVar.apiKey, new Ag(fVar, t12));
    }
}
