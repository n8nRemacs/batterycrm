package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vs2 extends dtf implements sm6 {
    public final /* synthetic */ dt2 X;
    public final /* synthetic */ rs2 Y;
    public final /* synthetic */ bs4 Z;
    public int o;
    public final /* synthetic */ rs2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs2(dt2 dt2Var, rs2 rs2Var, bs4 bs4Var, rs2 rs2Var2, Continuation continuation) {
        super(2, continuation);
        this.X = dt2Var;
        this.Y = rs2Var;
        this.Z = bs4Var;
        this.s0 = rs2Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vs2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vs2(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (defpackage.dt2.a(r1, r5.s0, r5) == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.o
            dt2 r1 = r5.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r6)
            goto L39
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.g8j.b(r6)
            goto L2e
        L1e:
            defpackage.g8j.b(r6)
            r5.o = r3
            rs2 r6 = r5.Y
            bs4 r0 = r5.Z
            java.lang.Object r6 = defpackage.dt2.b(r1, r6, r0, r5)
            if (r6 != r4) goto L2e
            goto L38
        L2e:
            r5.o = r2
            rs2 r6 = r5.s0
            java.lang.Object r6 = defpackage.dt2.a(r1, r6, r5)
            if (r6 != r4) goto L39
        L38:
            return r4
        L39:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs2.n(java.lang.Object):java.lang.Object");
    }
}
