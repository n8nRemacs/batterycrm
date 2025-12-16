package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dia extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eia Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dia(eia eiaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = eiaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dia) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dia diaVar = new dia(this.Y, continuation);
        diaVar.X = obj;
        return diaVar;
    }

    /* JADX WARN: Path cross not found for [B:11:0x0033, B:28:0x0069], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:11:0x0033, B:31:0x0070], limit reached: 55 */
    /* JADX WARN: Path cross not found for [B:33:0x007f, B:43:0x00a9], limit reached: 55 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:19:0x0053, B:21:0x0059), top: B:53:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0067 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:11:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a1 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00af -> B:11:0x0033). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            eia r0 = r10.Y
            n8a r1 = r0.e
            java.util.concurrent.locks.ReentrantLock r2 = r0.f
            int r3 = r10.o
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r3 == 0) goto L2c
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1b
            java.lang.Object r3 = r10.X
            f84 r3 = (defpackage.f84) r3
            defpackage.g8j.b(r11)
            r11 = r3
            goto L33
        L1b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L23:
            java.lang.Object r3 = r10.X
            f84 r3 = (defpackage.f84) r3
            defpackage.g8j.b(r11)
            r11 = r3
            goto L50
        L2c:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.X
            f84 r11 = (defpackage.f84) r11
        L33:
            yy7[] r3 = defpackage.eia.i
            boolean r3 = r0.e()
            if (r3 == 0) goto Lbc
            boolean r3 = defpackage.d7j.f(r11)
            if (r3 == 0) goto Lbc
            long r7 = r0.b()
            r10.X = r11
            r10.o = r5
            java.lang.Object r3 = defpackage.s8j.d(r7, r10)
            if (r3 != r6) goto L50
            goto La3
        L50:
            r2.lock()
            boolean r3 = r1.i()     // Catch: java.lang.Throwable -> L61
            if (r3 != 0) goto L63
            n8a r3 = defpackage.dsi.a(r1)     // Catch: java.lang.Throwable -> L61
            r1.c()     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r11 = move-exception
            goto Lb8
        L63:
            r3 = 0
        L64:
            r2.unlock()
            if (r3 == 0) goto L33
            boolean r7 = r3.i()
            if (r7 == 0) goto L70
            goto L33
        L70:
            t9f r7 = r0.g
            yy7[] r8 = defpackage.eia.i
            r9 = 0
            r8 = r8[r9]
            java.lang.Object r7 = r7.D(r0, r8)
            qt7 r7 = (defpackage.qt7) r7
            if (r7 == 0) goto La9
            boolean r7 = r7.isActive()
            if (r7 != 0) goto La9
            r2.lock()
            int r7 = defpackage.s65.d     // Catch: java.lang.Throwable -> La4
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La4
            y65 r9 = defpackage.y65.NANOSECONDS     // Catch: java.lang.Throwable -> La4
            long r7 = defpackage.v9j.i(r7, r9)     // Catch: java.lang.Throwable -> La4
            r0.h = r7     // Catch: java.lang.Throwable -> La4
            r2.unlock()
            r10.X = r11
            r10.o = r4
            java.lang.Object r3 = r0.c(r3, r10)
            if (r3 != r6) goto L33
        La3:
            return r6
        La4:
            r11 = move-exception
            r2.unlock()
            throw r11
        La9:
            r2.lock()
            r1.b(r3)     // Catch: java.lang.Throwable -> Lb3
            r2.unlock()
            goto L33
        Lb3:
            r11 = move-exception
            r2.unlock()
            throw r11
        Lb8:
            r2.unlock()
            throw r11
        Lbc:
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dia.n(java.lang.Object):java.lang.Object");
    }
}
