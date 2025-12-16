package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BlockingFlowableIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41836c<T> implements Iterable<T> {

    /* compiled from: BlockingFlowableIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.c$a */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements InterfaceC41782o<T>, Iterator<T>, Runnable, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: b, reason: collision with root package name */
        public final q41.h<T> f402675b = new q41.h<>(0);

        /* renamed from: c, reason: collision with root package name */
        public final long f402676c = 0;

        /* renamed from: d, reason: collision with root package name */
        public final long f402677d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final ReentrantLock f402678e;

        /* renamed from: f, reason: collision with root package name */
        public final Condition f402679f;

        /* renamed from: g, reason: collision with root package name */
        public long f402680g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402681h;

        /* renamed from: i, reason: collision with root package name */
        public volatile Throwable f402682i;

        public a() {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f402678e = reentrantLock;
            this.f402679f = reentrantLock.newCondition();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.e(this, eVar, this.f402676c);
        }

        public final void a() {
            ReentrantLock reentrantLock = this.f402678e;
            reentrantLock.lock();
            try {
                this.f402679f.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            SubscriptionHelper.a(this);
            a();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402681h = true;
            a();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (!getF318621e()) {
                boolean z12 = this.f402681h;
                boolean zIsEmpty = this.f402675b.isEmpty();
                if (z12) {
                    Throwable th2 = this.f402682i;
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
                this.f402678e.lock();
                while (!this.f402681h && this.f402675b.isEmpty() && !getF318621e()) {
                    try {
                        try {
                            this.f402679f.await();
                        } catch (InterruptedException e12) {
                            run();
                            throw io.reactivex.rxjava3.internal.util.h.f(e12);
                        }
                    } finally {
                        this.f402678e.unlock();
                    }
                }
            }
            Throwable th3 = this.f402682i;
            if (th3 == null) {
                return false;
            }
            throw io.reactivex.rxjava3.internal.util.h.f(th3);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == SubscriptionHelper.f404813b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tPoll = this.f402675b.poll();
            long j12 = this.f402680g + 1;
            if (j12 == this.f402677d) {
                this.f402680g = 0L;
                get().request(j12);
            } else {
                this.f402680g = j12;
            }
            return tPoll;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402682i = th2;
            this.f402681h = true;
            a();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402675b.offer(t12)) {
                a();
            } else {
                SubscriptionHelper.a(this);
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubscriptionHelper.a(this);
            a();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        new a();
        throw null;
    }
}
