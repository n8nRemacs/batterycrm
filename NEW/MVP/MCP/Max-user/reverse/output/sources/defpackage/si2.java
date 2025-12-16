package defpackage;

/* loaded from: classes2.dex */
public interface si2 {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r14 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b9 -> B:35:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(defpackage.ve2 r13, defpackage.q44 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ei2
            if (r0 == 0) goto L13
            r0 = r14
            ei2 r0 = (defpackage.ei2) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            ei2 r0 = new ei2
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.s0
            int r1 = r0.u0
            r2 = 2
            g84 r3 = defpackage.g84.a
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L3e
            if (r1 != r2) goto L36
            int r13 = r0.Z
            int r1 = r0.Y
            java.lang.Object r6 = r0.o
            long[] r6 = (long[]) r6
            si2 r7 = r0.d
            defpackage.g8j.b(r14)
            goto Lbc
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            n9a r13 = r0.X
            java.lang.Object r1 = r0.o
            ve2 r1 = (defpackage.ve2) r1
            si2 r6 = r0.d
            defpackage.g8j.b(r14)
            r14 = r13
            r13 = r1
            goto L6a
        L4c:
            defpackage.g8j.b(r14)
            o00 r14 = defpackage.ve2.I
            java.lang.String r14 = "ve2"
            java.lang.String r1 = "clearTemporaryChats"
            defpackage.wqi.d(r14, r1)
            n9a r14 = r13.b
            r0.d = r13
            r0.o = r13
            r0.X = r14
            r0.u0 = r4
            java.lang.Object r1 = r14.e(r5, r0)
            if (r1 != r3) goto L69
            goto Lbb
        L69:
            r6 = r13
        L6a:
            n8a r1 = r13.c     // Catch: java.lang.Throwable -> Lbf
            long[] r1 = defpackage.dsi.f(r1)     // Catch: java.lang.Throwable -> Lbf
            n8a r13 = r13.c     // Catch: java.lang.Throwable -> Lbf
            r13.c()     // Catch: java.lang.Throwable -> Lbf
            r14.g(r5)
            int r13 = r1.length
            r14 = 0
            r7 = r6
            r6 = r1
            r1 = r14
        L7d:
            qqg r14 = defpackage.qqg.a
            if (r1 >= r13) goto Lbe
            r8 = r6[r1]
            r0.d = r7
            r0.o = r6
            r0.X = r5
            r0.Y = r1
            r0.Z = r13
            r0.u0 = r2
            r7.getClass()
            r10 = r7
            ve2 r10 = (defpackage.ve2) r10
            r11 = 0
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto Lb9
            java.util.concurrent.ConcurrentHashMap r11 = r10.i
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r8)
            java.lang.Object r8 = r11.get(r12)
            pb2 r8 = (defpackage.pb2) r8
            if (r8 == 0) goto Lb9
            boolean r9 = r8.j0()
            if (r9 != 0) goto Lb9
            long r8 = r8.a
            java.lang.Object r8 = r10.b(r8, r0)
            if (r8 != r3) goto Lb9
            r14 = r8
        Lb9:
            if (r14 != r3) goto Lbc
        Lbb:
            return r3
        Lbc:
            int r1 = r1 + r4
            goto L7d
        Lbe:
            return r14
        Lbf:
            r13 = move-exception
            r14.g(r5)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.a(ve2, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        if (r2.e(null, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012b -> B:65:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object c(defpackage.si2 r12, java.util.List r13, defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.c(si2, java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object d(defpackage.si2 r10, long r11, boolean r13, defpackage.sm6 r14, defpackage.q44 r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.d(si2, long, boolean, sm6, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object f(defpackage.si2 r9, long r10, long r12, defpackage.q44 r14) {
        /*
            qqg r0 = defpackage.qqg.a
            boolean r1 = r14 instanceof defpackage.mi2
            if (r1 == 0) goto L16
            r1 = r14
            mi2 r1 = (defpackage.mi2) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.s0 = r2
        L14:
            r14 = r1
            goto L1c
        L16:
            mi2 r1 = new mi2
            r1.<init>(r9, r14)
            goto L14
        L1c:
            java.lang.Object r1 = r14.Y
            g84 r2 = defpackage.g84.a
            int r3 = r14.s0
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L41
            if (r3 == r6) goto L37
            if (r3 != r5) goto L2f
            defpackage.g8j.b(r1)
            return r0
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r12 = r14.X
            long r10 = r14.o
            si2 r9 = r14.d
            defpackage.g8j.b(r1)
            goto L76
        L41:
            defpackage.g8j.b(r1)
            o00 r1 = defpackage.ve2.I
            l6b r1 = defpackage.wqi.a
            if (r1 != 0) goto L4b
            goto L67
        L4b:
            lg8 r3 = defpackage.lg8.d
            boolean r7 = r1.b(r3)
            if (r7 == 0) goto L67
            java.lang.String r7 = "updateChatLastSearchClickTime: chatId="
            java.lang.String r8 = ", chatSearchClickTime="
            java.lang.StringBuilder r7 = defpackage.az1.l(r10, r7, r8)
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ve2"
            r1.c(r3, r8, r7, r4)
        L67:
            r14.d = r9
            r14.o = r10
            r14.X = r12
            r14.s0 = r6
            java.lang.Object r1 = r9.e(r10, r14)
            if (r1 != r2) goto L76
            goto L9d
        L76:
            sf2 r1 = (defpackage.sf2) r1
            if (r1 == 0) goto L9e
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 == 0) goto L89
            rf2 r1 = r1.b
            long r6 = r1.Y
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 < 0) goto L89
            goto L9e
        L89:
            r6 = r12
            ni2 r13 = new ni2
            r13.<init>(r6, r4)
            r14.d = r4
            r14.s0 = r5
            r9.getClass()
            r12 = 0
            java.lang.Object r9 = d(r9, r10, r12, r13, r14)
            if (r9 != r2) goto L9e
        L9d:
            return r2
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.f(si2, long, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Comparable g(defpackage.ve2 r4, long r5, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ci2
            if (r0 == 0) goto L13
            r0 = r7
            ci2 r0 = (defpackage.ci2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ci2 r0 = new ci2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r5 = r0.d
            ve2 r4 = r0.o
            defpackage.g8j.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.g8j.b(r7)
            r0.o = r4
            r0.d = r5
            r0.Z = r2
            rt7 r7 = r4.l
            java.lang.Object r7 = r7.join(r0)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L45
            goto L47
        L45:
            qqg r7 = defpackage.qqg.a
        L47:
            if (r7 != r0) goto L4a
            return r0
        L4a:
            java.util.concurrent.ConcurrentHashMap r4 = r4.i
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            pb2 r4 = (defpackage.pb2) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.g(ve2, long, q44):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Comparable h(defpackage.ve2 r11, long[] r12, java.lang.String r13, java.lang.String r14, defpackage.q44 r15) {
        /*
            boolean r2 = r15 instanceof defpackage.fi2
            if (r2 == 0) goto L14
            r2 = r15
            fi2 r2 = (defpackage.fi2) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.s0 = r3
        L12:
            r6 = r2
            goto L1a
        L14:
            fi2 r2 = new fi2
            r2.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r6.Y
            g84 r7 = defpackage.g84.a
            int r2 = r6.s0
            r8 = 1
            if (r2 == 0) goto L3a
            if (r2 != r8) goto L32
            java.util.List r1 = r6.X
            ve2 r2 = r6.o
            java.lang.String r3 = r6.d
            defpackage.g8j.b(r0)
            r10 = r2
            r2 = r1
            r1 = r10
            goto L7f
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            defpackage.g8j.b(r0)
            o00 r0 = defpackage.ve2.I
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto L44
            goto L59
        L44:
            lg8 r2 = defpackage.lg8.d
            boolean r3 = r0.b(r2)
            if (r3 == 0) goto L59
            int r4 = r12.length
            java.lang.String r5 = "createMultiChat, contacts.size() = "
            java.lang.String r4 = defpackage.ho7.f(r4, r5)
            r5 = 0
            java.lang.String r9 = "ve2"
            r0.c(r2, r9, r4, r5)
        L59:
            java.util.List r2 = defpackage.ys.C(r12)
            lzf r0 = r11.D
            q2b r0 = (defpackage.q2b) r0
            z74 r9 = r0.b()
            gi2 r0 = new gi2
            r5 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.d = r13
            r6.o = r11
            r6.X = r2
            r6.s0 = r8
            java.lang.Object r0 = defpackage.svi.i(r9, r0, r6)
            if (r0 != r7) goto L7d
            return r7
        L7d:
            r1 = r11
            r3 = r13
        L7f:
            pb2 r0 = (defpackage.pb2) r0
            b10 r4 = new b10
            r4.<init>()
            c10 r5 = defpackage.c10.b
            r4.a = r5
            r5 = 3
            r4.l = r5
            r4.c = r2
            r4.d = r3
            d10 r2 = r4.a()
            long r3 = r0.a
            lge r5 = new lge
            r5.<init>(r3, r2, r8)
            mge r2 = new mge
            r3 = 0
            r2.<init>(r5, r3)
            kz4 r1 = r1.x
            java.lang.Object r1 = r1.get()
            c6i r1 = (defpackage.c6i) r1
            r1.b(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.h(ve2, long[], java.lang.String, java.lang.String, q44):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object j(defpackage.ve2 r10, long r11, defpackage.q44 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.oi2
            if (r0 == 0) goto L13
            r0 = r13
            oi2 r0 = (defpackage.oi2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            oi2 r0 = new oi2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r13)     // Catch: java.lang.Throwable -> L53
            goto L5e
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            defpackage.g8j.b(r13)
            z7c r13 = r10.o     // Catch: java.lang.Throwable -> L53
            pe8 r13 = r13.a     // Catch: java.lang.Throwable -> L53
            long r7 = r13.j()     // Catch: java.lang.Throwable -> L53
            lzf r13 = r10.D     // Catch: java.lang.Throwable -> L53
            q2b r13 = (defpackage.q2b) r13     // Catch: java.lang.Throwable -> L53
            z74 r13 = r13.b()     // Catch: java.lang.Throwable -> L53
            qi2 r3 = new qi2     // Catch: java.lang.Throwable -> L53
            r9 = 0
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r9)     // Catch: java.lang.Throwable -> L53
            r0.X = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r10 = defpackage.svi.i(r13, r3, r0)     // Catch: java.lang.Throwable -> L53
            g84 r11 = defpackage.g84.a
            if (r10 != r11) goto L5e
            return r11
        L53:
            r0 = move-exception
            r10 = r0
            o00 r11 = defpackage.ve2.I
            java.lang.String r11 = "ve2"
            java.lang.String r12 = "updateChatWriteTime fail!"
            defpackage.wqi.e(r11, r12, r10)
        L5e:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.j(ve2, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Comparable k(defpackage.ve2 r4, long r5, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.bi2
            if (r0 == 0) goto L13
            r0 = r7
            bi2 r0 = (defpackage.bi2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            bi2 r0 = new bi2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            long r5 = r0.d
            ve2 r4 = r0.o
            defpackage.g8j.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.g8j.b(r7)
            r0.o = r4
            r0.d = r5
            r0.Z = r2
            rt7 r7 = r4.l
            java.lang.Object r7 = r7.join(r0)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L45
            goto L47
        L45:
            qqg r7 = defpackage.qqg.a
        L47:
            if (r7 != r0) goto L4a
            return r0
        L4a:
            java.util.concurrent.ConcurrentHashMap r4 = r4.h
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            pb2 r4 = (defpackage.pb2) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.k(ve2, long, q44):java.lang.Comparable");
    }

    default Object b(long j, q44 q44Var) {
        ve2 ve2Var = (ve2) this;
        ve2Var.j.remove(new Long(j));
        sf2 sf2Var = (sf2) ve2Var.f.remove(new Long(j));
        n8a n8aVar = ve2Var.c;
        if (sf2Var != null) {
            rf2 rf2Var = sf2Var.b;
            long j2 = rf2Var.l;
            long j3 = rf2Var.a;
            ve2Var.e.remove(new Long(j2));
            ve2Var.d.remove(new Long(rf2Var.l));
            ve2Var.g.remove(new Long(j3));
            n8aVar.l(j3);
        }
        pb2 pb2Var = (pb2) ve2Var.h.remove(new Long(j));
        if (pb2Var != null) {
            rf2 rf2Var2 = pb2Var.b;
            ve2Var.i.remove(new Long(rf2Var2.a));
            n8aVar.l(rf2Var2.a);
        }
        Object objI = svi.i(((q2b) ve2Var.D).b(), new hi2(ve2Var, j, pb2Var, null), q44Var);
        return objI == g84.a ? objI : qqg.a;
    }

    default Object e(long j, q44 q44Var) {
        ve2 ve2Var = (ve2) this;
        sf2 sf2Var = (sf2) ve2Var.f.get(new Long(j));
        return (sf2Var != null || ve2Var.l.isCompleted()) ? sf2Var : ((ie4) ve2Var.m.get()).b.f(j, q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default java.lang.Object i(long r10, boolean r12, defpackage.q44 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ki2
            if (r0 == 0) goto L13
            r0 = r13
            ki2 r0 = (defpackage.ki2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ki2 r0 = new ki2
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r13)
            return r13
        L25:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2d:
            defpackage.g8j.b(r13)
            r13 = r9
            ve2 r13 = (defpackage.ve2) r13
            lzf r13 = r13.D
            q2b r13 = (defpackage.q2b) r13
            z74 r13 = r13.b()
            li2 r3 = new li2
            r8 = 0
            r4 = r9
            r5 = r10
            r7 = r12
            r3.<init>(r4, r5, r7, r8)
            r0.X = r2
            java.lang.Object r10 = defpackage.svi.i(r13, r3, r0)
            g84 r11 = defpackage.g84.a
            if (r10 != r11) goto L4f
            return r11
        L4f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si2.i(long, boolean, q44):java.lang.Object");
    }
}
