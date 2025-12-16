package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ex2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ long Z;
    public Object o;
    public final /* synthetic */ zx2 s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ vf6 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex2(Uri uri, long j, zx2 zx2Var, Long l, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = uri;
        this.Z = j;
        this.s0 = zx2Var;
        this.t0 = l;
        this.u0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ex2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ex2(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
    
        if (r0 == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.X
            qqg r6 = defpackage.qqg.a
            r1 = 3
            r2 = 2
            r3 = 1
            long r7 = r12.Z
            zx2 r9 = r12.s0
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L36
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            defpackage.g8j.b(r13)
            r0 = r13
            goto Lcf
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.Object r0 = r12.o
            ehe r0 = (defpackage.ehe) r0
            defpackage.g8j.b(r13)
            r2 = r13
            goto L84
        L2c:
            java.lang.Object r0 = r12.o
            dhe r0 = (defpackage.dhe) r0
            defpackage.g8j.b(r13)
            r4 = r0
            r0 = r13
            goto L67
        L36:
            defpackage.g8j.b(r13)
            android.net.Uri r0 = r12.Y
            java.lang.String r0 = r0.toString()
            l1f r4 = new l1f
            r11 = 7
            r4.<init>(r11, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r4)
            dhe r4 = new dhe
            r4.<init>(r7, r0)
            k18 r0 = r9.I0
            java.lang.Object r0 = r0.getValue()
            uq9 r0 = (defpackage.uq9) r0
            r12.o = r4
            r12.X = r3
            java.lang.Long r3 = r12.t0
            java.lang.Object r0 = r0.a(r7, r3, r12)
            if (r0 != r10) goto L67
            goto Lce
        L67:
            sk9 r0 = (defpackage.sk9) r0
            r4.b = r0
            ehe r0 = r4.a()
            k18 r3 = r9.G0
            java.lang.Object r3 = r3.getValue()
            zs6 r3 = (defpackage.zs6) r3
            r12.o = r0
            r12.X = r2
            vf6 r2 = r12.u0
            java.lang.Object r2 = r3.b(r2, r12)
            if (r2 != r10) goto L84
            goto Lce
        L84:
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L97
            c6i r1 = defpackage.zx2.v(r9)
            r0.getClass()
            r1.b(r0)
            return r6
        L97:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r3.add(r0)
            r3.addAll(r2)
            lge r0 = new lge
            r2 = 2
            r0.<init>(r7, r3, r2)
            ihe r2 = new ihe
            r2.<init>(r0)
            c6i r0 = defpackage.zx2.v(r9)
            r0.b(r2)
            k18 r0 = r9.F0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            ew0 r3 = (defpackage.ew0) r3
            r0 = 0
            r12.o = r0
            r12.X = r1
            long r0 = r12.Z
            r2 = 1
            vf6 r4 = r12.u0
            r5 = r12
            java.lang.Object r0 = defpackage.v17.f(r0, r2, r3, r4, r5)
            if (r0 != r10) goto Lcf
        Lce:
            return r10
        Lcf:
            ew2 r0 = (defpackage.ew2) r0
            ci5 r1 = r9.d1
            defpackage.xfh.r(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex2.n(java.lang.Object):java.lang.Object");
    }
}
