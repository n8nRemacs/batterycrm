package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;

/* compiled from: FlowableDelay.java */
/* loaded from: classes8.dex */
public final class J<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableDelay.java */
    public static final class a<T> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402382b;

        /* compiled from: FlowableDelay.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.J$a$a, reason: collision with other inner class name */
        public final class RunnableC11452a implements Runnable {
            /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
            
                throw null;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r1 = this;
                    r0 = 0
                    throw r0     // Catch: java.lang.Throwable -> L2
                L2:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.J.a.RunnableC11452a.run():void");
            }
        }

        /* compiled from: FlowableDelay.java */
        public final class b implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* compiled from: FlowableDelay.java */
        public final class c implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402382b, eVar)) {
                this.f402382b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402382b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402382b.request(j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
