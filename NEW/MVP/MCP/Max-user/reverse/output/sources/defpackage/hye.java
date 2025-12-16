package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hye extends dtf implements sm6 {
    public final /* synthetic */ lye X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hye(lye lyeVar, Continuation continuation) {
        super(2, continuation);
        this.X = lyeVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hye) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hye(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (defpackage.svi.i(((defpackage.q2b) ((defpackage.lzf) r3.w0.getValue())).c(), new defpackage.kye(r3, null), r7) == r4) goto L18;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            r1 = 2
            r2 = 1
            lye r3 = r7.X
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r8)
            goto L66
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.g8j.b(r8)
            goto L32
        L1e:
            defpackage.g8j.b(r8)
            k18 r8 = r3.X
            java.lang.Object r8 = r8.getValue()
            nt6 r8 = (defpackage.nt6) r8
            r7.o = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r4) goto L32
            goto L65
        L32:
            cf8 r8 = (defpackage.cf8) r8
            if (r8 == 0) goto L49
            defpackage.lye.t(r3, r8)
            ci5 r0 = r3.B0
            vxe r1 = new vxe
            double r2 = r8.a
            double r4 = r8.b
            r6 = 0
            r1.<init>(r2, r4, r6)
            defpackage.xfh.r(r0, r1)
            goto L66
        L49:
            r7.o = r1
            k18 r8 = r3.w0
            java.lang.Object r8 = r8.getValue()
            lzf r8 = (defpackage.lzf) r8
            q2b r8 = (defpackage.q2b) r8
            wl8 r8 = r8.c()
            kye r0 = new kye
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r8 = defpackage.svi.i(r8, r0, r7)
            if (r8 != r4) goto L66
        L65:
            return r4
        L66:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hye.n(java.lang.Object):java.lang.Object");
    }
}
