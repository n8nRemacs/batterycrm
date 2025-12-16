package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelFilter.java */
/* loaded from: classes8.dex */
public final class d<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelFilter.java */
    public static abstract class a<T> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404436b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404437c;

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404436b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12) || this.f404437c) {
                return;
            }
            this.f404436b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404436b.request(j12);
        }
    }

    /* compiled from: ParallelFilter.java */
    public static final class b<T> extends a<T> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404436b, eVar)) {
                this.f404436b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404437c) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404437c) {
                return;
            }
            this.f404437c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404437c) {
                C47998a.b(th2);
            } else {
                this.f404437c = true;
                throw null;
            }
        }
    }

    /* compiled from: ParallelFilter.java */
    public static final class c<T> extends a<T> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404436b, eVar)) {
                this.f404436b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404437c) {
                return false;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404437c) {
                return;
            }
            this.f404437c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404437c) {
                C47998a.b(th2);
            } else {
                this.f404437c = true;
                throw null;
            }
        }
    }
}
