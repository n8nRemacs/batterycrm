package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u56 extends dtf implements sm6 {
    public final /* synthetic */ zve X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ n4 Z;
    public int o;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u56(zve zveVar, x26 x26Var, e9a e9aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.X = zveVar;
        this.Y = x26Var;
        this.Z = (n4) e9aVar;
        this.s0 = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u56) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e9a, n4] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u56(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r4.d(r6, r8) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r4.d(r6, r8) != r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (defpackage.gw0.h(r9, r0, r8) == r7) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [e9a, n4, z26] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.o
            r1 = 4
            r2 = 3
            r3 = 1
            x26 r4 = r8.Y
            r5 = 2
            n4 r6 = r8.Z
            g84 r7 = defpackage.g84.a
            if (r0 == 0) goto L27
            if (r0 == r3) goto L23
            if (r0 == r5) goto L1f
            if (r0 == r2) goto L23
            if (r0 != r1) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            defpackage.g8j.b(r9)
            goto L50
        L23:
            defpackage.g8j.b(r9)
            goto L75
        L27:
            defpackage.g8j.b(r9)
            lcj r9 = defpackage.yve.a
            zve r0 = r8.X
            if (r0 != r9) goto L39
            r8.o = r3
            java.lang.Object r9 = r4.d(r6, r8)
            if (r9 != r7) goto L75
            goto L74
        L39:
            dcf r9 = defpackage.yve.b
            r3 = 0
            if (r0 != r9) goto L59
            mcf r9 = r6.i()
            s56 r0 = new s56
            r0.<init>(r5, r3)
            r8.o = r5
            java.lang.Object r9 = defpackage.gw0.o(r9, r0, r8)
            if (r9 != r7) goto L50
            goto L74
        L50:
            r8.o = r2
            java.lang.Object r9 = r4.d(r6, r8)
            if (r9 != r7) goto L75
            goto L74
        L59:
            mcf r9 = r6.i()
            x26 r9 = r0.e(r9)
            x26 r9 = defpackage.gw0.m(r9)
            t56 r0 = new t56
            java.lang.Object r2 = r8.s0
            r0.<init>(r4, r6, r2, r3)
            r8.o = r1
            java.lang.Object r9 = defpackage.gw0.h(r9, r0, r8)
            if (r9 != r7) goto L75
        L74:
            return r7
        L75:
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u56.n(java.lang.Object):java.lang.Object");
    }
}
