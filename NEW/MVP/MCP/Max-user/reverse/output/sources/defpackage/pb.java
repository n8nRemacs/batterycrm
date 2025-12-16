package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pb extends dtf implements sm6 {
    public final /* synthetic */ qb X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(qb qbVar, Continuation continuation) {
        super(2, continuation);
        this.X = qbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pb(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r1 != r6) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            qqg r1 = defpackage.qqg.a
            r2 = 3
            r3 = 2
            r4 = 1
            qb r5 = r7.X
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L27
            if (r0 == r4) goto L23
            if (r0 == r3) goto L1f
            if (r0 != r2) goto L17
            defpackage.g8j.b(r8)
            goto L66
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            defpackage.g8j.b(r8)
            goto L42
        L23:
            defpackage.g8j.b(r8)
            goto L33
        L27:
            defpackage.g8j.b(r8)
            r7.o = r4
            java.lang.Object r8 = defpackage.qb.a(r5, r7)
            if (r8 != r6) goto L33
            goto L65
        L33:
            zde r8 = (defpackage.zde) r8
            java.util.List r8 = defpackage.lee.o(r8)
            r7.o = r3
            java.lang.Object r8 = defpackage.hui.b(r8, r7)
            if (r8 != r6) goto L42
            goto L65
        L42:
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            k18 r8 = r5.b
            java.lang.Object r8 = r8.getValue()
            v04 r8 = (defpackage.v04) r8
            n8 r3 = new n8
            r4 = 8
            r3.<init>(r4)
            r8.c(r0, r3)
            tcf r8 = r5.j
            r7.o = r2
            r2 = 0
            r8.m(r2, r0)
            if (r1 != r6) goto L66
        L65:
            return r6
        L66:
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.h
            r0 = 0
            r8.set(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb.n(java.lang.Object):java.lang.Object");
    }
}
