package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelReduce.java */
/* loaded from: classes8.dex */
public final class n<T, R> extends AbstractC47491a<R> {

    /* compiled from: ParallelReduce.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.h<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;

        /* renamed from: f, reason: collision with root package name */
        public R f404464f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f404465g;

        public a() {
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
            if (this.f404465g) {
                return;
            }
            this.f404465g = true;
            R r12 = this.f404464f;
            this.f404464f = null;
            l(r12);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404465g) {
                C47998a.b(th2);
                return;
            }
            this.f404465g = true;
            this.f404464f = null;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404465g) {
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
