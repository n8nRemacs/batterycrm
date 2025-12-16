package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u28 extends dtf implements sm6 {
    public v28 X;
    public long Y;
    public int Z;
    public j9a o;
    public final /* synthetic */ v28 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u28(v28 v28Var, long j, Continuation continuation) {
        super(2, continuation);
        this.s0 = v28Var;
        this.t0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u28) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new u28(this.s0, this.t0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r4 == r6) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [j9a] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.Z
            r1 = 3
            r2 = 2
            r3 = 1
            qqg r4 = defpackage.qqg.a
            r5 = 0
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L30
            if (r0 == r3) goto L25
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1a
            j9a r0 = r11.o
        L14:
            defpackage.g8j.b(r12)     // Catch: java.lang.Throwable -> L18
            goto L75
        L18:
            r12 = move-exception
            goto L7b
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            j9a r0 = r11.o
            goto L14
        L25:
            long r7 = r11.Y
            v28 r0 = r11.X
            j9a r3 = r11.o
            defpackage.g8j.b(r12)
            r12 = r3
            goto L48
        L30:
            defpackage.g8j.b(r12)
            v28 r0 = r11.s0
            n9a r12 = r0.X
            r11.o = r12
            r11.X = r0
            long r7 = r11.t0
            r11.Y = r7
            r11.Z = r3
            java.lang.Object r3 = r12.e(r5, r11)
            if (r3 != r6) goto L48
            goto L74
        L48:
            ij7 r3 = r0.a     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.ConcurrentHashMap r3 = r3.t0     // Catch: java.lang.Throwable -> L64
            java.lang.Long r9 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L64
            boolean r3 = r3.containsKey(r9)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L69
            r11.o = r12     // Catch: java.lang.Throwable -> L64
            r11.X = r5     // Catch: java.lang.Throwable -> L64
            r11.Z = r2     // Catch: java.lang.Throwable -> L64
            defpackage.v28.a(r0, r7)     // Catch: java.lang.Throwable -> L64
            if (r4 != r6) goto L62
            goto L74
        L62:
            r0 = r12
            goto L75
        L64:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
            goto L7b
        L69:
            r11.o = r12     // Catch: java.lang.Throwable -> L64
            r11.X = r5     // Catch: java.lang.Throwable -> L64
            r11.Z = r1     // Catch: java.lang.Throwable -> L64
            defpackage.v28.b(r0, r7)     // Catch: java.lang.Throwable -> L64
            if (r4 != r6) goto L62
        L74:
            return r6
        L75:
            n9a r0 = (defpackage.n9a) r0
            r0.g(r5)
            return r4
        L7b:
            n9a r0 = (defpackage.n9a) r0
            r0.g(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u28.n(java.lang.Object):java.lang.Object");
    }
}
