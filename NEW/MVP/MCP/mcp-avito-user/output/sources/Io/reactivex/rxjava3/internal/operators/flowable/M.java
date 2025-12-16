package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* compiled from: FlowableDetach.java */
/* loaded from: classes8.dex */
public final class M<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDetach.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC41782o f402427b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f402428c;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402428c, eVar)) {
                this.f402428c = eVar;
                this.f402427b.K(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            org.reactivestreams.e eVar = this.f402428c;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f402428c = emptyComponent;
            this.f402427b = emptyComponent;
            eVar.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            InterfaceC41782o interfaceC41782o = this.f402427b;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f402428c = emptyComponent;
            this.f402427b = emptyComponent;
            interfaceC41782o.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            InterfaceC41782o interfaceC41782o = this.f402427b;
            EmptyComponent emptyComponent = EmptyComponent.f404817b;
            this.f402428c = emptyComponent;
            this.f402427b = emptyComponent;
            interfaceC41782o.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402427b.onNext(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402428c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a();
        aVar.f402427b = (InterfaceC41782o) dVar;
        this.f402624c.q(aVar);
    }
}
