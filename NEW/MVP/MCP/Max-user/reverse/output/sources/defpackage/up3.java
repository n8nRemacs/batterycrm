package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class up3 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ vp3 Y;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up3(vp3 vp3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vp3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((up3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new up3(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:14:0x0046). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            vp3 r3 = r9.Y
            r4 = 1
            if (r0 == 0) goto L19
            if (r0 != r4) goto L11
            long r5 = r9.o
            defpackage.g8j.b(r10)
            goto L46
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            defpackage.g8j.b(r10)
            tcf r10 = r3.x0
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
        L28:
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 >= 0) goto L48
            tcf r10 = r3.x0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r7 = 0
            r10.m(r7, r0)
            r9.o = r5
            r9.X = r4
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.s8j.c(r7, r9)
            g84 r0 = defpackage.g84.a
            if (r10 != r0) goto L46
            return r0
        L46:
            long r5 = r5 + r1
            goto L28
        L48:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up3.n(java.lang.Object):java.lang.Object");
    }
}
