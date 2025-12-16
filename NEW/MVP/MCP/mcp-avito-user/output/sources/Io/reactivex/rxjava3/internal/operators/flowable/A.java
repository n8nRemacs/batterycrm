package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableConcatWithCompletable.java */
/* loaded from: classes8.dex */
public final class A<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableConcatWithCompletable.java */
    public static final class a<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41782o<T>, InterfaceC41771d, org.reactivestreams.e {
        private static final long serialVersionUID = -7346385463600070225L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402270b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402271c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402272d;

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402270b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402271c, eVar)) {
                this.f402271c = eVar;
                this.f402270b.K(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.InterfaceC41771d
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            DisposableHelper.e(this, dVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402271c.cancel();
            DisposableHelper.a(this);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402272d) {
                this.f402270b.e();
            } else {
                this.f402272d = true;
                this.f402271c = SubscriptionHelper.f404813b;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f402270b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402270b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402271c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
