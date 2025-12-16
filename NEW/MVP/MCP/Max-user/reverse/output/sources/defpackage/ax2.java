package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ax2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zx2 Y;
    public zw1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ax2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ax2(this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r8 == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.X
            r1 = 2
            r2 = 1
            zx2 r3 = r7.Y
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r8)
            goto L55
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            zw1 r0 = r7.o
            defpackage.g8j.b(r8)
            goto L30
        L20:
            defpackage.g8j.b(r8)
            zw1 r0 = r3.Z
            r7.o = r0
            r7.X = r2
            java.lang.Object r8 = r3.D(r7)
            if (r8 != r4) goto L30
            goto L54
        L30:
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            r8 = 0
            r7.o = r8
            r7.X = r1
            k18 r1 = r0.c
            java.lang.Object r1 = r1.getValue()
            lzf r1 = (defpackage.lzf) r1
            q2b r1 = (defpackage.q2b) r1
            z74 r1 = r1.b()
            tod r2 = new tod
            r2.<init>(r0, r5, r8)
            java.lang.Object r8 = defpackage.svi.i(r1, r2, r7)
            if (r8 != r4) goto L55
        L54:
            return r4
        L55:
            sod r8 = (defpackage.sod) r8
            qqg r0 = defpackage.qqg.a
            if (r8 == 0) goto L7f
            java.lang.CharSequence r1 = r8.a
            if (r1 == 0) goto L7f
            boolean r2 = defpackage.vmf.F(r1)
            if (r2 == 0) goto L66
            goto L7f
        L66:
            java.lang.Class<zx2> r2 = defpackage.zx2.class
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "send restored draft on UI"
            defpackage.wqi.d(r2, r4)
            ci5 r2 = r3.d1
            gw2 r3 = new gw2
            java.lang.Long r4 = r8.c
            java.lang.Long r8 = r8.b
            r3.<init>(r1, r4, r8)
            defpackage.xfh.r(r2, r3)
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax2.n(java.lang.Object):java.lang.Object");
    }
}
