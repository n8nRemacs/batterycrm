package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qng extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sng Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qng(sng sngVar, Continuation continuation) {
        super(2, continuation);
        this.Y = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qng) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qng qngVar = new qng(this.Y, continuation);
        qngVar.X = obj;
        return qngVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r10 == r6) goto L28;
     */
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
            r2 = 0
            r3 = 2
            r4 = 1
            sng r5 = r9.Y
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1d
            if (r0 != r3) goto L15
            defpackage.g8j.b(r10)
            goto L76
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L21
            goto L40
        L21:
            r10 = move-exception
            goto L3a
        L23:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            f84 r10 = (defpackage.f84) r10
            png r0 = new png     // Catch: java.lang.Throwable -> L21
            r0.<init>(r10, r2, r5)     // Catch: java.lang.Throwable -> L21
            r9.o = r4     // Catch: java.lang.Throwable -> L21
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = defpackage.yei.f(r7, r0, r9)     // Catch: java.lang.Throwable -> L21
            if (r10 != r6) goto L40
            goto L75
        L3a:
            ipd r0 = new ipd
            r0.<init>(r10)
            r10 = r0
        L40:
            boolean r0 = r10 instanceof defpackage.ipd
            if (r0 == 0) goto L46
            r10 = r2
        L46:
            e70 r10 = (defpackage.e70) r10
            java.util.concurrent.atomic.AtomicReference r0 = r5.u0
            k11 r4 = new k11
            r7 = 11
            r4.<init>(r7, r10)
            r0.updateAndGet(r4)
            if (r10 == 0) goto L76
            r9.o = r3
            k18 r10 = r5.c
            java.lang.Object r10 = r10.getValue()
            lzf r10 = (defpackage.lzf) r10
            q2b r10 = (defpackage.q2b) r10
            z74 r10 = r10.a()
            rng r0 = new rng
            r0.<init>(r5, r2)
            java.lang.Object r10 = defpackage.svi.i(r10, r0, r9)
            if (r10 != r6) goto L72
            goto L73
        L72:
            r10 = r1
        L73:
            if (r10 != r6) goto L76
        L75:
            return r6
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qng.n(java.lang.Object):java.lang.Object");
    }
}
