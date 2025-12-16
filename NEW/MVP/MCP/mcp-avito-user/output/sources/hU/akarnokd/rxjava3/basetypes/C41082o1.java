package hu.akarnokd.rxjava3.basetypes;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SoloAndThen.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.o1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41082o1<T> extends AbstractC41073l1<T> {
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        new a(dVar);
        throw null;
    }

    /* compiled from: SoloAndThen.java */
    /* renamed from: hu.akarnokd.rxjava3.basetypes.o1$a */
    public static final class a<T> extends o41.f<T> implements org.reactivestreams.d<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f397738f = 0;
        private static final long serialVersionUID = 2538648456345135486L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T>.C11309a f397739d;

        /* renamed from: e, reason: collision with root package name */
        public org.reactivestreams.e f397740e;

        public a(org.reactivestreams.d dVar) {
            super(dVar);
            this.f397739d = new C11309a();
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f397740e, eVar)) {
                this.f397740e = eVar;
                this.f419376b.K(this);
                eVar.request(Long.MAX_VALUE);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            SubscriptionHelper.a(this.f397739d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f419377c = null;
            this.f419376b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f419377c = t12;
        }

        /* compiled from: SoloAndThen.java */
        /* renamed from: hu.akarnokd.rxjava3.basetypes.o1$a$a, reason: collision with other inner class name */
        public final class C11309a extends AtomicReference<org.reactivestreams.e> implements org.reactivestreams.d<Object> {
            private static final long serialVersionUID = 1987312061510219761L;

            public C11309a() {
            }

            @Override // org.reactivestreams.d
            public final void K(org.reactivestreams.e eVar) {
                SubscriptionHelper.f(this, eVar);
            }

            @Override // org.reactivestreams.d
            public final void e() {
                int i12 = a.f397738f;
                a aVar = a.this;
                aVar.l(aVar.f419377c);
            }

            @Override // org.reactivestreams.d
            public final void onError(Throwable th2) {
                int i12 = a.f397738f;
                a.this.f419376b.onError(th2);
            }

            @Override // org.reactivestreams.d
            public final void onNext(Object obj) {
            }
        }
    }
}
