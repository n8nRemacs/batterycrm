package hu.akarnokd.rxjava3.async;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: AsyncObservable.java */
/* loaded from: classes8.dex */
final class H0 implements l41.g<Throwable> {
    @Override // l41.g
    public final void accept(Throwable th2) {
        Throwable th3 = th2;
        try {
            throw null;
        } catch (Throwable th4) {
            io.reactivex.rxjava3.exceptions.a.a(th4);
            new CompositeException(th3, th4);
            throw null;
        }
    }
}
