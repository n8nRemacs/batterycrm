package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k6b extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ l6b Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6b(int i, l6b l6bVar, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = l6bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k6b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k6b(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r2.d(r8) == r3) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (defpackage.gw0.p(r0, r8) == r3) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            l6b r0 = r8.Y
            dh4 r1 = r0.j
            x4b r2 = r0.i
            int r3 = r8.o
            r4 = 3
            r5 = 0
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L22
            if (r3 == r7) goto L1e
            if (r3 != r6) goto L16
            defpackage.g8j.b(r9)
            goto L3a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            defpackage.g8j.b(r9)
            goto L6f
        L22:
            defpackage.g8j.b(r9)
            int r9 = r8.X
            int r9 = defpackage.az1.v(r9)
            g84 r3 = defpackage.g84.a
            if (r9 == 0) goto L5d
            if (r9 != r7) goto L57
            r8.o = r6
            java.lang.Object r9 = r2.d(r8)
            if (r9 != r3) goto L3a
            goto L6e
        L3a:
            r1.getClass()
            java.lang.Thread$UncaughtExceptionHandler r9 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            h4b r0 = new h4b
            r2 = 1
            r0.<init>()
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            java.lang.Object r9 = r1.a
            kotlinx.coroutines.internal.ContextScope r9 = (kotlinx.coroutines.internal.ContextScope) r9
            d6b r0 = new d6b
            r0.<init>(r1, r5)
            defpackage.svi.e(r9, r5, r5, r0, r4)
            goto L89
        L57:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5d:
            tcf r9 = r0.f
            d53 r0 = new d53
            r1 = 28
            r0.<init>(r9, r1)
            r8.o = r7
            java.lang.Object r9 = defpackage.gw0.p(r0, r8)
            if (r9 != r3) goto L6f
        L6e:
            return r3
        L6f:
            r2.getClass()
            java.lang.Thread$UncaughtExceptionHandler r9 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            h4b r0 = new h4b
            r1 = 0
            r0.<init>()
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            kotlinx.coroutines.internal.ContextScope r9 = r2.b
            v4b r0 = new v4b
            r0.<init>(r2, r5)
            defpackage.svi.e(r9, r5, r5, r0, r4)
        L89:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6b.n(java.lang.Object):java.lang.Object");
    }
}
