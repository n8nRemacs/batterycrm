package io.reactivex.rxjava3.internal.jdk8;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* compiled from: ObservableFromCompletionStage.java */
/* loaded from: classes8.dex */
public final class u<T> extends io.reactivex.rxjava3.core.z<T> {

    /* compiled from: ObservableFromCompletionStage.java */
    public static final class a<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(obj, th3);
            }
        }
    }

    /* compiled from: ObservableFromCompletionStage.java */
    public static final class b<T> extends io.reactivex.rxjava3.internal.observers.n<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f402084d;

        public b(io.reactivex.rxjava3.core.G<? super T> g12, a<T> aVar) {
            super(g12);
            this.f402084d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f402118b;
            if (th3 != null) {
                g12.onError(th3);
            } else if (obj != 0) {
                a(obj);
            } else {
                g12.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            super.dispose();
            this.f402084d.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a();
        b bVar = new b(g12, aVar);
        aVar.lazySet(bVar);
        g12.b(bVar);
        throw null;
    }
}
