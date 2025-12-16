package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bwb extends dtf implements sm6 {
    public final /* synthetic */ gwb X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwb(gwb gwbVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.X = gwbVar;
        this.Y = z;
        this.Z = z2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bwb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bwb(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (defpackage.svi.i(((defpackage.q2b) ((defpackage.lzf) r3.o.getValue())).c(), new defpackage.fwb(r3, null), r14) == r4) goto L29;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.o
            r1 = 2
            r2 = 1
            gwb r3 = r14.X
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            defpackage.g8j.b(r15)
            goto La3
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            defpackage.g8j.b(r15)
            goto L34
        L1f:
            defpackage.g8j.b(r15)
            k18 r15 = r3.b
            java.lang.Object r15 = r15.getValue()
            nt6 r15 = (defpackage.nt6) r15
            r14.o = r2
            java.lang.Object r15 = r15.a(r14)
            if (r15 != r4) goto L34
            goto La2
        L34:
            cf8 r15 = (defpackage.cf8) r15
            tcf r0 = r3.Y
            java.lang.Object r2 = r0.getValue()
            r5 = r2
            yvb r5 = (defpackage.yvb) r5
            r2 = 0
            if (r15 == 0) goto L4b
            double r6 = r15.a
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r6)
            r6 = r8
            goto L4c
        L4b:
            r6 = r2
        L4c:
            if (r15 == 0) goto L57
            double r7 = r15.b
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r7)
            r7 = r9
            goto L58
        L57:
            r7 = r2
        L58:
            r12 = 0
            r13 = 124(0x7c, float:1.74E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            yvb r5 = defpackage.yvb.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.m(r2, r5)
            if (r15 == 0) goto L87
            ci5 r0 = r3.t0
            qvb r3 = new qvb
            double r4 = r15.a
            double r6 = r15.b
            boolean r15 = r14.Y
            if (r15 == 0) goto L76
        L74:
            r8 = r2
            goto L7e
        L76:
            java.lang.Float r2 = new java.lang.Float
            r15 = 1096810496(0x41600000, float:14.0)
            r2.<init>(r15)
            goto L74
        L7e:
            boolean r9 = r14.Z
            r3.<init>(r4, r6, r8, r9)
            defpackage.xfh.r(r0, r3)
            goto La3
        L87:
            r14.o = r1
            k18 r15 = r3.o
            java.lang.Object r15 = r15.getValue()
            lzf r15 = (defpackage.lzf) r15
            q2b r15 = (defpackage.q2b) r15
            wl8 r15 = r15.c()
            fwb r0 = new fwb
            r0.<init>(r3, r2)
            java.lang.Object r15 = defpackage.svi.i(r15, r0, r14)
            if (r15 != r4) goto La3
        La2:
            return r4
        La3:
            qqg r15 = defpackage.qqg.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwb.n(java.lang.Object):java.lang.Object");
    }
}
