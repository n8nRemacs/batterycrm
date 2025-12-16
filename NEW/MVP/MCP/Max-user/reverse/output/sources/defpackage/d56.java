package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class d56 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ dtf Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d56(x26 x26Var, um6 um6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = (dtf) um6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d56) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        d56 d56Var = new d56(this.Y, this.Z, continuation);
        d56Var.X = obj;
        return d56Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.o
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            java.lang.Object r0 = r4.X
            c56 r0 = (defpackage.c56) r0
            defpackage.g8j.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> Lf
            goto L3c
        Lf:
            r5 = move-exception
            goto L38
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            defpackage.g8j.b(r5)
            java.lang.Object r5 = r4.X
            z26 r5 = (defpackage.z26) r5
            x26 r0 = r4.Y
            c56 r2 = new c56
            dtf r3 = r4.Z
            r2.<init>(r3, r5)
            r4.X = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            r4.o = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            java.lang.Object r5 = r0.d(r2, r4)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L36
            g84 r0 = defpackage.g84.a
            if (r5 != r0) goto L3c
            return r0
        L36:
            r5 = move-exception
            r0 = r2
        L38:
            java.lang.Object r1 = r5.a
            if (r1 != r0) goto L3f
        L3c:
            qqg r5 = defpackage.qqg.a
            return r5
        L3f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d56.n(java.lang.Object):java.lang.Object");
    }
}
