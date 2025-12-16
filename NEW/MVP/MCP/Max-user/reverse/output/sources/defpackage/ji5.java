package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public abstract class ji5 extends ki5 implements ms4 {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(ji5.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(ji5.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(ji5.class, "_isCompleted$volatile");

    @Override // defpackage.ki5
    public final long Z() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Runnable runnable;
        hi5 hi5Var;
        if (h0()) {
            return 0L;
        }
        k0();
        loop0: while (true) {
            atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof LockFreeTaskQueueCore)) {
                if (obj != li5.b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore = (LockFreeTaskQueueCore) obj;
            Object objRemoveFirstOrNull = lockFreeTaskQueueCore.removeFirstOrNull();
            if (objRemoveFirstOrNull != LockFreeTaskQueueCore.REMOVE_FROZEN) {
                runnable = (Runnable) objRemoveFirstOrNull;
                break;
            }
            LockFreeTaskQueueCore next = lockFreeTaskQueueCore.next();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, next) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        js jsVar = this.c;
        if (((jsVar == null || jsVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != null) {
                if (obj2 instanceof LockFreeTaskQueueCore) {
                    if (((LockFreeTaskQueueCore) obj2).isEmpty()) {
                    }
                } else if (obj2 == li5.b) {
                    return BuildConfig.MAX_TIME_TO_UPLOAD;
                }
            }
            ii5 ii5Var = (ii5) X.get(this);
            if (ii5Var != null && (hi5Var = (hi5) ii5Var.peek()) != null) {
                long jNanoTime = hi5Var.a - System.nanoTime();
                if (jNanoTime >= 0) {
                    return jNanoTime;
                }
            }
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        return 0L;
    }

    @Override // defpackage.ms4
    public final Object delay(long j, Continuation continuation) {
        return q8j.a(this, j, continuation);
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        j0(runnable);
    }

    @Override // defpackage.ms4
    public sy4 invokeOnTimeout(long j, Runnable runnable, x74 x74Var) {
        return lm4.a.invokeOnTimeout(j, runnable, x74Var);
    }

    public void j0(Runnable runnable) {
        k0();
        if (!l0(runnable)) {
            km4.Z.j0(runnable);
            return;
        }
        Thread threadY = y();
        if (Thread.currentThread() != threadY) {
            LockSupport.unpark(threadY);
        }
    }

    public final void k0() {
        ThreadSafeHeapNode threadSafeHeapNodeRemoveAtImpl;
        ii5 ii5Var = (ii5) X.get(this);
        if (ii5Var == null || ii5Var.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (ii5Var) {
                try {
                    ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = ii5Var.firstImpl();
                    if (threadSafeHeapNodeFirstImpl != null) {
                        hi5 hi5Var = (hi5) threadSafeHeapNodeFirstImpl;
                        threadSafeHeapNodeRemoveAtImpl = ((jNanoTime - hi5Var.a) > 0L ? 1 : ((jNanoTime - hi5Var.a) == 0L ? 0 : -1)) >= 0 ? l0(hi5Var) : false ? ii5Var.removeAtImpl(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((hi5) threadSafeHeapNodeRemoveAtImpl) != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ji5.o
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ji5.Y
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L47
            r4 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            int r5 = r4.addLast(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r4.next()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            kotlinx.coroutines.internal.Symbol r4 = defpackage.li5.b
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.addLast(r4)
            r3.addLast(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji5.l0(java.lang.Runnable):boolean");
    }

    public final boolean m0() {
        js jsVar = this.c;
        if (!(jsVar != null ? jsVar.isEmpty() : true)) {
            return false;
        }
        ii5 ii5Var = (ii5) X.get(this);
        if (ii5Var != null && !ii5Var.isEmpty()) {
            return false;
        }
        Object obj = o.get(this);
        if (obj != null) {
            if (obj instanceof LockFreeTaskQueueCore) {
                return ((LockFreeTaskQueueCore) obj).isEmpty();
            }
            if (obj != li5.b) {
                return false;
            }
        }
        return true;
    }

    public final void n0(long j, hi5 hi5Var) {
        int iC;
        Thread threadY;
        int i = Y.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        if (i != 0) {
            iC = 1;
        } else {
            ii5 ii5Var = (ii5) atomicReferenceFieldUpdater.get(this);
            if (ii5Var == null) {
                ii5 ii5Var2 = new ii5();
                ii5Var2.b = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ii5Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                ii5Var = (ii5) atomicReferenceFieldUpdater.get(this);
            }
            iC = hi5Var.c(j, ii5Var, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                i0(j, hi5Var);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        ii5 ii5Var3 = (ii5) atomicReferenceFieldUpdater.get(this);
        if ((ii5Var3 != null ? (hi5) ii5Var3.peek() : null) != hi5Var || Thread.currentThread() == (threadY = y())) {
            return;
        }
        LockSupport.unpark(threadY);
    }

    @Override // defpackage.ms4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo14scheduleResumeAfterDelay(long j, k42 k42Var) {
        Symbol symbol = li5.a;
        long j2 = j > 0 ? j >= 9223372036854L ? BuildConfig.MAX_TIME_TO_UPLOAD : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            fi5 fi5Var = new fi5(this, j2 + jNanoTime, k42Var);
            n0(jNanoTime, fi5Var);
            nyi.b(k42Var, new y32(2, fi5Var));
        }
    }

    @Override // defpackage.ki5
    public void shutdown() {
        hi5 hi5Var;
        r7g.a.set(null);
        Y.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != li5.b) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                        lockFreeTaskQueueCore.addLast((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((LockFreeTaskQueueCore) obj).close();
                break;
            }
            Symbol symbol = li5.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (Z() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            ii5 ii5Var = (ii5) X.get(this);
            if (ii5Var == null || (hi5Var = (hi5) ii5Var.removeFirstOrNull()) == null) {
                return;
            } else {
                i0(jNanoTime, hi5Var);
            }
        }
    }
}
