package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mpa extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ qpa Y;
    public final /* synthetic */ long Z;
    public List o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpa(qpa qpaVar, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = qpaVar;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mpa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mpa(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:40)|(1:(1:(6:6|42|7|39|35|36)(2:13|14))(1:15))(2:21|22)|46|26|44|27|(4:30|39|35|36)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r13 == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r1 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r0 = th;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.X
            qpa r1 = r12.Y
            r2 = 2
            r3 = 1
            java.lang.String r4 = "qpa"
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L32
            if (r0 == r3) goto L27
            if (r0 != r2) goto L1f
            java.util.List r1 = r12.o
            defpackage.g8j.b(r13)     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L1b
            goto L89
        L17:
            r0 = move-exception
        L18:
            r13 = r0
            goto L7e
        L1b:
            r0 = move-exception
            r13 = r0
            goto La3
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            defpackage.g8j.b(r13)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            goto L59
        L2b:
            r0 = move-exception
            r13 = r0
            goto L52
        L2e:
            r0 = move-exception
            r13 = r0
            goto La4
        L32:
            defpackage.g8j.b(r13)
            long r8 = r12.Z
            long r10 = r12.s0
            k18 r13 = r1.b     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            java.lang.Object r13 = r13.getValue()     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r7 = r13
            vs5 r7 = (defpackage.vs5) r7     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r12.X = r3     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            lrd r13 = r7.a     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            ts5 r6 = new ts5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            r6.<init>()     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            java.lang.Object r13 = defpackage.i8j.a(r13, r6, r12)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L2e
            if (r13 != r5) goto L59
            goto L76
        L52:
            java.lang.String r0 = "onSelfReadMarkChanged: failed to remove sent analytics entries"
            defpackage.wqi.b(r4, r0, r13)
            hd5 r13 = defpackage.hd5.a
        L59:
            java.util.List r13 = (java.util.List) r13
            k18 r0 = r1.d     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            java.lang.Object r0 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            wpa r0 = (defpackage.wpa) r0     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            r12.o = r13     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            r12.X = r2     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            lrd r1 = r0.a     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            ia r2 = new ia     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            r3 = 26
            r2.<init>(r0, r3, r13)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            java.lang.Object r0 = defpackage.i8j.a(r1, r2, r12)     // Catch: java.util.concurrent.CancellationException -> L1b java.lang.Throwable -> L7c
            if (r0 != r5) goto L77
        L76:
            return r5
        L77:
            r1 = r13
            r13 = r0
            goto L89
        L7a:
            r1 = r13
            goto L18
        L7c:
            r0 = move-exception
            goto L7a
        L7e:
            java.lang.String r0 = "onSelfReadMarkChanged: failed to remove tracker messages"
            defpackage.wqi.b(r4, r0, r13)
            java.lang.Integer r13 = new java.lang.Integer
            r0 = 0
            r13.<init>(r0)
        L89:
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r0 = r1.size()
            java.lang.String r1 = " analyticsEntries, "
            java.lang.String r2 = " trackerMessages entries"
            java.lang.String r3 = "onSelfReadMarkChanged: removed "
            java.lang.String r13 = defpackage.wy1.g(r3, r0, r1, r13, r2)
            defpackage.wqi.d(r4, r13)
            qqg r13 = defpackage.qqg.a
            return r13
        La3:
            throw r13
        La4:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpa.n(java.lang.Object):java.lang.Object");
    }
}
