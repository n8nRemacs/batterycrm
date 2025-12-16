package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: SingleFlatMapIterableObservable.java */
/* loaded from: classes8.dex */
public final class C<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404484b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super T, ? extends Iterable<? extends R>> f404485c;

    /* compiled from: SingleFlatMapIterableObservable.java */
    public static final class a<T, R> extends AbstractC41805c<R> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = -8938804753851907758L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404486b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.o<? super T, ? extends Iterable<? extends R>> f404487c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404488d;

        /* renamed from: e, reason: collision with root package name */
        public volatile Iterator<? extends R> f404489e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f404490f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404491g;

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f404486b = g12;
            this.f404487c = oVar;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404488d, dVar)) {
                this.f404488d = dVar;
                this.f404486b.b(this);
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f404489e = null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404490f = true;
            this.f404488d.dispose();
            this.f404488d = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404490f;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            return this.f404489e == null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f404488d = DisposableHelper.f401986b;
            this.f404486b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f404486b;
            try {
                Iterator<? extends R> it = this.f404487c.apply(t12).iterator();
                if (!it.hasNext()) {
                    g12.e();
                    return;
                }
                if (this.f404491g) {
                    this.f404489e = it;
                    g12.onNext(null);
                    g12.e();
                    return;
                }
                while (!this.f404490f) {
                    try {
                        g12.onNext(it.next());
                        if (this.f404490f) {
                            return;
                        }
                        try {
                            if (!it.hasNext()) {
                                g12.e();
                                return;
                            }
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.a(th2);
                            g12.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        g12.onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.rxjava3.exceptions.a.a(th4);
                this.f404486b.onError(th4);
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f404489e;
            if (it == null) {
                return null;
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f404489e = null;
            }
            return next;
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f404491g = true;
            return 2;
        }
    }

    public C(io.reactivex.rxjava3.core.I i12, l41.o oVar) {
        this.f404484b = i12;
        this.f404485c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        this.f404484b.a(new a(g12, this.f404485c));
    }
}
