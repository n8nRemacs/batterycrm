package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ri8 extends dtf implements sm6 {
    public final /* synthetic */ si8 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri8(si8 si8Var, Continuation continuation) {
        super(2, continuation);
        this.X = si8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ri8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ri8(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r6.invoke(r5) == r4) goto L15;
     */
    /* JADX WARN: Type inference failed for: r6v3, types: [dtf, em6] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.o
            si8 r1 = r5.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r6)
            goto L37
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.g8j.b(r6)
            goto L2c
        L1e:
            defpackage.g8j.b(r6)
            qi8 r6 = r1.b
            r5.o = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r4) goto L2c
            goto L36
        L2c:
            dtf r6 = r1.c
            r5.o = r2
            java.lang.Object r6 = r6.invoke(r5)
            if (r6 != r4) goto L37
        L36:
            return r4
        L37:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri8.n(java.lang.Object):java.lang.Object");
    }
}
