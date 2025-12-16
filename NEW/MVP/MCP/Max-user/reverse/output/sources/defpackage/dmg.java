package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dmg extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ emg Y;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmg(emg emgVar, Continuation continuation) {
        super(2, continuation);
        this.Y = emgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dmg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dmg(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0041 -> B:14:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            emg r0 = r9.Y
            tcf r0 = r0.A0
            int r1 = r9.X
            r2 = -1
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 != r4) goto L13
            long r5 = r9.o
            defpackage.g8j.b(r10)
            goto L44
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r0.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
        L28:
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 >= 0) goto L46
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r5)
            r1 = 0
            r0.m(r1, r10)
            r9.o = r5
            r9.X = r4
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = defpackage.s8j.c(r7, r9)
            g84 r1 = defpackage.g84.a
            if (r10 != r1) goto L44
            return r1
        L44:
            long r5 = r5 + r2
            goto L28
        L46:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmg.n(java.lang.Object):java.lang.Object");
    }
}
