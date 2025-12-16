package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q36 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q36(Continuation continuation) {
        super(2, continuation);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ((q36) l((z26) obj, (Continuation) obj2)).n(qqg.a);
        return g84.a;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        q36 q36Var = new q36(continuation);
        q36Var.Y = obj;
        return q36Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (defpackage.s8j.c(r8, r12) != r7) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0078 -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r12.X
            r2 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            g84 r7 = defpackage.g84.a
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L32
            if (r1 == r5) goto L28
            if (r1 != r4) goto L20
            long r1 = r12.o
            java.lang.Object r3 = r12.Y
            z26 r3 = (defpackage.z26) r3
            defpackage.g8j.b(r13)
        L1c:
            r10 = r1
            r1 = r3
            r2 = r10
            goto L51
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L28:
            long r1 = r12.o
            java.lang.Object r3 = r12.Y
            z26 r3 = (defpackage.z26) r3
            defpackage.g8j.b(r13)
            goto L68
        L32:
            java.lang.Object r1 = r12.Y
            z26 r1 = (defpackage.z26) r1
            defpackage.g8j.b(r13)
            goto L51
        L3a:
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.Y
            r1 = r13
            z26 r1 = (defpackage.z26) r1
            long r8 = r0.toMillis(r2)
            r12.Y = r1
            r12.X = r6
            java.lang.Object r13 = defpackage.s8j.c(r8, r12)
            if (r13 != r7) goto L51
            goto L7a
        L51:
            r8 = 1
            long r8 = r8 + r2
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r2)
            r12.Y = r1
            r12.o = r8
            r12.X = r5
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r7) goto L66
            goto L7a
        L66:
            r3 = r1
            r1 = r8
        L68:
            r8 = 100
            long r8 = r0.toMillis(r8)
            r12.Y = r3
            r12.o = r1
            r12.X = r4
            java.lang.Object r13 = defpackage.s8j.c(r8, r12)
            if (r13 != r7) goto L1c
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q36.n(java.lang.Object):java.lang.Object");
    }
}
