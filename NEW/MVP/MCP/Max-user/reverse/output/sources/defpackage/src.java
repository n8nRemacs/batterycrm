package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class src extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ trc Y;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public src(trc trcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = trcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((src) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new src(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002c -> B:14:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            r1 = 1
            if (r0 == 0) goto L15
            if (r0 != r1) goto Ld
            long r2 = r6.o
            defpackage.g8j.b(r7)
            goto L2f
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            defpackage.g8j.b(r7)
            r2 = 600(0x258, double:2.964E-321)
        L1a:
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L33
            r6.o = r2
            r6.X = r1
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = defpackage.s8j.c(r4, r6)
            g84 r0 = defpackage.g84.a
            if (r7 != r0) goto L2f
            return r0
        L2f:
            r4 = -1
            long r2 = r2 + r4
            goto L1a
        L33:
            trc r7 = r6.Y
            tcf r7 = r7.s0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = 0
            r7.m(r1, r0)
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.src.n(java.lang.Object):java.lang.Object");
    }
}
