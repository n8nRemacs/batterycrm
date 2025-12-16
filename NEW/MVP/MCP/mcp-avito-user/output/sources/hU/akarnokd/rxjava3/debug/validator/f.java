package hu.akarnokd.rxjava3.debug.validator;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;

/* compiled from: ObservableValidator.java */
/* loaded from: classes8.dex */
final class f<T> extends z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final z<T> f397863b;

    /* compiled from: ObservableValidator.java */
    public static final class a<T> implements G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final G<? super T> f397864b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f397865c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f397866d;

        public a(G g12) {
            this.f397864b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (dVar == null) {
                new NullOnSubscribeParameterException();
                throw null;
            }
            if (this.f397865c != null) {
                new MultipleOnSubscribeCallsException();
                throw null;
            }
            this.f397865c = dVar;
            this.f397864b.b(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f397865c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f397865c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397866d) {
                new MultipleTerminationsException();
                throw null;
            }
            this.f397866d = true;
            this.f397864b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f397865c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (th2 == null) {
                new NullOnErrorParameterException();
                throw null;
            }
            if (this.f397865c == null) {
                new OnSubscribeNotCalledException(th2);
                throw null;
            }
            if (this.f397866d) {
                new MultipleTerminationsException(th2);
                throw null;
            }
            this.f397866d = true;
            this.f397864b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (t12 == null) {
                new NullOnNextParameterException();
                throw null;
            }
            if (this.f397865c == null) {
                new OnSubscribeNotCalledException();
                throw null;
            }
            if (this.f397866d) {
                new OnNextAfterTerminationException();
                throw null;
            }
            this.f397864b.onNext(t12);
        }
    }

    public f(z zVar) {
        this.f397863b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f397863b.c(new a(g12));
    }
}
