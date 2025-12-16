package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.Objects;
import s41.C47998a;

/* compiled from: FlowableFromSupplier.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41884s0<T> extends AbstractC41777j<T> implements l41.s<T> {

    /* renamed from: c, reason: collision with root package name */
    public final l41.s<? extends T> f402965c;

    public C41884s0(l41.s<? extends T> sVar) {
        this.f402965c = sVar;
    }

    @Override // l41.s
    public final T get() {
        T t12 = this.f402965c.get();
        Objects.requireNonNull(t12, "The supplier returned a null value");
        return t12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.f fVar = new o41.f(dVar);
        dVar.K(fVar);
        try {
            T t12 = this.f402965c.get();
            Objects.requireNonNull(t12, "The supplier returned a null value");
            fVar.l(t12);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (fVar.m()) {
                C47998a.b(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
