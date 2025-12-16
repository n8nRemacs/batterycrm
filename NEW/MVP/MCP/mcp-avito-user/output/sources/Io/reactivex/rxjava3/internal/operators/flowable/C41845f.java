package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: BlockingFlowableNext.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41845f<T> implements Iterable<T> {

    /* compiled from: BlockingFlowableNext.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f$a */
    public static final class a<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final b<T> f402761b;

        /* renamed from: c, reason: collision with root package name */
        public T f402762c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402763d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402764e = true;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f402765f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402766g;

        public a(b bVar) {
            this.f402761b = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f402765f;
            if (th2 != null) {
                throw io.reactivex.rxjava3.internal.util.h.f(th2);
            }
            if (!this.f402763d) {
                return false;
            }
            if (this.f402764e) {
                b<T> bVar = this.f402761b;
                try {
                    boolean z12 = this.f402766g;
                    AtomicInteger atomicInteger = bVar.f402768d;
                    if (!z12) {
                        this.f402766g = true;
                        atomicInteger.set(1);
                        AbstractC41777j abstractC41777jG = AbstractC41777j.g(null);
                        abstractC41777jG.getClass();
                        new J0(abstractC41777jG).q(bVar);
                    }
                    atomicInteger.set(1);
                    io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) bVar.f402767c.take();
                    if (!yVar.e()) {
                        this.f402763d = false;
                        if (yVar.d()) {
                            return false;
                        }
                        Throwable thB = yVar.b();
                        this.f402765f = thB;
                        throw io.reactivex.rxjava3.internal.util.h.f(thB);
                    }
                    this.f402764e = false;
                    this.f402762c = (T) yVar.c();
                } catch (InterruptedException e12) {
                    bVar.dispose();
                    this.f402765f = e12;
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f402765f;
            if (th2 != null) {
                throw io.reactivex.rxjava3.internal.util.h.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f402764e = true;
            return this.f402762c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(new b());
    }

    /* compiled from: BlockingFlowableNext.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.f$b */
    public static final class b<T> extends io.reactivex.rxjava3.subscribers.b<io.reactivex.rxjava3.core.y<T>> {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayBlockingQueue f402767c = new ArrayBlockingQueue(1);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f402768d = new AtomicInteger();

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            C47998a.b(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj;
            if (this.f402768d.getAndSet(0) != 1 && yVar.e()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f402767c;
                if (arrayBlockingQueue.offer(yVar)) {
                    return;
                }
                io.reactivex.rxjava3.core.y yVar2 = (io.reactivex.rxjava3.core.y) arrayBlockingQueue.poll();
                if (yVar2 != null && !yVar2.e()) {
                    yVar = yVar2;
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
