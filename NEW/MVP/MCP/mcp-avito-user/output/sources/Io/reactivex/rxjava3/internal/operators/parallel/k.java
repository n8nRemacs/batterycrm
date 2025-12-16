package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelMap.java */
/* loaded from: classes8.dex */
public final class k<T, R> extends AbstractC47491a<R> {

    /* compiled from: ParallelMap.java */
    public static final class a<T, R> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404453b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404454c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404453b, eVar)) {
                this.f404453b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404454c) {
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
            this.f404453b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404454c) {
                return;
            }
            this.f404454c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404454c) {
                C47998a.b(th2);
            } else {
                this.f404454c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404454c) {
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

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404453b.request(j12);
        }
    }

    /* compiled from: ParallelMap.java */
    public static final class b<T, R> implements InterfaceC41782o<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404455b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404456c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404455b, eVar)) {
                this.f404455b = eVar;
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404455b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404456c) {
                return;
            }
            this.f404456c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404456c) {
                C47998a.b(th2);
            } else {
                this.f404456c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (this.f404456c) {
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

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404455b.request(j12);
        }
    }
}
