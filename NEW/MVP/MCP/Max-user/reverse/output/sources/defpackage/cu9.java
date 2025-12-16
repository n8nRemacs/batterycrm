package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cu9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cu9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cu9(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (defpackage.svi.i(r9, r0, r8) == r4) goto L21;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.o
            r1 = 2
            r2 = 1
            vu9 r3 = r8.X
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L1b
            if (r0 != r1) goto L13
            defpackage.g8j.b(r9)
            goto L88
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            defpackage.g8j.b(r9)
            goto L69
        L1f:
            defpackage.g8j.b(r9)
            tcf r9 = r3.C1
            java.lang.Object r9 = r9.getValue()
            hr9 r9 = (defpackage.hr9) r9
            java.util.ArrayList r9 = r9.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.we3.q(r9, r5)
            r0.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L3d:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r9.next()
            one.me.messages.list.loader.MessageModel r5 = (one.me.messages.list.loader.MessageModel) r5
            long r5 = r5.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r0.add(r7)
            goto L3d
        L54:
            k18 r9 = r3.J0
            java.lang.Object r9 = r9.getValue()
            ix9 r9 = (defpackage.ix9) r9
            cw9 r5 = r3.b
            long r5 = r5.a
            r8.o = r2
            java.lang.Object r9 = r9.a(r5, r8, r0)
            if (r9 != r4) goto L69
            goto L87
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L88
            lzf r9 = r3.X
            q2b r9 = (defpackage.q2b) r9
            wl8 r9 = r9.c()
            bu9 r0 = new bu9
            r2 = 0
            r0.<init>(r3, r2)
            r8.o = r1
            java.lang.Object r9 = defpackage.svi.i(r9, r0, r8)
            if (r9 != r4) goto L88
        L87:
            return r4
        L88:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu9.n(java.lang.Object):java.lang.Object");
    }
}
