package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelCollect.java */
/* loaded from: classes8.dex */
public final class a<T, C> extends AbstractC47491a<C> {

    /* compiled from: ParallelCollect.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.a$a, reason: collision with other inner class name */
    public static final class C11506a<T, C> extends io.reactivex.rxjava3.internal.subscribers.h<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;

        /* renamed from: f, reason: collision with root package name */
        public boolean f404430f;

        public C11506a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404782d, eVar)) {
                this.f404782d = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f404782d.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f404430f) {
                return;
            }
            this.f404430f = true;
            l(null);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404430f) {
                C47998a.b(th2);
            } else {
                this.f404430f = true;
                this.f419376b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404430f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
            }
        }
    }
}
