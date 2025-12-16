package io.reactivex.rxjava3.internal.operators.observable;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: BlockingObservableNext.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41944e<T> implements Iterable<T> {

    /* compiled from: BlockingObservableNext.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.e$a */
    public static final class a<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        public final b<T> f404012b;

        /* renamed from: c, reason: collision with root package name */
        public T f404013c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f404014d = true;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404015e = true;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f404016f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404017g;

        public a(b bVar) {
            this.f404012b = bVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Throwable th2 = this.f404016f;
            if (th2 != null) {
                throw io.reactivex.rxjava3.internal.util.h.f(th2);
            }
            if (!this.f404014d) {
                return false;
            }
            if (this.f404015e) {
                boolean z12 = this.f404017g;
                b<T> bVar = this.f404012b;
                AtomicInteger atomicInteger = bVar.f404019d;
                if (!z12) {
                    this.f404017g = true;
                    atomicInteger.set(1);
                    new D0((io.reactivex.rxjava3.core.E) null).c(bVar);
                }
                try {
                    atomicInteger.set(1);
                    io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) bVar.f404018c.take();
                    if (!yVar.e()) {
                        this.f404014d = false;
                        if (yVar.d()) {
                            return false;
                        }
                        Throwable thB = yVar.b();
                        this.f404016f = thB;
                        throw io.reactivex.rxjava3.internal.util.h.f(thB);
                    }
                    this.f404015e = false;
                    this.f404013c = (T) yVar.c();
                } catch (InterruptedException e12) {
                    bVar.dispose();
                    this.f404016f = e12;
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public final T next() {
            Throwable th2 = this.f404016f;
            if (th2 != null) {
                throw io.reactivex.rxjava3.internal.util.h.f(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f404015e = true;
            return this.f404013c;
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

    /* compiled from: BlockingObservableNext.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.e$b */
    public static final class b<T> extends io.reactivex.rxjava3.observers.e<io.reactivex.rxjava3.core.y<T>> {

        /* renamed from: c, reason: collision with root package name */
        public final ArrayBlockingQueue f404018c = new ArrayBlockingQueue(1);

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f404019d = new AtomicInteger();

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            C47998a.b(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj;
            if (this.f404019d.getAndSet(0) != 1 && yVar.e()) {
                return;
            }
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.f404018c;
                if (arrayBlockingQueue.offer(yVar)) {
                    return;
                }
                io.reactivex.rxjava3.core.y yVar2 = (io.reactivex.rxjava3.core.y) arrayBlockingQueue.poll();
                if (yVar2 != null && !yVar2.e()) {
                    yVar = yVar2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
        }
    }
}
