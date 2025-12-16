package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.internal.observers.z;

/* compiled from: QueueDrainHelper.java */
/* loaded from: classes8.dex */
public final class p {
    public p() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(boolean z12, boolean z13, io.reactivex.rxjava3.observers.m mVar, q41.f fVar, io.reactivex.rxjava3.disposables.d dVar, z zVar) {
        if (zVar.f402140e) {
            fVar.clear();
            dVar.dispose();
            return true;
        }
        if (!z12 || !z13) {
            return false;
        }
        if (dVar != null) {
            dVar.dispose();
        }
        mVar.e();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r1 = r13.g(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(io.reactivex.rxjava3.internal.queue.a r10, io.reactivex.rxjava3.observers.m r11, io.reactivex.rxjava3.disposables.d r12, io.reactivex.rxjava3.internal.observers.z r13) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r13.f402141f
            boolean r3 = r10.isEmpty()
            r4 = r11
            r5 = r10
            r6 = r12
            r7 = r13
            boolean r2 = a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L13
            return
        L13:
            boolean r3 = r13.f402141f
            java.lang.Object r2 = r10.poll()
            if (r2 != 0) goto L1d
            r9 = r0
            goto L1f
        L1d:
            r4 = 0
            r9 = r4
        L1f:
            r4 = r9
            r5 = r11
            r6 = r10
            r7 = r12
            r8 = r13
            boolean r3 = a(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L2b
            return
        L2b:
            if (r9 == 0) goto L35
            int r1 = -r1
            int r1 = r13.g(r1)
            if (r1 != 0) goto L2
            return
        L35:
            r13.a(r11, r2)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.p.b(io.reactivex.rxjava3.internal.queue.a, io.reactivex.rxjava3.observers.m, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.internal.observers.z):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r10 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(io.reactivex.rxjava3.internal.queue.a r8, io.reactivex.rxjava3.subscribers.e r9, io.reactivex.rxjava3.disposables.d r10, io.reactivex.rxjava3.internal.subscribers.o r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.f404798g
            java.lang.Object r3 = r8.poll()
            if (r3 != 0) goto Lc
            r4 = r0
            goto Ld
        Lc:
            r4 = 0
        Ld:
            boolean r5 = r11.f404797f
            if (r5 == 0) goto L15
            r8.clear()
            goto L1c
        L15:
            if (r2 == 0) goto L22
            if (r4 == 0) goto L22
            r9.e()
        L1c:
            if (r10 == 0) goto L21
            r10.dispose()
        L21:
            return
        L22:
            if (r4 == 0) goto L2c
            int r1 = -r1
            int r1 = r11.d(r1)
            if (r1 != 0) goto L2
            return
        L2c:
            long r4 = r11.g()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L49
            boolean r2 = r11.a(r9, r3)
            if (r2 == 0) goto L2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L2
            r11.f()
            goto L2
        L49:
            r8.clear()
            if (r10 == 0) goto L51
            r10.dispose()
        L51:
            io.reactivex.rxjava3.exceptions.MissingBackpressureException r8 = new io.reactivex.rxjava3.exceptions.MissingBackpressureException
            java.lang.String r10 = "Could not emit value due to lack of requests."
            r8.<init>(r10)
            r9.onError(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.util.p.c(io.reactivex.rxjava3.internal.queue.a, io.reactivex.rxjava3.subscribers.e, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.internal.subscribers.o):void");
    }
}
