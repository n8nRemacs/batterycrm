package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cg2 extends dtf implements sm6 {
    public final /* synthetic */ qg2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg2(qg2 qg2Var, Continuation continuation) {
        super(2, continuation);
        this.X = qg2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cg2 cg2Var = (cg2) l((r85) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cg2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cg2 cg2Var = new cg2(this.X, continuation);
        cg2Var.o = obj;
        return cg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r11.o
            r85 r12 = (defpackage.r85) r12
            qg2 r0 = r11.X
            yy7[] r1 = defpackage.qg2.F
            xec r2 = new xec
            java.lang.String r3 = r12.a
            long r4 = r12.b
            java.lang.String r6 = r12.d
            java.lang.CharSequence r7 = r12.c
            tcf r12 = r0.i
            java.lang.Object r12 = r12.getValue()
            r85 r12 = (defpackage.r85) r12
            r1 = 0
            if (r12 == 0) goto L30
            tcf r8 = r0.j
            java.lang.Object r8 = r8.getValue()
            e95 r8 = (defpackage.e95) r8
            boolean r12 = r12.a(r8)
            r8 = 1
            if (r12 != r8) goto L30
            goto L31
        L30:
            r8 = r1
        L31:
            boolean r9 = r0.p
            r10 = 1
            r2.<init>(r3, r4, r6, r7, r8, r9, r10)
            u85 r12 = r0.f()
            java.util.List r12 = r12.a(r0)
            tcf r1 = r0.b
        L41:
            java.lang.Object r3 = r1.getValue()
            r4 = r3
            xec r4 = (defpackage.xec) r4
            boolean r3 = r1.c(r3, r2)
            if (r3 == 0) goto L41
            tcf r3 = r0.c
        L50:
            java.lang.Object r0 = r3.getValue()
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r3.c(r0, r12)
            if (r0 == 0) goto L50
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg2.n(java.lang.Object):java.lang.Object");
    }
}
