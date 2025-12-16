package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mbf extends dtf implements sm6 {
    public ci5 X;
    public int Y;
    public final /* synthetic */ nbf Z;
    public nbf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbf(nbf nbfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = nbfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mbf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mbf(this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        if (defpackage.svi.i(r11, r0, r10) == r4) goto L20;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.Y
            r1 = 1
            r2 = 2
            nbf r3 = r10.Z
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L23
            if (r0 == r1) goto L1b
            if (r0 != r2) goto L13
            defpackage.g8j.b(r11)
            goto L9e
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            ci5 r0 = r10.X
            nbf r1 = r10.o
            defpackage.g8j.b(r11)
            goto L68
        L23:
            defpackage.g8j.b(r11)
            ci5 r0 = r3.A0
            k18 r11 = r3.Z
            java.lang.Object r11 = r11.getValue()
            zt6 r11 = (defpackage.zt6) r11
            drc r5 = new drc
            k18 r6 = r3.d
            java.lang.Object r6 = r6.getValue()
            pb3 r6 = (defpackage.pb3) r6
            w4e r6 = (defpackage.w4e) r6
            long r6 = r6.s()
            v1a r8 = defpackage.a93.s0
            k18 r9 = r3.b
            java.lang.Object r9 = r9.getValue()
            android.content.Context r9 = (android.content.Context) r9
            a93 r8 = r8.x(r9)
            yeb r8 = r8.k()
            java.lang.String r8 = r8.getName()
            r5.<init>(r6, r8)
            r10.o = r3
            r10.X = r0
            r10.Y = r1
            r6 = 0
            java.lang.Object r11 = r11.b(r5, r1, r6, r10)
            if (r11 != r4) goto L67
            goto L9d
        L67:
            r1 = r3
        L68:
            xqc r11 = (defpackage.xqc) r11
            r5 = 0
            if (r11 == 0) goto L70
            android.net.Uri r11 = r11.a
            goto L71
        L70:
            r11 = r5
        L71:
            taf r6 = new taf
            r6.<init>(r11)
            yy7[] r11 = defpackage.nbf.B0
            r1.getClass()
            defpackage.xfh.r(r0, r6)
            k18 r11 = r3.o
            java.lang.Object r11 = r11.getValue()
            lzf r11 = (defpackage.lzf) r11
            q2b r11 = (defpackage.q2b) r11
            z74 r11 = r11.a()
            lbf r0 = new lbf
            r0.<init>(r2, r5)
            r10.o = r5
            r10.X = r5
            r10.Y = r2
            java.lang.Object r11 = defpackage.svi.i(r11, r0, r10)
            if (r11 != r4) goto L9e
        L9d:
            return r4
        L9e:
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbf.n(java.lang.Object):java.lang.Object");
    }
}
