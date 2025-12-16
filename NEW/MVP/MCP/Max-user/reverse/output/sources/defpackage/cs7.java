package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cs7 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ ds7 Y;
    public final /* synthetic */ erc Z;
    public tcf o;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ int t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs7(ds7 ds7Var, erc ercVar, boolean z, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = ds7Var;
        this.Z = ercVar;
        this.s0 = z;
        this.t0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cs7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cs7(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r1.a(r10, r9) == r0) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r9.X
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            defpackage.g8j.b(r10)
            goto L6e
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            tcf r1 = r9.o
            defpackage.g8j.b(r10)
            goto L63
        L1f:
            defpackage.g8j.b(r10)
            ds7 r10 = r9.Y
            java.lang.String r10 = r10.o
            erc r1 = r9.Z
            l6b r5 = defpackage.wqi.a
            if (r5 != 0) goto L2d
            goto L46
        L2d:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto L46
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Start getting qr code for type: "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r5.c(r6, r10, r1, r2)
        L46:
            ds7 r10 = r9.Y
            tcf r1 = r10.X
            k18 r10 = r10.c
            java.lang.Object r10 = r10.getValue()
            zt6 r10 = (defpackage.zt6) r10
            erc r5 = r9.Z
            boolean r6 = r9.s0
            int r7 = r9.t0
            r9.o = r1
            r9.X = r4
            java.lang.Object r10 = r10.b(r5, r6, r7, r9)
            if (r10 != r0) goto L63
            goto L6d
        L63:
            r9.o = r2
            r9.X = r3
            java.lang.Object r10 = r1.a(r10, r9)
            if (r10 != r0) goto L6e
        L6d:
            return r0
        L6e:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs7.n(java.lang.Object):java.lang.Object");
    }
}
