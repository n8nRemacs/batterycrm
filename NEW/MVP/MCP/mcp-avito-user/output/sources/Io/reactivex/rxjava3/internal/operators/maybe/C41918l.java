package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MaybeDelay.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.maybe.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41918l<T> extends AbstractC41907a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final long f403263c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f403264d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.H f403265e;

    /* compiled from: MaybeDelay.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.maybe.l$a */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f403266b;

        /* renamed from: c, reason: collision with root package name */
        public final long f403267c;

        /* renamed from: d, reason: collision with root package name */
        public final TimeUnit f403268d;

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f403269e;

        /* renamed from: f, reason: collision with root package name */
        public T f403270f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f403271g;

        public a(io.reactivex.rxjava3.core.t tVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
            this.f403266b = tVar;
            this.f403267c = j12;
            this.f403268d = timeUnit;
            this.f403269e = h12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.e(this, dVar)) {
                this.f403266b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            DisposableHelper.c(this, this.f403269e.e(this, this.f403267c, this.f403268d));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403271g = th2;
            DisposableHelper.c(this, this.f403269e.e(this, 0L, this.f403268d));
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403270f = t12;
            DisposableHelper.c(this, this.f403269e.e(this, this.f403267c, this.f403268d));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f403271g;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f403266b;
            if (th2 != null) {
                tVar.onError(th2);
                return;
            }
            T t12 = this.f403270f;
            if (t12 != null) {
                tVar.onSuccess(t12);
            } else {
                tVar.e();
            }
        }
    }

    public C41918l(io.reactivex.rxjava3.core.q qVar, long j12, TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        super(qVar);
        this.f403263c = j12;
        this.f403264d = timeUnit;
        this.f403265e = h12;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        this.f403189b.a(new a(tVar, this.f403263c, this.f403264d, this.f403265e));
    }
}
