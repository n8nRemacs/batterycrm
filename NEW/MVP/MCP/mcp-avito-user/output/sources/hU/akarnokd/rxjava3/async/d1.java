package hu.akarnokd.rxjava3.async;

import io.reactivex.rxjava3.core.AbstractC41777j;

/* compiled from: FlowableFromCallableNull.java */
/* loaded from: classes8.dex */
final class d1<T> extends AbstractC41777j<T> implements l41.s<T> {

    /* compiled from: FlowableFromCallableNull.java */
    public static final class a<T> extends o41.f<T> {
        private static final long serialVersionUID = -7088349936918117528L;

        public a() {
            throw null;
        }
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(dVar);
        dVar.K(aVar);
        if (aVar.m()) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (aVar.m()) {
                return;
            }
            dVar.onError(th2);
        }
    }
}
