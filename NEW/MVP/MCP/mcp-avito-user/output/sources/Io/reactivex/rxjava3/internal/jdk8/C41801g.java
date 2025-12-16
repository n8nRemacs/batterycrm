package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* compiled from: FlowableFromCompletionStage.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41801g<T> extends AbstractC41777j<T> {

    /* compiled from: FlowableFromCompletionStage.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.g$a */
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

    /* compiled from: FlowableFromCompletionStage.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.g$b */
    public static final class b<T> extends o41.f<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f402050d;

        public b(InterfaceC41782o interfaceC41782o, a aVar) {
            super(interfaceC41782o);
            this.f402050d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            org.reactivestreams.d<? super T> dVar = this.f419376b;
            if (th3 != null) {
                dVar.onError(th3);
            } else if (obj != 0) {
                l(obj);
            } else {
                dVar.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402050d.set(null);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a();
        b bVar = new b((InterfaceC41782o) dVar, aVar);
        aVar.lazySet(bVar);
        dVar.K(bVar);
        throw null;
    }
}
