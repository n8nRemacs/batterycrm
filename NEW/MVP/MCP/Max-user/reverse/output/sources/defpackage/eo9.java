package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eo9 extends dtf implements sm6 {
    public final /* synthetic */ no9 X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ vf6 Z;
    public int o;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo9(no9 no9Var, Long l, vf6 vf6Var, CharSequence charSequence, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = no9Var;
        this.Y = l;
        this.Z = vf6Var;
        this.s0 = charSequence;
        this.t0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eo9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eo9(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0 == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0 == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r0.a(r4, r12.s0, r12.Y, r12.Z, r12.t0, r12) == r11) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        return r11;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.o
            r8 = 0
            r1 = 3
            r2 = 2
            r3 = 1
            qqg r9 = defpackage.qqg.a
            no9 r10 = r12.X
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1b
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1b:
            defpackage.g8j.b(r13)
            goto Laa
        L20:
            defpackage.g8j.b(r13)
            mcf r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            pb2 r0 = (defpackage.pb2) r0
            if (r0 == 0) goto Lb2
            long r4 = r0.a
            java.lang.Long r0 = r12.Y
            g84 r11 = defpackage.g84.a
            if (r0 != 0) goto L84
            vf6 r0 = r12.Z
            if (r0 == 0) goto L84
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.Long r4 = r0.b
            if (r4 == 0) goto L67
            boolean r4 = r0.c
            if (r4 == 0) goto L67
            k18 r2 = r10.Y
            java.lang.Object r2 = r2.getValue()
            lf6 r2 = (defpackage.lf6) r2
            r12.o = r3
            r2.getClass()
            kf6 r3 = new kf6
            r3.<init>(r2, r0, r1, r8)
            java.lang.Object r0 = defpackage.d7j.d(r3, r12)
            if (r0 != r11) goto L63
            goto L64
        L63:
            r0 = r9
        L64:
            if (r0 != r11) goto Laa
            goto La9
        L67:
            k18 r3 = r10.Z
            java.lang.Object r3 = r3.getValue()
            uf6 r3 = (defpackage.uf6) r3
            r12.o = r2
            r3.getClass()
            tf6 r2 = new tf6
            r2.<init>(r3, r0, r1, r8)
            java.lang.Object r0 = defpackage.d7j.d(r2, r12)
            if (r0 != r11) goto L80
            goto L81
        L80:
            r0 = r9
        L81:
            if (r0 != r11) goto Laa
            goto La9
        L84:
            java.lang.CharSequence r0 = r12.s0
            if (r0 == 0) goto Lb2
            boolean r0 = defpackage.vmf.F(r0)
            if (r0 == 0) goto L8f
            goto Lb2
        L8f:
            java.lang.Object r0 = r10.X
            java.lang.Object r0 = r0.getValue()
            dy9 r0 = (defpackage.dy9) r0
            r12.o = r1
            java.lang.CharSequence r3 = r12.s0
            r1 = r4
            java.lang.Long r4 = r12.Y
            vf6 r5 = r12.Z
            boolean r6 = r12.t0
            r7 = r12
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r6, r7)
            if (r0 != r11) goto Laa
        La9:
            return r11
        Laa:
            tcf r0 = r10.H0
            r0.setValue(r8)
            r10.v()
        Lb2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo9.n(java.lang.Object):java.lang.Object");
    }
}
