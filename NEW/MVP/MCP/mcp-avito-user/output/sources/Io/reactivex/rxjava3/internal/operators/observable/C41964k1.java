package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import kotlin.collections.C42784z0;
import s41.C47998a;

/* compiled from: ObservableSingleSingle.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41964k1<T> extends io.reactivex.rxjava3.core.I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404114b;

    /* renamed from: c, reason: collision with root package name */
    public final C42784z0 f404115c;

    /* compiled from: ObservableSingleSingle.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.k1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super T> f404116b;

        /* renamed from: c, reason: collision with root package name */
        public final C42784z0 f404117c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404118d;

        /* renamed from: e, reason: collision with root package name */
        public T f404119e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404120f;

        public a(io.reactivex.rxjava3.core.L l12, C42784z0 c42784z0) {
            this.f404116b = l12;
            this.f404117c = c42784z0;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404118d, dVar)) {
                this.f404118d = dVar;
                this.f404116b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404118d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404120f) {
                return;
            }
            this.f404120f = true;
            C42784z0 c42784z0 = this.f404119e;
            this.f404119e = null;
            if (c42784z0 == null) {
                c42784z0 = this.f404117c;
            }
            io.reactivex.rxjava3.core.L<? super T> l12 = this.f404116b;
            if (c42784z0 != null) {
                l12.onSuccess(c42784z0);
            } else {
                l12.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404118d.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404120f) {
                C47998a.b(th2);
            } else {
                this.f404120f = true;
                this.f404116b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404120f) {
                return;
            }
            if (this.f404119e == null) {
                this.f404119e = t12;
                return;
            }
            this.f404120f = true;
            this.f404118d.dispose();
            this.f404116b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public C41964k1(io.reactivex.rxjava3.core.z zVar, C42784z0 c42784z0) {
        this.f404114b = zVar;
        this.f404115c = c42784z0;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super T> l12) {
        this.f404114b.c(new a(l12, this.f404115c));
    }
}
