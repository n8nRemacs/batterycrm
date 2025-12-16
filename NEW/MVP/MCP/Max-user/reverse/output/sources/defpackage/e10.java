package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class e10 {
    public long a;
    public long b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        Object obj;
        zj5 zj5Var = (zj5) this.e;
        ExecutorService executorService = zj5Var.a;
        if (executorService.isTerminated() || executorService.isShutdown()) {
            return;
        }
        boolean z = true;
        if (((AtomicBoolean) this.c).compareAndSet(true, false)) {
            this.b = zj5.c(zj5Var.g(), this.a);
            try {
                zj5Var.execute((qj4) this.d);
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        if (s65.d(zj5Var.g(), this.b) > 0) {
            this.b = s65.b;
            f4b f4bVar = zj5Var.b;
            yj8 yj8Var = zj5Var.X;
            ReentrantReadWriteLock.ReadLock lock = zj5Var.Y.readLock();
            lock.lock();
            try {
                if (yj8Var.f != 0) {
                    z = false;
                }
                if (z) {
                    obj = hd5.a;
                } else {
                    Object[] objArr = yj8Var.d;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : objArr) {
                        ckh ckhVar = obj2 instanceof ckh ? (ckh) obj2 : null;
                        if (ckhVar != null) {
                            arrayList.add(ckhVar);
                        }
                    }
                    obj = arrayList;
                }
                lock.unlock();
                switch (f4bVar.a) {
                    case 0:
                        ((em6) f4bVar.d.a.X).invoke(obj);
                        return;
                    default:
                        ((em6) f4bVar.d.a.X).invoke(obj);
                        return;
                }
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }

    public o0i b(boolean z) {
        return z ? (j0i) ((bwf) this.e).getValue() : (i0i) ((bwf) this.d).getValue();
    }
}
