package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.G;

/* compiled from: ObservableMinMax.java */
/* loaded from: classes8.dex */
final class m<T> extends r<T, T> {

    /* compiled from: ObservableMinMax.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.o<T, T> {
        private static final long serialVersionUID = -4484454790848904397L;

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                if (this.f402119c != null) {
                    throw null;
                }
                this.f402119c = t12;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402120d.dispose();
                this.f402118b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(G<? super T> g12) {
        new a(g12);
        throw null;
    }
}
