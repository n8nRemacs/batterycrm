package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nk7 extends dtf implements sm6 {
    public final /* synthetic */ tid X;
    public final /* synthetic */ qk7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk7(tid tidVar, qk7 qk7Var, Continuation continuation) {
        super(2, continuation);
        this.X = tidVar;
        this.Y = qk7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nk7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nk7(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (defpackage.qk7.a(r3, r9) == r4) goto L18;
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
            r1 = 2
            r2 = 1
            qk7 r3 = r9.Y
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r10)
            goto L6b
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            defpackage.g8j.b(r10)
            goto L5b
        L1e:
            defpackage.g8j.b(r10)
            tid r10 = r9.X
            long r5 = r10.a
            yy7[] r10 = defpackage.qk7.n
            k18 r10 = r3.e
            java.lang.Object r10 = r10.getValue()
            pb3 r10 = (defpackage.pb3) r10
            pe8 r10 = (defpackage.pe8) r10
            fde r0 = r10.O0
            yy7[] r7 = defpackage.pe8.U0
            r8 = 28
            r7 = r7[r8]
            java.lang.Object r10 = r0.D(r10, r7)
            s65 r10 = (defpackage.s65) r10
            long r7 = r10.a
            long r7 = defpackage.s65.g(r7)
            long r7 = r7 + r5
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 >= 0) goto L52
            r7 = r5
        L52:
            r9.o = r2
            java.lang.Object r10 = defpackage.s8j.c(r7, r9)
            if (r10 != r4) goto L5b
            goto L6a
        L5b:
            java.lang.String r10 = r3.d
            java.lang.String r0 = "hide informer by show duration"
            defpackage.wqi.d(r10, r0)
            r9.o = r1
            java.lang.Object r10 = defpackage.qk7.a(r3, r9)
            if (r10 != r4) goto L6b
        L6a:
            return r4
        L6b:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk7.n(java.lang.Object):java.lang.Object");
    }
}
