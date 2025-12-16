package defpackage;

/* loaded from: classes2.dex */
public final class tqc {
    public final k18 a;
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

    public tqc(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = k18Var7;
        this.h = k18Var8;
        this.i = k18Var9;
        this.j = k18Var10;
        this.k = k18Var11;
        this.l = k18Var12;
    }

    public final boolean a() {
        if (((lv4) this.b.getValue()).d()) {
            return true;
        }
        k18 k18Var = this.a;
        if (((lr3) k18Var.getValue()).e()) {
            return true;
        }
        return ((((lr3) k18Var.getValue()).d() && ((lr3) k18Var.getValue()).a().g()) || ((lr3) k18Var.getValue()).c()) ? false : true;
    }

    public final boolean b(long j, long j2) {
        boolean zB = ((fxa) this.k.getValue()).b();
        if (zB) {
            return false;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return true;
        }
        lg8 lg8Var = lg8.X;
        if (!l6bVar.b(lg8Var)) {
            return true;
        }
        l6bVar.c(lg8Var, "tqc", "onMessagePush: skipped (authorized=" + zB + ", chatServerId=" + j + ", messageId=" + j2, null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.lt5 r5, defpackage.ws5 r6, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.qqc
            if (r0 == 0) goto L13
            r0 = r7
            qqc r0 = (defpackage.qqc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            qqc r0 = new qqc
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            goto L4e
        L25:
            r5 = move-exception
            goto L47
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r7)
            k18 r7 = r4.i     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            qpa r7 = (defpackage.qpa) r7     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            r0.X = r2     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r5 = r7.f(r5, r6, r0)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4e
            return r6
        L47:
            java.lang.String r6 = "tqc"
            java.lang.String r7 = "notifyTracker: failed"
            defpackage.wqi.e(r6, r7, r5)
        L4e:
            qqg r5 = defpackage.qqg.a
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.c(lt5, ws5, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        if (r6.b(r8, r2, r4) != r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.lt5 r18, defpackage.ws5 r19, defpackage.q44 r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.d(lt5, ws5, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.kt5 r18, defpackage.q44 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            qqg r3 = defpackage.qqg.a
            boolean r4 = r2 instanceof defpackage.sqc
            if (r4 == 0) goto L1b
            r4 = r2
            sqc r4 = (defpackage.sqc) r4
            int r5 = r4.Z
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.Z = r5
            goto L20
        L1b:
            sqc r4 = new sqc
            r4.<init>(r0, r2)
        L20:
            java.lang.Object r2 = r4.X
            g84 r5 = defpackage.g84.a
            int r6 = r4.Z
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L46
            if (r6 == r9) goto L3e
            if (r6 != r8) goto L36
            tqc r1 = r4.d
            defpackage.g8j.b(r2)
            goto Lc2
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            kt5 r1 = r4.o
            tqc r6 = r4.d
            defpackage.g8j.b(r2)
            goto L9d
        L46:
            defpackage.g8j.b(r2)
            long r10 = r1.a
            long r12 = r1.b
            boolean r2 = r0.b(r10, r12)
            if (r2 == 0) goto L54
            return r3
        L54:
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L59
            goto L79
        L59:
            lg8 r6 = defpackage.lg8.d
            boolean r10 = r2.b(r6)
            if (r10 == 0) goto L79
            long r10 = r1.a
            long r12 = r1.b
            java.lang.String r14 = "onMessageRemovedPush: chatServerId="
            java.lang.String r15 = ", messageId="
            java.lang.StringBuilder r10 = defpackage.az1.l(r10, r14, r15)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "tqc"
            r2.c(r6, r11, r10, r7)
        L79:
            k18 r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            wna r2 = (defpackage.wna) r2
            long r12 = r1.a
            long r14 = r1.b
            r4.d = r0
            r4.o = r1
            r4.Z = r9
            lrd r6 = r2.a
            vna r10 = new vna
            r11 = 0
            r16 = r2
            r10.<init>(r11, r12, r14, r16)
            java.lang.Object r2 = defpackage.k7j.b(r6, r10, r4)
            if (r2 != r5) goto L9c
            goto Lc0
        L9c:
            r6 = r0
        L9d:
            k18 r2 = r6.d
            java.lang.Object r2 = r2.getValue()
            mg4 r2 = (defpackage.mg4) r2
            long r10 = r1.a
            k18 r1 = r6.b
            java.lang.Object r1 = r1.getValue()
            lv4 r1 = (defpackage.lv4) r1
            boolean r1 = r1.d()
            r1 = r1 ^ r9
            r4.d = r6
            r4.o = r7
            r4.Z = r8
            java.lang.Object r1 = r2.b(r10, r1, r4)
            if (r1 != r5) goto Lc1
        Lc0:
            return r5
        Lc1:
            r1 = r6
        Lc2:
            r2 = 0
            boolean r4 = r1.a()
            r1.f(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqc.e(kt5, q44):java.lang.Object");
    }

    public final void f(boolean z, boolean z2) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "tqc", "onPush: callPush=" + z + ", forceConnection=" + z2, null);
            }
        }
        pe8 pe8Var = ((z7c) this.c.getValue()).a;
        pe8Var.J.O(pe8Var, w4e.m0[27], Long.valueOf(System.currentTimeMillis()));
        if (z2) {
            ((z7c) this.c.getValue()).a.A(true);
            ((hwa) this.g.getValue()).B(((lv4) this.b.getValue()).d());
            ((x2g) this.e.getValue()).a();
        }
        ((dd) this.f.getValue()).e("ACTION_FCM_PUSH");
    }
}
