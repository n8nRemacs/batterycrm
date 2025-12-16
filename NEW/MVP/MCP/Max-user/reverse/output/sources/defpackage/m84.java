package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class m84 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ lrd Y;
    public final /* synthetic */ n84 Z;
    public kv0 o;
    public final /* synthetic */ pv0 s0;
    public final /* synthetic */ Callable t0;
    public final /* synthetic */ pv0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m84(lrd lrdVar, n84 n84Var, pv0 pv0Var, Callable callable, pv0 pv0Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = lrdVar;
        this.Z = n84Var;
        this.s0 = pv0Var;
        this.t0 = callable;
        this.u0 = pv0Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m84) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m84(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:7:0x0012, B:18:0x0035, B:21:0x0040, B:23:0x0048, B:14:0x0022, B:17:0x002e), top: B:30:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005b -> B:18:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.X
            r1 = 2
            r2 = 1
            n84 r3 = r7.Z
            lrd r4 = r7.Y
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L26
            if (r0 == r2) goto L20
            if (r0 != r1) goto L18
            kv0 r0 = r7.o
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L16
            goto L35
        L16:
            r8 = move-exception
            goto L66
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kv0 r0 = r7.o
            defpackage.g8j.b(r8)     // Catch: java.lang.Throwable -> L16
            goto L40
        L26:
            defpackage.g8j.b(r8)
            oq7 r8 = r4.e
            r8.a(r3)
            pv0 r8 = r7.s0     // Catch: java.lang.Throwable -> L16
            kv0 r0 = new kv0     // Catch: java.lang.Throwable -> L16
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L16
        L35:
            r7.o = r0     // Catch: java.lang.Throwable -> L16
            r7.X = r2     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r0.b(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r5) goto L40
            goto L5d
        L40:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L5e
            r0.c()     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.Callable r8 = r7.t0     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L16
            pv0 r6 = r7.u0     // Catch: java.lang.Throwable -> L16
            r7.o = r0     // Catch: java.lang.Throwable -> L16
            r7.X = r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r6.h(r8, r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r5) goto L35
        L5d:
            return r5
        L5e:
            oq7 r8 = r4.e
            r8.c(r3)
            qqg r8 = defpackage.qqg.a
            return r8
        L66:
            oq7 r0 = r4.e
            r0.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m84.n(java.lang.Object):java.lang.Object");
    }
}
