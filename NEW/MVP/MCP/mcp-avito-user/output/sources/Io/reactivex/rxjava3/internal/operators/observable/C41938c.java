package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: BlockingObservableLatest.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41938c<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        new a();
        io.reactivex.rxjava3.core.z.J0(null);
        throw null;
    }

    /* compiled from: BlockingObservableLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c$a */
    public static final class a<T> extends io.reactivex.rxjava3.observers.e<io.reactivex.rxjava3.core.y<T>> implements Iterator<T> {

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.core.y<T> f403996c;

        /* renamed from: d, reason: collision with root package name */
        public final Semaphore f403997d = new Semaphore(0);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.core.y<T>> f403998e = new AtomicReference<>();

        @Override // java.util.Iterator
        public final boolean hasNext() throws InterruptedException {
            io.reactivex.rxjava3.core.y<T> yVar = this.f403996c;
            if (yVar != null && NotificationLite.i(yVar.f401975a)) {
                throw io.reactivex.rxjava3.internal.util.h.f(this.f403996c.b());
            }
            if (this.f403996c == null) {
                try {
                    this.f403997d.acquire();
                    io.reactivex.rxjava3.core.y<T> andSet = this.f403998e.getAndSet(null);
                    this.f403996c = andSet;
                    if (NotificationLite.i(andSet.f401975a)) {
                        throw io.reactivex.rxjava3.internal.util.h.f(andSet.b());
                    }
                } catch (InterruptedException e12) {
                    dispose();
                    this.f403996c = io.reactivex.rxjava3.core.y.a(e12);
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            return this.f403996c.e();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tC2 = this.f403996c.c();
            this.f403996c = null;
            return tC2;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            if (this.f403998e.getAndSet((io.reactivex.rxjava3.core.y) obj) == null) {
                this.f403997d.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
        }
    }
}
