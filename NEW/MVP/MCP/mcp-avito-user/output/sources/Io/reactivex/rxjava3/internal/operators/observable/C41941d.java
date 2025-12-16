package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: BlockingObservableMostRecent.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41941d<T> implements Iterable<T> {
    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        new a();
        throw null;
    }

    /* compiled from: BlockingObservableMostRecent.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d$a */
    public static final class a<T> extends io.reactivex.rxjava3.observers.b<T> {

        /* renamed from: c, reason: collision with root package name */
        public volatile Object f404006c;

        /* compiled from: BlockingObservableMostRecent.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d$a$a, reason: collision with other inner class name */
        public final class C11501a implements Iterator<T> {

            /* renamed from: b, reason: collision with root package name */
            public Object f404007b;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.f404007b == null) {
                        throw null;
                    }
                    if (NotificationLite.h(this.f404007b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.i(this.f404007b)) {
                        throw io.reactivex.rxjava3.internal.util.h.f(NotificationLite.f(this.f404007b));
                    }
                    return (T) this.f404007b;
                } finally {
                    this.f404007b = null;
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

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404006c = NotificationLite.e(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404006c = t12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
        }
    }
}
