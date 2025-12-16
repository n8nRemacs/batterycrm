package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelMapOptional.java */
/* loaded from: classes8.dex */
public final class C<T, R> extends AbstractC47491a<R> {

    /* compiled from: ParallelMapOptional.java */
    public static final class a<T, R> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402019b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402020c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402019b, eVar)) {
                this.f402019b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f402020c) {
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

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402019b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402020c) {
                return;
            }
            this.f402020c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402020c) {
                C47998a.b(th2);
            } else {
                this.f402020c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            this.f402019b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402019b.request(j12);
        }
    }

    /* compiled from: ParallelMapOptional.java */
    public static final class b<T, R> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402021b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402022c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402021b, eVar)) {
                this.f402021b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f402022c) {
                return true;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                onError(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402021b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402022c) {
                return;
            }
            this.f402022c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402022c) {
                C47998a.b(th2);
            } else {
                this.f402022c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402021b.request(j12);
        }
    }
}
