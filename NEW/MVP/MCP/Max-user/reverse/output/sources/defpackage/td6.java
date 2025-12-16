package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class td6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ae6 Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(ae6 ae6Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = ae6Var;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((td6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        td6 td6Var = new td6(this.Y, this.Z, continuation);
        td6Var.X = obj;
        return td6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0.c(r7, r6) == r5) goto L23;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            qqg r1 = defpackage.qqg.a
            ae6 r2 = r6.Y
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1c
            if (r0 != r3) goto L14
            defpackage.g8j.b(r7)
            goto L5c
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L20
            goto L36
        L20:
            r7 = move-exception
            goto L38
        L22:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            f84 r7 = (defpackage.f84) r7
            java.lang.String r7 = r6.Z
            w86 r0 = r2.Y     // Catch: java.lang.Throwable -> L20
            r6.o = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r7 = r0.c(r7, r6)     // Catch: java.lang.Throwable -> L20
            if (r7 != r5) goto L36
            goto L5b
        L36:
            r0 = r1
            goto L3d
        L38:
            ipd r0 = new ipd
            r0.<init>(r7)
        L3d:
            java.lang.Throwable r7 = defpackage.kpd.a(r0)
            if (r7 == 0) goto L5c
            r6.X = r0
            r6.o = r3
            lzf r7 = r2.b
            q2b r7 = (defpackage.q2b) r7
            wl8 r7 = r7.c()
            yd6 r0 = new yd6
            r3 = 0
            r0.<init>(r2, r3)
            java.lang.Object r7 = defpackage.svi.i(r7, r0, r6)
            if (r7 != r5) goto L5c
        L5b:
            return r5
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td6.n(java.lang.Object):java.lang.Object");
    }
}
