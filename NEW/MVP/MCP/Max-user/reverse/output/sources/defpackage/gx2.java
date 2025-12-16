package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gx2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ cf8 Z;
    public Object o;
    public final /* synthetic */ float s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ zx2 u0;
    public final /* synthetic */ Long v0;
    public final /* synthetic */ vf6 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx2(long j, cf8 cf8Var, float f, long j2, zx2 zx2Var, Long l, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = cf8Var;
        this.s0 = f;
        this.t0 = j2;
        this.u0 = zx2Var;
        this.v0 = l;
        this.w0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gx2(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            qqg r6 = defpackage.qqg.a
            r1 = 3
            r2 = 2
            r3 = 1
            long r7 = r13.Y
            zx2 r9 = r13.u0
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2d
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            defpackage.g8j.b(r14)
            r0 = r14
            goto Lc7
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.Object r0 = r13.o
            che r0 = (defpackage.che) r0
            defpackage.g8j.b(r14)
            r3 = r0
            r0 = r14
            goto L7d
        L2d:
            java.lang.Object r0 = r13.o
            bhe r0 = (defpackage.bhe) r0
            defpackage.g8j.b(r14)
            r3 = r14
            goto L5f
        L36:
            defpackage.g8j.b(r14)
            bhe r0 = new bhe
            r0.<init>(r7)
            cf8 r4 = r13.Z
            r0.g = r4
            float r4 = r13.s0
            r0.h = r4
            long r11 = r13.t0
            r0.i = r11
            k18 r4 = r9.I0
            java.lang.Object r4 = r4.getValue()
            uq9 r4 = (defpackage.uq9) r4
            r13.o = r0
            r13.X = r3
            java.lang.Long r3 = r13.v0
            java.lang.Object r3 = r4.a(r7, r3, r13)
            if (r3 != r10) goto L5f
            goto Lc6
        L5f:
            sk9 r3 = (defpackage.sk9) r3
            r0.b = r3
            che r3 = new che
            r3.<init>(r0)
            k18 r0 = r9.G0
            java.lang.Object r0 = r0.getValue()
            zs6 r0 = (defpackage.zs6) r0
            r13.o = r3
            r13.X = r2
            vf6 r4 = r13.w0
            java.lang.Object r0 = r0.b(r4, r13)
            if (r0 != r10) goto L7d
            goto Lc6
        L7d:
            java.util.List r0 = (java.util.List) r0
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L90
            c6i r0 = defpackage.zx2.v(r9)
            r3.getClass()
            r0.b(r3)
            return r6
        L90:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r4.add(r3)
            r4.addAll(r0)
            lge r0 = new lge
            r0.<init>(r7, r4, r2)
            ihe r2 = new ihe
            r2.<init>(r0)
            c6i r0 = defpackage.zx2.v(r9)
            r0.b(r2)
            k18 r0 = r9.F0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            ew0 r3 = (defpackage.ew0) r3
            r0 = 0
            r13.o = r0
            r13.X = r1
            long r0 = r13.Y
            r2 = 1
            vf6 r4 = r13.w0
            r5 = r13
            java.lang.Object r0 = defpackage.v17.f(r0, r2, r3, r4, r5)
            if (r0 != r10) goto Lc7
        Lc6:
            return r10
        Lc7:
            ew2 r0 = (defpackage.ew2) r0
            ci5 r1 = r9.d1
            defpackage.xfh.r(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx2.n(java.lang.Object):java.lang.Object");
    }
}
