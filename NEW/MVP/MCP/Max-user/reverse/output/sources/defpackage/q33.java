package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ fv6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q33(b43 b43Var, fv6 fv6Var, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = fv6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new q33(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r12 == r6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.o
            qqg r1 = defpackage.qqg.a
            r2 = 2
            r3 = 1
            fv6 r4 = r11.Y
            b43 r5 = r11.X
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1e
            if (r0 != r2) goto L16
            defpackage.g8j.b(r12)
            goto L88
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            defpackage.g8j.b(r12)
            goto L64
        L22:
            defpackage.g8j.b(r12)
            yy7[] r12 = defpackage.b43.W0
            k18 r12 = r5.s0
            java.lang.Object r12 = r12.getValue()
            pb3 r12 = (defpackage.pb3) r12
            w4e r12 = (defpackage.w4e) r12
            long r7 = r12.s()
            long r9 = r4.c
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r0 = 0
            if (r12 != 0) goto L4e
            int r12 = defpackage.mvd.H1
            n5g r2 = new n5g
            r2.<init>(r12)
            ci5 r12 = r5.M0
            tye r3 = new tye
            r3.<init>(r2, r0, r0)
            defpackage.xfh.r(r12, r3)
            return r1
        L4e:
            lzf r12 = r5.Y
            q2b r12 = (defpackage.q2b) r12
            z74 r12 = r12.b()
            p33 r7 = new p33
            r7.<init>(r5, r4, r0)
            r11.o = r3
            java.lang.Object r12 = defpackage.svi.i(r12, r7, r11)
            if (r12 != r6) goto L64
            goto L87
        L64:
            gx3 r12 = r4.u0
            long r7 = r4.c
            boolean r12 = r12.e()
            if (r12 != 0) goto L79
            yy7[] r12 = defpackage.b43.W0
            w63 r12 = r5.v()
            pb2 r12 = r12.n(r7)
            goto L8a
        L79:
            yy7[] r12 = defpackage.b43.W0
            w63 r12 = r5.v()
            r11.o = r2
            java.lang.Object r12 = r12.p(r7, r11)
            if (r12 != r6) goto L88
        L87:
            return r6
        L88:
            pb2 r12 = (defpackage.pb2) r12
        L8a:
            if (r12 == 0) goto L95
            a63 r0 = defpackage.a63.c
            long r2 = r12.a
            ei4 r12 = defpackage.a63.M0(r0, r2)
            goto Lb5
        L95:
            a63 r12 = defpackage.a63.c
            long r2 = r4.c
            r12.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = ":profile?id="
            r12.<init>(r0)
            r12.append(r2)
            java.lang.String r0 = "&type=contact"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            ei4 r0 = new ei4
            r0.<init>(r12)
            r12 = r0
        Lb5:
            ci5 r0 = r5.L0
            defpackage.xfh.r(r0, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q33.n(java.lang.Object):java.lang.Object");
    }
}
