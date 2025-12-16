package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloOnErrorResumeWith.java */
/* loaded from: classes8.dex */
final class P1<T> extends AbstractC41073l1<T> {

    /* compiled from: SoloOnErrorResumeWith.java */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f397605f = 0;
        private static final long serialVersionUID = -7631998337002592538L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11292a f397606d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397607e;

        /* compiled from: SoloOnErrorResumeWith.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.P1$a$a, reason: collision with other inner class name */
        public final class C11292a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<T> {
            private static final long serialVersionUID = 5161815655607865861L;

            public C11292a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                if (SubscriptionHelper.f(this, eVar)) {
                    eVar.request(Long.MAX_VALUE);
                }
            }

            @Override // org.reactivestreams.d
            public final void e() {
                a.this.e();
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                int i12 = a.f397605f;
                a.this.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(T t12) {
                a.this.f419377c = t12;
            }
        }

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397606d = new C11292a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397607e, eVar)) {
                this.f397607e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397607e.cancel();
            SubscriptionHelper.a(this.f397606d);
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
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }
}
