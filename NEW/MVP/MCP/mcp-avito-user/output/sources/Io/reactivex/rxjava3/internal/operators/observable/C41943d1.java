package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import q41.InterfaceC47199b;

/* compiled from: ObservableScalarXMap.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.d1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41943d1 {

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d1$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC47199b<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404008b;

        /* renamed from: c, reason: collision with root package name */
        public final T f404009c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, T t12) {
            this.f404008b = g12;
            this.f404009c = t12;
        }

        @Override // q41.g
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return get() == 3;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // q41.g
        public final boolean offer(T t12) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f404009c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                io.reactivex.rxjava3.core.G<? super T> g12 = this.f404008b;
                g12.onNext(this.f404009c);
                if (get() == 2) {
                    lazySet(3);
                    g12.e();
                }
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            lazySet(1);
            return 1;
        }
    }

    /* compiled from: ObservableScalarXMap.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.d1$b */
    public static final class b<T, R> extends io.reactivex.rxjava3.core.z<R> {

        /* renamed from: b, reason: collision with root package name */
        public final T f404010b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> f404011c;

        public b(T t12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> oVar) {
            this.f404010b = t12;
            this.f404011c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
            try {
                io.reactivex.rxjava3.core.E<? extends R> eApply = this.f404011c.apply(this.f404010b);
                Objects.requireNonNull(eApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.E<? extends R> e12 = eApply;
                if (!(e12 instanceof l41.s)) {
                    e12.c(g12);
                    return;
                }
                try {
                    Object obj = ((l41.s) e12).get();
                    if (obj == null) {
                        EmptyDisposable.a(g12);
                        return;
                    }
                    a aVar = new a(g12, obj);
                    g12.b(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    EmptyDisposable.d(th2, g12);
                }
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                EmptyDisposable.d(th3, g12);
            }
        }
    }

    public C41943d1() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> io.reactivex.rxjava3.core.z<U> a(T t12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends U>> oVar) {
        return new b(t12, oVar);
    }

    public static <T, R> boolean b(io.reactivex.rxjava3.core.E<T> e12, io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, ? extends io.reactivex.rxjava3.core.E<? extends R>> oVar) {
        if (!(e12 instanceof l41.s)) {
            return false;
        }
        try {
            A00.a aVar = (Object) ((l41.s) e12).get();
            if (aVar == null) {
                EmptyDisposable.a(g12);
                return true;
            }
            try {
                io.reactivex.rxjava3.core.E<? extends R> eApply = oVar.apply(aVar);
                Objects.requireNonNull(eApply, "The mapper returned a null ObservableSource");
                io.reactivex.rxjava3.core.E<? extends R> e13 = eApply;
                if (e13 instanceof l41.s) {
                    try {
                        Object obj = ((l41.s) e13).get();
                        if (obj == null) {
                            EmptyDisposable.a(g12);
                            return true;
                        }
                        a aVar2 = new a(g12, obj);
                        g12.b(aVar2);
                        aVar2.run();
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        EmptyDisposable.d(th2, g12);
                        return true;
                    }
                } else {
                    e13.c(g12);
                }
                return true;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                EmptyDisposable.d(th3, g12);
                return true;
            }
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            EmptyDisposable.d(th4, g12);
            return true;
        }
    }
}
