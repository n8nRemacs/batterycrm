package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iq6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tq6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iq6 iq6Var = new iq6(this.Y, continuation);
        iq6Var.X = obj;
        return iq6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            tq6 r0 = r12.Y
            tcf r1 = r0.y0
            int r2 = r12.o
            r3 = 2
            r4 = 1
            java.lang.String r5 = "tq6"
            qqg r6 = defpackage.qqg.a
            r7 = 0
            g84 r8 = defpackage.g84.a
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            java.lang.Object r1 = r12.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r13)
            goto L98
        L1e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L26:
            java.lang.Object r2 = r12.X
            f84 r2 = (defpackage.f84) r2
            defpackage.g8j.b(r13)
            goto L60
        L2e:
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.X
            f84 r13 = (defpackage.f84) r13
            java.lang.String r2 = "loadMoreItems(): loadingItemsJob start"
            defpackage.wqi.d(r5, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.m(r7, r2)
            tcf r2 = r0.A0
            java.lang.Object r2 = r2.getValue()
            vo6 r2 = (defpackage.vo6) r2
            if (r2 != 0) goto L4a
            goto La0
        L4a:
            de8 r9 = r0.o
            qp6 r10 = r0.x0
            int r10 = r10.b
            r12.X = r13
            r12.o = r4
            bj7 r9 = (defpackage.bj7) r9
            java.lang.Object r2 = r9.c(r2, r10, r12)
            if (r2 != r8) goto L5d
            goto L96
        L5d:
            r11 = r2
            r2 = r13
            r13 = r11
        L60:
            ce8 r13 = (defpackage.ce8) r13
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.m(r7, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "loadMoreItems(): get result "
            r1.<init>(r4)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            defpackage.wqi.d(r5, r1)
            boolean r1 = defpackage.d7j.f(r2)
            if (r1 != 0) goto L7f
            goto La0
        L7f:
            boolean r1 = r13 instanceof defpackage.ae8
            if (r1 == 0) goto L84
            goto La0
        L84:
            boolean r1 = r13 instanceof defpackage.be8
            if (r1 == 0) goto Lb6
            be8 r13 = (defpackage.be8) r13
            java.util.List r13 = r13.a
            r12.X = r2
            r12.o = r3
            java.lang.Object r13 = defpackage.tq6.t(r0, r13, r12)
            if (r13 != r8) goto L97
        L96:
            return r8
        L97:
            r1 = r2
        L98:
            java.util.List r13 = (java.util.List) r13
            boolean r1 = defpackage.d7j.f(r1)
            if (r1 != 0) goto La1
        La0:
            return r6
        La1:
            tcf r0 = r0.v0
            java.lang.Object r1 = r0.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r13 = defpackage.ue3.T(r1, r13)
            r0.m(r7, r13)
            java.lang.String r13 = "loadMoreItems(): loadingItemsJob finish"
            defpackage.wqi.d(r5, r13)
            return r6
        Lb6:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq6.n(java.lang.Object):java.lang.Object");
    }
}
