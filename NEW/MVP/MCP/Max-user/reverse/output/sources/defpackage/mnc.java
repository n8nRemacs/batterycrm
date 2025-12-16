package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mnc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mnc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mnc(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r7 == r5) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            pnc r0 = r6.X
            yac r1 = r0.T0
            int r2 = r6.o
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.g8j.b(r7)
            goto L35
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            defpackage.g8j.b(r7)
            goto L2c
        L20:
            defpackage.g8j.b(r7)
            r6.o = r4
            java.lang.Object r7 = r1.A(r6)
            if (r7 != r5) goto L2c
            goto L34
        L2c:
            r6.o = r3
            java.lang.Object r7 = r1.n(r6)
            if (r7 != r5) goto L35
        L34:
            return r5
        L35:
            pb2 r7 = (defpackage.pb2) r7
            if (r7 == 0) goto L47
            ci5 r0 = r0.F0
            vkc r1 = new vkc
            long r2 = r7.a
            pdc r7 = defpackage.pdc.b
            r1.<init>(r2, r7)
            defpackage.xfh.r(r0, r1)
        L47:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnc.n(java.lang.Object):java.lang.Object");
    }
}
