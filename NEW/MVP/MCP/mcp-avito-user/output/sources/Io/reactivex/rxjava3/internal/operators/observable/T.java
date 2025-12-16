package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableElementAtSingle.java */
/* loaded from: classes8.dex */
public final class T<T> extends io.reactivex.rxjava3.core.I<T> implements InterfaceC44188e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403845b;

    /* renamed from: c, reason: collision with root package name */
    public final T f403846c;

    /* compiled from: ObservableElementAtSingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f403847b;

        /* renamed from: c, reason: collision with root package name */
        public final T f403848c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403849d;

        /* renamed from: e, reason: collision with root package name */
        public long f403850e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f403851f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.L l12, Object obj) {
            this.f403847b = l12;
            this.f403848c = obj;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403849d, dVar)) {
                this.f403849d = dVar;
                this.f403847b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403849d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403851f) {
                return;
            }
            this.f403851f = true;
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f403847b;
            T t12 = this.f403848c;
            if (t12 != null) {
                l12.onSuccess(t12);
            } else {
                l12.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403849d.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403851f) {
                C47998a.b(th2);
            } else {
                this.f403851f = true;
                this.f403847b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403851f) {
                return;
            }
            long j12 = this.f403850e;
            if (j12 != 0) {
                this.f403850e = j12 + 1;
                return;
            }
            this.f403851f = true;
            this.f403849d.dispose();
            this.f403847b.onSuccess(t12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T(io.reactivex.rxjava3.core.z zVar, Object obj) {
        this.f403845b = zVar;
        this.f403846c = obj;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<T> d() {
        return new Q(this.f403845b, this.f403846c, true);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f403845b.c(new a(l12, this.f403846c));
    }
}
