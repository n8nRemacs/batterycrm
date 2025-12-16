package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hsh implements cw7 {
    public final ew7 a;
    public final k18 b;
    public final k18 c;
    public final Set d;
    public final pv0 e;
    public clh f;

    public hsh(ew7 ew7Var, k18 k18Var, k18 k18Var2) {
        this.a = ew7Var;
        this.b = k18Var;
        this.c = k18Var2;
        zg5 zg5Var = dsh.X;
        ArrayList arrayList = new ArrayList(we3.q(zg5Var, 10));
        f2 f2Var = new f2(0, zg5Var);
        while (f2Var.hasNext()) {
            arrayList.add(((dsh) f2Var.next()).a);
        }
        this.d = ue3.h0(arrayList);
        this.e = gzi.a(0, 0, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (f(r19, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        r2 = r17;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (e(r19, r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.cw7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsh.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.cw7
    public final pv0 b() {
        return this.e;
    }

    @Override // defpackage.cw7
    public final Set c() {
        return this.d;
    }

    @Override // defpackage.cw7
    public final void d(clh clhVar) {
        this.f = clhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r12, defpackage.q44 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.fsh
            if (r0 == 0) goto L14
            r0 = r13
            fsh r0 = (defpackage.fsh) r0
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
            fsh r0 = new fsh
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.o
            int r0 = r6.Y
            qqg r7 = defpackage.qqg.a
            r8 = 0
            r1 = 1
            r9 = 2
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L37
            if (r0 != r9) goto L2f
            defpackage.g8j.b(r13)
            return r7
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            hsh r12 = r6.d
            defpackage.g8j.b(r13)
            goto L93
        L3d:
            defpackage.g8j.b(r13)
            ew7 r13 = r11.a
            k18 r0 = r11.c
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            xh3 r2 = (defpackage.xh3) r2
            yv7 r3 = new yv7
            bw7 r0 = new bw7
            java.lang.String r4 = "json_decode_error"
            r0.<init>(r4, r9)
            r3.<init>(r0)
            r13.getClass()     // Catch: java.lang.IllegalArgumentException -> L66
            ysh r0 = defpackage.zsh.Companion     // Catch: java.lang.IllegalArgumentException -> L66
            zy7 r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L66
            java.lang.Object r12 = r13.a(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L66
            r13 = r11
            goto L95
        L66:
            r0 = move-exception
            r12 = r0
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "json parse error at: "
            r0.<init>(r4)
            dsh r4 = defpackage.dsh.c
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            defpackage.wqi.e(r13, r0, r12)
            r6.d = r11
            r6.Y = r1
            r1 = r2
            pv0 r2 = r11.e
            r5 = 0
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r10) goto L92
            goto Lad
        L92:
            r12 = r11
        L93:
            r13 = r12
            r12 = r8
        L95:
            zsh r12 = (defpackage.zsh) r12
            if (r12 != 0) goto L9a
            goto Lae
        L9a:
            pv0 r13 = r13.e
            bsh r0 = new bsh
            java.lang.String r12 = r12.a
            r0.<init>(r12)
            r6.d = r8
            r6.Y = r9
            java.lang.Object r12 = r13.h(r0, r6)
            if (r12 != r10) goto Lae
        Lad:
            return r10
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsh.e(java.lang.String, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r12, defpackage.q44 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gsh
            if (r0 == 0) goto L14
            r0 = r13
            gsh r0 = (defpackage.gsh) r0
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
            gsh r0 = new gsh
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.o
            int r0 = r6.Y
            qqg r7 = defpackage.qqg.a
            r8 = 0
            r1 = 1
            r9 = 2
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L3d
            if (r0 == r1) goto L37
            if (r0 != r9) goto L2f
            defpackage.g8j.b(r13)
            return r7
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            hsh r12 = r6.d
            defpackage.g8j.b(r13)
            goto L93
        L3d:
            defpackage.g8j.b(r13)
            ew7 r13 = r11.a
            k18 r0 = r11.c
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            xh3 r2 = (defpackage.xh3) r2
            yv7 r3 = new yv7
            bw7 r0 = new bw7
            java.lang.String r4 = "json_decode_error"
            r0.<init>(r4, r9)
            r3.<init>(r0)
            r13.getClass()     // Catch: java.lang.IllegalArgumentException -> L66
            bth r0 = defpackage.cth.Companion     // Catch: java.lang.IllegalArgumentException -> L66
            zy7 r0 = r0.serializer()     // Catch: java.lang.IllegalArgumentException -> L66
            java.lang.Object r12 = r13.a(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L66
            r13 = r11
            goto L95
        L66:
            r0 = move-exception
            r12 = r0
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "json parse error at: "
            r0.<init>(r4)
            dsh r4 = defpackage.dsh.d
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            defpackage.wqi.e(r13, r0, r12)
            r6.d = r11
            r6.Y = r1
            r1 = r2
            pv0 r2 = r11.e
            r5 = 0
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r10) goto L92
            goto Lad
        L92:
            r12 = r11
        L93:
            r13 = r12
            r12 = r8
        L95:
            cth r12 = (defpackage.cth) r12
            if (r12 != 0) goto L9a
            goto Lae
        L9a:
            pv0 r13 = r13.e
            ash r0 = new ash
            java.lang.String r12 = r12.a
            r0.<init>(r12)
            r6.d = r8
            r6.Y = r9
            java.lang.Object r12 = r13.h(r0, r6)
            if (r12 != r10) goto Lae
        Lad:
            return r10
        Lae:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsh.f(java.lang.String, q44):java.lang.Object");
    }
}
