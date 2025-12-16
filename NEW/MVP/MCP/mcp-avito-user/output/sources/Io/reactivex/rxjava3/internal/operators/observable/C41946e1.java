package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import s41.C47998a;

/* compiled from: ObservableScan.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41946e1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.c<T, T, T> f404026c;

    /* compiled from: ObservableScan.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.e1$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404027b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.c<T, T, T> f404028c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404029d;

        /* renamed from: e, reason: collision with root package name */
        public T f404030e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404031f;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, l41.c<T, T, T> cVar) {
            this.f404027b = g12;
            this.f404028c = cVar;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404029d, dVar)) {
                this.f404029d = dVar;
                this.f404027b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404029d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404031f) {
                return;
            }
            this.f404031f = true;
            this.f404027b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404029d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404031f) {
                C47998a.b(th2);
            } else {
                this.f404031f = true;
                this.f404027b.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object] */
        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404031f) {
                return;
            }
            T t13 = this.f404030e;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404027b;
            if (t13 == null) {
                this.f404030e = t12;
                g12.onNext(t12);
                return;
            }
            try {
                T tApply = this.f404028c.apply(t13, t12);
                Objects.requireNonNull(tApply, "The value returned by the accumulator is null");
                this.f404030e = tApply;
                g12.onNext(tApply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404029d.dispose();
                onError(th2);
            }
        }
    }

    public C41946e1(io.reactivex.rxjava3.core.z zVar, l41.c cVar) {
        super(zVar);
        this.f404026c = cVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404026c));
    }
}
