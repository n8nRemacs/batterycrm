package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class n15 implements btf {
    public final m2g a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public btf n;
    public volatile int o;
    public volatile long p;
    public volatile int q;
    public volatile c15 s;
    public final bwf t;
    public x6i u;
    public final String m = ho7.f(o15.a.incrementAndGet(), "DownloadFileAttachOperation");
    public final long r = 500;
    public String v = "";

    public n15(m2g m2gVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11) {
        this.a = m2gVar;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        this.g = k18Var6;
        this.h = k18Var7;
        this.i = k18Var8;
        this.j = k18Var9;
        this.k = k18Var10;
        this.l = k18Var11;
        this.t = new bwf(new da1(this, k18Var, k18Var2, 5));
    }

    @Override // defpackage.btf
    public final String a() {
        m2g m2gVar = this.a;
        long j = m2gVar.c;
        if (j > 0) {
            long j2 = m2gVar.a;
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            sb.append(j);
            return sb.toString();
        }
        long j3 = m2gVar.d;
        if (j3 > 0) {
            long j4 = m2gVar.a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j4);
            sb2.append(j3);
            return sb2.toString();
        }
        long j5 = m2gVar.e;
        if (j5 > 0) {
            long j6 = m2gVar.a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j6);
            sb3.append(j5);
            return sb3.toString();
        }
        long j7 = m2gVar.f;
        if (j7 > 0) {
            long j8 = m2gVar.a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j8);
            sb4.append(j7);
            return sb4.toString();
        }
        long j9 = m2gVar.j;
        if (j9 <= 0) {
            throw new AssertionError("DownloadListener.getContext() must return not null value");
        }
        long j10 = m2gVar.a;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(j10);
        sb5.append(j9);
        return sb5.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r25, long r26, long r28, defpackage.q44 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.b(float, long, long, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r13.c(r11) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.q44 r13) {
        /*
            r12 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r13 instanceof defpackage.d15
            if (r1 == 0) goto L16
            r1 = r13
            d15 r1 = (defpackage.d15) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.Y = r2
        L14:
            r11 = r1
            goto L1c
        L16:
            d15 r1 = new d15
            r1.<init>(r12, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r11.o
            g84 r1 = defpackage.g84.a
            int r2 = r11.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            n15 r1 = r11.d
            defpackage.g8j.b(r13)
            goto Lb1
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L39:
            n15 r2 = r11.d
            defpackage.g8j.b(r13)
            goto L5b
        L3f:
            defpackage.g8j.b(r13)
            n25 r13 = defpackage.n25.g
            m25 r2 = defpackage.m25.USER_CANCELLED
            java.lang.String r5 = r12.v
            defpackage.yqb.e(r13, r2, r5)
            btf r13 = r12.n
            if (r13 == 0) goto L5a
            r11.d = r12
            r11.Y = r4
            java.lang.Object r13 = r13.c(r11)
            if (r13 != r1) goto L5a
            goto Laf
        L5a:
            r2 = r12
        L5b:
            java.lang.String r13 = r2.m
            l6b r4 = defpackage.wqi.a
            if (r4 != 0) goto L62
            goto L7e
        L62:
            lg8 r5 = defpackage.lg8.d
            boolean r6 = r4.b(r5)
            if (r6 == 0) goto L7e
            m2g r6 = r2.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "onFileDownloadCancelled: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r4.c(r5, r13, r6, r7)
        L7e:
            m2g r13 = r2.a
            boolean r13 = r13.a()
            if (r13 == 0) goto Lb2
            m2g r13 = r2.a
            boolean r13 = r13.h
            if (r13 == 0) goto Lb2
            p10 r4 = defpackage.p10.b
            int r5 = r2.o
            r11.d = r2
            r11.Y = r3
            qi9 r13 = r2.i()
            m2g r3 = r2.a
            long r6 = r3.a
            si9 r3 = r13.m(r6)
            r10 = 0
            r6 = 0
            r8 = 0
            java.lang.Object r13 = r2.l(r3, r4, r5, r6, r8, r10, r11)
            if (r13 != r1) goto Lac
            goto Lad
        Lac:
            r13 = r0
        Lad:
            if (r13 != r1) goto Lb0
        Laf:
            return r1
        Lb0:
            r1 = r2
        Lb1:
            r2 = r1
        Lb2:
            w05 r13 = defpackage.w05.a
            r2.s = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.c(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.q44 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.f15
            if (r0 == 0) goto L13
            r0 = r9
            f15 r0 = (defpackage.f15) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            f15 r0 = new f15
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n15 r0 = r0.d
            defpackage.g8j.b(r9)
            goto L44
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.g8j.b(r9)
            btf r9 = r8.n
            if (r9 == 0) goto L43
            r0.d = r8
            r0.Y = r3
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r8
        L44:
            java.lang.String r9 = r0.m
            l6b r1 = defpackage.wqi.a
            if (r1 != 0) goto L4b
            goto L67
        L4b:
            lg8 r2 = defpackage.lg8.d
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L67
            m2g r3 = r0.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onFileDownloadFailed: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r4 = 0
            r1.c(r2, r9, r3, r4)
        L67:
            m2g r9 = r0.a
            boolean r9 = r9.h
            if (r9 == 0) goto L88
            k18 r9 = r0.h
            java.lang.Object r9 = r9.getValue()
            tw0 r9 = (defpackage.tw0) r9
            r05 r1 = new r05
            m2g r2 = r0.a
            r4 = r2
            long r2 = r4.o
            java.lang.String r6 = r4.g
            java.lang.String r7 = r4.b
            long r4 = r4.a
            r1.<init>(r2, r4, r6, r7)
            r9.c(r1)
        L88:
            y05 r9 = defpackage.y05.a
            r0.s = r9
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.d(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.q44 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.e(q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r2.f(r1, r14) == r4) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.io.File r27, defpackage.q44 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.f(java.io.File, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r12, boolean r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.g(boolean, boolean, q44):java.lang.Object");
    }

    public final Object h(q44 q44Var) {
        String str = this.m;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "File download. CancelLoading: " + (wqi.a() ? j() : "*****"), null);
            }
        }
        Object objA = ((ctf) this.e.getValue()).a.a(j(), this.a.b, q44Var);
        return objA == g84.a ? objA : qqg.a;
    }

    public final qi9 i() {
        return (qi9) this.c.getValue();
    }

    public final File j() {
        return (File) this.t.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        if (r12.h(r0) != r1) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:17:0x003a, B:39:0x00c9, B:41:0x00cf, B:43:0x00e6, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:51:0x0102, B:53:0x010a, B:55:0x0115, B:57:0x011d, B:59:0x0127, B:61:0x012f, B:63:0x013a, B:22:0x0044, B:32:0x0093, B:34:0x0097, B:36:0x00aa), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:17:0x003a, B:39:0x00c9, B:41:0x00cf, B:43:0x00e6, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:51:0x0102, B:53:0x010a, B:55:0x0115, B:57:0x011d, B:59:0x0127, B:61:0x012f, B:63:0x013a, B:22:0x0044, B:32:0x0093, B:34:0x0097, B:36:0x00aa), top: B:82:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.x6i r12, defpackage.btf r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.k(x6i, btf, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.si9 r22, final defpackage.p10 r23, final int r24, final long r25, final long r27, final java.io.File r29, defpackage.q44 r30) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n15.l(si9, p10, int, long, long, java.io.File, q44):java.lang.Object");
    }
}
