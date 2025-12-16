package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tqf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ xqf Y;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqf(xqf xqfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = xqfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tqf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tqf(this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r10.X
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L2c
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            java.lang.Object r1 = r10.o
            lc2 r1 = (defpackage.lc2) r1
            defpackage.g8j.b(r11)
            goto L82
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            java.lang.Object r2 = r10.o
            xqf r2 = (defpackage.xqf) r2
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L4e
        L27:
            r11 = move-exception
            goto L50
        L29:
            r11 = move-exception
            goto La1
        L2c:
            defpackage.g8j.b(r11)
            xqf r2 = r10.Y
            hwa r11 = r2.a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            kc2 r6 = new kc2     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            pb2 r7 = r2.b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            rf2 r7 = r7.b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            long r7 = r7.a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r9 = "chatId"
            r6.t(r7, r9)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r10.o = r2     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r10.X = r5     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r11 = r11.F(r6, r10)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r11 != r1) goto L4e
            goto L80
        L4e:
            r3 = r11
            goto L57
        L50:
            java.lang.String r2 = r2.n
            java.lang.String r5 = "loadBotCommands fail!"
            defpackage.wqi.e(r2, r5, r11)
        L57:
            r11 = r3
            lc2 r11 = (defpackage.lc2) r11
            if (r11 != 0) goto L5d
            return r0
        L5d:
            sr0 r2 = new sr0
            java.util.List r3 = r11.c
            java.util.HashMap r5 = r11.d
            r2.<init>(r3, r5)
            xqf r3 = r10.Y
            k18 r3 = r3.j
            java.lang.Object r3 = r3.getValue()
            rr0 r3 = (defpackage.rr0) r3
            xqf r5 = r10.Y
            pb2 r5 = r5.b
            long r5 = r5.a
            r10.o = r11
            r10.X = r4
            java.lang.Object r2 = r3.e(r5, r2, r10)
            if (r2 != r1) goto L81
        L80:
            return r1
        L81:
            r1 = r11
        L82:
            xqf r11 = r10.Y
            x6i r11 = r11.k
            java.util.List r2 = r1.c
            java.util.HashMap r1 = r1.d
            r11.getClass()
            if (r2 != 0) goto L92
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            goto L9c
        L92:
            i00 r3 = new i00
            r4 = 2
            r3.<init>(r11, r4, r1)
            java.util.ArrayList r11 = defpackage.jqi.g(r2, r3)
        L9c:
            xqf r1 = r10.Y
            r1.o = r11
            return r0
        La1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqf.n(java.lang.Object):java.lang.Object");
    }
}
