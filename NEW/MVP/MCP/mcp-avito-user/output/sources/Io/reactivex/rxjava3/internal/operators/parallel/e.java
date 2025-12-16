package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelFilterTry.java */
/* loaded from: classes8.dex */
public final class e<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelFilterTry.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f404438a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f404438a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f404438a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f404438a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ParallelFilterTry.java */
    public static abstract class b<T> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404439b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404440c;

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404439b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            if (P(t12) || this.f404440c) {
                return;
            }
            this.f404439b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404439b.request(j12);
        }
    }

    /* compiled from: ParallelFilterTry.java */
    public static final class c<T> extends b<T> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404439b, eVar)) {
                this.f404439b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404440c) {
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

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404440c) {
                return;
            }
            this.f404440c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404440c) {
                C47998a.b(th2);
            } else {
                this.f404440c = true;
                throw null;
            }
        }
    }

    /* compiled from: ParallelFilterTry.java */
    public static final class d<T> extends b<T> {
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404439b, eVar)) {
                this.f404439b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404440c) {
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

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404440c) {
                return;
            }
            this.f404440c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404440c) {
                C47998a.b(th2);
            } else {
                this.f404440c = true;
                throw null;
            }
        }
    }
}
