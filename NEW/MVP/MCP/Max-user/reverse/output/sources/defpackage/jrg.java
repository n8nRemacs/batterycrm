package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jrg extends dtf implements sm6 {
    public final /* synthetic */ nrg X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrg(nrg nrgVar, Continuation continuation) {
        super(2, continuation);
        this.X = nrgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jrg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jrg(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r9 == r7) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            nrg r0 = r8.X
            long r1 = r0.c
            int r3 = r8.o
            qqg r4 = defpackage.qqg.a
            r5 = 2
            r6 = 1
            g84 r7 = defpackage.g84.a
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            defpackage.g8j.b(r9)
            goto L51
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            defpackage.g8j.b(r9)
            goto L35
        L22:
            defpackage.g8j.b(r9)
            k18 r9 = r0.o
            java.lang.Object r9 = r9.getValue()
            ou3 r9 = (defpackage.ou3) r9
            r8.o = r6
            r9.a(r1)
            if (r4 != r7) goto L35
            goto L50
        L35:
            yx1 r9 = r0.t()
            wx1 r3 = defpackage.wx1.TO_CONTACTS
            java.lang.String r6 = r0.b
            r9.j(r3, r6)
            k18 r9 = r0.X
            java.lang.Object r9 = r9.getValue()
            vr6 r9 = (defpackage.vr6) r9
            r8.o = r5
            java.lang.Object r9 = defpackage.vr6.a(r9, r1, r8)
            if (r9 != r7) goto L51
        L50:
            return r7
        L51:
            ku3 r9 = (defpackage.ku3) r9
            if (r9 == 0) goto L5a
            java.lang.String r9 = r9.e()
            goto L5b
        L5a:
            r9 = 0
        L5b:
            if (r9 != 0) goto L5f
            java.lang.String r9 = ""
        L5f:
            ci5 r0 = r0.z0
            erg r1 = new erg
            int r2 = defpackage.m0b.N2
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            p5g r3 = new p5g
            java.util.List r9 = defpackage.ys.D(r9)
            r3.<init>(r2, r9)
            int r9 = defpackage.ivd.A0
            bdb r2 = defpackage.bdb.a
            r1.<init>(r3, r9, r2)
            defpackage.xfh.r(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrg.n(java.lang.Object):java.lang.Object");
    }
}
