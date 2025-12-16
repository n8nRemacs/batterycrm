package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class n9a extends wce implements j9a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(n9a.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public n9a() {
        super(1);
        this.owner$volatile = o9a.a;
    }

    public final boolean d() {
        return Math.max(wce.g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.f(r1, r3.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r0 = r3.f(r4)
            qqg r1 = defpackage.qqg.a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            kotlin.coroutines.Continuation r5 = defpackage.hni.f(r5)
            l42 r5 = defpackage.nyi.a(r5)
            m9a r0 = new m9a     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r3, r5, r4)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.wce.g     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L3c
            int r2 = r3.a     // Catch: java.lang.Throwable -> L3c
            if (r4 > r2) goto L16
            if (r4 <= 0) goto L28
            js0 r4 = r3.b     // Catch: java.lang.Throwable -> L3c
            r0.f(r1, r4)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r4 = r3.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L16
        L2e:
            java.lang.Object r4 = r5.n()
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L37
            goto L38
        L37:
            r4 = r1
        L38:
            if (r4 != r5) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            r5.v()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9a.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.wce.g
            int r1 = r0.get(r7)
            int r2 = r7.a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r2 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.n9a.h
            r4 = 2
            r5 = 1
            if (r1 > 0) goto L3e
            if (r8 != 0) goto L22
        L20:
            r0 = r5
            goto L4a
        L22:
            boolean r0 = r7.d()
            if (r0 != 0) goto L2a
            r0 = r2
            goto L37
        L2a:
            java.lang.Object r0 = r3.get(r7)
            kotlinx.coroutines.internal.Symbol r1 = defpackage.o9a.a
            if (r0 == r1) goto L22
            if (r0 != r8) goto L36
            r0 = r5
            goto L37
        L36:
            r0 = r4
        L37:
            if (r0 == r5) goto L3c
            if (r0 == r4) goto L20
            goto L0
        L3c:
            r0 = r4
            goto L4a
        L3e:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r3.set(r7, r8)
            r0 = r2
        L4a:
            if (r0 == 0) goto L71
            if (r0 == r5) goto L70
            if (r0 == r4) goto L58
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r8.<init>(r0)
            throw r8
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L70:
            return r2
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9a.f(java.lang.Object):boolean");
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = o9a.a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + zg4.a(this) + "[isLocked=" + d() + ",owner=" + h.get(this) + ']';
    }
}
