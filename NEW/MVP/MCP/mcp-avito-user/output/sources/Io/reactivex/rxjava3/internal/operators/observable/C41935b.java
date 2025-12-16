package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BlockingObservableIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41935b<T> implements Iterable<T> {

    /* compiled from: BlockingObservableIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.b$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.G<T>, Iterator<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: b, reason: collision with root package name */
        public final q41.i<T> f403972b = new q41.i<>(0);

        /* renamed from: c, reason: collision with root package name */
        public final ReentrantLock f403973c;

        /* renamed from: d, reason: collision with root package name */
        public final Condition f403974d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f403975e;

        /* renamed from: f, reason: collision with root package name */
        public volatile Throwable f403976f;

        public a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f403973c = reentrantLock;
            this.f403974d = reentrantLock.newCondition();
        }

        public final void a() {
            ReentrantLock reentrantLock = this.f403973c;
            reentrantLock.lock();
            try {
                this.f403974d.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f403975e = true;
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!i()) {
                boolean z12 = this.f403975e;
                boolean zIsEmpty = this.f403972b.isEmpty();
                if (z12) {
                    Throwable th2 = this.f403976f;
                    if (th2 != null) {
                        throw io.reactivex.rxjava3.internal.util.h.f(th2);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                try {
                    this.f403973c.lock();
                    while (!this.f403975e && this.f403972b.isEmpty() && !i()) {
                        try {
                            this.f403974d.await();
                        } finally {
                        }
                    }
                    this.f403973c.unlock();
                } catch (InterruptedException e12) {
                    DisposableHelper.a(this);
                    a();
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            Throwable th3 = this.f403976f;
            if (th3 == null) {
                return false;
            }
            throw io.reactivex.rxjava3.internal.util.h.f(th3);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return DisposableHelper.b(get());
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                return this.f403972b.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403976f = th2;
            this.f403975e = true;
            a();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403972b.offer(t12);
            a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        new a();
        throw null;
    }
}
