package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.jdk8.C41801g;
import java.util.function.BiConsumer;

/* compiled from: SingleFromCompletionStage.java */
/* loaded from: classes8.dex */
public final class G<T> extends I<T> {

    /* compiled from: SingleFromCompletionStage.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d, BiConsumer<T, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        public final L<? super T> f402028b;

        /* renamed from: c, reason: collision with root package name */
        public final C41801g.a<T> f402029c;

        public a(L<? super T> l12, C41801g.a<T> aVar) {
            this.f402028b = l12;
            this.f402029c = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            L<? super T> l12 = this.f402028b;
            if (th3 != null) {
                l12.onError(th3);
            } else if (obj != null) {
                l12.onSuccess(obj);
            } else {
                l12.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402029c.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402029c.get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        C41801g.a aVar = new C41801g.a();
        a aVar2 = new a(l12, aVar);
        aVar.lazySet(aVar2);
        l12.b(aVar2);
        throw null;
    }
}
