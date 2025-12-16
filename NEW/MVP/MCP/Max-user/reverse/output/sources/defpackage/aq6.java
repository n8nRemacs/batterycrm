package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aq6 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ tq6 Y;
    public final /* synthetic */ vo6 Z;
    public List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq6(tq6 tq6Var, vo6 vo6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = tq6Var;
        this.Z = vo6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aq6(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            tq6 r0 = r14.Y
            tcf r1 = r0.v0
            de8 r2 = r0.o
            tcf r3 = r0.y0
            int r4 = r14.X
            java.lang.String r5 = "tq6"
            r6 = 3
            r7 = 2
            r8 = 1
            qqg r9 = defpackage.qqg.a
            vo6 r10 = r14.Z
            r11 = 0
            g84 r12 = defpackage.g84.a
            if (r4 == 0) goto L37
            if (r4 == r8) goto L33
            if (r4 == r7) goto L2d
            if (r4 != r6) goto L25
            java.util.List r0 = r14.o
            defpackage.g8j.b(r15)
            goto Lb0
        L25:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L2d:
            java.util.List r2 = r14.o
            defpackage.g8j.b(r15)
            goto L90
        L33:
            defpackage.g8j.b(r15)
            goto L77
        L37:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r3.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L47
            goto L9b
        L47:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r4 = "start fetch medias for "
            r15.<init>(r4)
            r15.append(r10)
            java.lang.String r15 = r15.toString()
            defpackage.wqi.d(r5, r15)
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r3.m(r11, r15)
            uo6 r15 = r10.a
            r4 = r2
            bj7 r4 = (defpackage.bj7) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.z0
            java.lang.Object r15 = r4.get(r15)
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto L6e
            hd5 r15 = defpackage.hd5.a
        L6e:
            r14.X = r8
            java.lang.Object r15 = defpackage.tq6.t(r0, r15, r14)
            if (r15 != r12) goto L77
            goto Lae
        L77:
            java.util.List r15 = (java.util.List) r15
            r1.setValue(r15)
            qp6 r4 = r0.x0
            int r4 = r4.b
            r14.o = r15
            r14.X = r7
            bj7 r2 = (defpackage.bj7) r2
            java.lang.Object r2 = r2.c(r10, r4, r14)
            if (r2 != r12) goto L8d
            goto Lae
        L8d:
            r13 = r2
            r2 = r15
            r15 = r13
        L90:
            ce8 r15 = (defpackage.ce8) r15
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.m(r11, r4)
            boolean r3 = r15 instanceof defpackage.ae8
            if (r3 == 0) goto L9c
        L9b:
            return r9
        L9c:
            boolean r3 = r15 instanceof defpackage.be8
            if (r3 == 0) goto Lcb
            be8 r15 = (defpackage.be8) r15
            java.util.List r15 = r15.a
            r14.o = r2
            r14.X = r6
            java.lang.Object r15 = defpackage.tq6.t(r0, r15, r14)
            if (r15 != r12) goto Laf
        Lae:
            return r12
        Laf:
            r0 = r2
        Lb0:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r15 = defpackage.ue3.T(r0, r15)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "finish fetch medias for "
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            defpackage.wqi.d(r5, r0)
            r1.m(r11, r15)
            return r9
        Lcb:
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq6.n(java.lang.Object):java.lang.Object");
    }
}
