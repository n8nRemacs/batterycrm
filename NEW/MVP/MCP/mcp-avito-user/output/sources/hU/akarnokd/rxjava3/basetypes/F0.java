package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.Callable;

/* compiled from: PerhapsFromCallable.java */
/* loaded from: classes8.dex */
final class F0<T> extends AbstractC41069k0<T> implements Callable<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new o41.f(dVar));
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            dVar.onError(th2);
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        throw null;
    }
}
