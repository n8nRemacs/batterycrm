package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableSingleMaybe.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41961j1<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f404105b;

    /* compiled from: ObservableSingleMaybe.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.j1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f404106b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404107c;

        /* renamed from: d, reason: collision with root package name */
        public T f404108d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404109e;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar) {
            this.f404106b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404107c, dVar)) {
                this.f404107c = dVar;
                this.f404106b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404107c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404109e) {
                return;
            }
            this.f404109e = true;
            T t12 = this.f404108d;
            this.f404108d = null;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f404106b;
            if (t12 == null) {
                tVar.e();
            } else {
                tVar.onSuccess(t12);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404107c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404109e) {
                C47998a.b(th2);
            } else {
                this.f404109e = true;
                this.f404106b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404109e) {
                return;
            }
            if (this.f404108d == null) {
                this.f404108d = t12;
                return;
            }
            this.f404109e = true;
            this.f404107c.dispose();
            this.f404106b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public C41961j1(io.reactivex.rxjava3.core.z zVar) {
        this.f404105b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f404105b.c(new a(tVar));
    }
}
