package hu.akarnokd.rxjava3.operators;

/* compiled from: ObservableIndexOf.java */
/* loaded from: classes8.dex */
final class h0<T> extends io.reactivex.rxjava3.core.z<Long> implements io.reactivex.rxjava3.core.F<T, Long> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.z<T> f398048b;

    /* compiled from: ObservableIndexOf.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.o<T, Long> {
        private static final long serialVersionUID = 4809092721669178986L;

        /* renamed from: e, reason: collision with root package name */
        public boolean f398049e;

        @Override // io.reactivex.rxjava3.internal.observers.o, io.reactivex.rxjava3.core.G
        public final void e() {
            if (this.f398049e) {
                return;
            }
            a(-1L);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398049e = true;
                this.f402120d.dispose();
                onError(th2);
            }
        }
    }

    public h0(io.reactivex.rxjava3.core.z zVar) {
        this.f398048b = zVar;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final io.reactivex.rxjava3.core.E<Long> a(io.reactivex.rxjava3.core.z<T> zVar) {
        return new h0(zVar);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        this.f398048b.c(new a(g12));
    }
}
