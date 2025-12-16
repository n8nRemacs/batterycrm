package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qw2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public final /* synthetic */ int Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw2(zx2 zx2Var, int i, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qw2(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (defpackage.svi.i(r13, r0, r12) != r9) goto L29;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            zx2 r1 = r12.X
            k18 r0 = r1.y0
            int r2 = r12.o
            qqg r7 = defpackage.qqg.a
            r8 = 2
            r3 = 1
            g84 r9 = defpackage.g84.a
            if (r2 == 0) goto L23
            if (r2 == r3) goto L1f
            if (r2 != r8) goto L17
            defpackage.g8j.b(r13)
            goto L95
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            defpackage.g8j.b(r13)
            goto L2f
        L23:
            defpackage.g8j.b(r13)
            r12.o = r3
            java.lang.Object r13 = r1.D(r12)
            if (r13 != r9) goto L2f
            goto L94
        L2f:
            java.lang.Number r13 = (java.lang.Number) r13
            long r2 = r13.longValue()
            int r13 = defpackage.zud.p0
            int r4 = r12.Y
            if (r4 != r13) goto L4c
            java.lang.Object r13 = r0.getValue()
            pb3 r13 = (defpackage.pb3) r13
            w4e r13 = (defpackage.w4e) r13
            long r4 = r13.j()
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
        L4a:
            long r4 = r4 + r10
            goto L7a
        L4c:
            int r13 = defpackage.zud.q0
            if (r4 != r13) goto L60
            java.lang.Object r13 = r0.getValue()
            pb3 r13 = (defpackage.pb3) r13
            w4e r13 = (defpackage.w4e) r13
            long r4 = r13.j()
            r10 = 18000000(0x112a880, double:8.8931816E-317)
            goto L4a
        L60:
            int r13 = defpackage.zud.o0
            if (r4 != r13) goto L74
            java.lang.Object r13 = r0.getValue()
            pb3 r13 = (defpackage.pb3) r13
            w4e r13 = (defpackage.w4e) r13
            long r4 = r13.j()
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L4a
        L74:
            int r13 = defpackage.zud.r0
            if (r4 != r13) goto La9
            r4 = -1
        L7a:
            yy7[] r13 = defpackage.zx2.h1
            lzf r13 = r1.y()
            q2b r13 = (defpackage.q2b) r13
            z74 r13 = r13.b()
            pw2 r0 = new pw2
            r6 = 0
            r0.<init>(r1, r2, r4, r6)
            r12.o = r8
            java.lang.Object r13 = defpackage.svi.i(r13, r0, r12)
            if (r13 != r9) goto L95
        L94:
            return r9
        L95:
            ci5 r13 = r1.d1
            iw2 r0 = new iw2
            int r1 = defpackage.avd.O
            int r2 = defpackage.yud.A
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2, r3, r8)
            defpackage.xfh.r(r13, r0)
        La9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw2.n(java.lang.Object):java.lang.Object");
    }
}
