package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

/* compiled from: ObservableSkipLast.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41970m1<T> extends AbstractC41932a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public final int f404143c;

    /* compiled from: ObservableSkipLast.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.m1$a */
    public static final class a<T> extends ArrayDeque<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404144b;

        /* renamed from: c, reason: collision with root package name */
        public final int f404145c;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404146d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12, int i12) {
            super(i12);
            this.f404144b = g12;
            this.f404145c = i12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404146d, dVar)) {
                this.f404146d = dVar;
                this.f404144b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404146d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404144b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f404146d.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404144b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            if (this.f404145c == size()) {
                this.f404144b.onNext(poll());
            }
            offer(t12);
        }
    }

    public C41970m1(C41957i0 c41957i0) {
        super(c41957i0);
        this.f404143c = 1;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12, this.f404143c));
    }
}
