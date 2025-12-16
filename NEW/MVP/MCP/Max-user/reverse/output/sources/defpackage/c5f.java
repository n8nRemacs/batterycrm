package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c5f extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ e5f Y;
    public final /* synthetic */ k18 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5f(k18 k18Var, e5f e5fVar, k18 k18Var2, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = e5fVar;
        this.Z = k18Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c5f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c5f(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0.o((defpackage.pb2) r7, r6) == r3) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r7)
            goto L52
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            defpackage.g8j.b(r7)
            goto L3f
        L1c:
            defpackage.g8j.b(r7)
            k18 r7 = r6.X
            java.lang.Object r7 = r7.getValue()
            w63 r7 = (defpackage.w63) r7
            e5f r0 = r6.Y
            long r4 = r0.a
            hbd r7 = r7.j(r4)
            d53 r0 = new d53
            r4 = 12
            r0.<init>(r7, r4)
            r6.o = r2
            java.lang.Object r7 = defpackage.gw0.p(r0, r6)
            if (r7 != r3) goto L3f
            goto L51
        L3f:
            pb2 r7 = (defpackage.pb2) r7
            k18 r0 = r6.Z
            java.lang.Object r0 = r0.getValue()
            k1a r0 = (defpackage.k1a) r0
            r6.o = r1
            java.lang.Object r7 = r0.o(r7, r6)
            if (r7 != r3) goto L52
        L51:
            return r3
        L52:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5f.n(java.lang.Object):java.lang.Object");
    }
}
