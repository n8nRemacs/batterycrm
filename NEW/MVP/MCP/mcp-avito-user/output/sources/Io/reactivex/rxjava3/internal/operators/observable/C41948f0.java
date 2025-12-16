package io.reactivex.rxjava3.internal.operators.observable;

import java.util.concurrent.Callable;
import s41.C47998a;

/* compiled from: ObservableFromCallable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41948f0<T> extends io.reactivex.rxjava3.core.z<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Callable<? extends T> f404037b;

    public C41948f0(Callable<? extends T> callable) {
        this.f404037b = callable;
    }

    @Override // l41.s
    public final T get() throws Exception {
        T tCall = this.f404037b.call();
        if (tCall == null) {
            throw io.reactivex.rxjava3.internal.util.h.b("The Callable returned a null value.");
        }
        Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
        return tCall;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        io.reactivex.rxjava3.internal.observers.n nVar = new io.reactivex.rxjava3.internal.observers.n(g12);
        g12.b(nVar);
        if (nVar.i()) {
            return;
        }
        try {
            T tCall = this.f404037b.call();
            if (tCall == null) {
                throw io.reactivex.rxjava3.internal.util.h.b("Callable returned a null value.");
            }
            Throwable th2 = io.reactivex.rxjava3.internal.util.h.f404834a;
            nVar.a(tCall);
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.a(th3);
            if (nVar.i()) {
                C47998a.b(th3);
            } else {
                g12.onError(th3);
            }
        }
    }
}
