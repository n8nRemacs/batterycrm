package defpackage;

/* loaded from: classes2.dex */
public final class ehf {
    public final k18 a;
    public final k18 b;

    public ehf(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static /* synthetic */ Object d(ehf ehfVar, String str, long j, dtf dtfVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            j = 0;
        }
        return ehfVar.c(str2, j, 50, dtfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.bhf
            if (r0 == 0) goto L13
            r0 = r7
            bhf r0 = (defpackage.bhf) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            bhf r0 = new bhf
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r7)
            goto L64
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.g8j.b(r7)
            k18 r7 = r4.a
            java.lang.Object r1 = r7.getValue()
            tef r1 = (defpackage.tef) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.a
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r1 = r1.get(r3)
            jef r1 = (defpackage.jef) r1
            if (r1 != 0) goto L6d
            java.lang.Object r7 = r7.getValue()
            tef r7 = (defpackage.tef) r7
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r5)
            java.util.List r5 = java.util.Collections.singletonList(r1)
            m2f r5 = r7.b(r5)
            r0.X = r2
            java.lang.Object r7 = defpackage.n8j.b(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L64
            return r5
        L64:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = defpackage.ue3.I(r7)
            jef r5 = (defpackage.jef) r5
            return r5
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehf.a(long, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r15, long r16, int r18, defpackage.q44 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehf.b(java.lang.String, long, int, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r11, long r12, int r14, defpackage.q44 r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.dhf
            if (r0 == 0) goto L13
            r0 = r15
            dhf r0 = (defpackage.dhf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            dhf r0 = new dhf
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            ehf r11 = r0.d
            defpackage.g8j.b(r15)     // Catch: java.lang.Throwable -> L27
            goto L55
        L27:
            r0 = move-exception
            r12 = r0
            goto L61
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            defpackage.g8j.b(r15)
            k18 r15 = r10.b     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r15 = r15.getValue()     // Catch: java.lang.Throwable -> L5e
            hwa r15 = (defpackage.hwa) r15     // Catch: java.lang.Throwable -> L5e
            wua r3 = new wua     // Catch: java.lang.Throwable -> L58
            r4 = 3
            r8 = 0
            r9 = r11
            r6 = r12
            r5 = r14
            r3.<init>(r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L58
            r0.d = r10     // Catch: java.lang.Throwable -> L58
            r0.Y = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r15 = r15.F(r3, r0)     // Catch: java.lang.Throwable -> L58
            g84 r11 = defpackage.g84.a
            if (r15 != r11) goto L54
            return r11
        L54:
            r11 = r10
        L55:
            iu r15 = (defpackage.iu) r15     // Catch: java.lang.Throwable -> L27
            goto L66
        L58:
            r0 = move-exception
            r12 = r0
        L5a:
            r11 = r10
            goto L61
        L5c:
            r12 = r11
            goto L5a
        L5e:
            r0 = move-exception
            r11 = r0
            goto L5c
        L61:
            ipd r15 = new ipd
            r15.<init>(r12)
        L66:
            java.lang.Throwable r12 = defpackage.kpd.a(r15)
            if (r12 == 0) goto L7f
            boolean r13 = r12 instanceof java.util.concurrent.CancellationException
            if (r13 != 0) goto L7e
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r13 = "Can't search stickers by query"
            defpackage.wqi.e(r11, r13, r12)
            goto L7f
        L7e:
            throw r12
        L7f:
            boolean r11 = r15 instanceof defpackage.ipd
            if (r11 == 0) goto L84
            r15 = 0
        L84:
            iu r15 = (defpackage.iu) r15
            if (r15 != 0) goto L8b
            ahf r11 = defpackage.ahf.c
            return r11
        L8b:
            ahf r11 = new ahf
            java.util.List r12 = r15.d
            long r13 = r15.X
            r11.<init>(r13, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehf.c(java.lang.String, long, int, q44):java.lang.Object");
    }
}
