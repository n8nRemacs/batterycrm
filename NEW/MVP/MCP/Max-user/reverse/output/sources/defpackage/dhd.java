package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class dhd implements AutoCloseable {
    public final AtomicBoolean a;
    public final bhd b;
    public final long c;
    public final xw5 d;
    public final kce o;

    public dhd(bhd bhdVar, long j, xw5 xw5Var, boolean z) {
        kce kceVar;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        if (Build.VERSION.SDK_INT >= 30) {
            kceVar = new kce(11, new mc3());
        } else {
            kceVar = new kce(11, new qha(16));
        }
        this.o = kceVar;
        this.b = bhdVar;
        this.c = j;
        this.d = xw5Var;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((nc3) kceVar.b).c("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r11, java.lang.RuntimeException r12) {
        /*
            r10 = this;
            kce r0 = r10.o
            java.lang.Object r0 = r0.b
            nc3 r0 = (defpackage.nc3) r0
            r0.close()
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L14
            goto La6
        L14:
            bhd r2 = r10.b
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            java.lang.Object r8 = r2.h
            monitor-enter(r8)
            gb0 r1 = r2.n     // Catch: java.lang.Throwable -> L40
            boolean r1 = defpackage.bhd.p(r10, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L44
            gb0 r1 = r2.m     // Catch: java.lang.Throwable -> L40
            boolean r1 = defpackage.bhd.p(r10, r1)     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L44
            java.lang.String r11 = "Recorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L40
            xw5 r0 = r10.d     // Catch: java.lang.Throwable -> L40
            r12.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L40
            defpackage.gri.a(r11, r12)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r0 = move-exception
            r11 = r0
            goto Laf
        L44:
            ahd r0 = r2.j     // Catch: java.lang.Throwable -> L40
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L40
            r9 = 0
            switch(r0) {
                case 0: goto La7;
                case 1: goto L79;
                case 2: goto L79;
                case 3: goto La7;
                case 4: goto L5b;
                case 5: goto L5b;
                case 6: goto L51;
                case 7: goto L51;
                default: goto L4e;
            }     // Catch: java.lang.Throwable -> L40
        L4e:
            r6 = r11
            r7 = r12
            goto L8c
        L51:
            gb0 r0 = r2.m     // Catch: java.lang.Throwable -> L40
            boolean r0 = defpackage.bhd.p(r10, r0)     // Catch: java.lang.Throwable -> L40
            defpackage.z5j.f(r9, r0)     // Catch: java.lang.Throwable -> L40
            goto L4e
        L5b:
            ahd r0 = defpackage.ahd.Y     // Catch: java.lang.Throwable -> L40
            r2.D(r0)     // Catch: java.lang.Throwable -> L40
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L40
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L40
            long r4 = r0.toMicros(r3)     // Catch: java.lang.Throwable -> L40
            gb0 r3 = r2.m     // Catch: java.lang.Throwable -> L40
            qee r0 = r2.e     // Catch: java.lang.Throwable -> L40
            ugd r1 = new ugd     // Catch: java.lang.Throwable -> L40
            r6 = r11
            r7 = r12
            r1.<init>()     // Catch: java.lang.Throwable -> L40
            r0.execute(r1)     // Catch: java.lang.Throwable -> L40
            goto L8c
        L79:
            r6 = r11
            r7 = r12
            gb0 r11 = r2.n     // Catch: java.lang.Throwable -> L40
            boolean r11 = defpackage.bhd.p(r10, r11)     // Catch: java.lang.Throwable -> L40
            defpackage.z5j.f(r9, r11)     // Catch: java.lang.Throwable -> L40
            gb0 r11 = r2.n     // Catch: java.lang.Throwable -> L40
            r2.n = r9     // Catch: java.lang.Throwable -> L40
            r2.y()     // Catch: java.lang.Throwable -> L40
            r9 = r11
        L8c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto La6
            r11 = 10
            if (r6 != r11) goto L9a
            java.lang.String r11 = "Recorder"
            java.lang.String r12 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            defpackage.gri.b(r11, r12)
        L9a:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r7)
            r12 = 8
            r2.j(r9, r12, r11)
        La6:
            return
        La7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Laf:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L40
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhd.c(int, java.lang.RuntimeException):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            ((nc3) this.o.b).b();
            c(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
