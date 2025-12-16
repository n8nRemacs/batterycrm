package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tjf extends dtf implements sm6 {
    public final /* synthetic */ hkf X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf(hkf hkfVar, Continuation continuation) {
        super(2, continuation);
        this.X = hkfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tjf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tjf(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (defpackage.n8j.a(r10, r9) == r6) goto L22;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            hkf r0 = r9.X
            k18 r1 = r0.Y
            int r2 = r9.o
            qqg r3 = defpackage.qqg.a
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L22
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L16
            defpackage.g8j.b(r10)
            goto L7e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            defpackage.g8j.b(r10)
            goto L3a
        L22:
            defpackage.g8j.b(r10)
            yy7[] r10 = defpackage.hkf.A0
            java.lang.Object r10 = r1.getValue()
            ps5 r10 = (defpackage.ps5) r10
            ora r10 = r10.a()
            r9.o = r5
            java.lang.Object r10 = defpackage.n8j.c(r10, r9)
            if (r10 != r6) goto L3a
            goto L7d
        L3a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.we3.q(r10, r5)
            r2.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L4b:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r10.next()
            jef r5 = (defpackage.jef) r5
            long r7 = r5.a
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r7)
            r2.add(r5)
            goto L4b
        L62:
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L69
            return r3
        L69:
            yy7[] r10 = defpackage.hkf.A0
            java.lang.Object r10 = r1.getValue()
            ps5 r10 = (defpackage.ps5) r10
            uk3 r10 = r10.g(r2)
            r9.o = r4
            java.lang.Object r10 = defpackage.n8j.a(r10, r9)
            if (r10 != r6) goto L7e
        L7d:
            return r6
        L7e:
            ci5 r10 = r0.y0
            qne r0 = new qne
            int r1 = defpackage.yud.x
            int r2 = defpackage.vdb.x
            n5g r4 = new n5g
            r4.<init>(r2)
            r0.<init>(r1, r4)
            defpackage.xfh.r(r10, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjf.n(java.lang.Object):java.lang.Object");
    }
}
