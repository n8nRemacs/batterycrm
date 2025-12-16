package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.schedulers.o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelRunOn.java */
/* loaded from: classes8.dex */
public final class p<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelRunOn.java */
    public static abstract class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404468b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f404469c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f404470d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404471e;

        /* renamed from: f, reason: collision with root package name */
        public int f404472f;

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404471e) {
                return;
            }
            this.f404471e = true;
            this.f404468b.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404469c) {
                return;
            }
            this.f404469c = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404469c) {
                C47998a.b(th2);
                return;
            }
            this.f404470d = th2;
            this.f404469c = true;
            if (getAndIncrement() == 0) {
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (!this.f404469c) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(null, j12);
                if (getAndIncrement() == 0) {
                    throw null;
                }
            }
        }
    }

    /* compiled from: ParallelRunOn.java */
    public final class b implements o.a {
        public b() {
            throw null;
        }
    }

    /* compiled from: ParallelRunOn.java */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404468b, eVar)) {
                this.f404468b = eVar;
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: ParallelRunOn.java */
    public static final class d<T> extends a<T> {
        private static final long serialVersionUID = 1075119423897941642L;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404468b, eVar)) {
                this.f404468b = eVar;
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }
}
