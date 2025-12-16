package hu.akarnokd.rxjava3.debug.validator;

import io.reactivex.rxjava3.core.t;

/* compiled from: MaybeValidator.java */
/* loaded from: classes8.dex */
final class e<T> extends io.reactivex.rxjava3.core.q<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q<T> f397859b;

    /* compiled from: MaybeValidator.java */
    public static final class a<T> implements t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final t<? super T> f397860b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397861c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397862d;

        public a(t tVar) {
            this.f397860b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (dVar == null) {
                new NullOnSubscribeParameterException();
                throw null;
            }
            if (this.f397861c != null) {
                new MultipleOnSubscribeCallsException();
                throw null;
            }
            this.f397861c = dVar;
            this.f397860b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397861c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            if (this.f397861c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397862d) {
                new MultipleTerminationsException();
                throw null;
            }
            this.f397862d = true;
            this.f397860b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397861c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            if (th2 == null) {
                new NullOnErrorParameterException();
                throw null;
            }
            if (this.f397861c == null) {
                new OnSubscribeNotCalledException(th2);
                throw null;
            }
            if (this.f397862d) {
                new MultipleTerminationsException(th2);
                throw null;
            }
            this.f397862d = true;
            this.f397860b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            if (t12 == null) {
                new NullOnSuccessParameterException();
                throw null;
            }
            if (this.f397861c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397862d) {
                new OnSuccessAfterTerminationException();
                throw null;
            }
            this.f397862d = true;
            this.f397860b.onSuccess(t12);
        }
    }

    public e(io.reactivex.rxjava3.core.q qVar) {
        this.f397859b = qVar;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(t<? super T> tVar) {
        this.f397859b.a(new a(tVar));
    }
}
