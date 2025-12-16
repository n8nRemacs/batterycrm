package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rs9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs9(vu9 vu9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rs9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rs9(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.o
            qqg r1 = defpackage.qqg.a
            r2 = 3
            r3 = 2
            r4 = 1
            vu9 r5 = r9.X
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L27
            if (r0 == r4) goto L23
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L17
            defpackage.g8j.b(r10)
            return r1
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            defpackage.g8j.b(r10)
            return r1
        L23:
            defpackage.g8j.b(r10)
            goto L3f
        L27:
            defpackage.g8j.b(r10)
            k18 r10 = r5.I0
            java.lang.Object r10 = r10.getValue()
            gx9 r10 = (defpackage.gx9) r10
            r9.o = r4
            bsd r10 = r10.a
            long r7 = r9.Y
            java.lang.Object r10 = r10.j(r7, r9)
            if (r10 != r6) goto L3f
            goto L65
        L3f:
            si9 r10 = (defpackage.si9) r10
            if (r10 != 0) goto L44
            goto L66
        L44:
            s10 r0 = defpackage.s10.c
            boolean r0 = r10.s(r0)
            if (r0 == 0) goto L55
            r9.o = r3
            java.lang.Object r10 = defpackage.vu9.x(r5, r10, r9)
            if (r10 != r6) goto L66
            goto L65
        L55:
            s10 r0 = defpackage.s10.d
            boolean r0 = r10.s(r0)
            if (r0 == 0) goto L66
            r9.o = r2
            java.lang.Object r10 = defpackage.vu9.y(r5, r10, r9)
            if (r10 != r6) goto L66
        L65:
            return r6
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs9.n(java.lang.Object):java.lang.Object");
    }
}
