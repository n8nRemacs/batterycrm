package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PerhapsOnErrorResumeNext.java */
/* loaded from: classes8.dex */
final class S0<T> extends AbstractC41069k0<T> {

    /* compiled from: PerhapsOnErrorResumeNext.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {
        private static final long serialVersionUID = -9119999967998769573L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11293a f397618d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397619e;

        /* compiled from: PerhapsOnErrorResumeNext.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.S0$a$a, reason: collision with other inner class name */
        public final class C11293a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = -6651374802328276829L;

            public C11293a() {
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
                    a.this.f419376b.e();
                }
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                if (get() != SubscriptionHelper.f404813b) {
                    a.this.f419376b.onError(th2);
                } else {
                    C47998a.b(th2);
                }
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                get().cancel();
                lazySet(SubscriptionHelper.f404813b);
                a.this.l(t12);
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397618d = new C11293a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397619e, eVar)) {
                this.f397619e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397619e.cancel();
            SubscriptionHelper.a(this.f397618d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            T t12 = this.f419377c;
            if (t12 != null) {
                l(t12);
            } else {
                this.f419376b.e();
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f419376b.onError(new CompositeException(th2, th3));
            }
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
