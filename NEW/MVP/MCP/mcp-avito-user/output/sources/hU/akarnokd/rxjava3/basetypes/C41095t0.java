package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsDelayPublisher.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41095t0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsDelayPublisher.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.t0$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -9119999967998769573L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11312a f397773d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397774e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f397775f;

        /* compiled from: PerhapsDelayPublisher.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.t0$a$a, reason: collision with other inner class name */
        public final class C11312a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = -6651374802328276829L;

            public C11312a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                if (get() != SubscriptionHelper.f404813b) {
                    a aVar = a.this;
                    Throwable th2 = aVar.f397775f;
                    org.reactivestreams.d<? super T> dVar = aVar.f419376b;
                    if (th2 != null) {
                        dVar.onError(th2);
                        return;
                    }
                    T t12 = aVar.f419377c;
                    if (t12 != null) {
                        aVar.l(t12);
                    } else {
                        dVar.e();
                    }
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (get() == SubscriptionHelper.f404813b) {
                    C47998a.b(th2);
                    return;
                }
                a aVar = a.this;
                Throwable th3 = aVar.f397775f;
                if (th3 != null) {
                    th2 = new CompositeException(th3, th2);
                }
                aVar.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
                get().cancel();
                lazySet(SubscriptionHelper.f404813b);
                a aVar = a.this;
                Throwable th2 = aVar.f397775f;
                org.reactivestreams.d<? super T> dVar = aVar.f419376b;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                }
                T t12 = aVar.f419377c;
                if (t12 != null) {
                    aVar.l(t12);
                } else {
                    dVar.e();
                }
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397773d = new C11312a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397774e, eVar)) {
                this.f397774e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397774e.cancel();
            SubscriptionHelper.a(this.f397773d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f397775f = th2;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41069k0
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
