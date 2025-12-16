package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xd6 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ae6 Z;
    public wd6 o;
    public final /* synthetic */ tid s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd6(ae6 ae6Var, tid tidVar, Continuation continuation) {
        super(2, continuation);
        this.Z = ae6Var;
        this.s0 = tidVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xd6) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xd6 xd6Var = new xd6(this.Z, this.s0, continuation);
        xd6Var.Y = obj;
        return xd6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (defpackage.e6j.a(r2, r9, r8) == r5) goto L16;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            ae6 r0 = r8.Z
            tih r1 = r0.X
            int r2 = r8.X
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r2 == 0) goto L26
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.g8j.b(r9)
            goto L69
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            wd6 r1 = r8.o
            java.lang.Object r2 = r8.Y
            sac r2 = (defpackage.sac) r2
            defpackage.g8j.b(r9)
            goto L54
        L26:
            defpackage.g8j.b(r9)
            java.lang.Object r9 = r8.Y
            r2 = r9
            sac r2 = (defpackage.sac) r2
            wd6 r9 = new wd6
            tid r6 = r8.s0
            r7 = 0
            r9.<init>(r6, r7, r2)
            r1.c(r9)
            boolean r1 = r1.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.Y = r2
            r8.o = r9
            r8.X = r4
            r4 = r2
            pac r4 = (defpackage.pac) r4
            pv0 r4 = r4.a
            java.lang.Object r1 = r4.h(r1, r8)
            if (r1 != r5) goto L53
            goto L68
        L53:
            r1 = r9
        L54:
            qn2 r9 = new qn2
            r4 = 17
            r9.<init>(r0, r4, r1)
            r0 = 0
            r8.Y = r0
            r8.o = r0
            r8.X = r3
            java.lang.Object r9 = defpackage.e6j.a(r2, r9, r8)
            if (r9 != r5) goto L69
        L68:
            return r5
        L69:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd6.n(java.lang.Object):java.lang.Object");
    }
}
