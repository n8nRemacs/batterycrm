package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSampleWithObservable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41940c1<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableSampleWithObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c1$a */
    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41940c1.c
        public final void a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41940c1.c
        public final void c() {
            throw null;
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c1$b */
    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public b() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41940c1.c
        public final void a() {
            this.f404003b.e();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.C41940c1.c
        public final void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f404003b.onNext(andSet);
            }
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c1$c */
    public static abstract class c<T> extends AtomicReference<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.observers.m f404003b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f404004c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404005d;

        public c(io.reactivex.rxjava3.observers.m mVar) {
            this.f404003b = mVar;
        }

        public abstract void a();

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404005d, dVar)) {
                this.f404005d = dVar;
                this.f404003b.b(this);
                if (this.f404004c.get() == null) {
                    throw null;
                }
            }
        }

        public abstract void c();

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this.f404004c);
            this.f404005d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            DisposableHelper.a(this.f404004c);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404004c.get() == DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f404004c);
            this.f404003b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            lazySet(t12);
        }
    }

    /* compiled from: ObservableSampleWithObservable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c1$d */
    public static final class d<T> implements io.reactivex.rxjava3.core.G<Object> {
        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new b(new io.reactivex.rxjava3.observers.m(g12)));
    }
}
