package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47648d;
import retrofit2.y;
import s41.C47998a;

/* compiled from: CallEnqueueObservable.java */
/* loaded from: classes8.dex */
final class b<T> extends z<y<T>> {

    /* compiled from: CallEnqueueObservable.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d, InterfaceC47648d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC47646b<?> f398205b;

        /* renamed from: c, reason: collision with root package name */
        public final G<? super y<T>> f398206c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f398207d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f398208e = false;

        public a(InterfaceC47646b<?> interfaceC47646b, G<? super y<T>> g12) {
            this.f398205b = interfaceC47646b;
            this.f398206c = g12;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f398207d = true;
            this.f398205b.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f398207d;
        }

        @Override // retrofit2.InterfaceC47648d
        public final void onFailure(InterfaceC47646b<T> interfaceC47646b, Throwable th2) {
            if (interfaceC47646b.isCanceled()) {
                return;
            }
            try {
                this.f398206c.onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                C47998a.b(new CompositeException(th2, th3));
            }
        }

        @Override // retrofit2.InterfaceC47648d
        public final void onResponse(InterfaceC47646b<T> interfaceC47646b, y<T> yVar) {
            if (this.f398207d) {
                return;
            }
            try {
                this.f398206c.onNext(yVar);
                if (this.f398207d) {
                    return;
                }
                this.f398208e = true;
                this.f398206c.e();
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                if (this.f398208e) {
                    C47998a.b(th2);
                    return;
                }
                if (this.f398207d) {
                    return;
                }
                try {
                    this.f398206c.onError(th2);
                } catch (Throwable th3) {
                    io.reactivex.rxjava3.exceptions.a.a(th3);
                    C47998a.b(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super y<T>> g12) {
        throw null;
    }
}
