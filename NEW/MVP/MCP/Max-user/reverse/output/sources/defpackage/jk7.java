package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jk7 extends dtf implements sm6 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ qk7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk7(qk7 qk7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = qk7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((jk7) l(bool, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jk7 jk7Var = new jk7(this.Y, continuation);
        jk7Var.X = ((Boolean) obj).booleanValue();
        return jk7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            qqg r1 = defpackage.qqg.a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L18
            if (r0 != r2) goto L10
            defpackage.g8j.b(r7)
            return r1
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            defpackage.g8j.b(r7)
            return r1
        L1c:
            defpackage.g8j.b(r7)
            boolean r7 = r6.X
            qk7 r0 = r6.Y
            g84 r4 = defpackage.g84.a
            if (r7 == 0) goto L55
            t9f r7 = r0.g
            yy7[] r2 = defpackage.qk7.n
            r5 = 0
            r5 = r2[r5]
            java.lang.Object r7 = r7.D(r0, r5)
            qt7 r7 = (defpackage.qt7) r7
            r5 = 0
            if (r7 == 0) goto L3a
            r7.cancel(r5)
        L3a:
            t9f r7 = r0.h
            r2 = r2[r3]
            java.lang.Object r7 = r7.D(r0, r2)
            qt7 r7 = (defpackage.qt7) r7
            if (r7 == 0) goto L49
            r7.cancel(r5)
        L49:
            tcf r7 = r0.j
            r6.o = r3
            yk7 r0 = defpackage.yk7.a
            r7.m(r5, r0)
            if (r1 != r4) goto L6a
            goto L69
        L55:
            hbd r7 = r0.k
            mcf r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            boolean r7 = r7 instanceof defpackage.yk7
            if (r7 == 0) goto L6a
            r6.o = r2
            java.lang.Object r7 = defpackage.qk7.a(r0, r6)
            if (r7 != r4) goto L6a
        L69:
            return r4
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk7.n(java.lang.Object):java.lang.Object");
    }
}
