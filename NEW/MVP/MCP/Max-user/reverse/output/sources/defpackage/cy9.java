package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cy9 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ dy9 Y;
    public final /* synthetic */ long Z;
    public Object o;
    public final /* synthetic */ CharSequence s0;
    public final /* synthetic */ Long t0;
    public final /* synthetic */ boolean u0;
    public final /* synthetic */ vf6 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy9(dy9 dy9Var, long j, CharSequence charSequence, Long l, boolean z, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = dy9Var;
        this.Z = j;
        this.s0 = charSequence;
        this.t0 = l;
        this.u0 = z;
        this.v0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cy9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cy9(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1 == r10) goto L18;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            dy9 r1 = r0.Y
            k18 r2 = r1.b
            int r3 = r0.X
            boolean r4 = r0.u0
            java.lang.CharSequence r5 = r0.s0
            r6 = 2
            long r7 = r0.Z
            r9 = 1
            g84 r10 = defpackage.g84.a
            if (r3 == 0) goto L35
            if (r3 == r9) goto L2b
            if (r3 != r6) goto L23
            java.lang.Object r1 = r0.o
            lhe r1 = (defpackage.lhe) r1
            defpackage.g8j.b(r18)
            r3 = r1
            r1 = r18
            goto L91
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            java.lang.Object r3 = r0.o
            java.util.List r3 = (java.util.List) r3
            defpackage.g8j.b(r18)
            r9 = r18
            goto L59
        L35:
            defpackage.g8j.b(r18)
            k18 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            ft6 r3 = (defpackage.ft6) r3
            java.util.List r3 = r3.b(r5, r7)
            k18 r11 = r1.d
            java.lang.Object r11 = r11.getValue()
            uq9 r11 = (defpackage.uq9) r11
            r0.o = r3
            r0.X = r9
            java.lang.Long r9 = r0.t0
            java.lang.Object r9 = r11.a(r7, r9, r0)
            if (r9 != r10) goto L59
            goto L90
        L59:
            sk9 r9 = (defpackage.sk9) r9
            java.lang.CharSequence r5 = defpackage.vmf.c0(r5)
            java.lang.String r14 = r5.toString()
            jhe r11 = new jhe
            if (r3 != 0) goto L69
            hd5 r3 = defpackage.hd5.a
        L69:
            r16 = r3
            long r12 = r0.Z
            r15 = 1
            r11.<init>(r12, r14, r15, r16)
            r11.b = r9
            r3 = r4 ^ 1
            r11.d = r3
            lhe r3 = new lhe
            r3.<init>(r11)
            k18 r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            zs6 r1 = (defpackage.zs6) r1
            r0.o = r3
            r0.X = r6
            vf6 r5 = r0.v0
            java.lang.Object r1 = r1.b(r5, r0)
            if (r1 != r10) goto L91
        L90:
            return r10
        L91:
            java.util.List r1 = (java.util.List) r1
            boolean r5 = r1.isEmpty()
            qqg r6 = defpackage.qqg.a
            if (r5 == 0) goto La8
            java.lang.Object r1 = r2.getValue()
            c6i r1 = (defpackage.c6i) r1
            r3.getClass()
            r1.b(r3)
            return r6
        La8:
            o98 r5 = defpackage.ve3.d()
            r5.add(r3)
            r5.addAll(r1)
            o98 r1 = defpackage.ve3.a(r5)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r1)
            lge r1 = new lge
            r5 = 2
            r1.<init>(r7, r3, r5)
            r1.d = r4
            ihe r3 = new ihe
            r3.<init>(r1)
            java.lang.Object r1 = r2.getValue()
            c6i r1 = (defpackage.c6i) r1
            r1.b(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cy9.n(java.lang.Object):java.lang.Object");
    }
}
