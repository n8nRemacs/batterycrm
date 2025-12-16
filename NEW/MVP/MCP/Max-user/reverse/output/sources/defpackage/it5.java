package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class it5 extends i3 {
    public static final /* synthetic */ int y0 = 0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final Context c;
    public final z7c d;
    public final lzf o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;

    public it5(Context context, z7c z7cVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, lzf lzfVar) {
        super(k18Var);
        this.c = context;
        this.d = z7cVar;
        this.o = lzfVar;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        this.t0 = k18Var6;
        this.u0 = k18Var7;
        this.v0 = k18Var9;
        this.w0 = k18Var10;
        this.x0 = k18Var11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.at5
            if (r0 == 0) goto L13
            r0 = r7
            at5 r0 = (defpackage.at5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            at5 r0 = new at5
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            g84 r1 = defpackage.g84.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r5 = r0.d
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L63
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            r5 = move-exception
            goto L66
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.g8j.b(r7)
            k18 r7 = r4.X     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            hpa r7 = (defpackage.hpa) r7     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.d = r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.Y = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r7.d(r5, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L63
            return r1
        L4b:
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto L50
            goto L63
        L50:
            lg8 r1 = defpackage.lg8.Y
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L63
            java.lang.String r2 = "failed to delete "
            java.lang.String r5 = defpackage.vb9.e(r5, r2)
            java.lang.String r6 = "it5"
            r0.c(r1, r6, r5, r7)
        L63:
            qqg r5 = defpackage.qqg.a
            return r5
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.L0(long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(defpackage.q44 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.bt5
            if (r0 == 0) goto L13
            r0 = r5
            bt5 r0 = (defpackage.bt5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            bt5 r0 = new bt5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.d
            g84 r1 = defpackage.g84.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L5b
        L27:
            r5 = move-exception
            goto L47
        L29:
            r5 = move-exception
            goto L5e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.g8j.b(r5)
            k18 r5 = r4.X
            java.lang.Object r5 = r5.getValue()
            hpa r5 = (defpackage.hpa) r5
            r0.X = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L5b
            return r1
        L47:
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto L4c
            goto L5b
        L4c:
            lg8 r1 = defpackage.lg8.Y
            boolean r2 = r0.b(r1)
            if (r2 == 0) goto L5b
            java.lang.String r2 = "failed to delete"
            java.lang.String r3 = "it5"
            r0.c(r1, r3, r2, r5)
        L5b:
            qqg r5 = defpackage.qqg.a
            return r5
        L5e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.M0(q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(defpackage.lt5 r8, defpackage.q44 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ct5
            if (r0 == 0) goto L13
            r0 = r9
            ct5 r0 = (defpackage.ct5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ct5 r0 = new ct5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            lt5 r8 = r0.o
            it5 r0 = r0.d
            defpackage.g8j.b(r9)
            goto L61
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.g8j.b(r9)
            long r3 = r8.a
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r1 = 0
            if (r9 == 0) goto L65
            k18 r9 = r7.s0
            java.lang.Object r9 = r9.getValue()
            ve2 r9 = (defpackage.ve2) r9
            long r3 = r8.a
            pb2 r9 = r9.J(r3)
            if (r9 == 0) goto L65
            q7b r1 = r7.P0()
            r0.d = r7
            r0.o = r8
            r0.Z = r2
            java.lang.Object r9 = r1.b(r9, r0)
            g84 r0 = defpackage.g84.a
            if (r9 != r0) goto L60
            return r0
        L60:
            r0 = r7
        L61:
            r1 = r9
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L66
        L65:
            r0 = r7
        L66:
            if (r1 != 0) goto L84
            java.lang.String r9 = r8.d
            if (r9 == 0) goto L84
            int r9 = r9.length()
            if (r9 != 0) goto L73
            goto L84
        L73:
            q7b r9 = r0.P0()
            java.lang.String r0 = r8.d
            long r1 = r8.a
            tka r8 = r9.a()
            android.graphics.Bitmap r8 = r8.i(r0, r1)
            return r8
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.N0(lt5, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(defpackage.n8a r18, defpackage.q44 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.O0(n8a, q44):java.lang.Object");
    }

    public final q7b P0() {
        return (q7b) this.u0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0661, code lost:
    
        if (r15.c != defpackage.ot5.GROUP_CHAT) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0666, code lost:
    
        if (r9 != r16) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0668, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x066a, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x066b, code lost:
    
        if (r10 == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x066d, code lost:
    
        r4.d = r1;
        r4.o = r6;
        r4.X = r3;
        r4.Y = r0;
        r4.Z = r7;
        r4.s0 = r11;
        r4.t0 = r32;
        r4.u0 = r27;
        r4.v0 = r5;
        r4.w0 = r28;
        r4.x0 = r24;
        r14 = r26;
        r4.y0 = r14;
        r4.z0 = r29;
        r4.A0 = r29;
        r4.B0 = r2;
        r4.C0 = r15;
        r4.D0 = r9;
        r4.E0 = null;
        r4.F0 = null;
        r4.G0 = null;
        r4.H0 = r8;
        r4.I0 = r9;
        r9 = r10;
        r4.J0 = r9;
        r4.K0 = r10;
        r56 = r10;
        r4.S0 = 3;
        r10 = r1.T0(r24, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x06bd, code lost:
    
        if (r10 != r13) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x06c1, code lost:
    
        r24 = r11;
        r11 = r29;
        r12 = r29;
        r26 = r3;
        r25 = r7;
        r7 = r9;
        r3 = r0;
        r55 = r1;
        r0 = r24;
        r1 = r10;
        r5 = r9;
        r19 = r5;
        r23 = r32;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0708, code lost:
    
        r8 = (defpackage.lt5) defpackage.to8.c((java.util.Map) r28.getValue(), new java.lang.Long(r9));
        r4.d = r1;
        r4.o = r6;
        r4.X = r3;
        r4.Y = r0;
        r4.Z = r7;
        r4.s0 = r11;
        r4.t0 = r32;
        r9 = r27;
        r4.u0 = r9;
        r4.v0 = r5;
        r4.w0 = r28;
        r4.x0 = r24;
        r4.y0 = r26;
        r4.z0 = r29;
        r4.A0 = r29;
        r4.B0 = r2;
        r4.C0 = r15;
        r4.D0 = r9;
        r4.E0 = r8;
        r4.F0 = null;
        r4.G0 = null;
        r4.H0 = r8;
        r12 = r9;
        r4.I0 = r12;
        r15 = r10;
        r4.J0 = r15;
        r2 = r10;
        r4.K0 = r2;
        r4.S0 = 4;
        r5 = r1.T0(r8, r4);
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0789, code lost:
    
        if (r5 != r8) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x078e, code lost:
    
        r26 = r0;
        r0 = r1;
        r27 = r3;
        r1 = r5;
        r22 = r26;
        r3 = r28;
        r5 = r4;
        r28 = r6;
        r14 = r29;
        r13 = r2;
        r4 = r24;
        r6 = r8;
        r25 = r7;
        r23 = r32;
        r24 = r11;
        r11 = r15;
        r19 = r5;
        r10 = r9;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:171:0x0856, B:173:0x085c], limit reached: 307 */
    /* JADX WARN: Path cross not found for [B:173:0x085c, B:171:0x0856], limit reached: 307 */
    /* JADX WARN: Path cross not found for [B:224:0x099b, B:230:0x09ac], limit reached: 307 */
    /* JADX WARN: Path cross not found for [B:225:0x099e, B:224:0x099b], limit reached: 307 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0a4d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0adf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0566 A[EDGE_INSN: B:284:0x0566->B:115:0x0566 BREAK  A[LOOP:1: B:73:0x03e5->B:289:0x03e5], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a0  */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:237:0x0a1b -> B:238:0x0a3a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Q0(java.util.ArrayList r55, defpackage.n8a r56, defpackage.q44 r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.Q0(java.util.ArrayList, n8a, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(java.util.Set r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gt5
            if (r0 == 0) goto L13
            r0 = r6
            gt5 r0 = (defpackage.gt5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            gt5 r0 = new gt5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            g84 r1 = defpackage.g84.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r6
        L27:
            r5 = move-exception
            goto L4c
        L29:
            r5 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r6)
            k18 r6 = r4.Y     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            mt5 r6 = (defpackage.mt5) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.List r5 = defpackage.ue3.d0(r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.X = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L4b
            return r1
        L4b:
            return r5
        L4c:
            l6b r6 = defpackage.wqi.a
            if (r6 != 0) goto L51
            goto L60
        L51:
            lg8 r0 = defpackage.lg8.Y
            boolean r1 = r6.b(r0)
            if (r1 == 0) goto L60
            java.lang.String r1 = "failed to get notifications history items"
            java.lang.String r2 = "it5"
            r6.c(r0, r2, r1, r5)
        L60:
            hd5 r5 = defpackage.hd5.a
            return r5
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.R0(java.util.Set, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(java.util.List r6, defpackage.q44 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ht5
            if (r0 == 0) goto L13
            r0 = r7
            ht5 r0 = (defpackage.ht5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ht5 r0 = new ht5
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            g84 r1 = defpackage.g84.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L47
        L27:
            r6 = move-exception
            goto L6b
        L29:
            r6 = move-exception
            goto L82
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.g8j.b(r7)
            k18 r7 = r5.Z     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            coa r7 = (defpackage.coa) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.X = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.a(r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            l8a r6 = new l8a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
        L56:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            cna r0 = (defpackage.cna) r0     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            long r1 = r0.a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            long r3 = r0.b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r6.e(r1, r3)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L56
        L6a:
            return r6
        L6b:
            l6b r7 = defpackage.wqi.a
            if (r7 != 0) goto L70
            goto L7f
        L70:
            lg8 r0 = defpackage.lg8.Y
            boolean r1 = r7.b(r0)
            if (r1 == 0) goto L7f
            java.lang.String r1 = "getSystemReadMarks: failed"
            java.lang.String r2 = "it5"
            r7.c(r0, r2, r1, r6)
        L7f:
            l8a r6 = defpackage.wj8.a
            return r6
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it5.S0(java.util.List, q44):java.lang.Object");
    }

    public final Object T0(lt5 lt5Var, ft5 ft5Var) {
        ot5 ot5Var = lt5Var.c;
        long j = lt5Var.f;
        if (zs5.$EnumSwitchMapping$0[ot5Var.ordinal()] != 1) {
            return j != 0 ? U0(lt5Var, ft5Var) : N0(lt5Var, ft5Var);
        }
        if (j != 0) {
            return U0(lt5Var, ft5Var);
        }
        return null;
    }

    public final Object U0(lt5 lt5Var, ft5 ft5Var) {
        ku3 ku3VarI = ((qv3) this.t0.getValue()).i(lt5Var.f, false);
        if (ku3VarI != null) {
            return P0().c(ku3VarI, ft5Var);
        }
        q7b q7bVarP0 = P0();
        String str = lt5Var.e;
        if (str == null) {
            str = "";
        }
        return q7bVarP0.a().i(str, lt5Var.f);
    }
}
