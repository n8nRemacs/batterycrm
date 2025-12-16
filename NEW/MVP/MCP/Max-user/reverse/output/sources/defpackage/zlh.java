package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zlh extends dtf implements sm6 {
    public final /* synthetic */ tmh X;
    public final /* synthetic */ go0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zlh(tmh tmhVar, go0 go0Var, Continuation continuation) {
        super(2, continuation);
        this.X = tmhVar;
        this.Y = go0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zlh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zlh(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (defpackage.tmh.a(r5.X, (defpackage.lo0) r6, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (defpackage.tmh.c(r5.X, (defpackage.po0) r6, r2, r5) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (defpackage.tmh.b(r5.X, (defpackage.mo0) r6, r3, r5) == r0) goto L27;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r5.o
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            defpackage.g8j.b(r6)
            goto L7e
        L1c:
            defpackage.g8j.b(r6)
            goto L38
        L20:
            defpackage.g8j.b(r6)
            tmh r6 = r5.X
            qv7 r6 = r6.m
            boolean r1 = r6 instanceof defpackage.lo0
            if (r1 == 0) goto L4a
            tmh r1 = r5.X
            lo0 r6 = (defpackage.lo0) r6
            r5.o = r4
            java.lang.Object r6 = defpackage.tmh.a(r1, r6, r5)
            if (r6 != r0) goto L38
            goto L6f
        L38:
            tmh r6 = r5.X
            k18 r6 = r6.j
            java.lang.Object r6 = r6.getValue()
            t9c r6 = (defpackage.t9c) r6
            tmh r0 = r5.X
            long r0 = r0.b
            r6.a(r0, r4)
            goto L7e
        L4a:
            boolean r1 = r6 instanceof defpackage.po0
            if (r1 == 0) goto L5d
            tmh r1 = r5.X
            po0 r6 = (defpackage.po0) r6
            go0 r2 = r5.Y
            r5.o = r3
            java.lang.Object r6 = defpackage.tmh.c(r1, r6, r2, r5)
            if (r6 != r0) goto L7e
            goto L6f
        L5d:
            boolean r1 = r6 instanceof defpackage.mo0
            if (r1 == 0) goto L70
            tmh r1 = r5.X
            mo0 r6 = (defpackage.mo0) r6
            go0 r3 = r5.Y
            r5.o = r2
            java.lang.Object r6 = defpackage.tmh.b(r1, r6, r3, r5)
            if (r6 != r0) goto L7e
        L6f:
            return r0
        L70:
            tmh r6 = r5.X
            qv7 r6 = r6.m
            if (r6 == 0) goto L7e
            d1 r0 = new d1
            r0.<init>()
            r6.b(r0)
        L7e:
            tmh r6 = r5.X
            r0 = 0
            r6.m = r0
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zlh.n(java.lang.Object):java.lang.Object");
    }
}
