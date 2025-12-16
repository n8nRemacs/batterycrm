package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yf6 extends dtf implements sm6 {
    public final /* synthetic */ cg6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf6(cg6 cg6Var, Continuation continuation) {
        super(2, continuation);
        this.X = cg6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yf6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yf6(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r1.a(r8, r16) == r5) goto L20;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.o
            r2 = 2
            r3 = 1
            cg6 r4 = r0.X
            g84 r5 = defpackage.g84.a
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            defpackage.g8j.b(r17)
            goto L6f
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            defpackage.g8j.b(r17)
            r1 = r17
            goto L30
        L22:
            defpackage.g8j.b(r17)
            fde r1 = r4.c
            r0.o = r3
            java.io.Serializable r1 = r1.u(r0)
            if (r1 != r5) goto L30
            goto L6e
        L30:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = defpackage.ue3.F(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            jve r1 = r4.p
            dg6 r8 = new dg6
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r6)
            java.util.List r3 = r4.o
            java.lang.Object r3 = defpackage.ue3.I(r3)
            si9 r3 = (defpackage.si9) r3
            if (r3 == 0) goto L58
            long r6 = r3.Z
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
        L56:
            r10 = r3
            goto L5a
        L58:
            r3 = 0
            goto L56
        L5a:
            java.util.Set r11 = r4.a
            java.lang.Long r12 = r4.d
            boolean r13 = r4.e
            r14 = 0
            r15 = 32
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.o = r2
            java.lang.Object r1 = r1.a(r8, r0)
            if (r1 != r5) goto L6f
        L6e:
            return r5
        L6f:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf6.n(java.lang.Object):java.lang.Object");
    }
}
