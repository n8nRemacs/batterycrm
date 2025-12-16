package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w78 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ w68 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w78(w68 w68Var, Continuation continuation) {
        super(2, continuation);
        this.Y = w68Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((w78) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w78 w78Var = new w78(this.Y, continuation);
        w78Var.X = obj;
        return w78Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r0.a(r6.Y, r6) == r3) goto L15;
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
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r7)
            goto L43
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
            goto L35
        L20:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            r0 = r7
            z26 r0 = (defpackage.z26) r0
            r6.X = r0
            r6.o = r2
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r7 = defpackage.s8j.c(r4, r6)
            if (r7 != r3) goto L35
            goto L42
        L35:
            r7 = 0
            r6.X = r7
            r6.o = r1
            w68 r7 = r6.Y
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r3) goto L43
        L42:
            return r3
        L43:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w78.n(java.lang.Object):java.lang.Object");
    }
}
