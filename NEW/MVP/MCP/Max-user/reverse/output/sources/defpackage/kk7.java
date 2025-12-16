package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kk7 extends dtf implements sm6 {
    public final /* synthetic */ qk7 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ mcf Z;
    public int o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk7(qk7 qk7Var, long j, mcf mcfVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = qk7Var;
        this.Y = j;
        this.Z = mcfVar;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kk7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kk7(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.d(r8, r7) == r4) goto L15;
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
            qk7 r1 = r7.X
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.g8j.b(r8)
            goto L54
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.g8j.b(r8)
            goto L32
        L1e:
            defpackage.g8j.b(r8)
            wj r8 = r1.c
            long r5 = r7.Y
            n8a r0 = defpackage.dk8.b(r5)
            r7.o = r3
            java.lang.Object r8 = r8.e(r0, r7)
            if (r8 != r4) goto L32
            goto L53
        L32:
            d53 r8 = new d53
            r0 = 12
            mcf r3 = r7.Z
            r8.<init>(r3, r0)
            d53 r0 = new d53
            r3 = 9
            r0.<init>(r8, r3)
            w3 r8 = new w3
            java.lang.String r3 = r7.s0
            r5 = 28
            r8.<init>(r1, r5, r3)
            r7.o = r2
            java.lang.Object r8 = r0.d(r8, r7)
            if (r8 != r4) goto L54
        L53:
            return r4
        L54:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk7.n(java.lang.Object):java.lang.Object");
    }
}
