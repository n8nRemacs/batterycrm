package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Collection;

/* compiled from: ObservableBufferExactBoundary.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41974o<T, U extends Collection<? super T>, B> extends AbstractC41932a<T, U> {

    /* compiled from: ObservableBufferExactBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o$a */
    public static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.observers.e<B> {
        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(B b12) {
            throw null;
        }
    }

    /* compiled from: ObservableBufferExactBoundary.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.o$b */
    public static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.observers.z<T, U, U> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404163g;

        /* renamed from: h, reason: collision with root package name */
        public U f404164h;

        @Override // io.reactivex.rxjava3.internal.observers.z, io.reactivex.rxjava3.internal.util.l
        public final void a(io.reactivex.rxjava3.observers.m mVar, Object obj) {
            this.f402138c.onNext((Collection) obj);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404163g, dVar)) {
                this.f404163g = dVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    this.f402140e = true;
                    dVar.dispose();
                    EmptyDisposable.d(th2, this.f402138c);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f402140e) {
                return;
            }
            this.f402140e = true;
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            synchronized (this) {
                try {
                    U u12 = this.f404164h;
                    if (u12 == null) {
                        return;
                    }
                    this.f404164h = null;
                    this.f402139d.offer(u12);
                    this.f402141f = true;
                    if (c()) {
                        io.reactivex.rxjava3.internal.util.p.b(this.f402139d, this.f402138c, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402140e;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            dispose();
            this.f402138c.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    U u12 = this.f404164h;
                    if (u12 == null) {
                        return;
                    }
                    u12.add(t12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super U> g12) {
        this.f403951b.c(new b(new io.reactivex.rxjava3.observers.m(g12), new io.reactivex.rxjava3.internal.queue.a()));
    }
}
