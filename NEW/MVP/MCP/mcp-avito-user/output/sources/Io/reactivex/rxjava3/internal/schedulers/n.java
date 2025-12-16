package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s41.C47998a;

/* compiled from: ScheduledRunnable.java */
/* loaded from: classes8.dex */
public final class n extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, io.reactivex.rxjava3.disposables.d {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f404738c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f404739d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f404740e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f404741f = new Object();
    private static final long serialVersionUID = -6120223772001106981L;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f404742b;

    public n(Runnable runnable, io.reactivex.rxjava3.disposables.e eVar) {
        super(3);
        this.f404742b = runnable;
        lazySet(0, eVar);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f404741f) {
                return;
            }
            if (obj == f404739d) {
                future.cancel(false);
                return;
            } else if (obj == f404740e) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f404741f;
            if (obj6 == obj || obj6 == (obj4 = f404739d) || obj6 == (obj5 = f404740e)) {
                break;
            }
            boolean z12 = get(2) != Thread.currentThread();
            if (z12) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z12);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f404738c) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((io.reactivex.rxjava3.disposables.e) obj2).c(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        Object obj = get(0);
        return obj == f404738c || obj == f404741f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f404740e;
        Object obj4 = f404739d;
        Object obj5 = f404738c;
        Object obj6 = f404741f;
        lazySet(2, Thread.currentThread());
        try {
            this.f404742b.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((io.reactivex.rxjava3.disposables.e) obj7).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th2) {
            try {
                C47998a.b(th2);
                throw th2;
            } catch (Throwable th3) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((io.reactivex.rxjava3.disposables.e) obj8).c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strA;
        Object obj = get(1);
        if (obj == f404741f) {
            strA = "Finished";
        } else if (obj == f404739d) {
            strA = "Disposed(Sync)";
        } else if (obj == f404740e) {
            strA = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            strA = obj2 == null ? "Waiting" : androidx.camera.view.k.a(obj2, "Running on ");
        }
        return n.class.getSimpleName() + "[" + strA + "]";
    }
}
