package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: BlockingFlowableMostRecent.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41842e<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        new a();
        throw null;
    }

    /* compiled from: BlockingFlowableMostRecent.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e$a */
    public static final class a<T> extends io.reactivex.rxjava3.subscribers.a<T> {

        /* renamed from: c, reason: collision with root package name */
        public volatile Object f402730c;

        /* compiled from: BlockingFlowableMostRecent.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.e$a$a, reason: collision with other inner class name */
        public final class C11462a implements Iterator<T> {

            /* renamed from: b, reason: collision with root package name */
            public Object f402731b;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.f402731b == null) {
                        throw null;
                    }
                    if (NotificationLite.h(this.f402731b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.i(this.f402731b)) {
                        throw io.reactivex.rxjava3.internal.util.h.f(NotificationLite.f(this.f402731b));
                    }
                    return (T) this.f402731b;
                } finally {
                    this.f402731b = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402730c = NotificationLite.e(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402730c = t12;
        }

        @Override // org.reactivestreams.d
        public final void e() {
        }
    }
}
