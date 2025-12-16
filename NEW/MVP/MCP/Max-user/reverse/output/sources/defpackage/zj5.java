package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public class zj5 implements ExecutorService {
    public static final AtomicInteger t0 = new AtomicInteger(0);
    public final yj8 X;
    public final ReentrantReadWriteLock Y;
    public final Condition Z;
    public final ExecutorService a;
    public final f4b b;
    public final wj5 c;
    public volatile boolean d;
    public final AtomicLong o;
    public volatile Thread s0;

    public zj5(ExecutorService executorService, f4b f4bVar, em6 em6Var) {
        wj5.s.getClass();
        kc3 kc3Var = kc3.w0;
        this.a = executorService;
        this.b = f4bVar;
        this.c = kc3Var;
        this.o = new AtomicLong(0L);
        yj8 yj8Var = new yj8();
        yj8Var.b = gei.a;
        yj8Var.c = gei.b;
        yj8Var.d = gei.c;
        yj8Var.c(6);
        this.X = yj8Var;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.Y = reentrantReadWriteLock;
        this.Z = reentrantReadWriteLock.writeLock().newCondition();
        em6Var.invoke(new qj4(23, this));
    }

    public static long c(long j, long j2) {
        long jG = s65.g(j);
        long jG2 = s65.g(j2);
        long j3 = jG + jG2;
        return ((jG ^ j3) & (jG2 ^ j3)) < 0 ? v9j.i(BuildConfig.MAX_TIME_TO_UPLOAD, y65.MILLISECONDS) : v9j.i(j3, y65.MILLISECONDS);
    }

    public final void a(long j) {
        yj8 yj8Var = this.X;
        ReentrantReadWriteLock reentrantReadWriteLock = this.Y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            yj8Var.d(j);
            int i3 = yj8Var.f;
            int i4 = yj8Var.e;
            if (i3 / i4 < 0.25f && i4 >= 4192) {
                int i5 = i3 == 7 ? 8 : i3 + ((i3 - 1) / 7);
                int iNumberOfLeadingZeros = i5 > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i5) : 0;
                if (iNumberOfLeadingZeros < i4) {
                    yj8Var.e(iNumberOfLeadingZeros);
                }
            }
            this.Z.signal();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final ckh b() {
        String name = Thread.currentThread().getName();
        long jG = g();
        return new ckh(name, jG, jG, null, hd5.a);
    }

    public final void d() {
        this.d = true;
        ReentrantReadWriteLock reentrantReadWriteLock = this.Y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.Z.signal();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final long e(ckh ckhVar) {
        long andIncrement = this.o.getAndIncrement();
        ReentrantReadWriteLock reentrantReadWriteLock = this.Y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.X.f(andIncrement, ckh.a(ckhVar, 0L, this.s0, 23));
            return andIncrement;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(i(runnable, b()));
    }

    public final void f(long j) {
        yj8 yj8Var = this.X;
        ReentrantReadWriteLock reentrantReadWriteLock = this.Y;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ckh ckhVar = (ckh) yj8Var.b(j);
            ckh ckhVarA = ckhVar != null ? ckh.a(ckhVar, g(), Thread.currentThread(), 19) : null;
            if (ckhVarA != null) {
                yj8Var.f(j, ckhVarA);
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final long g() {
        ((kc3) this.c).getClass();
        int i = s65.d;
        return v9j.i(System.nanoTime(), y65.NANOSECONDS);
    }

    public final xj5 h(Callable callable, ckh ckhVar) {
        return new xj5(callable, new tj5(this, e(ckhVar), 0), new uj5(this, 0));
    }

    public final yj5 i(Runnable runnable, ckh ckhVar) {
        return new yj5(runnable, new tj5(this, e(ckhVar), 1), new uj5(this, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(we3.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        ArrayList arrayList = new ArrayList(we3.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
        d();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.a.shutdownNow();
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : listShutdownNow) {
            if (runnable instanceof yj5) {
                runnable = ((yj5) runnable).a;
            }
            arrayList.add(runnable);
        }
        d();
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.a.submit(h(callable, b()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(i(runnable, b()), obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.a.submit(i(runnable, b()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(we3.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(we3.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList, j, timeUnit);
    }
}
