package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.AbstractC41805c;
import java.util.Iterator;
import java.util.stream.Stream;
import s41.C47998a;

/* compiled from: MaybeFlattenStreamAsObservable.java */
/* loaded from: classes8.dex */
public final class n<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* compiled from: MaybeFlattenStreamAsObservable.java */
    public static final class a<T, R> extends AbstractC41805c<R> implements io.reactivex.rxjava3.core.t<T>, L<T> {
        private static final long serialVersionUID = 7363336003027148283L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f402065b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402066c;

        /* renamed from: d, reason: collision with root package name */
        public volatile Iterator<? extends R> f402067d;

        /* renamed from: e, reason: collision with root package name */
        public Stream f402068e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f402069f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402070g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f402071h;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f402065b = g12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402066c, dVar)) {
                this.f402066c = dVar;
                this.f402065b.b(this);
            }
        }

        @Override // q41.g
        public final void clear() {
            this.f402067d = null;
            Stream stream = this.f402068e;
            this.f402068e = null;
            if (stream != null) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    C47998a.b(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402070g = true;
            this.f402066c.dispose();
            if (this.f402071h || getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super R> g12 = this.f402065b;
            Iterator<? extends R> it = this.f402067d;
            int iAddAndGet = 1;
            while (true) {
                if (this.f402070g) {
                    clear();
                } else if (this.f402071h) {
                    g12.onNext(null);
                    g12.e();
                } else {
                    try {
                        R next = it.next();
                        if (!this.f402070g) {
                            g12.onNext(next);
                            if (!this.f402070g) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f402070g && !zHasNext) {
                                        g12.e();
                                        this.f402070g = true;
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.a(th2);
                                    g12.onError(th2);
                                    this.f402070g = true;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.rxjava3.exceptions.a.a(th3);
                        g12.onError(th3);
                        this.f402070g = true;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f402065b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402070g;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            Iterator<? extends R> it = this.f402067d;
            if (it == null) {
                return true;
            }
            if (!this.f402069f || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(@j41.e Throwable th2) {
            this.f402065b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(@j41.e T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402065b.onError(th2);
            }
        }

        @Override // q41.g
        @j41.f
        public final R poll() {
            Iterator<? extends R> it = this.f402067d;
            if (it == null) {
                return null;
            }
            if (!this.f402069f) {
                this.f402069f = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            this.f402071h = true;
            return 2;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@j41.e io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
