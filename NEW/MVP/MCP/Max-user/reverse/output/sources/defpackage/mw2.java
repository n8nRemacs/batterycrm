package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mw2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zx2 Y;
    public ra3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mw2(this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (r0.i(r4, r6) == r3) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r7)
            goto L42
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            ra3 r0 = r6.o
            defpackage.g8j.b(r7)
            goto L30
        L1e:
            defpackage.g8j.b(r7)
            zx2 r7 = r6.Y
            ra3 r0 = r7.s0
            r6.o = r0
            r6.X = r2
            java.lang.Object r7 = r7.D(r6)
            if (r7 != r3) goto L30
            goto L41
        L30:
            java.lang.Number r7 = (java.lang.Number) r7
            long r4 = r7.longValue()
            r7 = 0
            r6.o = r7
            r6.X = r1
            java.lang.Object r7 = r0.i(r4, r6)
            if (r7 != r3) goto L42
        L41:
            return r3
        L42:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw2.n(java.lang.Object):java.lang.Object");
    }
}
