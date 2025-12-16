package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import n41.C44185b;
import s41.C47998a;

/* compiled from: FlowableFromAction.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41858j0<T> extends AbstractC41777j<T> implements l41.s<T> {
    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        C44185b c44185b = new C44185b();
        dVar.K(c44185b);
        if (c44185b.f414901b) {
            return;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (c44185b.f414901b) {
                C47998a.b(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
