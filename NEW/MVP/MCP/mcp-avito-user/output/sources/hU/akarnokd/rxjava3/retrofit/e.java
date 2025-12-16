package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.y;
import s41.C47998a;

/* compiled from: ResultObservable.java */
/* loaded from: classes8.dex */
final class e<T> extends z<d<T>> {

    /* renamed from: b, reason: collision with root package name */
    public final z<y<T>> f398212b;

    /* compiled from: ResultObservable.java */
    public static class a<R> implements G<y<R>> {

        /* renamed from: b, reason: collision with root package name */
        public final G<? super d<R>> f398213b;

        public a(G<? super d<R>> g12) {
            this.f398213b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            this.f398213b.b(dVar);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f398213b.e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            G<? super d<R>> g12 = this.f398213b;
            try {
                if (th2 == null) {
                    throw new NullPointerException("error == null");
                }
                g12.onNext(new d());
                g12.e();
            } catch (Throwable th3) {
                try {
                    g12.onError(th3);
                } catch (Throwable th4) {
                    io.reactivex.rxjava3.exceptions.a.a(th4);
                    C47998a.b(new CompositeException(th3, th4));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            if (((y) obj) == null) {
                throw new NullPointerException("response == null");
            }
            this.f398213b.onNext(new d());
        }
    }

    public e(z<y<T>> zVar) {
        this.f398212b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super d<T>> g12) {
        this.f398212b.c(new a(g12));
    }
}
