package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k41.AbstractC42503a;
import n41.InterfaceC44192i;
import s41.C47998a;

/* compiled from: FlowablePublish.java */
/* loaded from: classes8.dex */
public final class Z0<T> extends AbstractC42503a<T> implements InterfaceC44192i<T> {

    /* compiled from: FlowablePublish.java */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = 2845000326761540265L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.b(this, j12);
                throw null;
            }
        }
    }

    /* compiled from: FlowablePublish.java */
    public static final class b<T> extends AtomicInteger implements InterfaceC41782o<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -1672047311619175801L;

        /* renamed from: b, reason: collision with root package name */
        public volatile q41.g<T> f402584b;

        /* renamed from: c, reason: collision with root package name */
        public int f402585c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f402586d;

        /* renamed from: e, reason: collision with root package name */
        public int f402587e;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(null, eVar)) {
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(7);
                    if (iV2 == 1) {
                        this.f402585c = iV2;
                        this.f402584b = dVar;
                        this.f402586d = true;
                        a();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402585c = iV2;
                        this.f402584b = dVar;
                        eVar.request(0);
                        return;
                    }
                }
                this.f402584b = new q41.h(0);
                eVar.request(0);
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            q41.g<T> gVar = this.f402584b;
            int i12 = this.f402587e;
            int iAddAndGet = 1;
            while (gVar == null) {
                this.f402587e = i12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (gVar == null) {
                    gVar = this.f402584b;
                }
            }
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402586d = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402586d) {
                C47998a.b(th2);
            } else {
                this.f402586d = true;
                a();
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f402585c != 0 || this.f402584b.offer(t12)) {
                a();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
