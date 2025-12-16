package defpackage;

/* loaded from: classes2.dex */
public final class hx implements wu {
    public static final /* synthetic */ yy7[] o;
    public final long a;
    public final lzf b;
    public final rs4 c;
    public final c47 d;
    public final l4e e;
    public final String f;
    public final k18 g;
    public final k18 h;
    public final k18 i;
    public final k18 j;
    public final k18 k;
    public final k18 l;
    public final bwf m = new bwf(new i6(10, this));
    public final t9f n = c7j.c();

    static {
        z8a z8aVar = new z8a(hx.class, "getReactionsJob", "getGetReactionsJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        o = new yy7[]{z8aVar};
    }

    public hx(long j, lzf lzfVar, rs4 rs4Var, c47 c47Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, l4e l4eVar, k18 k18Var6) {
        this.a = j;
        this.b = lzfVar;
        this.c = rs4Var;
        this.d = c47Var;
        this.e = l4eVar;
        this.f = vb9.e(j, "AsyncMessagesLocalDataSource#");
        this.g = k18Var3;
        this.h = k18Var;
        this.i = k18Var2;
        this.j = k18Var4;
        this.k = k18Var5;
        this.l = k18Var6;
        if (c47Var.e()) {
            svi.e((f84) k18Var6.getValue(), null, null, new zw(k18Var4, this, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (r1 != r4) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [hx, java.lang.Throwable, pb2] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r20, int r22, long r23, defpackage.q44 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx.a(long, int, long, q44):java.lang.Object");
    }

    public final pb2 b() {
        w63 w63Var = (w63) this.h.getValue();
        long j = this.a;
        pb2 pb2Var = (pb2) w63Var.j(j).a.getValue();
        if (pb2Var != null) {
            return pb2Var;
        }
        wqi.q(this.f, "No chat=" + j + " in cache for loaded messages!", new Object[0]);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
    
        if (r1 != r4) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [hx, java.lang.Throwable, pb2] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r20, int r22, long r23, defpackage.q44 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx.c(long, int, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r14, defpackage.q44 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.ax
            if (r0 == 0) goto L13
            r0 = r15
            ax r0 = (defpackage.ax) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ax r0 = new ax
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L41
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.g8j.b(r15)
            return r15
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            java.lang.Object r14 = r0.o
            pb2 r14 = (defpackage.pb2) r14
            hx r2 = r0.d
            defpackage.g8j.b(r15)
            goto Lac
        L41:
            java.lang.Object r14 = r0.o
            java.util.Collection r14 = (java.util.Collection) r14
            hx r2 = r0.d
            defpackage.g8j.b(r15)
            goto L5c
        L4b:
            defpackage.g8j.b(r15)
            r0.d = r13
            r0.o = r14
            r0.Z = r6
            pb2 r15 = r13.b()
            if (r15 != r1) goto L5b
            goto Lba
        L5b:
            r2 = r13
        L5c:
            pb2 r15 = (defpackage.pb2) r15
            if (r15 != 0) goto L63
            hd5 r14 = defpackage.hd5.a
            return r14
        L63:
            java.lang.String r6 = r2.f
            l6b r7 = defpackage.wqi.a
            if (r7 != 0) goto L6a
            goto L92
        L6a:
            lg8 r8 = defpackage.lg8.d
            boolean r9 = r7.b(r8)
            if (r9 == 0) goto L92
            rs4 r9 = r2.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getHistoryItems(ids: "
            r10.<init>(r11)
            r10.append(r14)
            java.lang.String r11 = ", itemType: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = ")"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r7.c(r8, r6, r9, r3)
        L92:
            k18 r6 = r2.j
            java.lang.Object r6 = r6.getValue()
            gx9 r6 = (defpackage.gx9) r6
            r0.d = r2
            r0.o = r15
            r0.Z = r5
            bsd r5 = r6.a
            java.lang.Object r14 = r5.k(r14, r0)
            if (r14 != r1) goto La9
            goto Lba
        La9:
            r12 = r15
            r15 = r14
            r14 = r12
        Lac:
            java.util.List r15 = (java.util.List) r15
            r0.d = r3
            r0.o = r3
            r0.Z = r4
            java.lang.Object r14 = r2.e(r14, r15, r0)
            if (r14 != r1) goto Lbb
        Lba:
            return r1
        Lbb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx.d(java.util.Collection, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x019d, code lost:
    
        if (r2 == r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pb2 r18, java.util.List r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx.e(pb2, java.util.List, q44):java.lang.Object");
    }
}
