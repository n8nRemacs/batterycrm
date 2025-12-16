package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hq6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tq6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hq6) l((imb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hq6 hq6Var = new hq6(this.Y, continuation);
        hq6Var.X = obj;
        return hq6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r2.h(defpackage.yo6.a, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r2.h(defpackage.zo6.a, r7) == r0) goto L20;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            tq6 r0 = r7.Y
            mp6 r1 = r0.X
            pv0 r2 = r0.C0
            int r3 = r7.o
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            defpackage.g8j.b(r8)
            goto L96
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            defpackage.g8j.b(r8)
            goto L59
        L21:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            imb r8 = (defpackage.imb) r8
            java.lang.Object r3 = r8.a
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r8 = r8.b
            pp6 r8 = (defpackage.pp6) r8
            np6 r6 = defpackage.np6.b
            boolean r6 = defpackage.fni.a(r8, r6)
            if (r6 == 0) goto L6c
            k18 r8 = r0.Z
            java.lang.Object r8 = r8.getValue()
            qsb r8 = (defpackage.qsb) r8
            java.lang.String[] r0 = defpackage.qsb.m
            boolean r8 = r8.c(r0)
            g84 r0 = defpackage.g84.a
            if (r8 == 0) goto L61
            r7.o = r5
            yo6 r8 = defpackage.yo6.a
            java.lang.Object r8 = r2.h(r8, r7)
            if (r8 != r0) goto L59
            goto L6b
        L59:
            ci5 r8 = r1.c
            fp6 r0 = defpackage.fp6.a
            defpackage.xfh.r(r8, r0)
            goto L96
        L61:
            r7.o = r4
            zo6 r8 = defpackage.zo6.a
            java.lang.Object r8 = r2.h(r8, r7)
            if (r8 != r0) goto L96
        L6b:
            return r0
        L6c:
            boolean r2 = r8 instanceof defpackage.op6
            if (r2 == 0) goto L99
            ci5 r1 = r1.c
            hp6 r2 = new hp6
            xo6 r4 = r0.b
            boolean r4 = r4.a
            if (r4 == 0) goto L7c
            int r3 = r3 + (-1)
        L7c:
            hbd r0 = r0.B0
            mcf r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            vo6 r0 = (defpackage.vo6) r0
            uo6 r0 = r0.a
            java.lang.String r0 = r0.b()
            op6 r8 = (defpackage.op6) r8
            vd8 r8 = r8.c
            r2.<init>(r3, r0, r8)
            defpackage.xfh.r(r1, r2)
        L96:
            qqg r8 = defpackage.qqg.a
            return r8
        L99:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq6.n(java.lang.Object):java.lang.Object");
    }
}
