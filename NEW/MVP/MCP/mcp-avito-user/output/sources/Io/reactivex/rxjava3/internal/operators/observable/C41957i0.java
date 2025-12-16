package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.AbstractC41806d;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: ObservableFromIterable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41957i0<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable<? extends T> f404089b;

    /* compiled from: ObservableFromIterable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.i0$a */
    public static final class a<T> extends AbstractC41806d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404090b;

        /* renamed from: c, reason: collision with root package name */
        public final Iterator<? extends T> f404091c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404092d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404093e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404094f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404095g;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, Iterator<? extends T> it) {
            this.f404090b = g12;
            this.f404091c = it;
        }

        @Override // q41.g
        public final void clear() {
            this.f404094f = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404092d = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404092d;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f404094f;
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            if (this.f404094f) {
                return null;
            }
            boolean z12 = this.f404095g;
            Iterator<? extends T> it = this.f404091c;
            if (!z12) {
                this.f404095g = true;
            } else if (!it.hasNext()) {
                this.f404094f = true;
                return null;
            }
            T next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            return next;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f404093e = true;
            return 1;
        }
    }

    public C41957i0(Iterable<? extends T> iterable) {
        this.f404089b = iterable;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        try {
            Iterator<? extends T> it = this.f404089b.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.a(g12);
                    return;
                }
                a aVar = new a(g12, it);
                g12.b(aVar);
                if (aVar.f404093e) {
                    return;
                }
                while (!aVar.f404092d) {
                    try {
                        T next = aVar.f404091c.next();
                        Objects.requireNonNull(next, "The iterator returned a null value");
                        aVar.f404090b.onNext(next);
                        if (aVar.f404092d) {
                            return;
                        }
                        try {
                            if (!aVar.f404091c.hasNext()) {
                                if (aVar.f404092d) {
                                    return;
                                }
                                aVar.f404090b.e();
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            aVar.f404090b.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        aVar.f404090b.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                EmptyDisposable.d(th4, g12);
            }
        } catch (Throwable th5) {
            io.reactivex.rxjava3.exceptions.a.a(th5);
            EmptyDisposable.d(th5, g12);
        }
    }
}
