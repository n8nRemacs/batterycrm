package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vbc implements nbc {
    public final boolean X;
    public final tcf Y;
    public final hbd Z;
    public final long a;
    public final k18 b;
    public final k18 c;
    public final sxd d;
    public final klc o;
    public final kbc s0;

    public vbc(long j) {
        this.a = j;
        fdc fdcVar = fdc.a;
        this.b = fdcVar.a();
        this.c = fdcVar.d();
        z7c z7cVar = (z7c) fdcVar.getAccessor().c(32);
        this.d = fdcVar.g();
        this.o = (klc) fdcVar.getAccessor().c(110);
        this.X = z7cVar.a.s() == j;
        tcf tcfVarA = ucf.a(hd5.a);
        this.Y = tcfVarA;
        this.Z = new hbd(tcfVarA);
        this.s0 = kbc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r9 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r9 == r6) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a8 -> B:31:0x00ab). Please report as a decompilation issue!!! */
    @Override // defpackage.nbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.q44 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.sbc
            if (r0 == 0) goto L13
            r0 = r9
            sbc r0 = (defpackage.sbc) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sbc r0 = new sbc
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            int r1 = r0.Y
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            vbc r1 = r0.d
            defpackage.g8j.b(r9)
            goto Lab
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            vbc r1 = r0.d
            defpackage.g8j.b(r9)
            goto L6b
        L3f:
            vbc r1 = r0.d
            defpackage.g8j.b(r9)
            goto L54
        L45:
            defpackage.g8j.b(r9)
            r0.d = r8
            r0.Y = r4
            java.lang.Object r9 = r8.f(r0)
            if (r9 != r6) goto L53
            goto Laa
        L53:
            r1 = r8
        L54:
            cbc r9 = (defpackage.cbc) r9
            tcf r4 = r1.Y
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r4.m(r5, r9)
            r0.d = r1
            r0.Y = r3
            r9 = 0
            java.io.Serializable r9 = r1.d(r9, r0)
            if (r9 != r6) goto L6b
            goto Laa
        L6b:
            imb r9 = (defpackage.imb) r9
            java.lang.Object r3 = r9.a
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = r9.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            tcf r4 = r1.Y
            java.lang.Object r7 = r4.getValue()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r3 = defpackage.ue3.T(r7, r3)
            r4.m(r5, r3)
        L88:
            tcf r3 = r1.Y
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            if (r4 >= r9) goto Lc9
            java.lang.Object r9 = r3.getValue()
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.size()
            r0.d = r1
            r0.Y = r2
            java.io.Serializable r9 = r1.d(r9, r0)
            if (r9 != r6) goto Lab
        Laa:
            return r6
        Lab:
            imb r9 = (defpackage.imb) r9
            java.lang.Object r3 = r9.a
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r9 = r9.b
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            tcf r4 = r1.Y
            java.lang.Object r7 = r4.getValue()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r3 = defpackage.ue3.T(r7, r3)
            r4.m(r5, r3)
            goto L88
        Lc9:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbc.a(q44):java.lang.Object");
    }

    @Override // defpackage.nbc
    public final List b(boolean z) {
        o98 o98VarD = ve3.d();
        o98VarD.add(fbc.d);
        o98VarD.add(fbc.o);
        if (this.X) {
            if (!z) {
                o98VarD.add(fbc.X);
            }
            o98VarD.add(fbc.Y);
        }
        return ve3.a(o98VarD);
    }

    @Override // defpackage.nbc
    public final hbd c() {
        return this.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(int r7, defpackage.q44 r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbc.d(int, q44):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bb  */
    @Override // defpackage.nbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fbc r17, defpackage.cbc r18, java.lang.String r19, boolean r20, defpackage.ts9 r21, defpackage.q44 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbc.e(fbc, cbc, java.lang.String, boolean, ts9, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.q44 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ubc
            if (r0 == 0) goto L13
            r0 = r8
            ubc r0 = (defpackage.ubc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ubc r0 = new ubc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.X
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 != r4) goto L27
            defpackage.g8j.b(r8)
            goto L4b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.g8j.b(r8)
            long r5 = r7.a
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 == 0) goto L4e
            k18 r8 = r7.c
            java.lang.Object r8 = r8.getValue()
            l24 r8 = (defpackage.l24) r8
            r0.X = r4
            java.lang.Comparable r8 = r8.b(r5, r0)
            g84 r0 = defpackage.g84.a
            if (r8 != r0) goto L4b
            return r0
        L4b:
            ku3 r8 = (defpackage.ku3) r8
            goto L4f
        L4e:
            r8 = 0
        L4f:
            if (r8 == 0) goto Lc1
            aw3 r8 = r8.a
            zv3 r8 = r8.b
            o98 r0 = defpackage.ve3.d()
            zg5 r1 = defpackage.ll0.a
            wp8 r2 = new wp8
            r3 = 1
            r2.<init>(r3, r1)
            java.util.Iterator r1 = r2.iterator()
        L65:
            r2 = r1
            eqd r2 = (defpackage.eqd) r2
            java.util.ListIterator r2 = r2.b
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto Lb5
            java.lang.Object r2 = r2.previous()
            il0 r2 = (defpackage.il0) r2
            il0 r3 = defpackage.il0.a
            int r3 = r2.compareTo(r3)
            if (r3 < 0) goto L65
            il0 r3 = defpackage.il0.o
            int r3 = r2.compareTo(r3)
            if (r3 > 0) goto L65
            java.lang.String r3 = r8.d
            java.lang.String r4 = r8.c
            hl0 r5 = defpackage.hl0.b
            java.lang.String r3 = defpackage.xui.a(r3, r2, r5)
            if (r3 == 0) goto L95
            r0.add(r3)
        L95:
            java.lang.String r3 = r8.d
            hl0 r6 = defpackage.hl0.a
            java.lang.String r3 = defpackage.xui.a(r3, r2, r6)
            if (r3 == 0) goto La2
            r0.add(r3)
        La2:
            java.lang.String r3 = defpackage.xui.a(r4, r2, r5)
            if (r3 == 0) goto Lab
            r0.add(r3)
        Lab:
            java.lang.String r2 = defpackage.xui.a(r4, r2, r6)
            if (r2 == 0) goto L65
            r0.add(r2)
            goto L65
        Lb5:
            o98 r0 = defpackage.ve3.a(r0)
            cbc r1 = new cbc
            long r2 = r8.e
            r1.<init>(r2, r0)
            return r1
        Lc1:
            cbc r8 = new cbc
            hd5 r0 = defpackage.hd5.a
            r8.<init>(r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vbc.f(q44):java.lang.Object");
    }

    @Override // defpackage.nbc
    public final mbc getTitle() {
        return this.s0;
    }
}
