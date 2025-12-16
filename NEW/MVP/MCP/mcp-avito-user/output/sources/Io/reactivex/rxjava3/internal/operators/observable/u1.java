package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* compiled from: ObservableTakeLast.java */
/* loaded from: classes8.dex */
public final class u1<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableTakeLast.java */
    public static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 7240042530241604978L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404350b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404351c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f404352d;

        public a(io.reactivex.rxjava3.core.G g12) {
            this.f404350b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404351c, dVar)) {
                this.f404351c = dVar;
                this.f404350b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            if (this.f404352d) {
                return;
            }
            this.f404352d = true;
            this.f404351c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404350b;
            while (!this.f404352d) {
                T tPoll = poll();
                if (tPoll == null) {
                    g12.e();
                    return;
                }
                g12.onNext(tPoll);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404352d;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404350b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (size() == 0) {
                poll();
            }
            offer(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }
}
