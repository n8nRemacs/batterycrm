package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.jdk8.C41801g;
import java.util.function.BiConsumer;

/* compiled from: MaybeFromCompletionStage.java */
/* loaded from: classes8.dex */
public final class o<T> extends io.reactivex.rxjava3.core.q<T> {

    /* compiled from: MaybeFromCompletionStage.java */
    public static final class a<T> implements io.reactivex.rxjava3.disposables.d, BiConsumer<T, Throwable> {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super T> f402072b;

        /* renamed from: c, reason: collision with root package name */
        public final C41801g.a<T> f402073c;

        public a(io.reactivex.rxjava3.core.t<? super T> tVar, C41801g.a<T> aVar) {
            this.f402072b = tVar;
            this.f402073c = aVar;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Throwable th2) {
            Throwable th3 = th2;
            io.reactivex.rxjava3.core.t<? super T> tVar = this.f402072b;
            if (th3 != null) {
                tVar.onError(th3);
            } else if (obj != null) {
                tVar.onSuccess(obj);
            } else {
                tVar.e();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402073c.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f402073c.get() == null;
        }
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super T> tVar) {
        C41801g.a aVar = new C41801g.a();
        a aVar2 = new a(tVar, aVar);
        aVar.lazySet(aVar2);
        tVar.b(aVar2);
        throw null;
    }
}
