package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class cka {
    public static final /* synthetic */ int h = 0;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final ContextScope g;

    public cka(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, lzf lzfVar, a84 a84Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
        this.g = d7j.a(((q2b) lzfVar).b().limitedParallelism(1, "notif-msg-delayed-logic").plus(a84Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.cka r35, long r36, defpackage.fh9 r38, defpackage.q44 r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cka.a(cka, long, fh9, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r6, defpackage.q44 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.yja
            if (r0 == 0) goto L13
            r0 = r8
            yja r0 = (defpackage.yja) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            yja r0 = new yja
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            int r1 = r0.Z
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.g8j.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            long r6 = r0.o
            cka r1 = r0.d
            defpackage.g8j.b(r8)
            goto L53
        L3a:
            defpackage.g8j.b(r8)
            k18 r8 = r5.a
            java.lang.Object r8 = r8.getValue()
            w63 r8 = (defpackage.w63) r8
            r0.d = r5
            r0.o = r6
            r0.Z = r3
            java.lang.Object r8 = r8.h(r6, r0)
            if (r8 != r4) goto L52
            goto L69
        L52:
            r1 = r5
        L53:
            pb2 r8 = (defpackage.pb2) r8
            if (r8 != 0) goto L6b
            zja r8 = new zja
            r3 = 0
            r8.<init>(r1, r6, r3)
            r0.d = r3
            r0.Z = r2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = defpackage.yei.g(r6, r8, r0)
            if (r6 != r4) goto L6a
        L69:
            return r4
        L6a:
            return r6
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cka.b(long, q44):java.lang.Object");
    }
}
