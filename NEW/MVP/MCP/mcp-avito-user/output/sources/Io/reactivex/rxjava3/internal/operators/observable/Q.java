package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import s41.C47998a;

/* compiled from: ObservableElementAt.java */
/* loaded from: classes8.dex */
public final class Q<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final T f403798c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f403799d;

    /* compiled from: ObservableElementAt.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f403800b;

        /* renamed from: c, reason: collision with root package name */
        public final T f403801c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f403802d;

        /* renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403803e;

        /* renamed from: f, reason: collision with root package name */
        public long f403804f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f403805g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(io.reactivex.rxjava3.core.G g12, Object obj, boolean z12) {
            this.f403800b = g12;
            this.f403801c = obj;
            this.f403802d = z12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403803e, dVar)) {
                this.f403803e = dVar;
                this.f403800b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403803e.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f403805g) {
                return;
            }
            this.f403805g = true;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403800b;
            T t12 = this.f403801c;
            if (t12 == null && this.f403802d) {
                g12.onError(new NoSuchElementException());
                return;
            }
            if (t12 != null) {
                g12.onNext(t12);
            }
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403803e.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            if (this.f403805g) {
                C47998a.b(th2);
            } else {
                this.f403805g = true;
                this.f403800b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f403805g) {
                return;
            }
            long j12 = this.f403804f;
            if (j12 != 0) {
                this.f403804f = j12 + 1;
                return;
            }
            this.f403805g = true;
            this.f403803e.dispose();
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403800b;
            g12.onNext(t12);
            g12.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q(io.reactivex.rxjava3.core.z zVar, Object obj, boolean z12) {
        super(zVar);
        this.f403798c = obj;
        this.f403799d = z12;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f403798c, this.f403799d));
    }
}
