package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class am2 implements wu {
    public final lzf a;
    public final long b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final Set g;

    public am2(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, lzf lzfVar, long j, Set set) {
        this.a = lzfVar;
        this.b = j;
        this.c = k18Var;
        this.d = k18Var4;
        this.e = k18Var2;
        this.f = k18Var3;
        this.g = fni.a(s00.D0, set) ? ta9.e : fni.a(s00.E0, set) ? ta9.f : fni.a(s00.F0, set) ? ta9.b : fni.a(s00.G0, set) ? ta9.c : fni.a(s00.H0, set) ? ta9.d : fni.a(s00.I0, set) ? ta9.g : fni.a(s00.J0, set) ? ta9.h : ta9.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r1 == r13) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r15, int r17, long r18, defpackage.q44 r20) {
        /*
            r14 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.xl2
            if (r2 == 0) goto L18
            r2 = r1
            xl2 r2 = (defpackage.xl2) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.Z = r3
        L16:
            r11 = r2
            goto L1e
        L18:
            xl2 r2 = new xl2
            r2.<init>(r14, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r11.X
            int r2 = r11.Z
            r12 = 2
            r3 = 1
            g84 r13 = defpackage.g84.a
            if (r2 == 0) goto L46
            if (r2 == r3) goto L3c
            if (r2 != r12) goto L34
            java.lang.Object r0 = r11.d
            java.util.List r0 = (java.util.List) r0
            defpackage.g8j.b(r1)
            goto L86
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            java.util.ArrayList r0 = r11.o
            java.lang.Object r2 = r11.d
            am2 r2 = (defpackage.am2) r2
            defpackage.g8j.b(r1)
            goto L76
        L46:
            defpackage.g8j.b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 <= 0) goto L92
            k18 r2 = r14.d
            java.lang.Object r2 = r2.getValue()
            gx9 r2 = (defpackage.gx9) r2
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            r11.d = r14
            r11.o = r1
            r11.Z = r3
            bsd r3 = r2.a
            long r4 = r14.b
            java.util.Set r8 = r14.g
            r10 = 0
            r6 = r15
            java.lang.Object r0 = r3.p(r4, r6, r8, r9, r10, r11)
            if (r0 != r13) goto L72
            goto L85
        L72:
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r14
        L76:
            java.util.List r1 = (java.util.List) r1
            r11.d = r0
            r3 = 0
            r11.o = r3
            r11.Z = r12
            java.lang.Object r1 = r2.b(r1, r11)
            if (r1 != r13) goto L86
        L85:
            return r13
        L86:
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L91
            r0.addAll(r1)
        L91:
            return r0
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.a(long, int, long, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        if (r11 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r10, defpackage.q44 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.zl2
            if (r0 == 0) goto L13
            r0 = r11
            zl2 r0 = (defpackage.zl2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            zl2 r0 = new zl2
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2b
            defpackage.g8j.b(r11)
            goto L9d
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.util.List r10 = r0.o
            am2 r1 = r0.d
            defpackage.g8j.b(r11)
            goto L56
        L3b:
            defpackage.g8j.b(r11)
            k18 r11 = r9.c
            java.lang.Object r11 = r11.getValue()
            w63 r11 = (defpackage.w63) r11
            r0.d = r9
            r0.o = r10
            r0.Z = r3
            long r5 = r9.b
            java.lang.Object r11 = r11.r(r5, r0)
            if (r11 != r4) goto L55
            goto L9c
        L55:
            r1 = r9
        L56:
            pb2 r11 = (defpackage.pb2) r11
            lzf r3 = r1.a
            q2b r3 = (defpackage.q2b) r3
            z74 r3 = r3.b()
            if (r3 != 0) goto L64
            x74 r3 = r0.b
        L64:
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.d7j.a(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.we3.q(r10, r6)
            r5.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L77:
            boolean r6 = r10.hasNext()
            r7 = 0
            if (r6 == 0) goto L90
            java.lang.Object r6 = r10.next()
            yl2 r8 = new yl2
            r8.<init>(r6, r7, r1, r11)
            r6 = 3
            cs4 r6 = defpackage.svi.b(r3, r7, r8, r6)
            r5.add(r6)
            goto L77
        L90:
            r0.d = r7
            r0.o = r7
            r0.Z = r2
            java.lang.Object r11 = defpackage.hui.b(r5, r0)
            if (r11 != r4) goto L9d
        L9c:
            return r4
        L9d:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r10 = defpackage.ue3.E(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.b(java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r1 == r13) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r15, int r17, long r18, defpackage.q44 r20) {
        /*
            r14 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.wl2
            if (r2 == 0) goto L18
            r2 = r1
            wl2 r2 = (defpackage.wl2) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.Z = r3
        L16:
            r11 = r2
            goto L1e
        L18:
            wl2 r2 = new wl2
            r2.<init>(r14, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r11.X
            int r2 = r11.Z
            r12 = 2
            r3 = 1
            g84 r13 = defpackage.g84.a
            if (r2 == 0) goto L46
            if (r2 == r3) goto L3c
            if (r2 != r12) goto L34
            java.lang.Object r0 = r11.d
            java.util.List r0 = (java.util.List) r0
            defpackage.g8j.b(r1)
            goto L86
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            java.util.ArrayList r0 = r11.o
            java.lang.Object r2 = r11.d
            am2 r2 = (defpackage.am2) r2
            defpackage.g8j.b(r1)
            goto L76
        L46:
            defpackage.g8j.b(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 <= 0) goto L92
            k18 r2 = r14.d
            java.lang.Object r2 = r2.getValue()
            gx9 r2 = (defpackage.gx9) r2
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r0)
            r11.d = r14
            r11.o = r1
            r11.Z = r3
            bsd r3 = r2.a
            long r4 = r14.b
            java.util.Set r8 = r14.g
            r10 = 1
            r6 = r15
            java.lang.Object r0 = r3.p(r4, r6, r8, r9, r10, r11)
            if (r0 != r13) goto L72
            goto L85
        L72:
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r14
        L76:
            java.util.List r1 = (java.util.List) r1
            r11.d = r0
            r3 = 0
            r11.o = r3
            r11.Z = r12
            java.lang.Object r1 = r2.b(r1, r11)
            if (r1 != r13) goto L86
        L85:
            return r13
        L86:
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L91
            r0.addAll(r1)
        L91:
            return r0
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.c(long, int, long, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Collection r10, defpackage.q44 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.vl2
            if (r0 == 0) goto L14
            r0 = r11
            vl2 r0 = (defpackage.vl2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            vl2 r0 = new vl2
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.o
            int r0 = r6.Y
            r7 = 2
            r1 = 1
            g84 r8 = defpackage.g84.a
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L34
            if (r0 != r7) goto L2c
            defpackage.g8j.b(r11)
            return r11
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            am2 r10 = r6.d
            defpackage.g8j.b(r11)
            goto L58
        L3a:
            defpackage.g8j.b(r11)
            k18 r11 = r9.d
            java.lang.Object r11 = r11.getValue()
            gx9 r11 = (defpackage.gx9) r11
            r6.d = r9
            r6.Y = r1
            bsd r1 = r11.a
            long r2 = r9.b
            java.util.Set r5 = r9.g
            r4 = r10
            java.lang.Object r11 = r1.q(r2, r4, r5, r6)
            if (r11 != r8) goto L57
            goto L65
        L57:
            r10 = r9
        L58:
            java.util.List r11 = (java.util.List) r11
            r0 = 0
            r6.d = r0
            r6.Y = r7
            java.lang.Object r10 = r10.b(r11, r6)
            if (r10 != r8) goto L66
        L65:
            return r8
        L66:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.d(java.util.Collection, q44):java.lang.Object");
    }
}
