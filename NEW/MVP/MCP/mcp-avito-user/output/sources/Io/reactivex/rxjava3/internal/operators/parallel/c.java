package io.reactivex.rxjava3.internal.operators.parallel;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFailureHandling;
import q41.InterfaceC47198a;
import r41.AbstractC47491a;
import s41.C47998a;

/* compiled from: ParallelDoOnNextTry.java */
/* loaded from: classes8.dex */
public final class c<T> extends AbstractC47491a<T> {

    /* compiled from: ParallelDoOnNextTry.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f404431a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f404431a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f404431a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f404431a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ParallelDoOnNextTry.java */
    public static final class b<T> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404432b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404433c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404432b, eVar)) {
                this.f404432b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404433c) {
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
            this.f404432b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404433c) {
                return;
            }
            this.f404433c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404433c) {
                C47998a.b(th2);
            } else {
                this.f404433c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            if (this.f404433c) {
                return;
            }
            this.f404432b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404432b.request(j12);
        }
    }

    /* compiled from: ParallelDoOnNextTry.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.parallel.c$c, reason: collision with other inner class name */
    public static final class C11507c<T> implements InterfaceC47198a<T>, org.reactivestreams.e {

        /* renamed from: b, reason: collision with root package name */
        public org.reactivestreams.e f404434b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f404435c;

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f404434b, eVar)) {
                this.f404434b = eVar;
                throw null;
            }
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404435c) {
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
            this.f404434b.cancel();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            if (this.f404435c) {
                return;
            }
            this.f404435c = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (this.f404435c) {
                C47998a.b(th2);
            } else {
                this.f404435c = true;
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
            this.f404434b.request(1L);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            this.f404434b.request(j12);
        }
    }
}
