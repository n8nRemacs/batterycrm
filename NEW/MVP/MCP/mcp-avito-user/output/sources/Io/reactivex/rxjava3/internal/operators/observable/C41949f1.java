package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import s41.C47998a;

/* compiled from: ObservableScanSeed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41949f1<T, R> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.c<R, ? super T, R> f404038c;

    /* renamed from: d, reason: collision with root package name */
    public final l41.s<R> f404039d;

    /* compiled from: ObservableScanSeed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.f1$a */
    public static final class a<T, R> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f404040b;

        /* renamed from: c, reason: collision with root package name */
        public final l41.c<R, ? super T, R> f404041c;

        /* renamed from: d, reason: collision with root package name */
        public R f404042d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404043e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404044f;

        public a(io.reactivex.rxjava3.core.G<? super R> g12, l41.c<R, ? super T, R> cVar, R r12) {
            this.f404040b = g12;
            this.f404041c = cVar;
            this.f404042d = r12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404043e, dVar)) {
                this.f404043e = dVar;
                io.reactivex.rxjava3.core.G<? super R> g12 = this.f404040b;
                g12.b(this);
                g12.onNext(this.f404042d);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404043e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f404044f) {
                return;
            }
            this.f404044f = true;
            this.f404040b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404043e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f404044f) {
                C47998a.b(th2);
            } else {
                this.f404044f = true;
                this.f404040b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404044f) {
                return;
            }
            try {
                R rApply = this.f404041c.apply(this.f404042d, t12);
                Objects.requireNonNull(rApply, "The accumulator returned a null value");
                this.f404042d = rApply;
                this.f404040b.onNext(rApply);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404043e.dispose();
                onError(th2);
            }
        }
    }

    public C41949f1(io.reactivex.rxjava3.core.z zVar, l41.s sVar, l41.c cVar) {
        super(zVar);
        this.f404038c = cVar;
        this.f404039d = sVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        try {
            R r12 = this.f404039d.get();
            Objects.requireNonNull(r12, "The seed supplied is null");
            this.f403951b.c(new a(g12, this.f404038c, r12));
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.d(th2, g12);
        }
    }
}
