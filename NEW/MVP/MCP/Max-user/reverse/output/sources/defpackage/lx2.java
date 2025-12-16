package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lx2 extends dtf implements sm6 {
    public ci5 X;
    public int Y;
    public final /* synthetic */ zx2 Z;
    public zx2 o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ x6h t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ vf6 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx2(zx2 zx2Var, long j, x6h x6hVar, Long l, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zx2Var;
        this.s0 = j;
        this.t0 = x6hVar;
        this.u0 = l;
        this.v0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lx2(this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r15 == r5) goto L18;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.Y
            qqg r1 = defpackage.qqg.a
            zx2 r2 = r14.Z
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 != r3) goto L18
            ci5 r0 = r14.X
            zx2 r2 = r14.o
            defpackage.g8j.b(r15)
            goto L77
        L18:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L20:
            defpackage.g8j.b(r15)
            goto L59
        L24:
            defpackage.g8j.b(r15)
            bwf r15 = r2.L0
            java.lang.Object r15 = r15.getValue()
            r7 = r15
            t8h r7 = (defpackage.t8h) r7
            r14.Y = r4
            k18 r15 = r7.a
            java.lang.Object r15 = r15.getValue()
            lzf r15 = (defpackage.lzf) r15
            q2b r15 = (defpackage.q2b) r15
            z74 r15 = r15.b()
            s8h r6 = new s8h
            r13 = 0
            long r8 = r14.s0
            java.lang.Long r10 = r14.u0
            x6h r11 = r14.t0
            vf6 r12 = r14.v0
            r6.<init>(r7, r8, r10, r11, r12, r13)
            java.lang.Object r15 = defpackage.svi.i(r15, r6, r14)
            if (r15 != r5) goto L55
            goto L56
        L55:
            r15 = r1
        L56:
            if (r15 != r5) goto L59
            goto L76
        L59:
            ci5 r0 = r2.d1
            k18 r15 = r2.F0
            java.lang.Object r15 = r15.getValue()
            r9 = r15
            ew0 r9 = (defpackage.ew0) r9
            r14.o = r2
            r14.X = r0
            r14.Y = r3
            long r6 = r14.s0
            r8 = 1
            vf6 r10 = r14.v0
            r11 = r14
            java.lang.Object r15 = defpackage.v17.f(r6, r8, r9, r10, r11)
            if (r15 != r5) goto L77
        L76:
            return r5
        L77:
            yy7[] r3 = defpackage.zx2.h1
            r2.getClass()
            defpackage.xfh.r(r0, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx2.n(java.lang.Object):java.lang.Object");
    }
}
