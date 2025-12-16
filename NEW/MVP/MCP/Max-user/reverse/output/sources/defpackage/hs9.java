package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hs9 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vu9 Z;
    public hr9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hs9) l((imb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hs9 hs9Var = new hs9(this.Z, continuation);
        hs9Var.Y = obj;
        return hs9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.X
            qqg r1 = defpackage.qqg.a
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            vu9 r6 = r9.Z
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L32
            if (r0 == r5) goto L28
            if (r0 == r4) goto L20
            if (r0 != r3) goto L18
            defpackage.g8j.b(r10)
            return r1
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r0 = r9.Y
            hr9 r0 = (defpackage.hr9) r0
            defpackage.g8j.b(r10)
            goto L69
        L28:
            hr9 r0 = r9.o
            java.lang.Object r5 = r9.Y
            pb2 r5 = (defpackage.pb2) r5
            defpackage.g8j.b(r10)
            goto L56
        L32:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.Y
            imb r10 = (defpackage.imb) r10
            java.lang.Object r0 = r10.a
            pb2 r0 = (defpackage.pb2) r0
            java.lang.Object r10 = r10.b
            hr9 r10 = (defpackage.hr9) r10
            yy7[] r8 = defpackage.vu9.U1
            csg r8 = r6.F()
            r9.Y = r0
            r9.o = r10
            r9.X = r5
            java.lang.Object r5 = r8.a(r0, r10, r9)
            if (r5 != r7) goto L54
            goto L74
        L54:
            r5 = r0
            r0 = r10
        L56:
            yy7[] r10 = defpackage.vu9.U1
            ay9 r10 = r6.E()
            r9.Y = r0
            r9.o = r2
            r9.X = r4
            java.lang.Object r10 = r10.e(r5, r0, r9)
            if (r10 != r7) goto L69
            goto L74
        L69:
            tcf r10 = r6.C1
            r9.Y = r2
            r9.X = r3
            r10.setValue(r0)
            if (r1 != r7) goto L75
        L74:
            return r7
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs9.n(java.lang.Object):java.lang.Object");
    }
}
