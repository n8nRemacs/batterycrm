package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t36 extends dtf implements sm6 {
    public final /* synthetic */ tid X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ x74 t0;
    public final /* synthetic */ sac u0;
    public final /* synthetic */ Object v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t36(tid tidVar, long j, long j2, long j3, x74 x74Var, sac sacVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.X = tidVar;
        this.Y = j;
        this.Z = j2;
        this.s0 = j3;
        this.t0 = x74Var;
        this.u0 = sacVar;
        this.v0 = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((t36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new t36(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (defpackage.svi.i(r9.t0, r10, r9) == r4) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.o
            tid r1 = r9.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r10)
            goto L61
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            defpackage.g8j.b(r10)
            goto L2f
        L1e:
            defpackage.g8j.b(r10)
            long r5 = r1.a
            long r7 = r9.Y
            long r5 = r5 - r7
            r9.o = r3
            java.lang.Object r10 = defpackage.s8j.c(r5, r9)
            if (r10 != r4) goto L2f
            goto L60
        L2f:
            long r5 = r9.Z
            long r7 = r1.a
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L61
            int r10 = defpackage.s65.d
            long r5 = java.lang.System.nanoTime()
            y65 r10 = defpackage.y65.NANOSECONDS
            long r5 = defpackage.v9j.i(r5, r10)
            long r5 = defpackage.s65.g(r5)
            long r7 = r9.s0
            long r5 = r5 + r7
            r1.a = r5
            s36 r10 = new s36
            java.lang.Object r0 = r9.v0
            r1 = 0
            sac r3 = r9.u0
            r10.<init>(r3, r0, r1)
            r9.o = r2
            x74 r0 = r9.t0
            java.lang.Object r10 = defpackage.svi.i(r0, r10, r9)
            if (r10 != r4) goto L61
        L60:
            return r4
        L61:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t36.n(java.lang.Object):java.lang.Object");
    }
}
