package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qrd extends dtf implements sm6 {
    public final /* synthetic */ rs4 X;
    public final /* synthetic */ bsd Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrd(rs4 rs4Var, bsd bsdVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = rs4Var;
        this.Y = bsdVar;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qrd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qrd(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (defpackage.k7j.b(r5.a, new defpackage.iq9(r5, r11.Z, r11.s0, 1), r11) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (defpackage.k7j.b(r5.a, new defpackage.iq9(r5, r11.Z, r11.s0, 0), r11) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r3;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.o
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto La
            if (r0 != r1) goto Le
        La:
            defpackage.g8j.b(r12)
            goto L5f
        Le:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L16:
            defpackage.g8j.b(r12)
            rs4 r12 = r11.X
            int r12 = r12.ordinal()
            bsd r0 = r11.Y
            g84 r3 = defpackage.g84.a
            if (r12 == 0) goto L46
            if (r12 != r2) goto L40
            lq9 r5 = r0.d()
            r11.o = r1
            lrd r12 = r5.a
            iq9 r4 = new iq9
            r10 = 1
            long r6 = r11.Z
            long r8 = r11.s0
            r4.<init>(r5, r6, r8, r10)
            java.lang.Object r12 = defpackage.k7j.b(r12, r4, r11)
            if (r12 != r3) goto L5f
            goto L5e
        L40:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L46:
            lq9 r5 = r0.d()
            r11.o = r2
            lrd r12 = r5.a
            iq9 r4 = new iq9
            r10 = 0
            long r6 = r11.Z
            long r8 = r11.s0
            r4.<init>(r5, r6, r8, r10)
            java.lang.Object r12 = defpackage.k7j.b(r12, r4, r11)
            if (r12 != r3) goto L5f
        L5e:
            return r3
        L5f:
            qqg r12 = defpackage.qqg.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrd.n(java.lang.Object):java.lang.Object");
    }
}
