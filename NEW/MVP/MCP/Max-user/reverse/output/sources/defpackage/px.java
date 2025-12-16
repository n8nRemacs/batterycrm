package defpackage;

/* loaded from: classes2.dex */
public final class px implements wu, jkd {
    public final long a;
    public final rs4 b;
    public final m1g c;
    public final a3b d;
    public final qh2 e;
    public final k1a f;
    public final hx g;
    public final l4e h;
    public final String i;
    public f37 j;

    public px(long j, rs4 rs4Var, m1g m1gVar, a3b a3bVar, qh2 qh2Var, k1a k1aVar, hx hxVar, l4e l4eVar) {
        this.a = j;
        this.b = rs4Var;
        this.c = m1gVar;
        this.d = a3bVar;
        this.e = qh2Var;
        this.f = k1aVar;
        this.g = hxVar;
        this.h = l4eVar;
        this.i = vb9.e(j, "AsyncMessagesRemoteDataSource#");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r15, int r17, long r18, defpackage.q44 r20) throws java.io.IOException {
        /*
            r14 = this;
            r1 = r20
            boolean r2 = r1 instanceof defpackage.ox
            if (r2 == 0) goto L16
            r2 = r1
            ox r2 = (defpackage.ox) r2
            int r3 = r2.t0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.t0 = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            ox r2 = new ox
            r2.<init>(r14, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r9.Z
            int r2 = r9.t0
            r10 = 2
            r3 = 1
            g84 r11 = defpackage.g84.a
            if (r2 == 0) goto L49
            if (r2 == r3) goto L38
            if (r2 != r10) goto L30
            px r2 = r9.d
            defpackage.g8j.b(r1)
            goto L7a
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r2 = r9.X
            int r4 = r9.Y
            long r5 = r9.o
            px r7 = r9.d
            defpackage.g8j.b(r1)
            r12 = r5
            r6 = r4
            r4 = r12
            r0 = r7
            r7 = r2
            goto L6c
        L49:
            defpackage.g8j.b(r1)
            r9.d = r14
            r1 = r15
            r9.o = r1
            r4 = r17
            r9.Y = r4
            r7 = r18
            r9.X = r7
            r9.t0 = r3
            r3 = 0
            r5 = 0
            r0 = r14
            java.lang.Object r3 = r0.e(r1, r3, r4, r5, r7, r9)
            if (r3 != r11) goto L66
            goto L78
        L66:
            r0 = r14
            r4 = r15
            r6 = r17
            r7 = r18
        L6c:
            hx r3 = r0.g
            r9.d = r0
            r9.t0 = r10
            java.lang.Object r1 = r3.a(r4, r6, r7, r9)
            if (r1 != r11) goto L79
        L78:
            return r11
        L79:
            r2 = r0
        L7a:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r2.i
            int r2 = r1.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.wqi.d(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.a(long, int, long, q44):java.lang.Object");
    }

    @Override // defpackage.jkd
    public final void b(f37 f37Var) {
        this.j = f37Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r0 == r10) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r12, int r14, long r15, defpackage.q44 r17) throws java.io.IOException {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.nx
            if (r1 == 0) goto L16
            r1 = r0
            nx r1 = (defpackage.nx) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.t0 = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            nx r1 = new nx
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.Z
            int r1 = r8.t0
            r9 = 2
            r2 = 1
            g84 r10 = defpackage.g84.a
            if (r1 == 0) goto L48
            if (r1 == r2) goto L38
            if (r1 != r9) goto L30
            px r12 = r8.d
            defpackage.g8j.b(r0)
            goto L71
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            long r12 = r8.X
            int r1 = r8.Y
            long r2 = r8.o
            px r4 = r8.d
            defpackage.g8j.b(r0)
            r6 = r12
            r5 = r1
            r12 = r4
            r3 = r2
            goto L64
        L48:
            defpackage.g8j.b(r0)
            r8.d = r11
            r8.o = r12
            r8.Y = r14
            r6 = r15
            r8.X = r6
            r8.t0 = r2
            r2 = r11
            r3 = r12
            r5 = r14
            java.lang.Object r0 = defpackage.jkd.f(r2, r3, r5, r6, r8)
            if (r0 != r10) goto L60
            goto L70
        L60:
            r3 = r12
            r5 = r14
            r6 = r15
            r12 = r11
        L64:
            hx r2 = r12.g
            r8.d = r12
            r8.t0 = r9
            java.lang.Object r0 = r2.c(r3, r5, r6, r8)
            if (r0 != r10) goto L71
        L70:
            return r10
        L71:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r12 = r12.i
            int r13 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getMessages: result count: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            defpackage.wqi.d(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.c(long, int, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mx
            if (r0 == 0) goto L13
            r0 = r6
            mx r0 = (defpackage.mx) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mx r0 = new mx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            px r5 = r0.d
            defpackage.g8j.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r6)
            r0.d = r4
            r0.Y = r2
            hx r6 = r4.g
            java.lang.Object r6 = r6.d(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r6 != r5) goto L41
            return r5
        L41:
            r5 = r4
        L42:
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r5.i
            int r0 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getHistoryItems: result count: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.wqi.d(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.d(java.util.Collection, q44):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(5:13|61|(1:67)|68|69)(2:14|15))(8:16|72|17|18|50|57|(5:60|61|(3:63|65|67)|68|69)|59))(1:21))(4:22|(2:24|(9:29|(1:31)|32|(1:34)|35|(1:37)|38|(1:41)|59))|70|71)|42|76|43|44|74|45|46|(4:49|50|57|(0))|59|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0205, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0206, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0208, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r29, int r31, int r32, long r33, long r35, defpackage.q44 r37) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.e(long, int, int, long, long, q44):java.lang.Object");
    }
}
