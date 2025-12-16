package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* loaded from: classes.dex */
public abstract class hi5 implements Runnable, Comparable, sy4, ThreadSafeHeapNode {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public hi5(long j) {
        this.a = j;
    }

    public final int c(long j, ii5 ii5Var, ji5 ji5Var) {
        synchronized (this) {
            if (this._heap == li5.a) {
                return 2;
            }
            synchronized (ii5Var) {
                try {
                    hi5 hi5Var = (hi5) ii5Var.firstImpl();
                    if (ji5.Y.get(ji5Var) != 0) {
                        return 1;
                    }
                    if (hi5Var == null) {
                        ii5Var.b = j;
                    } else {
                        long j2 = hi5Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - ii5Var.b > 0) {
                            ii5Var.b = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = ii5Var.b;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    ii5Var.addImpl(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((hi5) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.sy4
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Symbol symbol = li5.a;
                if (obj == symbol) {
                    return;
                }
                ii5 ii5Var = obj instanceof ii5 ? (ii5) obj : null;
                if (ii5Var != null) {
                    ii5Var.remove(this);
                }
                this._heap = symbol;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final ThreadSafeHeap getHeap() {
        Object obj = this._heap;
        if (obj instanceof ThreadSafeHeap) {
            return (ThreadSafeHeap) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final int getIndex() {
        return this.b;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setHeap(ThreadSafeHeap threadSafeHeap) {
        if (this._heap == li5.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setIndex(int i) {
        this.b = i;
    }

    public String toString() {
        return utb.l(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
