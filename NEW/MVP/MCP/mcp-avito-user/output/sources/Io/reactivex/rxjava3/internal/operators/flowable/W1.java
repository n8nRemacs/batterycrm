package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;

/* compiled from: FlowableToList.java */
/* loaded from: classes8.dex */
public final class W1<T, U extends Collection<? super T>> extends AbstractC41833b<T, U> {

    /* compiled from: FlowableToList.java */
    public static final class a<T, U extends Collection<? super T>> extends o41.f<U> implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: d, reason: collision with root package name */
        public org.reactivestreams.e f402572d;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402572d, eVar)) {
                this.f402572d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f402572d.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            l(this.f419377c);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419377c = null;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            Collection collection = (Collection) this.f419377c;
            if (collection != null) {
                collection.add(t12);
            }
        }
    }

    public W1() {
        super(null);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptySubscription.b(th2, dVar);
        }
    }
}
