package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SoloDelayPublisher.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.t1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41096t1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloDelayPublisher.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.t1$a */
    public static final class a<T> extends AtomicReference<org.reactivestreams.e> implements QueueSubscription<T>, org.reactivestreams.d<T> {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super T> f397777b;

        /* renamed from: c, reason: collision with root package name */
        public org.reactivestreams.e f397778c;

        /* renamed from: d, reason: collision with root package name */
        public T f397779d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f397780e;

        /* compiled from: SoloDelayPublisher.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.t1$a$a, reason: collision with other inner class name */
        public final class C11313a implements org.reactivestreams.d<Object> {

            /* renamed from: b, reason: collision with root package name */
            public boolean f397781b;

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (this.f397781b) {
                    return;
                }
                this.f397781b = true;
                throw null;
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (!this.f397781b) {
                    throw null;
                }
                C47998a.b(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                SubscriptionHelper.a(null);
                e();
            }
        }

        public a(org.reactivestreams.d dVar) {
            this.f397777b = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397778c, eVar)) {
                this.f397778c = eVar;
                this.f397777b.K(this);
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397780e = th2;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f397779d = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
