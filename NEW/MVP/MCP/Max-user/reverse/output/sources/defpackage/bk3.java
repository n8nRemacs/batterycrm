package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bk3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gk3 Y;
    public final /* synthetic */ Long Z;
    public int o;
    public final /* synthetic */ long[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk3(gk3 gk3Var, Long l, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.Y = gk3Var;
        this.Z = l;
        this.s0 = jArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bk3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bk3 bk3Var = new bk3(this.Y, this.Z, this.s0, continuation);
        bk3Var.X = obj;
        return bk3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r7.o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r7.X
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r8)
            goto L70
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r8)
            goto L3d
        L24:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            r1 = r8
            f84 r1 = (defpackage.f84) r1
            gk3 r8 = r7.Y
            java.lang.Long r4 = r7.Z
            long[] r5 = r7.s0
            r7.X = r1
            r7.o = r3
            java.lang.Enum r8 = defpackage.gk3.t(r8, r4, r5, r7)
            if (r8 != r0) goto L3d
            goto L6f
        L3d:
            rj3 r8 = (defpackage.rj3) r8
            gk3 r4 = r7.Y
            r4.y0 = r8
            gk3 r4 = r7.Y
            k18 r4 = r4.u0
            java.lang.Object r4 = r4.getValue()
            mj3 r4 = (defpackage.mj3) r4
            byte r8 = r8.a
            r7.X = r1
            r7.o = r2
            r4.getClass()
            java.lang.String r1 = "SELECT * FROM complain_reasons WHERE type_id = ?"
            dsd r1 = defpackage.dsd.c(r3, r1)
            long r5 = (long) r8
            android.os.CancellationSignal r8 = defpackage.xrf.m(r1, r3, r5)
            lrd r2 = r4.a
            ci r3 = new ci
            r5 = 5
            r3.<init>(r4, r5, r1)
            java.lang.Object r8 = defpackage.k7j.a(r2, r8, r3, r7)
            if (r8 != r0) goto L70
        L6f:
            return r0
        L70:
            nj3 r8 = (defpackage.nj3) r8
            if (r8 == 0) goto L77
            java.util.List r8 = r8.c
            return r8
        L77:
            gk3 r8 = r7.Y
            k18 r8 = r8.v0
            java.lang.Object r8 = r8.getValue()
            pj3 r8 = (defpackage.pj3) r8
            kotlinx.coroutines.internal.ContextScope r0 = r8.e
            oj3 r1 = new oj3
            r2 = 0
            r1.<init>(r8, r2)
            r8 = 3
            defpackage.svi.e(r0, r2, r2, r1, r8)
            hd5 r8 = defpackage.hd5.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk3.n(java.lang.Object):java.lang.Object");
    }
}
