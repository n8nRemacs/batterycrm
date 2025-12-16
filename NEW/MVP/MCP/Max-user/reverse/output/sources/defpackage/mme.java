package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mme extends dtf implements sm6 {
    public final /* synthetic */ tme X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mme(tme tmeVar, Continuation continuation) {
        super(2, continuation);
        this.X = tmeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mme) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mme(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (defpackage.tme.t(r1, r5) == r4) goto L15;
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
            tme r1 = r5.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r6)
            goto L3b
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.g8j.b(r6)
            goto L32
        L1e:
            defpackage.g8j.b(r6)
            lme r6 = new lme
            r0 = 1
            r6.<init>(r1, r0)
            r5.o = r3
            bd5 r0 = defpackage.bd5.a
            java.lang.Object r6 = defpackage.vmi.i(r0, r6, r5)
            if (r6 != r4) goto L32
            goto L3a
        L32:
            r5.o = r2
            java.lang.Object r6 = defpackage.tme.t(r1, r5)
            if (r6 != r4) goto L3b
        L3a:
            return r4
        L3b:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mme.n(java.lang.Object):java.lang.Object");
    }
}
