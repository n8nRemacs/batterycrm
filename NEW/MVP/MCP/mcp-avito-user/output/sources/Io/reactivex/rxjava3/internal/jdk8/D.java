package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelMapTryOptional.java */
/* loaded from: classes8.dex */
public final class D<T, R> extends AbstractC47491a<R> {

    /* compiled from: ParallelMapTryOptional.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f402023a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f402023a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f402023a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f402023a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ParallelMapTryOptional.java */
    public static final class b<T, R> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402024b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402025c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402024b, eVar)) {
                this.f402024b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f402025c) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    cancel();
                    onError(new CompositeException(th, th2));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402024b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402025c) {
                return;
            }
            this.f402025c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402025c) {
                C47998a.b(th2);
            } else {
                this.f402025c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            if (this.f402025c) {
                return;
            }
            this.f402024b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402024b.request(j12);
        }
    }

    /* compiled from: ParallelMapTryOptional.java */
    public static final class c<T, R> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f402026b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f402027c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402026b, eVar)) {
                this.f402026b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f402027c) {
                return false;
            }
            try {
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    cancel();
                    onError(new CompositeException(th, th2));
                    return false;
                }
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402026b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f402027c) {
                return;
            }
            this.f402027c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f402027c) {
                C47998a.b(th2);
            } else {
                this.f402027c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            if (this.f402027c) {
                return;
            }
            this.f402026b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f402026b.request(j12);
        }
    }
}
