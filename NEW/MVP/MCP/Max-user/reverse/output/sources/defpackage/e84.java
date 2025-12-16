package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class e84 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater Z = AtomicLongFieldUpdater.newUpdater(e84.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater s0 = AtomicLongFieldUpdater.newUpdater(e84.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater t0 = AtomicIntegerFieldUpdater.newUpdater(e84.class, "_isTerminated$volatile");
    public static final Symbol u0 = new Symbol("NOT_IN_STACK");
    public final mv6 X;
    public final ResizableAtomicArray Y;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final mv6 o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public e84(long j, String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            throw new IllegalArgumentException(wy1.e(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(ho7.g("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(wy1.e(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a9h.d(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.o = new mv6(false);
        this.X = new mv6(false);
        this.Y = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void y(e84 e84Var, Runnable runnable, int i) {
        e84Var.w(runnable, e3g.g, (i & 4) == 0);
    }

    public final void P(d84 d84Var, int i, int i2) {
        while (true) {
            long j = Z.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = d84Var.c();
                    while (true) {
                        if (objC == u0) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        d84 d84Var2 = (d84) objC;
                        int iB = d84Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = d84Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (Z.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean Q(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iL = l();
            if (iL == 1 && i2 > 1) {
                l();
            }
            if (iL > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z() {
        Symbol symbol;
        int iB;
        while (true) {
            long j = Z.get(this);
            d84 d84Var = (d84) this.Y.get((int) (2097151 & j));
            if (d84Var == null) {
                d84Var = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objC = d84Var.c();
                while (true) {
                    symbol = u0;
                    if (objC == symbol) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    d84 d84Var2 = (d84) objC;
                    iB = d84Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = d84Var2.c();
                }
                if (iB >= 0) {
                    if (Z.compareAndSet(this, j, iB | j2)) {
                        d84Var.g(symbol);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (d84Var == null) {
                return false;
            }
            if (d84.s0.compareAndSet(d84Var, -1, 0)) {
                LockSupport.unpark(d84Var);
                return true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.e84.t0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.d84
            r3 = 0
            if (r1 == 0) goto L17
            d84 r0 = (defpackage.d84) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            e84 r1 = r0.Z
            boolean r1 = defpackage.fni.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            kotlinx.coroutines.internal.ResizableAtomicArray r1 = r8.Y
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.e84.s0     // Catch: java.lang.Throwable -> Lbf
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lbf
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L75
            r1 = r2
        L36:
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = r8.Y
            java.lang.Object r5 = r5.get(r1)
            d84 r5 = (defpackage.d84) r5
            if (r5 == r0) goto L70
        L40:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L51
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L40
        L51:
            m5i r5 = r5.a
            mv6 r6 = r8.X
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.m5i.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            l2g r7 = (defpackage.l2g) r7
            if (r7 == 0) goto L65
            r6.addLast(r7)
        L65:
            l2g r7 = r5.b()
            if (r7 != 0) goto L6c
            goto L70
        L6c:
            r6.addLast(r7)
            goto L65
        L70:
            if (r1 == r4) goto L75
            int r1 = r1 + 1
            goto L36
        L75:
            mv6 r1 = r8.X
            r1.close()
            mv6 r1 = r8.o
            r1.close()
        L7f:
            if (r0 == 0) goto L87
            l2g r1 = r0.a(r2)
            if (r1 != 0) goto Lae
        L87:
            mv6 r1 = r8.o
            java.lang.Object r1 = r1.removeFirstOrNull()
            l2g r1 = (defpackage.l2g) r1
            if (r1 != 0) goto Lae
            mv6 r1 = r8.X
            java.lang.Object r1 = r1.removeFirstOrNull()
            l2g r1 = (defpackage.l2g) r1
            if (r1 != 0) goto Lae
            if (r0 == 0) goto La1
            r1 = 5
            r0.h(r1)
        La1:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.e84.Z
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.e84.s0
            r0.set(r8, r1)
            return
        Lae:
            r1.run()     // Catch: java.lang.Throwable -> Lb2
            goto L7f
        Lb2:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7f
        Lbf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e84.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y(this, runnable, 6);
    }

    public final int l() {
        synchronized (this.Y) {
            try {
                if (t0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = s0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Y.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                d84 d84Var = new d84(this, i3);
                this.Y.setSynchronized(i3, d84Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                d84Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.Y;
        int iCurrentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iCurrentLength; i6++) {
            d84 d84Var = (d84) resizableAtomicArray.get(i6);
            if (d84Var != null) {
                m5i m5iVar = d84Var.a;
                m5iVar.getClass();
                int i7 = m5i.b.get(m5iVar) != null ? (m5i.c.get(m5iVar) - m5i.d.get(m5iVar)) + 1 : m5i.c.get(m5iVar) - m5i.d.get(m5iVar);
                int iV = az1.v(d84Var.c);
                if (iV == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iV == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iV == 2) {
                    i3++;
                } else if (iV == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iV != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = s0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(zg4.a(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        hf3.g(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        hf3.g(sb4, i2, ", parked = ", i3, ", dormant = ");
        hf3.g(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.o.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.X.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final void w(Runnable runnable, p2g p2gVar, boolean z) {
        l2g w2gVar;
        int i;
        e3g.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof l2g) {
            w2gVar = (l2g) runnable;
            w2gVar.submissionTime = jNanoTime;
            w2gVar.taskContext = p2gVar;
        } else {
            w2gVar = new w2g(runnable, jNanoTime, p2gVar);
        }
        boolean z2 = false;
        boolean z3 = ((l16) w2gVar.taskContext).b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = s0;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        d84 d84Var = threadCurrentThread instanceof d84 ? (d84) threadCurrentThread : null;
        if (d84Var == null || !fni.a(d84Var.Z, this)) {
            d84Var = null;
        }
        if (d84Var != null && (i = d84Var.c) != 5 && (((l16) w2gVar.taskContext).b != 0 || i != 2)) {
            d84Var.Y = true;
            m5i m5iVar = d84Var.a;
            if (z) {
                w2gVar = m5iVar.a(w2gVar);
            } else {
                m5iVar.getClass();
                l2g l2gVar = (l2g) m5i.b.getAndSet(m5iVar, w2gVar);
                w2gVar = l2gVar == null ? null : m5iVar.a(l2gVar);
            }
        }
        if (w2gVar != null) {
            if (!(((l16) w2gVar.taskContext).b == 1 ? this.X.addLast(w2gVar) : this.o.addLast(w2gVar))) {
                throw new RejectedExecutionException(ho7.l(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z && d84Var != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || Z() || Q(jAddAndGet)) {
                return;
            }
            Z();
            return;
        }
        if (z2 || Z() || Q(atomicLongFieldUpdater.get(this))) {
            return;
        }
        Z();
    }
}
