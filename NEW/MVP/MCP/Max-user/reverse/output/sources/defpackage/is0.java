package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class is0 {
    public final ch2 a;
    public final pb3 b;
    public final d53 c;

    public is0(ch2 ch2Var, pb3 pb3Var, h03 h03Var, lzf lzfVar) {
        this.a = ch2Var;
        this.b = pb3Var;
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).a().limitedParallelism(1, "bottom-bar-counters"));
        gbd gbdVar = new gbd(h03Var.a);
        int i = s65.d;
        this.c = new d53(gw0.C(new m36(new gs0(this, null), gw0.x(zs0.g(gbdVar, v9j.h(1, y65.SECONDS)), new fs0(this, null))), contextScopeA, yve.b, null), 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.is0 r6, defpackage.q44 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.hs0
            if (r0 == 0) goto L13
            r0 = r7
            hs0 r0 = (defpackage.hs0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            hs0 r0 = new hs0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            a23 r6 = r0.o
            is0 r0 = r0.d
            defpackage.g8j.b(r7)
            r1 = r6
            r6 = r0
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.g8j.b(r7)
            a23 r7 = defpackage.a23.a
            ch2 r1 = r6.a
            r0.d = r6
            r0.o = r7
            r0.Z = r2
            java.lang.Object r0 = r1.c(r7)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L49
            return r1
        L49:
            r1 = r7
            r7 = r0
        L4b:
            java.util.List r7 = (java.util.List) r7
            ch2 r0 = r6.a
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r0 = r0.d(r1, r2, r4, r5)
            java.util.ArrayList r7 = defpackage.ue3.T(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L68
            goto L90
        L68:
            java.util.Iterator r7 = r7.iterator()
        L6c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r7.next()
            pb2 r0 = (defpackage.pb2) r0
            rf2 r2 = r0.b
            int r2 = r2.m
            if (r2 <= 0) goto L6c
            pb3 r2 = r6.b
            boolean r0 = r0.Z(r2)
            if (r0 != 0) goto L6c
            int r1 = r1 + 1
            if (r1 < 0) goto L8b
            goto L6c
        L8b:
            defpackage.ve3.o()
            r6 = 0
            throw r6
        L90:
            u84 r6 = new u84
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is0.a(is0, q44):java.lang.Object");
    }
}
