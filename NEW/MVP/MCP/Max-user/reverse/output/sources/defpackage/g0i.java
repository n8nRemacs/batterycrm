package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g0i extends dtf implements sm6 {
    public final /* synthetic */ h0i X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0i(h0i h0iVar, Continuation continuation) {
        super(2, continuation);
        this.X = h0iVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g0i) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g0i(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r14 == r10) goto L26;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.o
            r1 = 0
            qqg r2 = defpackage.qqg.a
            r3 = 2
            h0i r8 = r13.X
            r4 = 1
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L16
            defpackage.g8j.b(r14)
            goto L99
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            defpackage.g8j.b(r14)
            goto L4d
        L22:
            defpackage.g8j.b(r14)
            k18 r14 = r8.c
            java.lang.Object r14 = r14.getValue()
            qlh r14 = (defpackage.qlh) r14
            long r5 = r8.b
            r13.o = r4
            r14.getClass()
            java.lang.String r0 = "SELECT * FROM webapp_biometry WHERE user_id = ?"
            dsd r0 = defpackage.dsd.c(r4, r0)
            android.os.CancellationSignal r4 = defpackage.xrf.m(r0, r4, r5)
            lrd r5 = r14.a
            nlh r6 = new nlh
            r7 = 0
            r6.<init>(r14, r0, r7)
            java.lang.Object r14 = defpackage.k7j.a(r5, r4, r6, r13)
            if (r14 != r10) goto L4d
            goto L98
        L4d:
            r9 = r14
            java.util.List r9 = (java.util.List) r9
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L57
            return r2
        L57:
            x74 r14 = r13.b
            kotlinx.coroutines.internal.ContextScope r14 = defpackage.d7j.a(r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.we3.q(r9, r4)
            r0.<init>(r4)
            java.util.Iterator r11 = r9.iterator()
            r4 = 0
            r5 = r4
        L6e:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L90
            java.lang.Object r6 = r11.next()
            int r12 = r5 + 1
            if (r5 < 0) goto L8c
            f0i r4 = new f0i
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r5 = 3
            cs4 r4 = defpackage.svi.b(r14, r1, r4, r5)
            r0.add(r4)
            r5 = r12
            goto L6e
        L8c:
            defpackage.ve3.p()
            throw r1
        L90:
            r13.o = r3
            java.lang.Object r14 = defpackage.hui.b(r0, r13)
            if (r14 != r10) goto L99
        L98:
            return r10
        L99:
            java.util.List r14 = (java.util.List) r14
            tcf r0 = r8.o
            uzh r3 = new uzh
            r3.<init>()
            java.util.List r3 = java.util.Collections.singletonList(r3)
            java.util.ArrayList r14 = defpackage.ue3.T(r3, r14)
            r0.m(r1, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0i.n(java.lang.Object):java.lang.Object");
    }
}
