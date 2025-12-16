package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kc6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ oc6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc6(oc6 oc6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = oc6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kc6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kc6 kc6Var = new kc6(this.Y, continuation);
        kc6Var.X = obj;
        return kc6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.c(r8, r7) == r5) goto L29;
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
            oc6 r1 = r7.Y
            r2 = 2
            r3 = 1
            qqg r4 = defpackage.qqg.a
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            defpackage.g8j.b(r8)
            goto L67
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L20
            goto L41
        L20:
            r8 = move-exception
            goto L43
        L22:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            f84 r8 = (defpackage.f84) r8
            fxg r8 = r1.w0
            if (r8 == 0) goto L67
            f86 r8 = r8.a
            if (r8 == 0) goto L67
            java.lang.String r8 = r8.a
            if (r8 != 0) goto L36
            goto L67
        L36:
            w86 r0 = r1.Y     // Catch: java.lang.Throwable -> L20
            r7.o = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r8 = r0.c(r8, r7)     // Catch: java.lang.Throwable -> L20
            if (r8 != r5) goto L41
            goto L66
        L41:
            r0 = r4
            goto L48
        L43:
            ipd r0 = new ipd
            r0.<init>(r8)
        L48:
            java.lang.Throwable r8 = defpackage.kpd.a(r0)
            if (r8 == 0) goto L67
            lzf r8 = r1.c
            q2b r8 = (defpackage.q2b) r8
            wl8 r8 = r8.c()
            jc6 r3 = new jc6
            r6 = 0
            r3.<init>(r1, r6)
            r7.X = r0
            r7.o = r2
            java.lang.Object r8 = defpackage.svi.i(r8, r3, r7)
            if (r8 != r5) goto L67
        L66:
            return r5
        L67:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc6.n(java.lang.Object):java.lang.Object");
    }
}
