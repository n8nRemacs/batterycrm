package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloSubscribeOn.java */
/* loaded from: classes8.dex */
final class W1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloSubscribeOn.java */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T>, Runnable, org.reactivestreams.e {
        private static final long serialVersionUID = 2047863608816341143L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.f(this, eVar)) {
                throw null;
            }
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this);
            DisposableHelper.a(null);
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
            if (SubscriptionHelper.h(j12)) {
                get().getClass();
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        throw null;
    }
}
