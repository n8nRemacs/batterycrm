package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uw6 extends dtf implements sm6 {
    public final /* synthetic */ vw6 X;
    public final /* synthetic */ k18 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw6(vw6 vw6Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = vw6Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uw6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uw6(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r7.d(r0, r6) == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            vw6 r1 = r6.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r7)
            goto L52
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            defpackage.g8j.b(r7)
            goto L2c
        L1e:
            defpackage.g8j.b(r7)
            mk3 r7 = r1.g
            r6.o = r3
            java.lang.Object r7 = r7.awaitInternal(r6)
            if (r7 != r4) goto L2c
            goto L51
        L2c:
            k18 r7 = r6.Y
            java.lang.Object r7 = r7.getValue()
            age r7 = (defpackage.age) r7
            l5c r7 = (defpackage.l5c) r7
            i3e r0 = r7.o
            h5e r3 = new h5e
            r5 = 0
            r3.<init>(r7, r5)
            m36 r7 = new m36
            r7.<init>(r3, r0)
            tw r0 = new tw
            r3 = 7
            r0.<init>(r3, r1)
            r6.o = r2
            java.lang.Object r7 = r7.d(r0, r6)
            if (r7 != r4) goto L52
        L51:
            return r4
        L52:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw6.n(java.lang.Object):java.lang.Object");
    }
}
