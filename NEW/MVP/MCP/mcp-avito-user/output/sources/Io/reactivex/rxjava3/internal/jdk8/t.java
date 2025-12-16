package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import s41.C47998a;

/* compiled from: ObservableFlatMapStream.java */
/* loaded from: classes8.dex */
public final class t<T, R> extends io.reactivex.rxjava3.core.z<R> {

    /* compiled from: ObservableFlatMapStream.java */
    public static final class a<T, R> extends AtomicInteger implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5127032662980523968L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super R> f402080b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402081c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402082d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f402083e;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f402080b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(@j41.e io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402081c, dVar)) {
                this.f402081c = dVar;
                this.f402080b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402082d = true;
            this.f402081c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f402083e) {
                return;
            }
            this.f402083e = true;
            this.f402080b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402082d;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(@j41.e Throwable th2) {
            if (this.f402083e) {
                C47998a.b(th2);
            } else {
                this.f402083e = true;
                this.f402080b.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(@j41.e T t12) {
            if (this.f402083e) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402081c.dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        new a(g12);
        throw null;
    }
}
