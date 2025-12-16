package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.android.notifications.NotificationsImagesProvider;

/* loaded from: classes.dex */
public final class yna extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsImagesProvider Y;
    public final /* synthetic */ Uri Z;
    public int o;
    public final /* synthetic */ c1f s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yna(NotificationsImagesProvider notificationsImagesProvider, Uri uri, c1f c1fVar, Continuation continuation) {
        super(2, continuation);
        this.Y = notificationsImagesProvider;
        this.Z = uri;
        this.s0 = c1fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yna) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yna ynaVar = new yna(this.Y, this.Z, this.s0, continuation);
        ynaVar.X = obj;
        return ynaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (one.me.android.notifications.NotificationsImagesProvider.b(r2, r7, r6) == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r7 == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [f84, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            java.lang.String r1 = "fetchAndGetCachedFileSync fail"
            one.me.android.notifications.NotificationsImagesProvider r2 = r6.Y
            r3 = 2
            r4 = 1
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L30
            if (r0 == r4) goto L24
            if (r0 != r3) goto L1c
            java.lang.Object r0 = r6.X
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1a
            goto L69
        L18:
            r7 = move-exception
            goto L5d
        L1a:
            r7 = move-exception
            goto L6a
        L1c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L24:
            java.lang.Object r0 = r6.X
            f84 r0 = (defpackage.f84) r0
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            goto L50
        L2c:
            r7 = move-exception
            goto L45
        L2e:
            r7 = move-exception
            goto L6b
        L30:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            r0 = r7
            f84 r0 = (defpackage.f84) r0
            android.net.Uri r7 = r6.Z
            r6.X = r0     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            r6.o = r4     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            java.lang.Object r7 = one.me.android.notifications.NotificationsImagesProvider.b(r2, r7, r6)     // Catch: java.lang.Throwable -> L2c java.util.concurrent.CancellationException -> L2e
            if (r7 != r5) goto L50
            goto L5c
        L45:
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            defpackage.wqi.b(r4, r1, r7)
        L50:
            c1f r7 = r6.s0
            r6.X = r0     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1a
            r6.o = r3     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1a
            java.lang.Object r7 = one.me.android.notifications.NotificationsImagesProvider.a(r2, r0, r7, r6)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1a
            if (r7 != r5) goto L69
        L5c:
            return r5
        L5d:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            defpackage.wqi.b(r0, r1, r7)
            r7 = 0
        L69:
            return r7
        L6a:
            throw r7
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yna.n(java.lang.Object):java.lang.Object");
    }
}
