package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mrg extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ nrg Y;
    public tcf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrg(nrg nrgVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nrgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mrg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mrg(this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            nrg r0 = r9.Y
            tcf r1 = r0.w0
            int r2 = r9.X
            qqg r3 = defpackage.qqg.a
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L24
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            tcf r2 = r9.o
            defpackage.g8j.b(r10)
            goto L59
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            defpackage.g8j.b(r10)
            goto L39
        L24:
            defpackage.g8j.b(r10)
            k18 r10 = r0.d
            java.lang.Object r10 = r10.getValue()
            su3 r10 = (defpackage.su3) r10
            long r7 = r0.c
            r9.X = r5
            r10.a(r7)
            if (r3 != r6) goto L39
            goto L57
        L39:
            r9.o = r1
            r9.X = r4
            k18 r10 = r0.Y
            java.lang.Object r10 = r10.getValue()
            lzf r10 = (defpackage.lzf) r10
            q2b r10 = (defpackage.q2b) r10
            z74 r10 = r10.b()
            lrg r2 = new lrg
            r5 = 0
            r2.<init>(r0, r5)
            java.lang.Object r10 = defpackage.svi.i(r10, r2, r9)
            if (r10 != r6) goto L58
        L57:
            return r6
        L58:
            r2 = r1
        L59:
            r2.setValue(r10)
            java.lang.Object r10 = r1.getValue()
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L9b
            java.lang.Object r10 = r1.getValue()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.we3.q(r10, r2)
            r1.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
        L7d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r10.next()
            jj3 r2 = (defpackage.jj3) r2
            vqg r5 = new vqg
            byte r6 = r2.a
            java.lang.String r2 = r2.b
            r5g r7 = new r5g
            r7.<init>(r2)
            r5.<init>(r6, r7)
            r1.add(r5)
            goto L7d
        L9b:
            vqg r10 = new vqg
            int r1 = defpackage.m0b.E2
            n5g r2 = new n5g
            r2.<init>(r1)
            r1 = 7
            r10.<init>(r1, r2)
            java.util.List r1 = java.util.Collections.singletonList(r10)
        Lac:
            tcf r10 = r0.x0
        Lae:
            java.lang.Object r2 = r10.getValue()
            r5 = r2
            irg r5 = (defpackage.irg) r5
            irg r5 = new irg
            int r6 = defpackage.m0b.J2
            n5g r7 = new n5g
            r7.<init>(r6)
            int r6 = defpackage.m0b.I2
            n5g r8 = new n5g
            r8.<init>(r6)
            r5.<init>(r7, r8, r1, r4)
            boolean r2 = r10.c(r2, r5)
            if (r2 == 0) goto Lae
            yx1 r10 = r0.t()
            java.lang.String r0 = r0.b
            defpackage.yx1.k(r10, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrg.n(java.lang.Object):java.lang.Object");
    }
}
