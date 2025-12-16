package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class us6 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ lk3 Y;
    public final /* synthetic */ bs4 Z;
    public int o;
    public final /* synthetic */ zs6 s0;
    public final /* synthetic */ boolean t0;
    public eh9 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us6(Object obj, Continuation continuation, lk3 lk3Var, bs4 bs4Var, zs6 zs6Var, boolean z) {
        super(2, continuation);
        this.X = obj;
        this.Y = lk3Var;
        this.Z = bs4Var;
        this.s0 = zs6Var;
        this.t0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((us6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new us6(this.X, continuation, this.Y, this.Z, this.s0, this.t0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r8.y0 == 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r8 == r4) goto L24;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.o
            bs4 r1 = r7.Z
            r2 = 1
            r3 = 2
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1a
            if (r0 != r3) goto L12
            defpackage.g8j.b(r8)
            goto L7d
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            eh9 r0 = r7.u0
            defpackage.g8j.b(r8)
            goto L43
        L20:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            r0 = r8
            eh9 r0 = (defpackage.eh9) r0
            si9 r8 = r0.a
            long r5 = r8.Z
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            lk3 r5 = r7.Y
            mk3 r5 = (defpackage.mk3) r5
            r5.makeCompleting$kotlinx_coroutines_core(r8)
            r7.u0 = r0
            r7.o = r2
            java.lang.Object r8 = r1.c(r7)
            if (r8 != r4) goto L43
            goto L7c
        L43:
            pb2 r8 = (defpackage.pb2) r8
            zs6 r2 = r7.s0
            k18 r5 = r2.d
            java.lang.Object r5 = r5.getValue()
            pb3 r5 = (defpackage.pb3) r5
            w4e r5 = (defpackage.w4e) r5
            long r5 = r5.s()
            rf2 r8 = r8.b
            boolean r8 = r8.e(r5)
            boolean r5 = r7.t0
            if (r5 != 0) goto L92
            if (r8 == 0) goto L71
            ku3 r8 = r0.b
            boolean r8 = r8.X
            if (r8 == 0) goto L71
            si9 r8 = r0.a
            si9 r5 = r8.A0
            if (r5 == 0) goto L92
            int r8 = r8.y0
            if (r8 != r3) goto L92
        L71:
            r8 = 0
            r7.u0 = r8
            r7.o = r3
            java.lang.Object r8 = defpackage.zs6.a(r2, r1, r0, r7)
            if (r8 != r4) goto L7d
        L7c:
            return r4
        L7d:
            sk9 r8 = (defpackage.sk9) r8
            jhe r0 = new jhe
            hd5 r5 = defpackage.hd5.a
            r1 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r3, r4, r5)
            r0.b = r8
            lhe r8 = new lhe
            r8.<init>(r0)
            return r8
        L92:
            lge r8 = new lge
            r8.<init>(r0)
            mge r0 = new mge
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us6.n(java.lang.Object):java.lang.Object");
    }
}
