package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pv7 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qv7 Z;
    public kv0 o;
    public final /* synthetic */ sm6 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv7(qv7 qv7Var, sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Z = qv7Var;
        this.s0 = sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pv7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pv7 pv7Var = new pv7(this.Z, this.s0, continuation);
        pv7Var.Y = obj;
        return pv7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r4.invoke(r7, r6) == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:7:0x0012, B:17:0x003e, B:21:0x004e, B:23:0x0056, B:12:0x0025, B:15:0x0032), top: B:29:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.X
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L29
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L17
            kv0 r0 = r6.o
            java.lang.Object r4 = r6.Y
            sm6 r4 = (defpackage.sm6) r4
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L67
        L15:
            r7 = r4
            goto L3e
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kv0 r0 = r6.o
            java.lang.Object r4 = r6.Y
            sm6 r4 = (defpackage.sm6) r4
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L67
            goto L4e
        L29:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.Y
            f84 r7 = (defpackage.f84) r7
            qv7 r7 = r6.Z
            pv0 r7 = r7.a     // Catch: java.lang.Throwable -> L67
            r7.getClass()     // Catch: java.lang.Throwable -> L67
            kv0 r0 = new kv0     // Catch: java.lang.Throwable -> L67
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L67
            sm6 r7 = r6.s0
        L3e:
            r6.Y = r7     // Catch: java.lang.Throwable -> L67
            r6.o = r0     // Catch: java.lang.Throwable -> L67
            r6.X = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r0.b(r6)     // Catch: java.lang.Throwable -> L67
            if (r4 != r3) goto L4b
            goto L66
        L4b:
            r5 = r4
            r4 = r7
            r7 = r5
        L4e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L67
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L67
            java.lang.Object r7 = r0.c()     // Catch: java.lang.Throwable -> L67
            r6.Y = r4     // Catch: java.lang.Throwable -> L67
            r6.o = r0     // Catch: java.lang.Throwable -> L67
            r6.X = r1     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch: java.lang.Throwable -> L67
            if (r7 != r3) goto L15
        L66:
            return r3
        L67:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pv7.n(java.lang.Object):java.lang.Object");
    }
}
