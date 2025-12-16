package hu.akarnokd.rxjava3.async;

/* compiled from: ObservableFromSupplierNull.java */
/* loaded from: classes8.dex */
final class f1<T> extends io.reactivex.rxjava3.core.z<T> implements l41.s<T> {

    /* compiled from: ObservableFromSupplierNull.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.n<T> {
        private static final long serialVersionUID = -7088349936918117528L;

        public a() {
            throw null;
        }
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        a aVar = new a(g12);
        g12.b(aVar);
        if (aVar.getF318621e()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (aVar.getF318621e()) {
                return;
            }
            g12.onError(th2);
        }
    }
}
