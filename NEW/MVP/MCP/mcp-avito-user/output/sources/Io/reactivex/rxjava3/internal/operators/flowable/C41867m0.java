package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.AbstractC44184a;
import n41.InterfaceC44189f;

/* compiled from: FlowableFromCompletable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41867m0<T> extends AbstractC41777j<T> implements InterfaceC44189f {

    /* compiled from: FlowableFromCompletable.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.m0$a */
    public static final class a<T> extends AbstractC44184a<T> implements InterfaceC41771d {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402881b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f402882c;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402881b = interfaceC41782o;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f402882c, dVar)) {
                this.f402882c = dVar;
                this.f402881b.K(this);
            }
        }

        @Override // n41.AbstractC44184a, org.reactivestreams.e
        public final void cancel() {
            this.f402882c.dispose();
            this.f402882c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void e() {
            this.f402882c = DisposableHelper.f401986b;
            this.f402881b.e();
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void onError(Throwable th2) {
            this.f402882c = DisposableHelper.f401986b;
            this.f402881b.onError(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
