package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableConcatWithMaybe.java */
/* loaded from: classes8.dex */
public final class B<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableConcatWithMaybe.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.u<T, T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = -7346385463600070225L;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f402279f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f402280g;

        public a(InterfaceC41782o interfaceC41782o) {
            super(interfaceC41782o);
            this.f402279f = new AtomicReference<>();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this.f402279f, dVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.u, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            DisposableHelper.a(this.f402279f);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402280g) {
                this.f404801b.e();
            } else {
                this.f402280g = true;
                this.f404802c = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f404801b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404804e++;
            this.f404801b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
