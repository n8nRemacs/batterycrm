package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* compiled from: ObservableDetach.java */
/* loaded from: classes8.dex */
public final class J<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableDetach.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.core.G<? super T> f403672b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403673c;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403673c, dVar)) {
                this.f403673c = dVar;
                this.f403672b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f403673c;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f403673c = emptyComponent;
            this.f403672b = emptyComponent;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403672b;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f403673c = emptyComponent;
            this.f403672b = emptyComponent;
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403673c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f403672b;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f403673c = emptyComponent;
            this.f403672b = emptyComponent;
            g12.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f403672b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a();
        aVar.f403672b = g12;
        this.f403951b.c(aVar);
    }
}
