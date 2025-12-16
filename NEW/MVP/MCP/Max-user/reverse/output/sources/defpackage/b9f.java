package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class b9f extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9f(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b9f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b9f b9fVar = new b9f(this.Y, continuation);
        b9fVar.X = obj;
        return b9fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[Catch: SSLException -> 0x0058, TryCatch #0 {SSLException -> 0x0058, blocks: (B:14:0x0034, B:17:0x0049, B:19:0x0051), top: B:25:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:25:0x0034). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r7.o
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r7.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r8)
            goto L34
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            f84 r8 = (defpackage.f84) r8
            r1 = r8
        L21:
            boolean r8 = defpackage.d7j.f(r1)
            if (r8 == 0) goto L67
            long r3 = r7.Y
            r7.X = r1
            r7.o = r2
            java.lang.Object r8 = defpackage.s8j.d(r3, r7)
            if (r8 != r0) goto L34
            return r0
        L34:
            t1b r8 = defpackage.t1b.a     // Catch: javax.net.ssl.SSLException -> L58
            w5 r8 = r8.getAccessor()     // Catch: javax.net.ssl.SSLException -> L58
            r3 = 172(0xac, float:2.41E-43)
            java.lang.Object r8 = r8.c(r3)     // Catch: javax.net.ssl.SSLException -> L58
            c9f r8 = (defpackage.c9f) r8     // Catch: javax.net.ssl.SSLException -> L58
            java.lang.String r8 = r8.a     // Catch: javax.net.ssl.SSLException -> L58
            l6b r3 = defpackage.wqi.a     // Catch: javax.net.ssl.SSLException -> L58
            if (r3 != 0) goto L49
            goto L21
        L49:
            lg8 r4 = defpackage.lg8.d     // Catch: javax.net.ssl.SSLException -> L58
            boolean r5 = r3.b(r4)     // Catch: javax.net.ssl.SSLException -> L58
            if (r5 == 0) goto L21
            java.lang.String r5 = "verifyIntegrity"
            r6 = 0
            r3.c(r4, r8, r5, r6)     // Catch: javax.net.ssl.SSLException -> L58
            goto L21
        L58:
            r8 = move-exception
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "ssl integrity verification failed"
            defpackage.wqi.e(r3, r4, r8)
            goto L21
        L67:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9f.n(java.lang.Object):java.lang.Object");
    }
}
