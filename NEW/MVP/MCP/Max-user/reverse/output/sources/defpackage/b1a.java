package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b1a extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xs Y;
    public final /* synthetic */ k1a Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1a(xs xsVar, k1a k1aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = xsVar;
        this.Z = k1aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b1a b1aVar = new b1a(this.Y, this.Z, continuation);
        b1aVar.X = obj;
        return b1aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r10 == r6) goto L29;
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
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 == r3) goto L18
            if (r0 != r2) goto L10
            defpackage.g8j.b(r10)
            goto L95
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            java.lang.Object r0 = r9.X
            long[] r0 = (long[]) r0
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L20
            goto L49
        L20:
            r10 = move-exception
            goto L53
        L22:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            f84 r10 = (defpackage.f84) r10
            xs r0 = r9.Y
            int r4 = r0.c
            k1a r5 = r9.Z
            g84 r6 = defpackage.g84.a
            r7 = 100
            if (r4 > r7) goto L5b
            long[] r0 = defpackage.ue3.e0(r0)     // Catch: java.lang.Throwable -> L20
            r9.X = r0     // Catch: java.lang.Throwable -> L20
            r9.o = r3     // Catch: java.lang.Throwable -> L20
            j1a r10 = new j1a     // Catch: java.lang.Throwable -> L20
            r10.<init>(r5, r1, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r10 = defpackage.d7j.d(r10, r9)     // Catch: java.lang.Throwable -> L20
            if (r10 != r6) goto L49
            goto L94
        L49:
            imb r2 = new imb     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0, r10)     // Catch: java.lang.Throwable -> L20
            java.util.List r10 = java.util.Collections.singletonList(r2)     // Catch: java.lang.Throwable -> L20
            return r10
        L53:
            java.lang.String r0 = "MissedContactsController"
            java.lang.String r2 = "fail"
            defpackage.wqi.e(r0, r2, r10)
            return r1
        L5b:
            java.util.ArrayList r0 = defpackage.ue3.i0(r0, r7, r7)
            x74 r3 = r9.b
            kotlinx.coroutines.internal.ContextScope r3 = defpackage.d7j.a(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.we3.q(r0, r7)
            r4.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L74:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L8c
            java.lang.Object r7 = r0.next()
            a1a r8 = new a1a
            r8.<init>(r7, r1, r10, r5)
            r7 = 3
            cs4 r7 = defpackage.svi.b(r3, r1, r8, r7)
            r4.add(r7)
            goto L74
        L8c:
            r9.o = r2
            java.lang.Object r10 = defpackage.hui.b(r4, r9)
            if (r10 != r6) goto L95
        L94:
            return r6
        L95:
            java.util.List r10 = (java.util.List) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1a.n(java.lang.Object):java.lang.Object");
    }
}
