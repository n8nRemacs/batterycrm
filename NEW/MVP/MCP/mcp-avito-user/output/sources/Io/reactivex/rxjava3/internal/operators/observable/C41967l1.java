package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableSkip.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41967l1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f404122c;

    /* compiled from: ObservableSkip.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.l1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404123b;

        /* renamed from: c, reason: collision with root package name */
        public long f404124c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404125d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, long j12) {
            this.f404123b = g12;
            this.f404124c = j12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404125d, dVar)) {
                this.f404125d = dVar;
                this.f404123b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404125d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404123b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404125d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404123b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            long j12 = this.f404124c;
            if (j12 != 0) {
                this.f404124c = j12 - 1;
            } else {
                this.f404123b.onNext(t12);
            }
        }
    }

    public C41967l1(io.reactivex.rxjava3.core.z zVar, long j12) {
        super(zVar);
        this.f404122c = j12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404122c));
    }
}
