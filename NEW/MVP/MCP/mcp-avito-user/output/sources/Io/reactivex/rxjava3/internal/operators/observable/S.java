package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44188e;
import s41.C47998a;

/* compiled from: ObservableElementAtMaybe.java */
/* loaded from: classes8.dex */
public final class S<T> extends io.reactivex.rxjava3.core.q<T> implements InterfaceC44188e<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z f403838b;

    /* compiled from: ObservableElementAtMaybe.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403839b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403840c;

        /* renamed from: d, reason: collision with root package name */
        public long f403841d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f403842e;

        public a(io.reactivex.rxjava3.core.t tVar) {
            this.f403839b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403840c, dVar)) {
                this.f403840c = dVar;
                this.f403839b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403840c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403842e) {
                return;
            }
            this.f403842e = true;
            this.f403839b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403840c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403842e) {
                C47998a.b(th2);
            } else {
                this.f403842e = true;
                this.f403839b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403842e) {
                return;
            }
            long j12 = this.f403841d;
            if (j12 != 0) {
                this.f403841d = j12 + 1;
                return;
            }
            this.f403842e = true;
            this.f403840c.dispose();
            this.f403839b.onSuccess(t12);
        }
    }

    public S(io.reactivex.rxjava3.core.z zVar) {
        this.f403838b = zVar;
    }

    @Override // n41.InterfaceC44188e
    public final io.reactivex.rxjava3.core.z<T> d() {
        return new Q(this.f403838b, null, false);
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403838b.c(new a(tVar));
    }
}
