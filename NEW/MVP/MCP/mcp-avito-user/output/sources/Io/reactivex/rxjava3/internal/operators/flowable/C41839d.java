package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: BlockingFlowableLatest.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41839d<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        a aVar = new a();
        AbstractC41777j abstractC41777jG = AbstractC41777j.g(null);
        abstractC41777jG.getClass();
        new J0(abstractC41777jG).q(aVar);
        return aVar;
    }

    /* compiled from: BlockingFlowableLatest.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.d$a */
    public static final class a<T> extends io.reactivex.rxjava3.subscribers.b<io.reactivex.rxjava3.core.y<T>> implements Iterator<T> {

        /* renamed from: c, reason: collision with root package name */
        public final Semaphore f402713c = new Semaphore(0);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.core.y<T>> f402714d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.core.y<T> f402715e;

        @Override // java.util.Iterator
        public final boolean hasNext() throws InterruptedException {
            io.reactivex.rxjava3.core.y<T> yVar = this.f402715e;
            if (yVar != null && NotificationLite.i(yVar.f401975a)) {
                throw io.reactivex.rxjava3.internal.util.h.f(this.f402715e.b());
            }
            io.reactivex.rxjava3.core.y<T> yVar2 = this.f402715e;
            if ((yVar2 == null || yVar2.e()) && this.f402715e == null) {
                try {
                    this.f402713c.acquire();
                    io.reactivex.rxjava3.core.y<T> andSet = this.f402714d.getAndSet(null);
                    this.f402715e = andSet;
                    if (NotificationLite.i(andSet.f401975a)) {
                        throw io.reactivex.rxjava3.internal.util.h.f(andSet.b());
                    }
                } catch (InterruptedException e12) {
                    dispose();
                    this.f402715e = io.reactivex.rxjava3.core.y.a(e12);
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            return this.f402715e.e();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext() || !this.f402715e.e()) {
                throw new NoSuchElementException();
            }
            T tC2 = this.f402715e.c();
            this.f402715e = null;
            return tC2;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            if (this.f402714d.getAndSet((io.reactivex.rxjava3.core.y) obj) == null) {
                this.f402713c.release();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
