package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q40 extends dtf implements sm6 {
    public final /* synthetic */ s40 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(s40 s40Var, Continuation continuation) {
        super(2, continuation);
        this.X = s40Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        q40 q40Var = (q40) l((x40) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        q40Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        q40 q40Var = new q40(this.X, continuation);
        q40Var.o = obj;
        return q40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.o
            x40 r7 = (defpackage.x40) r7
            s40 r0 = r6.X
            b70 r1 = r0.D0
            r2 = 0
            if (r7 == 0) goto L32
            p20 r3 = r7.d
            java.lang.Long r4 = r7.a
            java.lang.Long r5 = r0.N0
            boolean r5 = defpackage.fni.a(r4, r5)
            if (r5 == 0) goto L32
            mni r5 = defpackage.mni.a
            boolean r5 = defpackage.fni.a(r3, r5)
            if (r5 == 0) goto L23
            goto L32
        L23:
            float r7 = r7.c
            java.lang.Long r5 = r0.N0
            boolean r4 = defpackage.fni.a(r4, r5)
            r1.c(r7, r4, r2)
            r0.b(r3)
            goto L3c
        L32:
            jbe r7 = defpackage.jbe.b
            r0.b(r7)
            r7 = 0
            r0 = 1
            r1.c(r7, r2, r0)
        L3c:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q40.n(java.lang.Object):java.lang.Object");
    }
}
