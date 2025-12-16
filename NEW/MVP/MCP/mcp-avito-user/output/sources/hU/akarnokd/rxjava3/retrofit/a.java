package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.HttpException;
import retrofit2.y;
import s41.C47998a;

/* compiled from: BodyObservable.java */
/* loaded from: classes8.dex */
final class a<T> extends z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final z<y<T>> f398202b;

    /* compiled from: BodyObservable.java */
    /* renamed from: hu.akarnokd.rxjava3.retrofit.a$a, reason: collision with other inner class name */
    public static class C11350a<R> implements G<y<R>> {

        /* renamed from: b, reason: collision with root package name */
        public final G<? super R> f398203b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f398204c;

        public C11350a(G<? super R> g12) {
            this.f398203b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f398203b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f398204c) {
                return;
            }
            this.f398203b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (!this.f398204c) {
                this.f398203b.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            C47998a.b(assertionError);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            y yVar = (y) obj;
            boolean zIsSuccessful = yVar.f430118a.isSuccessful();
            G<? super R> g12 = this.f398203b;
            if (zIsSuccessful) {
                g12.onNext(yVar.f430119b);
                return;
            }
            this.f398204c = true;
            HttpException httpException = new HttpException(yVar);
            try {
                g12.onError(httpException);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(new CompositeException(httpException, th2));
            }
        }
    }

    public a(z<y<T>> zVar) {
        this.f398202b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        this.f398202b.c(new C11350a(g12));
    }
}
