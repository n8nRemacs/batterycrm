package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import s41.C47998a;

/* compiled from: FlowableMapFilter.java */
/* renamed from: hu.akarnokd.rxjava3.operators.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41165y<T, R> extends AbstractC41777j<R> implements InterfaceC41783p<T, R> {

    /* compiled from: FlowableMapFilter.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.y$a */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.a<T, R> implements ConditionalSubscriber<T>, InterfaceC41142a<R> {
        public a(ConditionalSubscriber conditionalSubscriber) {
            super(conditionalSubscriber);
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404773f != 0) {
                return this.downstream.tryOnNext((Object) null);
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404770c.cancel();
                this.downstream.onError(th2);
                return true;
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.e
        public final void cancel() {
            this.f404770c.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void e() {
            if (this.f404772e) {
                return;
            }
            this.f404772e = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404772e) {
                C47998a.b(th2);
            } else {
                this.f404772e = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12)) {
                return;
            }
            this.f404770c.request(1L);
        }

        @Override // q41.g
        public final R poll() {
            if (this.qs.poll() == null) {
                return null;
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.a, org.reactivestreams.e
        public final void request(long j12) {
            this.f404770c.request(j12);
        }
    }

    /* compiled from: FlowableMapFilter.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.y$b */
    public static final class b<T, R> extends io.reactivex.rxjava3.internal.subscribers.b<T, R> implements ConditionalSubscriber<T>, InterfaceC41142a<R> {
        public b(InterfaceC41782o interfaceC41782o) {
            super(interfaceC41782o);
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.e
        public final void cancel() {
            this.f404775c.cancel();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void e() {
            if (this.f404777e) {
                return;
            }
            this.f404777e = true;
            this.f404774b.e();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404777e) {
                C47998a.b(th2);
            } else {
                this.f404777e = true;
                this.f404774b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            int i12 = this.f404778f;
            org.reactivestreams.d<? super R> dVar = this.f404774b;
            if (i12 != 0) {
                dVar.onNext(null);
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404775c.cancel();
                dVar.onError(th2);
            }
        }

        @Override // q41.g
        public final R poll() {
            if (this.qs.poll() == null) {
                return null;
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.b, org.reactivestreams.e
        public final void request(long j12) {
            this.f404775c.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        if (dVar instanceof ConditionalSubscriber) {
            new a((ConditionalSubscriber) dVar);
            throw null;
        }
        new b((InterfaceC41782o) dVar);
        throw null;
    }
}
