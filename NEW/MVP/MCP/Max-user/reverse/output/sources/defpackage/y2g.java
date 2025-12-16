package defpackage;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class y2g {
    public boolean a;
    public k2g b;
    public final ArrayList c = new ArrayList();
    public boolean d;
    public final b3g e;
    public final String f;

    public y2g(b3g b3gVar, String str) {
        this.e = b3gVar;
        this.f = str;
    }

    public final void a() {
        byte[] bArr = yxg.a;
        synchronized (this.e) {
            if (b()) {
                this.e.d(this);
            }
        }
    }

    public final boolean b() {
        k2g k2gVar = this.b;
        if (k2gVar != null && k2gVar.d) {
            this.d = true;
        }
        ArrayList arrayList = this.c;
        boolean z = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((k2g) arrayList.get(size)).d) {
                k2g k2gVar2 = (k2g) arrayList.get(size);
                if (b3g.i.isLoggable(Level.FINE)) {
                    v8d.a(k2gVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(k2g k2gVar, long j) {
        synchronized (this.e) {
            if (!this.a) {
                if (d(k2gVar, j, false)) {
                    this.e.d(this);
                }
            } else if (k2gVar.d) {
                if (b3g.i.isLoggable(Level.FINE)) {
                    v8d.a(k2gVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (b3g.i.isLoggable(Level.FINE)) {
                    v8d.a(k2gVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.k2g r11, long r12, boolean r14) {
        /*
            r10 = this;
            y2g r0 = r11.a
            if (r0 != r10) goto L5
            goto L9
        L5:
            if (r0 != 0) goto L85
            r11.a = r10
        L9:
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.c
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L32
            long r8 = r11.b
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L2f
            java.util.logging.Logger r12 = defpackage.b3g.i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L84
            java.lang.String r12 = "already scheduled"
            defpackage.v8d.a(r11, r10, r12)
            return r6
        L2f:
            r4.remove(r5)
        L32:
            r11.b = r2
            java.util.logging.Logger r5 = defpackage.b3g.i
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L5a
            if (r14 == 0) goto L4c
            long r2 = r2 - r0
            java.lang.String r14 = defpackage.v8d.b(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L57
        L4c:
            long r2 = r2 - r0
            java.lang.String r14 = defpackage.v8d.b(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L57:
            defpackage.v8d.a(r11, r10, r14)
        L5a:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L5f:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r14.next()
            k2g r3 = (defpackage.k2g) r3
            long r8 = r3.b
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L73
            goto L77
        L73:
            int r2 = r2 + 1
            goto L5f
        L76:
            r2 = r7
        L77:
            if (r2 != r7) goto L7d
            int r2 = r4.size()
        L7d:
            r4.add(r2, r11)
            if (r2 != 0) goto L84
            r11 = 1
            return r11
        L84:
            return r6
        L85:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y2g.d(k2g, long, boolean):boolean");
    }

    public final void e() {
        byte[] bArr = yxg.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.d(this);
            }
        }
    }

    public final String toString() {
        return this.f;
    }
}
