package hu.akarnokd.rxjava3.debug.validator;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;

/* compiled from: SingleValidator.java */
/* loaded from: classes8.dex */
final class r<T> extends I<T> {

    /* renamed from: b, reason: collision with root package name */
    public final I<T> f397867b;

    /* compiled from: SingleValidator.java */
    public static final class a<T> implements L<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final L<? super T> f397868b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397869c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397870d;

        public a(L l12) {
            this.f397868b = l12;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (dVar == null) {
                new NullOnSubscribeParameterException();
                throw null;
            }
            if (this.f397869c != null) {
                new MultipleOnSubscribeCallsException();
                throw null;
            }
            this.f397869c = dVar;
            this.f397868b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397869c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397869c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            if (th2 == null) {
                new NullOnErrorParameterException();
                throw null;
            }
            if (this.f397869c == null) {
                new OnSubscribeNotCalledException(th2);
                throw null;
            }
            if (this.f397870d) {
                new MultipleTerminationsException(th2);
                throw null;
            }
            this.f397870d = true;
            this.f397868b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onSuccess(T t12) {
            if (t12 == null) {
                new NullOnSuccessParameterException();
                throw null;
            }
            if (this.f397869c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397870d) {
                new OnSuccessAfterTerminationException();
                throw null;
            }
            this.f397870d = true;
            this.f397868b.onSuccess(t12);
        }
    }

    public r(I i12) {
        this.f397867b = i12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        this.f397867b.a(new a(l12));
    }
}
