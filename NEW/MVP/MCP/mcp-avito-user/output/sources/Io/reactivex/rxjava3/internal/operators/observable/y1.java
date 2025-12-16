package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import s41.C47998a;

/* compiled from: ObservableTakeUntilPredicate.java */
/* loaded from: classes8.dex */
public final class y1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.r<? super T> f404412c;

    /* compiled from: ObservableTakeUntilPredicate.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404413b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.r<? super T> f404414c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404415d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f404416e;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.r<? super T> rVar) {
            this.f404413b = g12;
            this.f404414c = rVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404415d, dVar)) {
                this.f404415d = dVar;
                this.f404413b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404415d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404416e) {
                return;
            }
            this.f404416e = true;
            this.f404413b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404415d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404416e) {
                C47998a.b(th2);
            } else {
                this.f404416e = true;
                this.f404413b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404416e) {
                return;
            }
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404413b;
            g12.onNext(t12);
            try {
                if (this.f404414c.test(t12)) {
                    this.f404416e = true;
                    this.f404415d.dispose();
                    g12.e();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404415d.dispose();
                onError(th2);
            }
        }
    }

    public y1(io.reactivex.rxjava3.core.z zVar, l41.r rVar) {
        super(zVar);
        this.f404412c = rVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404412c));
    }
}
