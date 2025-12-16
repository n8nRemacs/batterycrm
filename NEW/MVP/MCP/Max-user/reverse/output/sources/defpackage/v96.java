package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v96 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ca6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v96(ca6 ca6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ca6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v96) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        v96 v96Var = new v96(this.Y, continuation);
        v96Var.X = obj;
        return v96Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r8.c(r0, r7) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (defpackage.svi.i(r8, r3, r7) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return r5;
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
            r2 = 2
            r3 = 1
            ca6 r4 = r7.Y
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            defpackage.g8j.b(r8)
            goto L5c
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L20
            goto L36
        L20:
            r8 = move-exception
            goto L38
        L22:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            f84 r8 = (defpackage.f84) r8
            w86 r8 = r4.s0     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r4.b     // Catch: java.lang.Throwable -> L20
            r7.o = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r8 = r8.c(r0, r7)     // Catch: java.lang.Throwable -> L20
            if (r8 != r5) goto L36
            goto L5b
        L36:
            r0 = r1
            goto L3d
        L38:
            ipd r0 = new ipd
            r0.<init>(r8)
        L3d:
            java.lang.Throwable r8 = defpackage.kpd.a(r0)
            if (r8 == 0) goto L5c
            lzf r8 = r4.d
            q2b r8 = (defpackage.q2b) r8
            wl8 r8 = r8.c()
            u96 r3 = new u96
            r6 = 0
            r3.<init>(r4, r6)
            r7.X = r0
            r7.o = r2
            java.lang.Object r8 = defpackage.svi.i(r8, r3, r7)
            if (r8 != r5) goto L5c
        L5b:
            return r5
        L5c:
            ci5 r8 = r4.B0
            b96 r0 = new b96
            r2 = 0
            r0.<init>(r2)
            defpackage.xfh.r(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v96.n(java.lang.Object):java.lang.Object");
    }
}
