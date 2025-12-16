package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ja6 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ la6 Z;
    public Object o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja6(la6 la6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = la6Var;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ja6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ja6 ja6Var = new ja6(this.Z, this.s0, continuation);
        ja6Var.Y = obj;
        return ja6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r12 == r8) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[PHI: r0
  0x00ad: PHI (r0v3 java.util.Set) = (r0v14 java.util.Set), (r0v15 java.util.Set), (r0v16 java.util.Set), (r0v17 java.util.Set) binds: [B:33:0x008b, B:35:0x00aa, B:23:0x005c, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.X
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            qqg r6 = defpackage.qqg.a
            la6 r7 = r11.Z
            g84 r8 = defpackage.g84.a
            if (r0 == 0) goto L3e
            if (r0 == r4) goto L36
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            defpackage.g8j.b(r12)
            return r6
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            java.lang.Object r0 = r11.Y
            java.util.Set r0 = (java.util.Set) r0
            defpackage.g8j.b(r12)
            goto Lad
        L2c:
            java.lang.Object r0 = r11.Y
            java.util.Set r0 = (java.util.Set) r0
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L34
            goto L80
        L34:
            r12 = move-exception
            goto L82
        L36:
            java.lang.Object r0 = r11.Y
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r12)
            goto L53
        L3e:
            defpackage.g8j.b(r12)
            java.lang.Object r12 = r11.Y
            f84 r12 = (defpackage.f84) r12
            fde r0 = r7.a
            r11.Y = r12
            r11.X = r4
            java.io.Serializable r12 = r0.u(r11)
            if (r12 != r8) goto L53
            goto Lc0
        L53:
            r0 = r12
            java.util.Set r0 = (java.util.Set) r0
            java.lang.String r12 = r11.s0
            boolean r4 = defpackage.vmf.F(r12)
            if (r4 != 0) goto Lad
            cb6 r4 = r7.b     // Catch: java.lang.Throwable -> L34
            n8a r9 = defpackage.dsi.i(r0)     // Catch: java.lang.Throwable -> L34
            r11.Y = r0     // Catch: java.lang.Throwable -> L34
            r11.X = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r4.c     // Catch: java.lang.Throwable -> L34
            kotlinx.coroutines.internal.ContextScope r3 = (kotlinx.coroutines.internal.ContextScope) r3     // Catch: java.lang.Throwable -> L34
            x74 r3 = r3.getCoroutineContext()     // Catch: java.lang.Throwable -> L34
            ya6 r10 = new ya6     // Catch: java.lang.Throwable -> L34
            r10.<init>(r4, r12, r9, r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r12 = defpackage.svi.i(r3, r10, r11)     // Catch: java.lang.Throwable -> L34
            if (r12 != r8) goto L7c
            goto L7d
        L7c:
            r12 = r6
        L7d:
            if (r12 != r8) goto L80
            goto Lc0
        L80:
            r3 = r6
            goto L87
        L82:
            ipd r3 = new ipd
            r3.<init>(r12)
        L87:
            java.lang.Throwable r12 = defpackage.kpd.a(r3)
            if (r12 == 0) goto Lad
            r11.Y = r0
            r11.o = r3
            r11.X = r2
            k18 r12 = r7.d
            java.lang.Object r12 = r12.getValue()
            lzf r12 = (defpackage.lzf) r12
            q2b r12 = (defpackage.q2b) r12
            wl8 r12 = r12.c()
            ka6 r2 = new ka6
            r2.<init>(r7, r5)
            java.lang.Object r12 = defpackage.svi.i(r12, r2, r11)
            if (r12 != r8) goto Lad
            goto Lc0
        Lad:
            jve r12 = r7.e
            ia6 r2 = new ia6
            r2.<init>(r0)
            r11.Y = r5
            r11.o = r5
            r11.X = r1
            java.lang.Object r12 = r12.a(r2, r11)
            if (r12 != r8) goto Lc1
        Lc0:
            return r8
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja6.n(java.lang.Object):java.lang.Object");
    }
}
