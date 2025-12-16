package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mc6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ oc6 Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc6(oc6 oc6Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = oc6Var;
        this.Z = str;
        this.s0 = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mc6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mc6 mc6Var = new mc6(this.Y, this.Z, this.s0, continuation);
        mc6Var.X = obj;
        return mc6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r10 == r6) goto L26;
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
            oc6 r2 = r9.Y
            r3 = 2
            r4 = 1
            qqg r5 = defpackage.qqg.a
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L23
            if (r0 == r4) goto L1d
            if (r0 != r3) goto L15
            defpackage.g8j.b(r10)
            goto L6f
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L21
            goto L4a
        L21:
            r10 = move-exception
            goto L4c
        L23:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            f84 r10 = (defpackage.f84) r10
            java.lang.String r10 = r9.Z
            int r0 = r9.s0
            xa6 r7 = r2.X     // Catch: java.lang.Throwable -> L21
            r9.o = r4     // Catch: java.lang.Throwable -> L21
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.internal.ContextScope r4 = (kotlinx.coroutines.internal.ContextScope) r4     // Catch: java.lang.Throwable -> L21
            x74 r4 = r4.getCoroutineContext()     // Catch: java.lang.Throwable -> L21
            wa6 r8 = new wa6     // Catch: java.lang.Throwable -> L21
            r8.<init>(r7, r10, r0, r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r10 = defpackage.svi.i(r4, r8, r9)     // Catch: java.lang.Throwable -> L21
            if (r10 != r6) goto L46
            goto L47
        L46:
            r10 = r5
        L47:
            if (r10 != r6) goto L4a
            goto L6e
        L4a:
            r0 = r5
            goto L51
        L4c:
            ipd r0 = new ipd
            r0.<init>(r10)
        L51:
            java.lang.Throwable r10 = defpackage.kpd.a(r0)
            if (r10 == 0) goto L6f
            r9.X = r0
            r9.o = r3
            lzf r10 = r2.c
            q2b r10 = (defpackage.q2b) r10
            wl8 r10 = r10.c()
            nc6 r0 = new nc6
            r0.<init>(r2, r1)
            java.lang.Object r10 = defpackage.svi.i(r10, r0, r9)
            if (r10 != r6) goto L6f
        L6e:
            return r6
        L6f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc6.n(java.lang.Object):java.lang.Object");
    }
}
